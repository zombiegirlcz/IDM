package z48;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.joint.impl.ui.invite_confirmation.JointAccountInviteConfirmationScreenContract$InputData;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import n38.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends jki.g implements h, no.m {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f319346p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AnalyticsProduct.Retail f319347q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m stateMapper, JointAccountInviteConfirmationScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        v vVar = inputData.f76555b;
        this.f319346p = new d(vVar.f211962a, vVar.f211963b);
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137508w;
        this.f319347q = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.f319347q;
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f319346p;
    }
}
