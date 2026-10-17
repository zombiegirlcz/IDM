package rp4;

import com.revolut.feature.credit.card.impl.ui.autopay.amount_confirmation.AutopayAmountConfirmationController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AutopayAmountConfirmationController f256263w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(AutopayAmountConfirmationController autopayAmountConfirmationController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f256263w = autopayAmountConfirmationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f256263w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f256263w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AutopayAmountConfirmationController autopayAmountConfirmationController = this.f256263w;
        switch (i) {
            case 0:
                ty0.a click = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) autopayAmountConfirmationController.U.getValue();
                Intrinsics.h(click);
                jVar.getClass();
                Intrinsics.checkNotNullParameter(click, "click");
                String str = click.f275445a;
                if (((f80.b) jVar.o).e(str)) {
                    jVar.l2(new rm6.c(jVar, str, null, 16), new yi5.b(26));
                }
                break;
            default:
                yx4.b clickWrapper = (yx4.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar2 = (j) autopayAmountConfirmationController.U.getValue();
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(clickWrapper, "clickWrapper");
                Object obj3 = clickWrapper.f317545b;
                if (obj3 instanceof b) {
                    jVar2.C2(d.f256259a);
                } else if (obj3 instanceof c) {
                    jVar2.B2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
