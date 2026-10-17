package androidx.camera.core.internal;

import androidx.camera.core.UseCase;
import androidx.camera.core.impl.StreamSpec;
import ch.qos.logback.core.CoreConstants;
import j6.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Landroidx/camera/core/internal/StreamSpecQueryResult;", "", "", "Landroidx/camera/core/UseCase;", "Landroidx/camera/core/impl/StreamSpec;", "streamSpecs", "", "maxSupportedFrameRate", "<init>", "(Ljava/util/Map;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getStreamSpecs", "()Ljava/util/Map;", "I", "getMaxSupportedFrameRate", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class StreamSpecQueryResult {
    private final int maxSupportedFrameRate;

    @NotNull
    private final Map<UseCase, StreamSpec> streamSpecs;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamSpecQueryResult(@NotNull Map<UseCase, ? extends StreamSpec> streamSpecs, int i) {
        Intrinsics.checkNotNullParameter(streamSpecs, "streamSpecs");
        this.streamSpecs = streamSpecs;
        this.maxSupportedFrameRate = i;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamSpecQueryResult)) {
            return false;
        }
        StreamSpecQueryResult streamSpecQueryResult = (StreamSpecQueryResult) other;
        return Intrinsics.f(this.streamSpecs, streamSpecQueryResult.streamSpecs) && this.maxSupportedFrameRate == streamSpecQueryResult.maxSupportedFrameRate;
    }

    public final int getMaxSupportedFrameRate() {
        return this.maxSupportedFrameRate;
    }

    @NotNull
    public final Map<UseCase, StreamSpec> getStreamSpecs() {
        return this.streamSpecs;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxSupportedFrameRate) + (this.streamSpecs.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb6.append(this.streamSpecs);
        sb6.append(", maxSupportedFrameRate=");
        return a.t(sb6, this.maxSupportedFrameRate, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ StreamSpecQueryResult(Map map, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? r0.g() : map, (i2 & 2) != 0 ? Integer.MAX_VALUE : i);
    }
}
