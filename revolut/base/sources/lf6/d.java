package lf6;

import com.revolut.feature.external_accounts.impl.data.open_banking_brazil.OpenBankingBrazilService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mf6.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f194640w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Boolean f194641x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Map f194642y;
    public final /* synthetic */ Map z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, String str, Boolean bool, Map map, Map map2, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f194640w = str;
        this.f194641x = bool;
        this.f194642y = map;
        this.z = map2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f194640w, this.f194641x, this.f194642y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            OpenBankingBrazilService openBankingBrazilService = this.v.f194653b;
            ArrayList arrayList2 = null;
            Map map = this.f194642y;
            if (map != null) {
                arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    dj0.d dVar = (dj0.d) entry.getValue();
                    arrayList.add(new h.c(dVar != null ? mo3.a.p(dVar) : null, str));
                }
            } else {
                arrayList = null;
            }
            Map map2 = this.z;
            if (map2 != null) {
                arrayList2 = new ArrayList(map2.size());
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    String str3 = ((LocalDate) entry2.getValue()).format(DateTimeFormatter.ISO_LOCAL_DATE);
                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                    arrayList2.add(new h.b(str2, str3));
                }
            }
            mf6.h hVar = new mf6.h("AUTHORIZE", this.f194641x, arrayList, arrayList2);
            this.u = 1;
            obj2 = openBankingBrazilService.consentAction(this.f194640w, hVar, new wj0.b("OPEN_BANKING_OUTBOUND_IDEMPOTENCY_KEY"), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return ((mf6.i) obj2).getRedirectUri();
    }
}
