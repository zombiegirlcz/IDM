package com.revolut.retail.operation_status.step;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.views.CircleClipView;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyContentContainerFrameLayout;
import com.revolut.retail.core.ui.activity.BaseDelegatesFragment;
import com.revolut.retail.operation_status.R$id;
import com.revolut.retail.operation_status.R$layout;
import grl.k9;
import hx7.b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o3l.a;
import o3l.g;
import o3l.q;
import pri.e;
import v60.i;
import yhm.j;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/operation_status/step/OperationStatusFragment;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesFragment;", "Lo3l/q;", "Lo3l/g;", "<init>", "()V", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OperationStatusFragment extends BaseDelegatesFragment<q, g> implements g {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final i f104421b0 = new i();
    public final Lazy c0 = j.b(new a(this, 0));

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Lazy f104422d0 = j.b(new a(this, 1));

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public f3l.a f104423e0;

    public final void E(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        f3l.a aVar = this.f104423e0;
        Intrinsics.h(aVar);
        AppCompatTextView operationStateLink = aVar.i;
        Intrinsics.checkNotNullExpressionValue(operationStateLink, "operationStateLink");
        b.w(operationStateLink, text);
        f3l.a aVar2 = this.f104423e0;
        Intrinsics.h(aVar2);
        aVar2.i.setText(text);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        AnalyticsProduct analyticsProductI6;
        OperationStatusStepContract$Configuration operationStatusStepContract$Configuration = (OperationStatusStepContract$Configuration) B();
        if (operationStatusStepContract$Configuration != null && (analyticsProductI6 = operationStatusStepContract$Configuration.getH()) != null) {
            return analyticsProductI6;
        }
        AnalyticsProduct.Companion aVar = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.o;
        return com.google.android.gms.internal.mlkit_vision_face.a.g(aVar, k9Var, k9Var);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_operation_status, viewGroup, false);
        int i = R$id.bottom_above_next_button;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(viewInflate, i);
        if (largeActionButton != null) {
            i = R$id.operation_state_animation;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(viewInflate, i);
            if (lottieAnimationView != null) {
                i = R$id.operation_state_animation_big;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(viewInflate, i);
                if (lottieAnimationView2 != null) {
                    i = R$id.operation_state_animation_big_mask;
                    CircleClipView circleClipView = (CircleClipView) ViewBindings.findChildViewById(viewInflate, i);
                    if (circleClipView != null) {
                        i = R$id.operation_state_animation_container;
                        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i)) != null) {
                            i = R$id.operation_state_animation_mask;
                            CircleClipView circleClipView2 = (CircleClipView) ViewBindings.findChildViewById(viewInflate, i);
                            if (circleClipView2 != null) {
                                i = R$id.operation_state_image;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i);
                                if (imageView != null) {
                                    i = R$id.operation_state_image_big;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, i);
                                    if (imageView2 != null) {
                                        i = R$id.operation_state_link;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, i);
                                        if (appCompatTextView != null) {
                                            i = R$id.operation_state_progress;
                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, i);
                                            if (progressBar != null) {
                                                i = R$id.operation_state_subtitle;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, i);
                                                if (appCompatTextView2 != null) {
                                                    i = R$id.operation_state_title;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, i);
                                                    if (appCompatTextView3 != null) {
                                                        i = R$id.player_view;
                                                        FullScreenStateView fullScreenStateView = (FullScreenStateView) ViewBindings.findChildViewById(viewInflate, i);
                                                        if (fullScreenStateView != null) {
                                                            LegacyContentContainerFrameLayout legacyContentContainerFrameLayout = (LegacyContentContainerFrameLayout) viewInflate;
                                                            this.f104423e0 = new f3l.a(legacyContentContainerFrameLayout, largeActionButton, lottieAnimationView, lottieAnimationView2, circleClipView, circleClipView2, imageView, imageView2, appCompatTextView, progressBar, appCompatTextView2, appCompatTextView3, fullScreenStateView);
                                                            Intrinsics.checkNotNullExpressionValue(legacyContentContainerFrameLayout, "getRoot(...)");
                                                            return legacyContentContainerFrameLayout;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f104423e0 = null;
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Intrinsics.checkNotNullExpressionValue(requireActivity(), "requireActivity(...)");
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        KeyEventDispatcher.Component activity = getActivity();
        Intrinsics.i(activity, "null cannot be cast to non-null type com.revolut.retail.operation_status.step.di.OperationStatusStepPresenterInjector");
        return ((q3l.b) activity).E0();
    }
}
