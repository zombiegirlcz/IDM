package t9e;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import skm.a2;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f268997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ qua.p f268998x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(qua.p pVar, w wVar, Continuation continuation) {
        super(1, continuation);
        this.u = 0;
        this.f268998x = pVar;
        this.f268997w = wVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f268998x, this.f268997w, continuation);
            case 1:
                return new r(this.f268997w, this.f268998x, continuation, 1);
            default:
                return new r(this.f268997w, this.f268998x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        pfm.a aVarU;
        switch (this.u) {
            case 0:
                xua.a aVar = this.f268997w.f269004q;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    qua.p subscription = this.f268998x;
                    boolean zR = qua.u.r(subscription);
                    ibd.e eVar = subscription.f249314a;
                    if (zR) {
                        pfm.h hVar = new pfm.h(((yua.q) aVar).j(eVar.f160150a), 4);
                        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                        this.v = 1;
                        if (nim.a.a(hVar, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        int i2 = q.f268996a[eVar.f160152c.ordinal()];
                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                            yua.q qVar = (yua.q) aVar;
                            qVar.getClass();
                            Intrinsics.checkNotNullParameter(subscription, "subscription");
                            aVarU = qVar.u(subscription, true);
                        } else {
                            if (i2 != 4) {
                                throw new IllegalStateException("Recurring payment of type " + eVar.f160152c + " can not be blocked");
                            }
                            yua.q qVar2 = (yua.q) aVar;
                            qVar2.getClass();
                            Intrinsics.checkNotNullParameter(subscription, "subscription");
                            aVarU = qVar2.v(subscription, true);
                        }
                        this.v = 2;
                        if (nim.a.a(aVarU, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                qua.p pVar = this.f268998x;
                w wVar = this.f268997w;
                Continuation continuation = null;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    a2 a2Var = wVar.A;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    r rVar = new r(pVar, wVar, null);
                    this.v = 1;
                    if (do3.q.t(wVar, rVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                qua.g gVar = pVar.f249332w;
                String str = gVar != null ? gVar.f249293b : null;
                yji.l.b1(wVar, wVar.X1(new y0(null, new j0((Clause) (str != null ? new TextLocalisedClause(R$string.subscription_block_success_title, zhm.u.c(str), null, 12) : new TextLocalisedClause(R$string.subscription_block_success_title_no_name, null, null, 14)), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5)), null, new sy6.j(wVar, pVar, continuation, 28), 3);
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    w wVar2 = this.f268997w;
                    r rVar2 = new r(wVar2, this.f268998x, null, 1);
                    this.v = 1;
                    if (wVar2.p2(this, rVar2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(w wVar, qua.p pVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f268997w = wVar;
        this.f268998x = pVar;
    }
}
