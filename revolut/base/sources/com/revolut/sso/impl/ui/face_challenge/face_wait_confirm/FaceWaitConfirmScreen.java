package com.revolut.sso.impl.ui.face_challenge.face_wait_confirm;

import aii.q;
import android.view.View;
import cnl.a;
import cnl.b;
import cnl.c;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.tracking.v3.FaceWaitContext;
import java.util.List;
import jki.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ljl.z;
import no.k;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/face_challenge/face_wait_confirm/FaceWaitConfirmScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lcnl/b;", "Lcom/revolut/sso/impl/ui/face_challenge/face_wait_confirm/FaceWaitConfirmScreenContract$InputData;", "Laii/q;", "Lno/k;", "Lwii/b;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FaceWaitConfirmScreen extends BaseRecyclerViewScreen<b, FaceWaitConfirmScreenContract$InputData, q> implements k, wii.b {
    public final ModalTransitionAnimation.Style.POPUP U;
    public AnalyticsContext V;
    public final Object W;
    public final int X;
    public final int Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f106556a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceWaitConfirmScreen(FaceWaitConfirmScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = ModalTransitionAnimation.Style.POPUP.f98391a;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        FaceWaitContext.a aVarNewBuilder = FaceWaitContext.newBuilder();
        String str = inputData.f106557a;
        str = str == null ? "" : str;
        aVarNewBuilder.c();
        ((FaceWaitContext) aVarNewBuilder.f49761b).setVerificationToken(str);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.V = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        this.W = w.y0(new a(this, inputData));
        this.X = R$layout.screen_face_wait;
        this.Y = R$id.faceWaitScreen_recyclerView;
        this.Z = w.y0(new a(this));
        this.f106556a0 = u.c(new PromptMarketingContentDelegate());
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.V = analyticsContext;
    }

    @Override // wii.b
    /* JADX INFO: renamed from: P0 */
    public final Boolean getL() {
        return Boolean.FALSE;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (z) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (c) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        this.z = false;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF106556a0() {
        return this.f106556a0;
    }

    @Override // wii.b
    /* JADX INFO: renamed from: d2 */
    public final ModalTransitionAnimation.Style getK() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getY() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.X;
    }
}
