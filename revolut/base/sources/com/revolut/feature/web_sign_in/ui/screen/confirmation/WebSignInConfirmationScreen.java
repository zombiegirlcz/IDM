package com.revolut.feature.web_sign_in.ui.screen.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.web_sign_in.R$id;
import com.revolut.feature.web_sign_in.R$layout;
import com.revolut.feature.web_sign_in.ui.screen.confirmation.WebSignInConfirmationScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import w83.a;
import wrh.c;
import wrh.d;
import wrh.f;
import wrh.g;
import wrh.i;
import wrh.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/web_sign_in/ui/screen/confirmation/WebSignInConfirmationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lwrh/j;", "Lcom/revolut/feature/web_sign_in/ui/screen/confirmation/WebSignInConfirmationScreenContract$InputData;", "Lwrh/f;", "feature_web_sign_in_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WebSignInConfirmationScreen extends BaseRecyclerViewScreen<j, WebSignInConfirmationScreenContract$InputData, f> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(WebSignInConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/feature/web_sign_in/databinding/ScreenWebSignInConfirmationBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f96341a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f96342b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSignInConfirmationScreen(WebSignInConfirmationScreenContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.U = R$id.webSignInConfirmationScreen_recyclerView;
        this.V = R$layout.screen_web_sign_in_confirmation;
        this.W = s.t(this, c.f);
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: wrh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebSignInConfirmationScreen f299579b;

            {
                this.f299579b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WebSignInConfirmationScreen webSignInConfirmationScreen = this.f299579b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WebSignInConfirmationScreen.c0;
                        ViewBinding value = webSignInConfirmationScreen.W.getValue(webSignInConfirmationScreen, WebSignInConfirmationScreen.c0[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        TwinHorizontalButton webSignInConfirmationScreenTwinHorizontalButton = ((rrh.a) value).f256840b;
                        Intrinsics.checkNotNullExpressionValue(webSignInConfirmationScreenTwinHorizontalButton, "webSignInConfirmationScreenTwinHorizontalButton");
                        return webSignInConfirmationScreenTwinHorizontalButton;
                    case 1:
                        KProperty[] kPropertyArr2 = WebSignInConfirmationScreen.c0;
                        ViewBinding value2 = webSignInConfirmationScreen.W.getValue(webSignInConfirmationScreen, WebSignInConfirmationScreen.c0[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        TwinVerticalButton webSignInConfirmationScreenTwinVerticalButton = ((rrh.a) value2).f256841c;
                        Intrinsics.checkNotNullExpressionValue(webSignInConfirmationScreenTwinVerticalButton, "webSignInConfirmationScreenTwinVerticalButton");
                        return webSignInConfirmationScreenTwinVerticalButton;
                    default:
                        KProperty[] kPropertyArr3 = WebSignInConfirmationScreen.c0;
                        return (g) ((srh.c) webSignInConfirmationScreen.Z.getValue()).f265221c.get();
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: wrh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebSignInConfirmationScreen f299579b;

            {
                this.f299579b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WebSignInConfirmationScreen webSignInConfirmationScreen = this.f299579b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WebSignInConfirmationScreen.c0;
                        ViewBinding value = webSignInConfirmationScreen.W.getValue(webSignInConfirmationScreen, WebSignInConfirmationScreen.c0[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        TwinHorizontalButton webSignInConfirmationScreenTwinHorizontalButton = ((rrh.a) value).f256840b;
                        Intrinsics.checkNotNullExpressionValue(webSignInConfirmationScreenTwinHorizontalButton, "webSignInConfirmationScreenTwinHorizontalButton");
                        return webSignInConfirmationScreenTwinHorizontalButton;
                    case 1:
                        KProperty[] kPropertyArr2 = WebSignInConfirmationScreen.c0;
                        ViewBinding value2 = webSignInConfirmationScreen.W.getValue(webSignInConfirmationScreen, WebSignInConfirmationScreen.c0[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        TwinVerticalButton webSignInConfirmationScreenTwinVerticalButton = ((rrh.a) value2).f256841c;
                        Intrinsics.checkNotNullExpressionValue(webSignInConfirmationScreenTwinVerticalButton, "webSignInConfirmationScreenTwinVerticalButton");
                        return webSignInConfirmationScreenTwinVerticalButton;
                    default:
                        KProperty[] kPropertyArr3 = WebSignInConfirmationScreen.c0;
                        return (g) ((srh.c) webSignInConfirmationScreen.Z.getValue()).f265221c.get();
                }
            }
        });
        this.Z = w.y0(new a(this, input, 29));
        final int i3 = 2;
        this.f96341a0 = w.y0(new Function0(this) { // from class: wrh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebSignInConfirmationScreen f299579b;

            {
                this.f299579b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WebSignInConfirmationScreen webSignInConfirmationScreen = this.f299579b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WebSignInConfirmationScreen.c0;
                        ViewBinding value = webSignInConfirmationScreen.W.getValue(webSignInConfirmationScreen, WebSignInConfirmationScreen.c0[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        TwinHorizontalButton webSignInConfirmationScreenTwinHorizontalButton = ((rrh.a) value).f256840b;
                        Intrinsics.checkNotNullExpressionValue(webSignInConfirmationScreenTwinHorizontalButton, "webSignInConfirmationScreenTwinHorizontalButton");
                        return webSignInConfirmationScreenTwinHorizontalButton;
                    case 1:
                        KProperty[] kPropertyArr2 = WebSignInConfirmationScreen.c0;
                        ViewBinding value2 = webSignInConfirmationScreen.W.getValue(webSignInConfirmationScreen, WebSignInConfirmationScreen.c0[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        TwinVerticalButton webSignInConfirmationScreenTwinVerticalButton = ((rrh.a) value2).f256841c;
                        Intrinsics.checkNotNullExpressionValue(webSignInConfirmationScreenTwinVerticalButton, "webSignInConfirmationScreenTwinVerticalButton");
                        return webSignInConfirmationScreenTwinVerticalButton;
                    default:
                        KProperty[] kPropertyArr3 = WebSignInConfirmationScreen.c0;
                        return (g) ((srh.c) webSignInConfirmationScreen.Z.getValue()).f265221c.get();
                }
            }
        });
        this.f96342b0 = w.y0(new wq1.a(8));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (srh.c) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.f96341a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ?? r72 = this.X;
        r rVarD = ((TwinHorizontalButton) r72.getValue()).d();
        ?? r110 = this.Y;
        r rVarMerge = r.merge(rVarD, ((TwinVerticalButton) r110.getValue()).o0());
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarMerge), null, new d(this, null, 0), 3);
        r rVarMerge2 = r.merge(((TwinHorizontalButton) r72.getValue()).c(), ((TwinVerticalButton) r110.getValue()).p0());
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarMerge2), null, new d(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.f96342b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        i iVar = uiState.f299590b;
        ResourceImage resourceImage = iVar.e;
        TextLocalisedClause textLocalisedClause = iVar.f299588c;
        ResourceImage resourceImage2 = iVar.d;
        TextLocalisedClause textLocalisedClause2 = iVar.f299587b;
        int i = wrh.b.f299580a[iVar.f299586a.ordinal()];
        ?? r4 = this.X;
        ?? r56 = this.Y;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            TwinVerticalButton twinVerticalButton = (TwinVerticalButton) r56.getValue();
            twinVerticalButton.setVisibility(0);
            twinVerticalButton.setMainButtonText(textLocalisedClause2);
            twinVerticalButton.setMainButtonIcon(resourceImage2);
            twinVerticalButton.setSecondaryButtonText(textLocalisedClause);
            twinVerticalButton.setSecondaryButtonImage(resourceImage);
            ((TwinHorizontalButton) r4.getValue()).setVisibility(8);
            return;
        }
        ((TwinVerticalButton) r56.getValue()).setVisibility(8);
        TwinHorizontalButton twinHorizontalButton = (TwinHorizontalButton) r4.getValue();
        twinHorizontalButton.setVisibility(0);
        twinHorizontalButton.setPrimaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        twinHorizontalButton.setPrimaryButtonText(textLocalisedClause);
        twinHorizontalButton.setPrimaryButtonIcon(resourceImage);
        twinHorizontalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinHorizontalButton.setSecondaryButtonText(textLocalisedClause2);
        twinHorizontalButton.setSecondaryButtonIcon(resourceImage2);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.V;
    }
}
