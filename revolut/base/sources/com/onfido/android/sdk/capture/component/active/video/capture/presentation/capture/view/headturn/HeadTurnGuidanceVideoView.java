package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.util.OvalAlignedView;
import com.onfido.android.sdk.capture.databinding.OnfidoAvcViewHeadTurnAnimBinding;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u001c\u0010\u0010\u001a\u00020\u000e*\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/headturn/HeadTurnGuidanceVideoView;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/util/OvalAlignedView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoAvcViewHeadTurnAnimBinding;", "hide", "", "show", "loadAnim", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/headturn/OnfidoAnimWebView;", "onPageFinished", "Lkotlin/Function0;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HeadTurnGuidanceVideoView extends OvalAlignedView {

    @NotNull
    public static final String CAPTURE_ANIM_PATH = "motion-helper.json";

    @NotNull
    private final OnfidoAvcViewHeadTurnAnimBinding binding;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.HeadTurnGuidanceVideoView$loadAnim$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3682invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3682invoke();
            return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadTurnGuidanceVideoView(@NotNull Context context) throws JSONException {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        OnfidoAvcViewHeadTurnAnimBinding onfidoAvcViewHeadTurnAnimBindingInflate = OnfidoAvcViewHeadTurnAnimBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoAvcViewHeadTurnAnimBindingInflate, "inflate(...)");
        this.binding = onfidoAvcViewHeadTurnAnimBindingInflate;
        OnfidoAnimWebView animWebView = onfidoAvcViewHeadTurnAnimBindingInflate.animWebView;
        Intrinsics.checkNotNullExpressionValue(animWebView, "animWebView");
        loadAnim$default(this, animWebView, null, 1, null);
    }

    private final void loadAnim(OnfidoAnimWebView onfidoAnimWebView, Function0<Unit> function0) throws JSONException {
        OnfidoAnimWebView.loadAnim$default(onfidoAnimWebView, "motion-helper.json", false, null, false, 0, R.string.onfido_avc_intro_video_accessibility, R.string.onfido_video_intro_button_play_accessibility, R.string.onfido_video_intro_button_pause_accessibility, function0, 30, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadAnim$default(HeadTurnGuidanceVideoView headTurnGuidanceVideoView, OnfidoAnimWebView onfidoAnimWebView, Function0 function0, int i, Object obj2) throws JSONException {
        if ((i & 1) != 0) {
            function0 = AnonymousClass1.INSTANCE;
        }
        headTurnGuidanceVideoView.loadAnim(onfidoAnimWebView, function0);
    }

    public final void hide() {
        ViewExtensionsKt.hideWithAlphaAnim$default(this, BitmapDescriptorFactory.HUE_RED, 0L, 3, null);
    }

    public final void show() throws JSONException {
        OnfidoAnimWebView onfidoAnimWebView = this.binding.animWebView;
        Intrinsics.h(onfidoAnimWebView);
        loadAnim(onfidoAnimWebView, new HeadTurnGuidanceVideoView$show$1$1(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadTurnGuidanceVideoView(@NotNull Context context, AttributeSet attributeSet) throws JSONException {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        OnfidoAvcViewHeadTurnAnimBinding onfidoAvcViewHeadTurnAnimBindingInflate = OnfidoAvcViewHeadTurnAnimBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoAvcViewHeadTurnAnimBindingInflate, "inflate(...)");
        this.binding = onfidoAvcViewHeadTurnAnimBindingInflate;
        OnfidoAnimWebView animWebView = onfidoAvcViewHeadTurnAnimBindingInflate.animWebView;
        Intrinsics.checkNotNullExpressionValue(animWebView, "animWebView");
        loadAnim$default(this, animWebView, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadTurnGuidanceVideoView(@NotNull Context context, AttributeSet attributeSet, int i) throws JSONException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        OnfidoAvcViewHeadTurnAnimBinding onfidoAvcViewHeadTurnAnimBindingInflate = OnfidoAvcViewHeadTurnAnimBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoAvcViewHeadTurnAnimBindingInflate, "inflate(...)");
        this.binding = onfidoAvcViewHeadTurnAnimBindingInflate;
        OnfidoAnimWebView animWebView = onfidoAvcViewHeadTurnAnimBindingInflate.animWebView;
        Intrinsics.checkNotNullExpressionValue(animWebView, "animWebView");
        loadAnim$default(this, animWebView, null, 1, null);
    }
}
