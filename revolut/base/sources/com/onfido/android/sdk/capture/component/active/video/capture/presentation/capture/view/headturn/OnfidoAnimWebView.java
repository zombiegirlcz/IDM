package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004*\u0001\u001b\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0002Jd\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020\t2\b\b\u0001\u0010\u0016\u001a\u00020\t2\b\b\u0001\u0010\u0017\u001a\u00020\t2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019J\u001b\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0002¢\u0006\u0002\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/headturn/OnfidoAnimWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getCustomization", "", "loadAnim", "", "path", "isDarkMode", "", "background", "controls", "controlsTimeout", "animAccessibility", "buttonPlayAccessibility", "buttonPauseAccessibility", "onPageFinished", "Lkotlin/Function0;", "webViewClient", "com/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/headturn/OnfidoAnimWebView$webViewClient$1", "(Lkotlin/jvm/functions/Function0;)Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/headturn/OnfidoAnimWebView$webViewClient$1;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OnfidoAnimWebView extends WebView {

    @NotNull
    public static final String BACKGROUND_TRANSPARENT = "transparent";

    @NotNull
    public static final String THEME_LIGHT = "light";

    @NotNull
    public static final String LOTTIE_PLAYER_URL = "https://assets.onfido.com/lottie/index.html?";

    @NotNull
    public static final String THEME_DARK = "dark";

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.OnfidoAnimWebView$loadAnim$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3684invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3684invoke();
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.OnfidoAnimWebView$loadAnim$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function0<Unit> {
        final /* synthetic */ Function0<Unit> $onPageFinished;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0) {
            super(0);
            this.$onPageFinished = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3685invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3685invoke() {
            this.$onPageFinished.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnfidoAnimWebView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackgroundColor(0);
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setOnTouchListener(new b(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() == 2;
    }

    private final String getCustomization() throws JSONException {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iColorFromAttr = ContextUtilsKt.colorFromAttr(context, R.attr.onfidoColorMotionHeadTurnProgressCompleted);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iColorFromAttr2 = ContextUtilsKt.colorFromAttr(context2, R.attr.onfidoColorActionMain);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iColorFromAttr3 = ContextUtilsKt.colorFromAttr(context3, R.attr.onfidoColorActionMainPressed);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int iColorFromAttr4 = ContextUtilsKt.colorFromAttr(context4, R.attr.onfidoColorContentOnAction);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("onfidoColorMotionHeadTurnProgress", OnfidoAnimWebViewKt.toRgbString(iColorFromAttr));
        jSONObject.put("onfidoColorActionMainPressed", OnfidoAnimWebViewKt.toRgbString(iColorFromAttr3));
        jSONObject.put("onfidoColorActionMain", OnfidoAnimWebViewKt.toRgbString(iColorFromAttr2));
        jSONObject.put("onfidoColorContentOnAction", OnfidoAnimWebViewKt.toRgbString(iColorFromAttr4));
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String strEncode = Uri.encode(string);
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        return strEncode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadAnim$default(OnfidoAnimWebView onfidoAnimWebView, String str, boolean z, String str2, boolean z3, int i, int i2, int i3, int i5, Function0 function0, int i6, Object obj2) throws JSONException {
        if ((i6 & 2) != 0) {
            z = false;
        }
        if ((i6 & 4) != 0) {
            str2 = "transparent";
        }
        if ((i6 & 8) != 0) {
            z3 = false;
        }
        if ((i6 & 16) != 0) {
            i = 5;
        }
        if ((i6 & 256) != 0) {
            function0 = AnonymousClass1.INSTANCE;
        }
        onfidoAnimWebView.loadAnim(str, z, str2, z3, i, i2, i3, i5, function0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.OnfidoAnimWebView$webViewClient$1] */
    private final C19851 webViewClient(final Function0<Unit> onPageFinished) {
        return new WebViewClient() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.OnfidoAnimWebView.webViewClient.1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url2) {
                super.onPageFinished(view, url2);
                onPageFinished.invoke();
            }
        };
    }

    public final void loadAnim(@NotNull String path, boolean isDarkMode, @NotNull String background, boolean controls, int controlsTimeout, int animAccessibility, int buttonPlayAccessibility, int buttonPauseAccessibility, @NotNull Function0<Unit> onPageFinished) throws JSONException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(onPageFinished, "onPageFinished");
        setWebViewClient(webViewClient(new AnonymousClass2(onPageFinished)));
        String str = isDarkMode ? "dark" : "light";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("anim_accessibility", getContext().getString(animAccessibility));
        jSONObject.put("button_play_accessibility", getContext().getString(buttonPlayAccessibility));
        jSONObject.put("button_pause_accessibility", getContext().getString(buttonPauseAccessibility));
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String strEncode = Uri.encode(string);
        StringBuilder sbM = v0.a.m("https://assets.onfido.com/lottie/index.html?&path=", path, "&theme=", str, "&background=");
        sbM.append(background);
        sbM.append("&controls=");
        sbM.append(controls);
        sbM.append("&customization=");
        sbM.append(getCustomization());
        sbM.append("&controlsTimeout=");
        sbM.append(controlsTimeout);
        sbM.append("&localization=");
        sbM.append(strEncode);
        loadUrl(sbM.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnfidoAnimWebView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackgroundColor(0);
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setOnTouchListener(new b(0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnfidoAnimWebView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackgroundColor(0);
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setOnTouchListener(new b(0));
    }
}
