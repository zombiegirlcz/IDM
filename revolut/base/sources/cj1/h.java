package cj1;

import com.revolut.feature.address.impl.data.network.AddressFieldSuggestionService;
import com.revolut.feature.address.impl.data.network.MunicipalitiesService;
import com.revolut.feature.address.models.AddressFieldSuggestion;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ g f24588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f24589x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f24589x = iVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        g gVar = (g) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                h hVar = new h(this.f24589x, continuation, 0);
                hVar.f24588w = gVar;
                return hVar.invokeSuspend(Unit.f186387a);
            default:
                h hVar2 = new h(this.f24589x, continuation, 1);
                hVar2.f24588w = gVar;
                return hVar2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                g gVar = this.f24588w;
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    String str = gVar.f24586a;
                    String str2 = gVar.f24587b;
                    AddressFieldSuggestionService addressFieldSuggestionService = this.f24589x.f24592c;
                    this.f24588w = null;
                    this.v = 1;
                    obj2 = addressFieldSuggestionService.searchCitySuggestions(str, str2, this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                Iterable<bj1.c> iterable = (Iterable) obj2;
                arrayList = new ArrayList(w.t(iterable, 10));
                for (bj1.c cVar : iterable) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    arrayList.add(new AddressFieldSuggestion(cVar.getValue(), cVar.getDisplayName(), cVar.getDisplayCode(), cVar.getIsEnabled()));
                }
                return arrayList;
            default:
                g gVar2 = this.f24588w;
                Object arrayList2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    String str3 = gVar2.f24586a;
                    String str4 = gVar2.f24587b;
                    MunicipalitiesService municipalitiesService = this.f24589x.f24591b;
                    this.f24588w = null;
                    this.v = 1;
                    obj2 = municipalitiesService.searchMunicipality(str3, str4, this);
                    if (obj2 != arrayList2) {
                    }
                    return arrayList2;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                Iterable<String> iterable2 = (Iterable) obj2;
                arrayList2 = new ArrayList(w.t(iterable2, 10));
                for (String str5 : iterable2) {
                    arrayList2.add(new AddressFieldSuggestion(str5, str5, null, true));
                }
                return arrayList2;
        }
    }
}
