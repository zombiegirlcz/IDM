package pq7;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.smart_driving.SmartDrivingScreenContract$InputData;
import kl7.j0;
import kotlin.jvm.internal.Intrinsics;
import ll7.e0;
import ll7.v;
import org.jetbrains.annotations.NotNull;
import pkf.x;
import rp0.t;
import rp0.y;
import vkm.j2;
import vkm.q0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends jki.g implements j {

    @NotNull
    private static final m Companion = new m();
    public static final j0 v = j0.SIX_MONTHS;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SmartDrivingScreenContract$InputData f238699p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f238700q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f238701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f238702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f238703t;
    public final h u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(jki.p stateMapper, SmartDrivingScreenContract$InputData inputData, v policyRepository, j60.a bottomDialogExtension, a popupFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(popupFactory, "popupFactory");
        this.f238699p = inputData;
        this.f238700q = policyRepository;
        this.f238701r = bottomDialogExtension;
        this.f238702s = popupFactory;
        j0 j0Var = v;
        this.f238703t = vkm.q.c(j0Var);
        this.u = new h(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), j0Var);
    }

    @Override // yji.l
    public final void I1() {
        String policyId = this.f238699p.f75666a;
        e0 e0Var = (e0) this.f238700q;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        yji.l.a1(this, rd0.e.b(e0Var.k.f(policyId, false)), null, null, new n(this, null, 0), 3);
        yji.l.a1(this, vkm.q.Q(new q0(this.f238703t, new n(this, null, 1), 1), new x(null, this, 9)), null, null, new n(this, null, 2), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    public final void y2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        int iHashCode = id10.hashCode();
        j60.a aVar = this.f238701r;
        if (iHashCode != 157982748) {
            if (iHashCode != 577422536) {
                if (iHashCode == 1756768606 && id10.equals("SPEED_EVENTS_LEARN_MORE")) {
                    this.f238702s.getClass();
                    t tVar = new t(new TextLocalisedClause(R$string.car_insurance_smart_driving_speed_alerts_modal_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_smart_driving_speed_alerts_modal_description, null, null, 14), null, 28);
                    rp0.l lVar = rp0.l.WINDOW;
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_common_close, null, null, 14);
                    int i = R$attr.uikit_dp16;
                    aVar.x(new y(u.c(new LargeActionButtonDelegate.Model("SPEED_LIMIT_CLOSE", defaultFilledButton, null, textLocalisedClause, false, null, null, i, R$attr.uikit_dp24, i, i, 496)), tVar, lVar, null, null, null, 1016));
                    return;
                }
                return;
            }
            if (!id10.equals("SMART_DRIVING_LEADERBOARD_CLOSE")) {
                return;
            }
        } else if (!id10.equals("SPEED_LIMIT_CLOSE")) {
            return;
        }
        j60.a.v(aVar, false, null, 3);
    }
}
