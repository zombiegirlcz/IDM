package k9e;

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
import qua.p;
import yhm.o;
import yji.l;
import yua.q;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u = 1;
    public p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f182324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f182325x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation continuation) {
        super(1, continuation);
        this.f182325x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, this.f182325x, continuation);
            default:
                return new h(this.f182325x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        pfm.a aVarU;
        p pVar;
        switch (this.u) {
            case 0:
                xua.a aVar = this.f182325x.f182326p;
                p subscription = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.f182324w;
                if (i == 0) {
                    o.b(obj2);
                    int i2 = g.f182323a[subscription.f249314a.f160152c.ordinal()];
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        q qVar = (q) aVar;
                        qVar.getClass();
                        Intrinsics.checkNotNullParameter(subscription, "subscription");
                        aVarU = qVar.u(subscription, true);
                    } else {
                        if (i2 != 4) {
                            throw new IllegalStateException("Recurring payment of type " + subscription.f249314a.f160152c + " can not be blocked");
                        }
                        q qVar2 = (q) aVar;
                        qVar2.getClass();
                        Intrinsics.checkNotNullParameter(subscription, "subscription");
                        aVarU = qVar2.v(subscription, true);
                    }
                    this.f182324w = 1;
                    if (nim.a.a(aVarU, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f182324w;
                Continuation continuation = null;
                i iVar = this.f182325x;
                if (i3 == 0) {
                    o.b(obj2);
                    p pVar2 = ((c) iVar.t2()).f182320a;
                    h hVar = new h(pVar2, iVar, null);
                    this.v = pVar2;
                    this.f182324w = 1;
                    if (do3.q.t(iVar, hVar, this) == aVar3) {
                        return aVar3;
                    }
                    pVar = pVar2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = this.v;
                    o.b(obj2);
                }
                int i5 = R$string.block_future_payments_confirm_success_dialog;
                qua.g gVar = ((c) iVar.t2()).f182320a.f249332w;
                String str = gVar != null ? gVar.f249293b : null;
                if (str == null) {
                    str = "";
                }
                return l.b1(iVar, iVar.X1(new y0(null, new j0((Clause) new TextLocalisedClause(i5, u.c(str), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5)), null, new jv.o(iVar, pVar, continuation, 28), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = pVar;
        this.f182325x = iVar;
    }
}
