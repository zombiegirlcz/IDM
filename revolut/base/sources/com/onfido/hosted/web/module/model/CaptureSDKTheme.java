package com.onfido.hosted.web.module.model;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import p.a;
import qlm.h0;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002)*BI\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÁ\u0001¢\u0006\u0002\b(R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, d2 = {"Lcom/onfido/hosted/web/module/model/CaptureSDKTheme;", "", "seen1", "", "name", "", "legacyConfig", "", "config", "Lcom/onfido/hosted/web/module/model/WebSdkThemeConfig;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/Map;Lcom/onfido/hosted/web/module/model/WebSdkThemeConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/Map;Lcom/onfido/hosted/web/module/model/WebSdkThemeConfig;)V", "getConfig$annotations", "()V", "getConfig", "()Lcom/onfido/hosted/web/module/model/WebSdkThemeConfig;", "getLegacyConfig$annotations", "getLegacyConfig", "()Ljava/util/Map;", "getName$annotations", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_capture_sdk_core_release", "$serializer", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class CaptureSDKTheme {

    @NotNull
    private static final KSerializer[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final WebSdkThemeConfig config;

    @NotNull
    private final Map<String, String> legacyConfig;

    @NotNull
    private final String name;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/hosted/web/module/model/CaptureSDKTheme$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/hosted/web/module/model/CaptureSDKTheme;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return CaptureSDKTheme$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        v1 v1Var = v1.f247718a;
        $childSerializers = new KSerializer[]{null, new h0(v1Var, v1Var, 1), null};
    }

    @d
    public /* synthetic */ CaptureSDKTheme(int i, String str, Map map, WebSdkThemeConfig webSdkThemeConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            j1.f(CaptureSDKTheme$$serializer.INSTANCE.getDescriptor(), i, 3);
            throw null;
        }
        this.name = str;
        this.legacyConfig = map;
        if ((i & 4) == 0) {
            this.config = null;
        } else {
            this.config = webSdkThemeConfig;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptureSDKTheme copy$default(CaptureSDKTheme captureSDKTheme, String str, Map map, WebSdkThemeConfig webSdkThemeConfig, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = captureSDKTheme.name;
        }
        if ((i & 2) != 0) {
            map = captureSDKTheme.legacyConfig;
        }
        if ((i & 4) != 0) {
            webSdkThemeConfig = captureSDKTheme.config;
        }
        return captureSDKTheme.copy(str, map, webSdkThemeConfig);
    }

    public static /* synthetic */ void getConfig$annotations() {
    }

    public static /* synthetic */ void getLegacyConfig$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_capture_sdk_core_release(CaptureSDKTheme self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.name);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.legacyConfig);
        if (!output.d(serialDesc) && self.config == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, WebSdkThemeConfig$$serializer.INSTANCE, self.config);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.legacyConfig;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WebSdkThemeConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final CaptureSDKTheme copy(@NotNull String name, @NotNull Map<String, String> legacyConfig, WebSdkThemeConfig config) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(legacyConfig, "legacyConfig");
        return new CaptureSDKTheme(name, legacyConfig, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureSDKTheme)) {
            return false;
        }
        CaptureSDKTheme captureSDKTheme = (CaptureSDKTheme) other;
        return Intrinsics.f(this.name, captureSDKTheme.name) && Intrinsics.f(this.legacyConfig, captureSDKTheme.legacyConfig) && Intrinsics.f(this.config, captureSDKTheme.config);
    }

    public final WebSdkThemeConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final Map<String, String> getLegacyConfig() {
        return this.legacyConfig;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iE = a.e(this.name.hashCode() * 31, 31, this.legacyConfig);
        WebSdkThemeConfig webSdkThemeConfig = this.config;
        return iE + (webSdkThemeConfig == null ? 0 : webSdkThemeConfig.hashCode());
    }

    @NotNull
    public String toString() {
        return "CaptureSDKTheme(name=" + this.name + ", legacyConfig=" + this.legacyConfig + ", config=" + this.config + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public CaptureSDKTheme(@NotNull String name, @NotNull Map<String, String> legacyConfig, WebSdkThemeConfig webSdkThemeConfig) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(legacyConfig, "legacyConfig");
        this.name = name;
        this.legacyConfig = legacyConfig;
        this.config = webSdkThemeConfig;
    }

    public /* synthetic */ CaptureSDKTheme(String str, Map map, WebSdkThemeConfig webSdkThemeConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? null : webSdkThemeConfig);
    }
}
