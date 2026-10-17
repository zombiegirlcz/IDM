package kw4;

import com.revolut.feature.credit.card.impl.ui.topup.CreditCardTopupScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditCardTopupScreen f190217w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CreditCardTopupScreen creditCardTopupScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f190217w = creditCardTopupScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f190217w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f190217w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditCardTopupScreen creditCardTopupScreen = this.f190217w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarK3 = creditCardTopupScreen.k3();
                Intrinsics.h(itemId);
                z zVar = (z) kVarK3;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                zVar.J2(itemId);
                break;
            default:
                Object obj3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarK32 = creditCardTopupScreen.k3();
                yx4.a aVar3 = yx4.b.Companion;
                Intrinsics.h(obj3);
                aVar3.getClass();
                yx4.b item = yx4.a.a(obj3);
                z zVar2 = (z) kVarK32;
                zVar2.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                Object obj4 = item.f317545b;
                if (obj4 instanceof cy0.a) {
                    cy0.a aVar4 = (cy0.a) obj4;
                    boolean z = aVar4.f110015b;
                    boolean z3 = aVar4.f110016c;
                    if (z) {
                        zVar2.K2(new g(dj0.d.c(zVar2.I2().f190228m, ((yx4.m) zVar2.A.getValue()).a(aVar4.f110014a, z3), null, 2), z3, f.SLIDER));
                    }
                } else {
                    zVar2.J2(item.f317544a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
