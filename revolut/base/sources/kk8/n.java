package kk8;

import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilLinkedAccountsGroup;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f184519w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f184519w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(0, this.f184519w, continuation);
                nVar.v = obj2;
                return nVar;
            case 1:
                n nVar2 = new n(1, this.f184519w, continuation);
                nVar2.v = obj2;
                return nVar2;
            default:
                n nVar3 = new n(2, this.f184519w, continuation);
                nVar3.v = obj2;
                return nVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((n) create((og6.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        String str = this.f184519w;
        switch (i) {
            case 0:
                String str2 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Intrinsics.f(str2, str) ? new pe8.b(str2) : pe8.a.f235336a;
            case 1:
                og6.g gVar = (og6.g) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                for (Object obj3 : gVar.f225046a) {
                    if (Intrinsics.f(((OpenBankingBrazilLinkedAccountsGroup) obj3).f72390a.f73116b, str)) {
                        return obj3;
                    }
                }
                return null;
            default:
                List list = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list2 = list;
                boolean z = false;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it8 = list2.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            if (Intrinsics.f(((CustomAsset) it8.next()).f99216a, str)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
