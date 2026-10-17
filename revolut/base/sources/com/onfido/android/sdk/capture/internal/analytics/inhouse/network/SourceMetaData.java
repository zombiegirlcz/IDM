package com.onfido.android.sdk.capture.internal.analytics.inhouse.network;

import ch.qos.logback.core.CoreConstants;
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
import qlm.h;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002,-BI\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0011J:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J&\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÁ\u0001¢\u0006\u0002\b+R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0012\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0015¨\u0006."}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/SourceMetaData;", "", "seen1", "", "platform", "", "version", "sdkEnvironment", "hasEnvironmentIntegrity", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getHasEnvironmentIntegrity$annotations", "()V", "getHasEnvironmentIntegrity", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPlatform$annotations", "getPlatform", "()Ljava/lang/String;", "getSdkEnvironment$annotations", "getSdkEnvironment", "getVersion$annotations", "getVersion", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/SourceMetaData;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_capture_sdk_core_release", "$serializer", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class SourceMetaData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean hasEnvironmentIntegrity;

    @NotNull
    private final String platform;
    private final String sdkEnvironment;

    @NotNull
    private final String version;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/SourceMetaData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/SourceMetaData;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SourceMetaData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @d
    public /* synthetic */ SourceMetaData(int i, String str, String str2, String str3, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            j1.f(SourceMetaData$$serializer.INSTANCE.getDescriptor(), i, 15);
            throw null;
        }
        this.platform = str;
        this.version = str2;
        this.sdkEnvironment = str3;
        this.hasEnvironmentIntegrity = bool;
    }

    public static /* synthetic */ SourceMetaData copy$default(SourceMetaData sourceMetaData, String str, String str2, String str3, Boolean bool, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = sourceMetaData.platform;
        }
        if ((i & 2) != 0) {
            str2 = sourceMetaData.version;
        }
        if ((i & 4) != 0) {
            str3 = sourceMetaData.sdkEnvironment;
        }
        if ((i & 8) != 0) {
            bool = sourceMetaData.hasEnvironmentIntegrity;
        }
        return sourceMetaData.copy(str, str2, str3, bool);
    }

    public static /* synthetic */ void getHasEnvironmentIntegrity$annotations() {
    }

    public static /* synthetic */ void getPlatform$annotations() {
    }

    public static /* synthetic */ void getSdkEnvironment$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_capture_sdk_core_release(SourceMetaData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.platform);
        output.encodeStringElement(serialDesc, 1, self.version);
        output.encodeNullableSerializableElement(serialDesc, 2, v1.f247718a, self.sdkEnvironment);
        output.encodeNullableSerializableElement(serialDesc, 3, h.f247648a, self.hasEnvironmentIntegrity);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSdkEnvironment() {
        return this.sdkEnvironment;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getHasEnvironmentIntegrity() {
        return this.hasEnvironmentIntegrity;
    }

    @NotNull
    public final SourceMetaData copy(@NotNull String platform, @NotNull String version, String sdkEnvironment, Boolean hasEnvironmentIntegrity) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(version, "version");
        return new SourceMetaData(platform, version, sdkEnvironment, hasEnvironmentIntegrity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceMetaData)) {
            return false;
        }
        SourceMetaData sourceMetaData = (SourceMetaData) other;
        return Intrinsics.f(this.platform, sourceMetaData.platform) && Intrinsics.f(this.version, sourceMetaData.version) && Intrinsics.f(this.sdkEnvironment, sourceMetaData.sdkEnvironment) && Intrinsics.f(this.hasEnvironmentIntegrity, sourceMetaData.hasEnvironmentIntegrity);
    }

    public final Boolean getHasEnvironmentIntegrity() {
        return this.hasEnvironmentIntegrity;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    public final String getSdkEnvironment() {
        return this.sdkEnvironment;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iC = a.c(this.platform.hashCode() * 31, 31, this.version);
        String str = this.sdkEnvironment;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hasEnvironmentIntegrity;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SourceMetaData(platform=" + this.platform + ", version=" + this.version + ", sdkEnvironment=" + this.sdkEnvironment + ", hasEnvironmentIntegrity=" + this.hasEnvironmentIntegrity + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public SourceMetaData(@NotNull String platform, @NotNull String version, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(version, "version");
        this.platform = platform;
        this.version = version;
        this.sdkEnvironment = str;
        this.hasEnvironmentIntegrity = bool;
    }
}
