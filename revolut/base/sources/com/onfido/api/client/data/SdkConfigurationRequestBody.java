package com.onfido.api.client.data;

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
import qlm.j1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(B=\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J&\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÁ\u0001¢\u0006\u0002\b&R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0013¨\u0006)"}, d2 = {"Lcom/onfido/api/client/data/SdkConfigurationRequestBody;", "", "seen1", "", "sdkSource", "", "sdkVersion", "sdkMetadata", "Lcom/onfido/api/client/data/DeviceInfo;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/onfido/api/client/data/DeviceInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/onfido/api/client/data/DeviceInfo;)V", "getSdkMetadata$annotations", "()V", "getSdkMetadata", "()Lcom/onfido/api/client/data/DeviceInfo;", "getSdkSource$annotations", "getSdkSource", "()Ljava/lang/String;", "getSdkVersion$annotations", "getSdkVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class SdkConfigurationRequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final DeviceInfo sdkMetadata;

    @NotNull
    private final String sdkSource;

    @NotNull
    private final String sdkVersion;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SdkConfigurationRequestBody$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkConfigurationRequestBody;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SdkConfigurationRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @d
    public /* synthetic */ SdkConfigurationRequestBody(int i, String str, String str2, DeviceInfo deviceInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            j1.f(SdkConfigurationRequestBody$$serializer.INSTANCE.getDescriptor(), i, 7);
            throw null;
        }
        this.sdkSource = str;
        this.sdkVersion = str2;
        this.sdkMetadata = deviceInfo;
    }

    public static /* synthetic */ SdkConfigurationRequestBody copy$default(SdkConfigurationRequestBody sdkConfigurationRequestBody, String str, String str2, DeviceInfo deviceInfo, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = sdkConfigurationRequestBody.sdkSource;
        }
        if ((i & 2) != 0) {
            str2 = sdkConfigurationRequestBody.sdkVersion;
        }
        if ((i & 4) != 0) {
            deviceInfo = sdkConfigurationRequestBody.sdkMetadata;
        }
        return sdkConfigurationRequestBody.copy(str, str2, deviceInfo);
    }

    public static /* synthetic */ void getSdkMetadata$annotations() {
    }

    public static /* synthetic */ void getSdkSource$annotations() {
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(SdkConfigurationRequestBody self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.sdkSource);
        output.encodeStringElement(serialDesc, 1, self.sdkVersion);
        output.encodeSerializableElement(serialDesc, 2, DeviceInfo$$serializer.INSTANCE, self.sdkMetadata);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSdkSource() {
        return this.sdkSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DeviceInfo getSdkMetadata() {
        return this.sdkMetadata;
    }

    @NotNull
    public final SdkConfigurationRequestBody copy(@NotNull String sdkSource, @NotNull String sdkVersion, @NotNull DeviceInfo sdkMetadata) {
        Intrinsics.checkNotNullParameter(sdkSource, "sdkSource");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sdkMetadata, "sdkMetadata");
        return new SdkConfigurationRequestBody(sdkSource, sdkVersion, sdkMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkConfigurationRequestBody)) {
            return false;
        }
        SdkConfigurationRequestBody sdkConfigurationRequestBody = (SdkConfigurationRequestBody) other;
        return Intrinsics.f(this.sdkSource, sdkConfigurationRequestBody.sdkSource) && Intrinsics.f(this.sdkVersion, sdkConfigurationRequestBody.sdkVersion) && Intrinsics.f(this.sdkMetadata, sdkConfigurationRequestBody.sdkMetadata);
    }

    @NotNull
    public final DeviceInfo getSdkMetadata() {
        return this.sdkMetadata;
    }

    @NotNull
    public final String getSdkSource() {
        return this.sdkSource;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        return this.sdkMetadata.hashCode() + a.c(this.sdkSource.hashCode() * 31, 31, this.sdkVersion);
    }

    @NotNull
    public String toString() {
        String str = this.sdkSource;
        String str2 = this.sdkVersion;
        DeviceInfo deviceInfo = this.sdkMetadata;
        StringBuilder sbM = v0.a.m("SdkConfigurationRequestBody(sdkSource=", str, ", sdkVersion=", str2, ", sdkMetadata=");
        sbM.append(deviceInfo);
        sbM.append(")");
        return sbM.toString();
    }

    public SdkConfigurationRequestBody(@NotNull String sdkSource, @NotNull String sdkVersion, @NotNull DeviceInfo sdkMetadata) {
        Intrinsics.checkNotNullParameter(sdkSource, "sdkSource");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sdkMetadata, "sdkMetadata");
        this.sdkSource = sdkSource;
        this.sdkVersion = sdkVersion;
        this.sdkMetadata = sdkMetadata;
    }
}
