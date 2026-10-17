package com.onfido.hosted.web.module;

import a0.d;
import android.content.Context;
import android.content.res.Resources;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.utils.FontInfo;
import com.onfido.hosted.web.module.WebModuleScriptBuilder;
import com.onfido.hosted.web.module.utils.ContextUtilsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0016\u0010\f\u001a\u00020\u000b*\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lcom/onfido/hosted/web/module/WebModuleThemeBuilder;", "", "()V", "build", "Lcom/onfido/hosted/web/module/WebModuleScriptBuilder$WebSDKTheme;", "context", "Landroid/content/Context;", "isDarkModuleEnabled", "", "getAndroidTheme", "", "", "resolveFontNameFromAttr", "attr", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WebModuleThemeBuilder {

    @NotNull
    public static final WebModuleThemeBuilder INSTANCE = new WebModuleThemeBuilder();

    private WebModuleThemeBuilder() {
    }

    private final Map<String, String> getAndroidTheme(Context context) {
        Resources resources = context.getResources();
        int dimension = (int) (resources.getDimension(R.dimen.onfidoButtonCornerRadius) / resources.getDisplayMetrics().density);
        Pair pair = new Pair("onfidoColorBackground", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorBackground));
        Pair pair2 = new Pair("onfidoColorContentMain", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorContentMain));
        Pair pair3 = new Pair("onfidoColorContentSecondary", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorContentSecondary));
        Pair pair4 = new Pair("onfidoColorContentMainDark", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorContentMainDark));
        Pair pair5 = new Pair("onfidoColorContentNegative", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorContentNegative));
        Pair pair6 = new Pair("onfidoColorContentDisclaimer", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorContentDisclaimer));
        Pair pair7 = new Pair("onfidoColorWatermark", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorWatermark));
        Pair pair8 = new Pair("onfidoColorWatermarkDark", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorWatermarkDark));
        Pair pair9 = new Pair("onfidoColorProgressIndicator", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorProgressIndicator));
        Pair pair10 = new Pair("onfidoColorProgressTrack", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorProgressTrack));
        Pair pair11 = new Pair("onfidoColorIconStrokeNegative", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorIconStrokeNegative));
        Pair pair12 = new Pair("onfidoColorActionMain", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorActionMain));
        Pair pair13 = new Pair("onfidoColorActionMainPressed", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorActionMainPressed));
        Pair pair14 = new Pair("onfidoColorActionMainDisabled", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorActionMainDisabled));
        Pair pair15 = new Pair("onfidoColorContentOnAction", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorContentOnAction));
        Pair pair16 = new Pair("onfidoColorContentOnActionDisabled", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorContentOnActionDisabled));
        Pair pair17 = new Pair("onfidoColorActionSecondary", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorBackground));
        Pair pair18 = new Pair("onfidoColorActionSecondaryDisabled", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorActionSecondaryDisabled));
        Pair pair19 = new Pair("onfidoColorActionSecondaryPressed", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorActionSecondaryPressed));
        Pair pair20 = new Pair("onfidoColorContentOnActionSecondary", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorContentOnActionSecondary));
        Pair pair21 = new Pair("onfidoColorContentOnActionSecondaryDisabled", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorContentOnActionSecondaryDisabled));
        Pair pair22 = new Pair("onfidoColorActionSecondaryBorder", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorActionSecondaryBorder));
        Pair pair23 = new Pair("onfidoColorActionSecondaryBorderDisabled", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorActionSecondaryBorderDisabled));
        Pair pair24 = new Pair("onfidoColorToolbarBackground", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorToolbarBackground));
        Pair pair25 = new Pair("onfidoColorContentToolbarTitle", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorContentToolbarTitle));
        Pair pair26 = new Pair("onfidoColorIconStroke", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorIconStroke));
        Pair pair27 = new Pair("onfidoColorIconFill", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorIconFill));
        Pair pair28 = new Pair("onfidoColorIconBackground", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorIconBackground));
        Pair pair29 = new Pair("onfidoColorIconAccent", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorIconAccent));
        Pair pair30 = new Pair("onfidoColorIconDisclaimer", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorIconDisclaimer));
        Pair pair31 = new Pair("onfidoColorDisclaimerBackground", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorDisclaimerBackground));
        Pair pair32 = new Pair("onfidoBottomSheetBackground", ContextUtilsKt.hexFrom(context, R.attr.onfidoBottomSheetBackground));
        Pair pair33 = new Pair("onfidoColorProgressIndicatorIndeterminate", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorProgressIndicatorIndeterminate));
        Pair pair34 = new Pair("onfidoColorProgressTrackIndeterminate", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorProgressTrackIndeterminate));
        Pair pair35 = new Pair("onfidoColorToolbarIcon", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorToolbarIcon));
        Pair pair36 = new Pair("onfidoColorToolbarIconDark", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorToolbarIconDark));
        Pair pair37 = new Pair("onfidoColorPermissionsIconStroke", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorPermissionsIconStroke));
        Pair pair38 = new Pair("onfidoColorPermissionsCheckIconStroke", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorPermissionsTickIconStroke));
        Pair pair39 = new Pair("OnfidoCaptureValidationBubbleBackgroundColor", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorCaptureValidationBubbleBackground));
        Pair pair40 = new Pair("OnfidoCaptureValidationBubbleTextColor", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorCaptureValidationBubbleText));
        Pair pair41 = new Pair("OnfidoCaptureValidationBubbleBorderColor", ContextUtilsKt.hexFrom(context, R.attr.onfidoColorCaptureValidationBubbleBorder));
        WebModuleThemeBuilder webModuleThemeBuilder = INSTANCE;
        Pair pair42 = new Pair("onfidoFontFamily", webModuleThemeBuilder.resolveFontNameFromAttr(context, R.attr.onfidoFontFamily));
        Pair pair43 = new Pair("onfidoFontFamilyTitleAttr", webModuleThemeBuilder.resolveFontNameFromAttr(context, R.attr.onfidoFontFamilyTitle));
        String strResolveFontNameFromAttr = webModuleThemeBuilder.resolveFontNameFromAttr(context, R.attr.onfidoFontFamilyBody);
        if (strResolveFontNameFromAttr.length() == 0) {
            strResolveFontNameFromAttr = webModuleThemeBuilder.resolveFontNameFromAttr(context, R.attr.onfidoFontFamily);
        }
        return r0.n(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, pair39, pair40, pair41, pair42, pair43, new Pair("onfidoFontFamilyBodyAttr", strResolveFontNameFromAttr), new Pair("onfidoFontFamilySubtitleAttr", webModuleThemeBuilder.resolveFontNameFromAttr(context, R.attr.onfidoFontFamilySubtitle)), new Pair("onfidoFontFamilyButtonAttr", webModuleThemeBuilder.resolveFontNameFromAttr(context, R.attr.onfidoFontFamilyButton)), new Pair("onfidoFontFamilyToolbarTitleAttr", webModuleThemeBuilder.resolveFontNameFromAttr(context, R.attr.onfidoFontFamilyToolbarTitle)), new Pair("onfidoFontFamilyDialogButtonAttr", webModuleThemeBuilder.resolveFontNameFromAttr(context, R.attr.onfidoFontFamilyDialogButton)), new Pair("onfidoButtonCornerRadius", d.h(dimension, "px")));
    }

    private final String resolveFontNameFromAttr(Context context, int i) {
        FontInfo fontInfoResolveFontFromAttr = com.onfido.android.sdk.capture.utils.ContextUtilsKt.resolveFontFromAttr(context, i);
        String fontName = fontInfoResolveFontFromAttr != null ? fontInfoResolveFontFromAttr.getFontName() : null;
        return fontName == null ? "" : fontName;
    }

    @NotNull
    public final WebModuleScriptBuilder.WebSDKTheme build(@NotNull Context context, boolean isDarkModuleEnabled) {
        WebModuleScriptBuilder.WebSDKTheme.Config configCopy$default;
        int i = 500;
        Intrinsics.checkNotNullParameter(context, "context");
        Map<String, String> androidTheme = getAndroidTheme(context);
        String str = androidTheme.get("onfidoFontFamilyTitleAttr");
        String str2 = androidTheme.get("onfidoFontFamilySubtitleAttr");
        WebModuleScriptBuilder.WebSDKTheme.Config config = new WebModuleScriptBuilder.WebSDKTheme.Config(null, null, null, null, 15, null);
        if (str == null || !a0.y(str, "-medium", false)) {
            configCopy$default = config;
        } else {
            androidTheme.remove("onfidoFontFamilyTitleAttr");
            configCopy$default = new WebModuleScriptBuilder.WebSDKTheme.Config(d0.g0(str, "-medium"), i, null, null, 12, null);
        }
        if (str2 != null && a0.y(str2, "-medium", false)) {
            androidTheme.remove("onfidoFontFamilySubtitleAttr");
            configCopy$default = WebModuleScriptBuilder.WebSDKTheme.Config.copy$default(configCopy$default, null, null, d0.g0(str2, "-medium"), 500, 3, null);
        }
        return new WebModuleScriptBuilder.WebSDKTheme(isDarkModuleEnabled, androidTheme, configCopy$default);
    }
}
