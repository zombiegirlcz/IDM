package mtc;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.second_device_login.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import h30.q;
import kl.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.k1;
import nii.l0;
import nii.l1;
import nii.m0;
import nii.m1;
import nii.n1;
import nii.t1;
import nii.u1;
import nii.w1;
import vkm.j2;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f208814w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f208814w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f208814w, continuation, 0);
            default:
                return new l(this.f208814w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                l lVar = this;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = lVar.v;
                final m mVar = lVar.f208814w;
                if (i == 0) {
                    o.b(obj2);
                    final int i2 = 0;
                    t1 t1Var = new t1() { // from class: mtc.j
                        @Override // nii.p1
                        public final m0 a(Object obj3) {
                            switch (i2) {
                                case 0:
                                    mVar.f208816q.getClass();
                                    return new l0(new TextLocalisedClause(R$string.second_device_login_device_not_found_dialog_title, null, null, 14), null, null, null, null, null, false, null, 1022);
                                default:
                                    m mVar2 = mVar;
                                    UserDevice device = ((itc.a) zi0.c.I(((d) ((j2) mVar2.f208817r.f22677a).getValue()).f208805a)).f168361a;
                                    b0 b0Var = mVar2.f208816q;
                                    b0Var.getClass();
                                    Intrinsics.checkNotNullParameter(device, "device");
                                    return new j0((Clause) new TextLocalisedClause(R$string.second_device_login_logout_success_title, u.c(((r86.b) b0Var.f185144b).a(device)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(R$string.second_device_login_logout_success_change_passcode, null, null, 14), new TextLocalisedClause(R$string.second_device_login_logout_success_skip, null, null, 14)), true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4046);
                            }
                        }
                    };
                    al6.c cVar = new al6.c(27);
                    k kVar = new k(mVar, null, 0);
                    lVar.v = 1;
                    Object objV = n14.k.V(mVar, null, cVar, t1Var, kVar, lVar, 1);
                    lVar = lVar;
                    if (objV == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        mVar.C2(e.f208806a);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                q qVar = mVar.f208815p;
                lVar.v = 2;
                if (qVar.P0(this) == aVar) {
                    return aVar;
                }
                mVar.C2(e.f208806a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                final m mVar2 = this.f208814w;
                if (i3 == 0) {
                    o.b(obj2);
                    final int i5 = 1;
                    t1 t1Var2 = new t1() { // from class: mtc.j
                        @Override // nii.p1
                        public final m0 a(Object obj3) {
                            switch (i5) {
                                case 0:
                                    mVar2.f208816q.getClass();
                                    return new l0(new TextLocalisedClause(R$string.second_device_login_device_not_found_dialog_title, null, null, 14), null, null, null, null, null, false, null, 1022);
                                default:
                                    m mVar22 = mVar2;
                                    UserDevice device = ((itc.a) zi0.c.I(((d) ((j2) mVar22.f208817r.f22677a).getValue()).f208805a)).f168361a;
                                    b0 b0Var = mVar22.f208816q;
                                    b0Var.getClass();
                                    Intrinsics.checkNotNullParameter(device, "device");
                                    return new j0((Clause) new TextLocalisedClause(R$string.second_device_login_logout_success_title, u.c(((r86.b) b0Var.f185144b).a(device)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(R$string.second_device_login_logout_success_change_passcode, null, null, 14), new TextLocalisedClause(R$string.second_device_login_logout_success_skip, null, null, 14)), true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4046);
                            }
                        }
                    };
                    al6.c cVar2 = new al6.c(27);
                    k kVar2 = new k(mVar2, null, 2);
                    this.v = 1;
                    obj2 = n14.k.V(mVar2, null, cVar2, t1Var2, kVar2, this, 1);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                nii.h hVar = (nii.h) obj2;
                if (hVar instanceof nii.g) {
                    n1 n1Var = ((nii.g) hVar).f216153b;
                    if ((n1Var instanceof l1) || (n1Var instanceof k1)) {
                        mVar2.C2(f.f208807a);
                    } else if (n1Var instanceof m1) {
                        mVar2.C2(g.f208808a);
                    }
                }
                return Unit.f186387a;
        }
    }
}
