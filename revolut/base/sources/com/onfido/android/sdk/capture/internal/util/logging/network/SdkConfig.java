package com.onfido.android.sdk.capture.internal.util.logging.network;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import m72.b;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.e;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002()BC\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J/\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÁ\u0001¢\u0006\u0002\b'R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/network/SdkConfig;", "", "seen1", "", "expectedSteps", "", "sdkToken", "stepsConfig", "", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/FlowStepConfig;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getExpectedSteps$annotations", "()V", "getExpectedSteps", "()Ljava/lang/String;", "getSdkToken$annotations", "getSdkToken", "getStepsConfig$annotations", "getStepsConfig", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_capture_sdk_core_release", "$serializer", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class SdkConfig {

    @NotNull
    private final String expectedSteps;
    private final String sdkToken;

    @NotNull
    private final List<FlowStepConfig> stepsConfig;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KSerializer[] $childSerializers = {null, null, new e(FlowStepConfig$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/network/SdkConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/SdkConfig;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SdkConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @d
    public /* synthetic */ SdkConfig(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            j1.f(SdkConfig$$serializer.INSTANCE.getDescriptor(), i, 7);
            throw null;
        }
        this.expectedSteps = str;
        this.sdkToken = str2;
        this.stepsConfig = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SdkConfig copy$default(SdkConfig sdkConfig, String str, String str2, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = sdkConfig.expectedSteps;
        }
        if ((i & 2) != 0) {
            str2 = sdkConfig.sdkToken;
        }
        if ((i & 4) != 0) {
            list = sdkConfig.stepsConfig;
        }
        return sdkConfig.copy(str, str2, list);
    }

    public static /* synthetic */ void getExpectedSteps$annotations() {
    }

    public static /* synthetic */ void getSdkToken$annotations() {
    }

    public static /* synthetic */ void getStepsConfig$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_capture_sdk_core_release(SdkConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.expectedSteps);
        output.encodeNullableSerializableElement(serialDesc, 1, v1.f247718a, self.sdkToken);
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.stepsConfig);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExpectedSteps() {
        return this.expectedSteps;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSdkToken() {
        return this.sdkToken;
    }

    @NotNull
    public final List<FlowStepConfig> component3() {
        return this.stepsConfig;
    }

    @NotNull
    public final SdkConfig copy(@NotNull String expectedSteps, String sdkToken, @NotNull List<FlowStepConfig> stepsConfig) {
        Intrinsics.checkNotNullParameter(expectedSteps, "expectedSteps");
        Intrinsics.checkNotNullParameter(stepsConfig, "stepsConfig");
        return new SdkConfig(expectedSteps, sdkToken, stepsConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkConfig)) {
            return false;
        }
        SdkConfig sdkConfig = (SdkConfig) other;
        return Intrinsics.f(this.expectedSteps, sdkConfig.expectedSteps) && Intrinsics.f(this.sdkToken, sdkConfig.sdkToken) && Intrinsics.f(this.stepsConfig, sdkConfig.stepsConfig);
    }

    @NotNull
    public final String getExpectedSteps() {
        return this.expectedSteps;
    }

    public final String getSdkToken() {
        return this.sdkToken;
    }

    @NotNull
    public final List<FlowStepConfig> getStepsConfig() {
        return this.stepsConfig;
    }

    public int hashCode() {
        int iHashCode = this.expectedSteps.hashCode() * 31;
        String str = this.sdkToken;
        return this.stepsConfig.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("SdkConfig(expectedSteps=");
        sb6.append(this.expectedSteps);
        sb6.append(", sdkToken=");
        sb6.append(this.sdkToken);
        sb6.append(", stepsConfig=");
        return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.stepsConfig, sb6);
    }

    public SdkConfig(@NotNull String expectedSteps, String str, @NotNull List<FlowStepConfig> stepsConfig) {
        Intrinsics.checkNotNullParameter(expectedSteps, "expectedSteps");
        Intrinsics.checkNotNullParameter(stepsConfig, "stepsConfig");
        this.expectedSteps = expectedSteps;
        this.sdkToken = str;
        this.stepsConfig = stepsConfig;
    }
}
