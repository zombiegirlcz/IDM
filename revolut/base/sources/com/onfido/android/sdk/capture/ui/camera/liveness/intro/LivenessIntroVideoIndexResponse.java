package com.onfido.android.sdk.capture.ui.camera.liveness.intro;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
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
import qlm.v1;
import yhm.d;
import zhm.f0;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB+\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0019\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/intro/LivenessIntroVideoIndexResponse;", "", "seen1", "", "paths", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getPaths$annotations", "()V", "getPaths", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_capture_sdk_core_release", "$serializer", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class LivenessIntroVideoIndexResponse {

    @NotNull
    private final List<String> paths;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KSerializer[] $childSerializers = {new e(v1.f247718a)};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/intro/LivenessIntroVideoIndexResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/intro/LivenessIntroVideoIndexResponse;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return LivenessIntroVideoIndexResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LivenessIntroVideoIndexResponse() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LivenessIntroVideoIndexResponse copy$default(LivenessIntroVideoIndexResponse livenessIntroVideoIndexResponse, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = livenessIntroVideoIndexResponse.paths;
        }
        return livenessIntroVideoIndexResponse.copy(list);
    }

    public static /* synthetic */ void getPaths$annotations() {
    }

    public static final void write$Self$onfido_capture_sdk_core_release(LivenessIntroVideoIndexResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        if (!output.d(serialDesc) && Intrinsics.f(self.paths, f0.f322471a)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.paths);
    }

    @NotNull
    public final List<String> component1() {
        return this.paths;
    }

    @NotNull
    public final LivenessIntroVideoIndexResponse copy(@NotNull List<String> paths) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        return new LivenessIntroVideoIndexResponse(paths);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LivenessIntroVideoIndexResponse) && Intrinsics.f(this.paths, ((LivenessIntroVideoIndexResponse) other).paths);
    }

    @NotNull
    public final List<String> getPaths() {
        return this.paths;
    }

    public int hashCode() {
        return this.paths.hashCode();
    }

    @NotNull
    public String toString() {
        return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.paths, new StringBuilder("LivenessIntroVideoIndexResponse(paths="));
    }

    @d
    public LivenessIntroVideoIndexResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.paths = f0.f322471a;
        } else {
            this.paths = list;
        }
    }

    public LivenessIntroVideoIndexResponse(@NotNull List<String> paths) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        this.paths = paths;
    }

    public LivenessIntroVideoIndexResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? f0.f322471a : list);
    }
}
