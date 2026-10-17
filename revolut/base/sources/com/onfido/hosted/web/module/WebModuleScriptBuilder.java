package com.onfido.hosted.web.module;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.api.client.e;
import com.onfido.hosted.web.module.model.CaptureSDKBootstrapConfig;
import com.onfido.hosted.web.module.model.CaptureSDKClassic;
import com.onfido.hosted.web.module.model.CaptureSDKClientConfiguration;
import com.onfido.hosted.web.module.model.CaptureSDKContext;
import com.onfido.hosted.web.module.model.CaptureSDKContextConfiguration;
import com.onfido.hosted.web.module.model.CaptureSDKContextPermission;
import com.onfido.hosted.web.module.model.CaptureSDKJsConfig;
import com.onfido.hosted.web.module.model.CaptureSDKOS;
import com.onfido.hosted.web.module.model.CaptureSDKStudio;
import com.onfido.hosted.web.module.model.CaptureSDKStudioTask;
import com.onfido.hosted.web.module.model.CaptureSDKTheme;
import com.onfido.hosted.web.module.model.HostedWebModuleCallbacks;
import com.onfido.hosted.web.module.model.HostedWebModuleModuleInfo;
import com.onfido.hosted.web.module.model.StudioModuleInfo;
import com.onfido.hosted.web.module.model.WebSdkThemeConfig;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jh.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import rlm.j;
import rlm.o;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J4\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J2\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0019J9\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0002\b\u001bJ\u0006\u0010\u001c\u001a\u00020\u0004¨\u0006\u001e"}, d2 = {"Lcom/onfido/hosted/web/module/WebModuleScriptBuilder;", "", "()V", "buildCallbackInstructions", "", "callback", "Lcom/onfido/hosted/web/module/model/HostedWebModuleCallbacks;", "buildCommonConfiguration", "Lkotlinx/serialization/json/JsonObject;", "webSdkTheme", "Lcom/onfido/hosted/web/module/WebModuleScriptBuilder$WebSDKTheme;", "locale", "Ljava/util/Locale;", "buildStudioCaptureSDKBootstrapConfig", "Lcom/onfido/hosted/web/module/model/CaptureSDKBootstrapConfig;", "token", "studioInfo", "Lcom/onfido/hosted/web/module/model/StudioModuleInfo;", "moduleInfo", "Lcom/onfido/hosted/web/module/model/HostedWebModuleModuleInfo;", "getConfigScript", "isStudioUserFlowExitEnabled", "", "getCurrentSdkTheme", "isDarkModeEnabled", "getCurrentSdkTheme$onfido_capture_sdk_core_release", "getJsonConfig", "getJsonConfig$onfido_capture_sdk_core_release", "getNavigateBackScript", "WebSDKTheme", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WebModuleScriptBuilder {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0018B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/onfido/hosted/web/module/WebModuleScriptBuilder$WebSDKTheme;", "", "isDarkModeEnabled", "", "legacyConfig", "", "", "config", "Lcom/onfido/hosted/web/module/WebModuleScriptBuilder$WebSDKTheme$Config;", "(ZLjava/util/Map;Lcom/onfido/hosted/web/module/WebModuleScriptBuilder$WebSDKTheme$Config;)V", "getConfig", "()Lcom/onfido/hosted/web/module/WebModuleScriptBuilder$WebSDKTheme$Config;", "()Z", "getLegacyConfig", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Config", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WebSDKTheme {
        private final Config config;
        private final boolean isDarkModeEnabled;

        @NotNull
        private final Map<String, String> legacyConfig;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/onfido/hosted/web/module/WebModuleScriptBuilder$WebSDKTheme$Config;", "", "fontFamilyTitle", "", "fontWeightTitle", "", "fontFamilySubtitle", "fontWeightSubtitle", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getFontFamilySubtitle", "()Ljava/lang/String;", "getFontFamilyTitle", "getFontWeightSubtitle", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFontWeightTitle", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/onfido/hosted/web/module/WebModuleScriptBuilder$WebSDKTheme$Config;", "equals", "", "other", "hashCode", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Config {
            private final String fontFamilySubtitle;
            private final String fontFamilyTitle;
            private final Integer fontWeightSubtitle;
            private final Integer fontWeightTitle;

            public Config() {
                this(null, null, null, null, 15, null);
            }

            public static /* synthetic */ Config copy$default(Config config, String str, Integer num, String str2, Integer num2, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = config.fontFamilyTitle;
                }
                if ((i & 2) != 0) {
                    num = config.fontWeightTitle;
                }
                if ((i & 4) != 0) {
                    str2 = config.fontFamilySubtitle;
                }
                if ((i & 8) != 0) {
                    num2 = config.fontWeightSubtitle;
                }
                return config.copy(str, num, str2, num2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getFontFamilyTitle() {
                return this.fontFamilyTitle;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Integer getFontWeightTitle() {
                return this.fontWeightTitle;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getFontFamilySubtitle() {
                return this.fontFamilySubtitle;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final Integer getFontWeightSubtitle() {
                return this.fontWeightSubtitle;
            }

            @NotNull
            public final Config copy(String fontFamilyTitle, Integer fontWeightTitle, String fontFamilySubtitle, Integer fontWeightSubtitle) {
                return new Config(fontFamilyTitle, fontWeightTitle, fontFamilySubtitle, fontWeightSubtitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Config)) {
                    return false;
                }
                Config config = (Config) other;
                return Intrinsics.f(this.fontFamilyTitle, config.fontFamilyTitle) && Intrinsics.f(this.fontWeightTitle, config.fontWeightTitle) && Intrinsics.f(this.fontFamilySubtitle, config.fontFamilySubtitle) && Intrinsics.f(this.fontWeightSubtitle, config.fontWeightSubtitle);
            }

            public final String getFontFamilySubtitle() {
                return this.fontFamilySubtitle;
            }

            public final String getFontFamilyTitle() {
                return this.fontFamilyTitle;
            }

            public final Integer getFontWeightSubtitle() {
                return this.fontWeightSubtitle;
            }

            public final Integer getFontWeightTitle() {
                return this.fontWeightTitle;
            }

            public int hashCode() {
                String str = this.fontFamilyTitle;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.fontWeightTitle;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.fontFamilySubtitle;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.fontWeightSubtitle;
                return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Config(fontFamilyTitle=" + this.fontFamilyTitle + ", fontWeightTitle=" + this.fontWeightTitle + ", fontFamilySubtitle=" + this.fontFamilySubtitle + ", fontWeightSubtitle=" + this.fontWeightSubtitle + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            public Config(String str, Integer num, String str2, Integer num2) {
                this.fontFamilyTitle = str;
                this.fontWeightTitle = num;
                this.fontFamilySubtitle = str2;
                this.fontWeightSubtitle = num2;
            }

            public /* synthetic */ Config(String str, Integer num, String str2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2);
            }
        }

        public WebSDKTheme(boolean z, @NotNull Map<String, String> legacyConfig, Config config) {
            Intrinsics.checkNotNullParameter(legacyConfig, "legacyConfig");
            this.isDarkModeEnabled = z;
            this.legacyConfig = legacyConfig;
            this.config = config;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WebSDKTheme copy$default(WebSDKTheme webSDKTheme, boolean z, Map map, Config config, int i, Object obj2) {
            if ((i & 1) != 0) {
                z = webSDKTheme.isDarkModeEnabled;
            }
            if ((i & 2) != 0) {
                map = webSDKTheme.legacyConfig;
            }
            if ((i & 4) != 0) {
                config = webSDKTheme.config;
            }
            return webSDKTheme.copy(z, map, config);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsDarkModeEnabled() {
            return this.isDarkModeEnabled;
        }

        @NotNull
        public final Map<String, String> component2() {
            return this.legacyConfig;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Config getConfig() {
            return this.config;
        }

        @NotNull
        public final WebSDKTheme copy(boolean isDarkModeEnabled, @NotNull Map<String, String> legacyConfig, Config config) {
            Intrinsics.checkNotNullParameter(legacyConfig, "legacyConfig");
            return new WebSDKTheme(isDarkModeEnabled, legacyConfig, config);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebSDKTheme)) {
                return false;
            }
            WebSDKTheme webSDKTheme = (WebSDKTheme) other;
            return this.isDarkModeEnabled == webSDKTheme.isDarkModeEnabled && Intrinsics.f(this.legacyConfig, webSDKTheme.legacyConfig) && Intrinsics.f(this.config, webSDKTheme.config);
        }

        public final Config getConfig() {
            return this.config;
        }

        @NotNull
        public final Map<String, String> getLegacyConfig() {
            return this.legacyConfig;
        }

        public int hashCode() {
            int iE = p.a.e(Boolean.hashCode(this.isDarkModeEnabled) * 31, 31, this.legacyConfig);
            Config config = this.config;
            return iE + (config == null ? 0 : config.hashCode());
        }

        public final boolean isDarkModeEnabled() {
            return this.isDarkModeEnabled;
        }

        @NotNull
        public String toString() {
            return "WebSDKTheme(isDarkModeEnabled=" + this.isDarkModeEnabled + ", legacyConfig=" + this.legacyConfig + ", config=" + this.config + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ WebSDKTheme(boolean z, Map map, Config config, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, map, (i & 4) != 0 ? null : config);
        }
    }

    private final String buildCallbackInstructions(HostedWebModuleCallbacks callback) {
        StringBuilder sb6;
        String str;
        if (callback == HostedWebModuleCallbacks.ANALYTICS_SEND) {
            sb6 = new StringBuilder("\n            window.bridge.context.");
            sb6.append(callback.getId());
            sb6.append(" = (event, properties) => {\n                try {\n                    window.callbackHandler.");
            sb6.append(callback.getId());
            str = "(JSON.stringify({event, properties}));\n                } catch (e) {\n                    window.callbackHandler.captureModuleError(JSON.stringify({message: e.message})); \n                }\n            };\n            ";
        } else {
            sb6 = new StringBuilder("\n            window.bridge.context.");
            sb6.append(callback.getId());
            sb6.append(" = (response) => {\n                try {\n                    window.callbackHandler.");
            sb6.append(callback.getId());
            str = "(JSON.stringify(response));\n                } catch (e) {\n                    window.callbackHandler.captureModuleError(JSON.stringify({message: e.message})); \n                }\n            };\n        ";
        }
        sb6.append(str);
        return t.e(sb6.toString());
    }

    private final JsonObject buildCommonConfiguration(WebSDKTheme webSdkTheme, Locale locale) {
        String string;
        o oVar = e.f50133a;
        String currentSdkTheme$onfido_capture_sdk_core_release = getCurrentSdkTheme$onfido_capture_sdk_core_release(webSdkTheme.isDarkModeEnabled());
        Map<String, String> legacyConfig = webSdkTheme.getLegacyConfig();
        WebSDKTheme.Config config = webSdkTheme.getConfig();
        CaptureSDKTheme captureSDKTheme = new CaptureSDKTheme(currentSdkTheme$onfido_capture_sdk_core_release, legacyConfig, config != null ? new WebSdkThemeConfig(config.getFontFamilyTitle(), config.getFontWeightTitle(), config.getFontFamilySubtitle(), config.getFontWeightSubtitle()) : null);
        KSerializer serializer = d.v(oVar.f187949b, o0.b(CaptureSDKTheme.class));
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Pair pair = new Pair("theme", g4i.a.O(oVar, captureSDKTheme, serializer));
        if (locale == null || (string = locale.toString()) == null) {
            string = Locale.getDefault().toString();
        }
        return new JsonObject(r0.k(pair, new Pair("language", j.c(string))));
    }

    public static /* synthetic */ JsonObject buildCommonConfiguration$default(WebModuleScriptBuilder webModuleScriptBuilder, WebSDKTheme webSDKTheme, Locale locale, int i, Object obj2) {
        if ((i & 2) != 0) {
            locale = null;
        }
        return webModuleScriptBuilder.buildCommonConfiguration(webSDKTheme, locale);
    }

    private final CaptureSDKBootstrapConfig buildStudioCaptureSDKBootstrapConfig(String token, StudioModuleInfo studioInfo, HostedWebModuleModuleInfo moduleInfo, WebSDKTheme webSdkTheme, Locale locale) {
        CaptureSDKClientConfiguration captureSDKClientConfiguration = new CaptureSDKClientConfiguration(token, null);
        String workflowRunId = studioInfo.getWorkflowRunId();
        CaptureSDKStudioTask captureSDKStudioTask = new CaptureSDKStudioTask(studioInfo.getTaskDefId(), studioInfo.getTaskId());
        Set<Map.Entry> setEntrySet = j.k(e.f50133a.d(moduleInfo.getConfig())).f187951a.entrySet();
        int iB = q0.b(w.t(setEntrySet, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return new CaptureSDKBootstrapConfig(captureSDKClientConfiguration, new CaptureSDKStudio(workflowRunId, captureSDKStudioTask, new JsonObject(linkedHashMap)), (CaptureSDKClassic) null, buildCommonConfiguration(webSdkTheme, locale), 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CaptureSDKBootstrapConfig buildStudioCaptureSDKBootstrapConfig$default(WebModuleScriptBuilder webModuleScriptBuilder, String str, StudioModuleInfo studioModuleInfo, HostedWebModuleModuleInfo hostedWebModuleModuleInfo, WebSDKTheme webSDKTheme, Locale locale, int i, Object obj2) {
        if ((i & 16) != 0) {
            locale = null;
        }
        return webModuleScriptBuilder.buildStudioCaptureSDKBootstrapConfig(str, studioModuleInfo, hostedWebModuleModuleInfo, webSDKTheme, locale);
    }

    public static /* synthetic */ String getConfigScript$default(WebModuleScriptBuilder webModuleScriptBuilder, HostedWebModuleModuleInfo hostedWebModuleModuleInfo, String str, boolean z, WebSDKTheme webSDKTheme, Locale locale, int i, Object obj2) {
        if ((i & 16) != 0) {
            locale = null;
        }
        return webModuleScriptBuilder.getConfigScript(hostedWebModuleModuleInfo, str, z, webSDKTheme, locale);
    }

    public static /* synthetic */ String getJsonConfig$onfido_capture_sdk_core_release$default(WebModuleScriptBuilder webModuleScriptBuilder, HostedWebModuleModuleInfo hostedWebModuleModuleInfo, String str, boolean z, WebSDKTheme webSDKTheme, Locale locale, int i, Object obj2) {
        if ((i & 16) != 0) {
            locale = null;
        }
        return webModuleScriptBuilder.getJsonConfig$onfido_capture_sdk_core_release(hostedWebModuleModuleInfo, str, z, webSDKTheme, locale);
    }

    @NotNull
    public final String getConfigScript(@NotNull HostedWebModuleModuleInfo moduleInfo, @NotNull String token, boolean isStudioUserFlowExitEnabled, @NotNull WebSDKTheme webSdkTheme, Locale locale) {
        Intrinsics.checkNotNullParameter(moduleInfo, "moduleInfo");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(webSdkTheme, "webSdkTheme");
        StringBuilder sb6 = new StringBuilder();
        for (HostedWebModuleCallbacks hostedWebModuleCallbacks : HostedWebModuleCallbacks.values()) {
            sb6.append(buildCallbackInstructions(hostedWebModuleCallbacks) + '\n');
        }
        return t.e("\n            try {\n                " + ((Object) sb6) + "\n                window.bridge.context.bootstrapComplete = () => window.bridge.sdk.start(" + moduleInfo.getInput() + ");\n                window.bridge.sdk.bootstrap(" + getJsonConfig$onfido_capture_sdk_core_release(moduleInfo, token, isStudioUserFlowExitEnabled, webSdkTheme, locale) + ");\n            } catch (e) {\n                window.callbackHandler.bootstrapError(JSON.stringify({message: e.message}));\n            }\n        ");
    }

    @NotNull
    public final String getCurrentSdkTheme$onfido_capture_sdk_core_release(boolean isDarkModeEnabled) {
        return isDarkModeEnabled ? "dark" : "light";
    }

    @NotNull
    public final String getJsonConfig$onfido_capture_sdk_core_release(@NotNull HostedWebModuleModuleInfo moduleInfo, @NotNull String token, boolean isStudioUserFlowExitEnabled, @NotNull WebSDKTheme webSdkTheme, Locale locale) {
        CaptureSDKBootstrapConfig captureSDKBootstrapConfig;
        Intrinsics.checkNotNullParameter(moduleInfo, "moduleInfo");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(webSdkTheme, "webSdkTheme");
        boolean z = moduleInfo.getStudioInfo() != null;
        if (z) {
            StudioModuleInfo studioInfo = moduleInfo.getStudioInfo();
            if (studioInfo == null) {
                throw new IllegalArgumentException("StudioInfo cannot be null in studio mode");
            }
            captureSDKBootstrapConfig = buildStudioCaptureSDKBootstrapConfig(token, studioInfo, moduleInfo, webSdkTheme, locale);
        } else {
            if (moduleInfo.getClassicInfo() == null) {
                throw new IllegalArgumentException("Both studioInfo and classicInfo cannot be null");
            }
            captureSDKBootstrapConfig = new CaptureSDKBootstrapConfig(new CaptureSDKClientConfiguration(token, null), (CaptureSDKStudio) null, new CaptureSDKClassic(moduleInfo.getClassicInfo().getType(), moduleInfo.getClassicInfo().getStep()), buildCommonConfiguration(webSdkTheme, locale), 2, (DefaultConstructorMarker) null);
        }
        Timber.INSTANCE.d("Generated config for bootstrapping the web module: " + captureSDKBootstrapConfig, new Object[0]);
        CaptureSDKJsConfig captureSDKJsConfig = new CaptureSDKJsConfig(captureSDKBootstrapConfig, new CaptureSDKContext("android", "23.11.0", new CaptureSDKOS(String.valueOf(Build.VERSION.SDK_INT)), new CaptureSDKContextConfiguration(true, isStudioUserFlowExitEnabled, z ^ true), (CaptureSDKContextPermission) null, 16, (DefaultConstructorMarker) null));
        o oVar = e.f50133a;
        return oVar.c(d.v(oVar.f187949b, o0.b(CaptureSDKJsConfig.class)), captureSDKJsConfig);
    }

    @NotNull
    public final String getNavigateBackScript() {
        return "(function() {\n    try {\n        return window.bridge.sdk.back?.() || false\n    } catch (e) {\n        console.error(e);\n        return 'Error: ' + e.message + '\\nStack: ' + e.stack\n    }\n})()";
    }
}
