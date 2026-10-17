package ae7;

import ch.qos.logback.core.util.FileSize;
import com.revolut.core.ui_kit.delegates.na;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.SettingsDestination;
import com.revolut.retail.toast.mediator.ToastViewAction;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.a0;
import rp0.p0;
import rp0.r0;
import rp0.u0;
import skm.e0;
import t80.m;
import t80.n;
import t80.o;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f3485b;

    public /* synthetic */ a(i iVar, int i) {
        this.f3484a = i;
        this.f3485b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Integer num;
        switch (this.f3484a) {
            case 0:
                a0 state = (a0) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                if (!state.f256040a) {
                    e0.n(this.f3485b.o.getF74819h());
                }
                return Unit.f186387a;
            case 1:
                p0.a it8 = (p0.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                i iVar = this.f3485b;
                iVar.f3496h.a();
                iVar.f.c(new ActivityNavigateCommand(new SettingsDestination("android.settings.APPLICATION_DETAILS_SETTINGS"), null, null, null, 0, null, null, null, null, false, 1022));
                return Unit.f186387a;
            case 2:
                na model = (na) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                upi.f.C(this.f3485b.f3492a, 1);
                return Unit.f186387a;
            default:
                i iVar2 = this.f3485b;
                p0 p0Var = iVar2.f3496h;
                upi.e result = (upi.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof upi.d) {
                    iVar2.f3498l.onNext(((upi.d) result).f282063a);
                    p0Var.a();
                    iVar2.f3495g.b(false);
                } else {
                    if (!(result instanceof upi.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    upi.c cVar = (upi.c) result;
                    d4l.a aVar = iVar2.f3494c;
                    m mVar = cVar.f282060a;
                    if (mVar instanceof o) {
                        aVar.D(new ToastViewAction.Show(new TextLocalisedClause(R$string.common_attachments_error_unknown, null, null, 14)));
                    } else if (mVar.equals(m.e.f268771a)) {
                        aVar.D(new ToastViewAction.Show(new TextLocalisedClause(R$string.common_attachments_error_not_valid, null, null, 14)));
                    } else if (mVar instanceof n) {
                        aVar.D(new ToastViewAction.Show(new TextLocalisedClause(R$string.common_attachments_error_too_large, u.c(ch.qos.logback.core.util.a.p((iVar2.f3493b.f268762b / FileSize.KB_COEFFICIENT) / FileSize.KB_COEFFICIENT, " MB")), null, 12)));
                    } else if (mVar.equals(m.d.f268770a)) {
                        if (cVar.f282061b == y80.d.DENIED_PERMANENTLY && (num = cVar.f282062c) != null && num.intValue() == 8432) {
                            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                            Clause clause = null;
                            Clause clause2 = null;
                            p0Var.g(new u0(new TextLocalisedClause(R$string.common_permission_camera_title, null, null, 14), new TextLocalisedClause(R$string.common_permission_camera_description, null, null, 14), clause, new r0(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d019", null, null, null, 30)), clause2, resourceImage, null, null, new TextLocalisedClause(R$string.common_action_allow_in_settings, null, null, 14), null, null, null, null, null, null, null, null, null, null, 33553876));
                        }
                    } else if (!mVar.equals(m.a.f268767a) && !mVar.equals(m.c.f268769a) && !mVar.equals(m.b.f268768a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
        }
    }
}
