package r24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f251043w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f251044x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f251043w = dVar;
        this.f251044x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f251043w, this.f251044x, continuation, 0);
            default:
                return new b(this.f251043w, this.f251044x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = this.f251043w.f251048a;
                    this.v = 1;
                    obj2 = creditPluginsService.getAddressHistory(this.f251044x, this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                Iterable iterable = (Iterable) obj2;
                arrayList = new ArrayList(w.t(iterable, 10));
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    arrayList.add(oo3.a.a((no3.b) it8.next()));
                }
                return arrayList;
            default:
                Object arrayList2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = this.f251043w.f251048a;
                    this.v = 1;
                    obj2 = creditPluginsService2.getAddressSelection(this.f251044x, this);
                    if (obj2 != arrayList2) {
                    }
                    return arrayList2;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                Iterable<wz3.a> iterable2 = (Iterable) obj2;
                arrayList2 = new ArrayList(w.t(iterable2, 10));
                for (wz3.a aVar : iterable2) {
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    arrayList2.add(new hv3.a(aVar.getEquifaxAddressId(), oo3.a.a(aVar.getAddress())));
                }
                return arrayList2;
        }
    }
}
