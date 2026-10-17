package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.result.HapticFeedback;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.util.ViewExtensionsKt;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel;
import com.onfido.android.sdk.capture.databinding.OnfidoAvcViewHeadTurnGuidanceBinding;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import igm.g;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u0018J\u001e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010!\u001a\u00020\u0018H\u0014J(\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0014J\u0006\u0010'\u001a\u00020\u0018R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/headturn/HeadTurnGuidanceView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "alphaAnimator", "Landroid/view/ViewPropertyAnimator;", "announcementService", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoAvcViewHeadTurnGuidanceBinding;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "hapticFeedback", "Lcom/onfido/android/sdk/capture/common/result/HapticFeedback;", "viewModel", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/headturn/HeadTurnGuidanceViewModel;", "announceSideCompleteAccessibility", "", "resId", "isSecondHeadTurn", "", "hide", "initialize", "observeLeftTrackState", "observeRightTrackState", "observeViewState", "onDetachedFromWindow", "onSizeChanged", "w", "h", "oldw", "oldh", "show", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HeadTurnGuidanceView extends FrameLayout {
    private ViewPropertyAnimator alphaAnimator;
    private AnnouncementService announcementService;

    @NotNull
    private final OnfidoAvcViewHeadTurnGuidanceBinding binding;

    @NotNull
    private final CompositeDisposable compositeDisposable;
    private HapticFeedback hapticFeedback;
    private HeadTurnGuidanceViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadTurnGuidanceView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        OnfidoAvcViewHeadTurnGuidanceBinding onfidoAvcViewHeadTurnGuidanceBindingInflate = OnfidoAvcViewHeadTurnGuidanceBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoAvcViewHeadTurnGuidanceBindingInflate, "inflate(...)");
        this.binding = onfidoAvcViewHeadTurnGuidanceBindingInflate;
        this.compositeDisposable = new CompositeDisposable();
        onfidoAvcViewHeadTurnGuidanceBindingInflate.watermark.setDarkBackground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void announceSideCompleteAccessibility(int resId, boolean isSecondHeadTurn) {
        if (isSecondHeadTurn) {
            AnnouncementService announcementService = this.announcementService;
            if (announcementService != null) {
                announcementService.announceStringAsync(new int[]{resId}, true);
                return;
            } else {
                Intrinsics.r("announcementService");
                throw null;
            }
        }
        AnnouncementService announcementService2 = this.announcementService;
        if (announcementService2 != null) {
            announcementService2.announceStringAsync(new int[]{resId, R.string.onfido_avc_face_capture_feedback_turn_head_other_side_accessibility}, true);
        } else {
            Intrinsics.r("announcementService");
            throw null;
        }
    }

    private final void observeLeftTrackState(final HeadTurnGuidanceViewModel viewModel) {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableSubscribe = viewModel.getLeftTrackState().subscribe(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.HeadTurnGuidanceView.observeLeftTrackState.1
            @Override // igm.g
            public final void accept(@NotNull HeadTurnGuidanceViewModel.TrackState it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof HeadTurnGuidanceViewModel.TrackState.ProgressUpdated) {
                    HeadTurnGuidanceView.this.binding.headTurnProgressView.setLeftSideProgress(((HeadTurnGuidanceViewModel.TrackState.ProgressUpdated) it8).getFaceAngle());
                    return;
                }
                if (!Intrinsics.f(it8, HeadTurnGuidanceViewModel.TrackState.Completed.INSTANCE)) {
                    if (Intrinsics.f(it8, HeadTurnGuidanceViewModel.TrackState.Reset.INSTANCE)) {
                        HeadTurnGuidanceView.this.binding.headTurnProgressView.resetLeftSide();
                        return;
                    }
                    return;
                }
                HeadTurnGuidanceView.this.binding.headTurnProgressView.setLeftSideCompleted();
                HapticFeedback hapticFeedback = HeadTurnGuidanceView.this.hapticFeedback;
                if (hapticFeedback == null) {
                    Intrinsics.r("hapticFeedback");
                    throw null;
                }
                hapticFeedback.performTap(HeadTurnGuidanceView.this);
                HeadTurnGuidanceView headTurnGuidanceView = HeadTurnGuidanceView.this;
                headTurnGuidanceView.announceSideCompleteAccessibility(R.string.onfido_avc_face_capture_confirmation_left_side_complete_accessibility, headTurnGuidanceView.binding.headTurnProgressView.getRightSideCompleted());
                viewModel.startHeadTurnTimer();
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    private final void observeRightTrackState(final HeadTurnGuidanceViewModel viewModel) {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableSubscribe = viewModel.getRightTrackState().subscribe(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.HeadTurnGuidanceView.observeRightTrackState.1
            @Override // igm.g
            public final void accept(@NotNull HeadTurnGuidanceViewModel.TrackState it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof HeadTurnGuidanceViewModel.TrackState.ProgressUpdated) {
                    HeadTurnGuidanceView.this.binding.headTurnProgressView.setRightSideProgress(((HeadTurnGuidanceViewModel.TrackState.ProgressUpdated) it8).getFaceAngle());
                    return;
                }
                if (!Intrinsics.f(it8, HeadTurnGuidanceViewModel.TrackState.Completed.INSTANCE)) {
                    if (Intrinsics.f(it8, HeadTurnGuidanceViewModel.TrackState.Reset.INSTANCE)) {
                        HeadTurnGuidanceView.this.binding.headTurnProgressView.resetRightSide();
                        return;
                    }
                    return;
                }
                HeadTurnGuidanceView.this.binding.headTurnProgressView.setRightSideCompleted();
                HapticFeedback hapticFeedback = HeadTurnGuidanceView.this.hapticFeedback;
                if (hapticFeedback == null) {
                    Intrinsics.r("hapticFeedback");
                    throw null;
                }
                hapticFeedback.performTap(HeadTurnGuidanceView.this);
                HeadTurnGuidanceView headTurnGuidanceView = HeadTurnGuidanceView.this;
                headTurnGuidanceView.announceSideCompleteAccessibility(R.string.onfido_avc_face_capture_confirmation_right_side_complete_accessibility, headTurnGuidanceView.binding.headTurnProgressView.getLeftSideCompleted());
                viewModel.startHeadTurnTimer();
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    private final void observeViewState(HeadTurnGuidanceViewModel viewModel) {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableSubscribe = viewModel.getViewState().subscribe(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.HeadTurnGuidanceView.observeViewState.1
            @Override // igm.g
            public final void accept(@NotNull HeadTurnGuidanceViewModel.ViewState it8) throws JSONException {
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8.getShowHeadTurnAnim()) {
                    HeadTurnGuidanceView.this.binding.headTurnAnimView.show();
                } else {
                    HeadTurnGuidanceView.this.binding.headTurnAnimView.hide();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    public final void hide() {
        ViewPropertyAnimator viewPropertyAnimator = this.alphaAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        setAlpha(BitmapDescriptorFactory.HUE_RED);
        HeadTurnGuidanceViewModel headTurnGuidanceViewModel = this.viewModel;
        if (headTurnGuidanceViewModel != null) {
            headTurnGuidanceViewModel.reset();
        } else {
            Intrinsics.r("viewModel");
            throw null;
        }
    }

    public final void initialize(@NotNull HeadTurnGuidanceViewModel viewModel, @NotNull HapticFeedback hapticFeedback, @NotNull AnnouncementService announcementService) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(hapticFeedback, "hapticFeedback");
        Intrinsics.checkNotNullParameter(announcementService, "announcementService");
        this.viewModel = viewModel;
        this.hapticFeedback = hapticFeedback;
        this.announcementService = announcementService;
        observeViewState(viewModel);
        observeLeftTrackState(viewModel);
        observeRightTrackState(viewModel);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.compositeDisposable.d();
        HeadTurnGuidanceViewModel headTurnGuidanceViewModel = this.viewModel;
        if (headTurnGuidanceViewModel != null) {
            headTurnGuidanceViewModel.onViewDetached();
        } else {
            Intrinsics.r("viewModel");
            throw null;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w3, int h2, int oldw, int oldh) {
        TextView instructionTextView = this.binding.instructionTextView;
        Intrinsics.checkNotNullExpressionValue(instructionTextView, "instructionTextView");
        ViewExtensionsKt.setOvalMargin$default(instructionTextView, getWidth(), getHeight(), 0, 4, null);
    }

    public final void show() {
        this.alphaAnimator = com.onfido.android.sdk.capture.utils.ViewExtensionsKt.showWithAlphaAnim$default(this, BitmapDescriptorFactory.HUE_RED, 0L, 3, null);
        HeadTurnGuidanceViewModel headTurnGuidanceViewModel = this.viewModel;
        if (headTurnGuidanceViewModel == null) {
            Intrinsics.r("viewModel");
            throw null;
        }
        headTurnGuidanceViewModel.startHeadTurnTimer();
        HeadTurnGuidanceViewModel headTurnGuidanceViewModel2 = this.viewModel;
        if (headTurnGuidanceViewModel2 != null) {
            headTurnGuidanceViewModel2.trackScreenEvent();
        } else {
            Intrinsics.r("viewModel");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadTurnGuidanceView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        OnfidoAvcViewHeadTurnGuidanceBinding onfidoAvcViewHeadTurnGuidanceBindingInflate = OnfidoAvcViewHeadTurnGuidanceBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoAvcViewHeadTurnGuidanceBindingInflate, "inflate(...)");
        this.binding = onfidoAvcViewHeadTurnGuidanceBindingInflate;
        this.compositeDisposable = new CompositeDisposable();
        onfidoAvcViewHeadTurnGuidanceBindingInflate.watermark.setDarkBackground();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadTurnGuidanceView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        OnfidoAvcViewHeadTurnGuidanceBinding onfidoAvcViewHeadTurnGuidanceBindingInflate = OnfidoAvcViewHeadTurnGuidanceBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoAvcViewHeadTurnGuidanceBindingInflate, "inflate(...)");
        this.binding = onfidoAvcViewHeadTurnGuidanceBindingInflate;
        this.compositeDisposable = new CompositeDisposable();
        onfidoAvcViewHeadTurnGuidanceBindingInflate.watermark.setDarkBackground();
    }
}
