package androidx.camera.core.impl;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R'\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\rR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Landroidx/camera/core/impl/SurfaceStreamSpecQueryResult;", "", "", "Landroidx/camera/core/impl/UseCaseConfig;", "Landroidx/camera/core/impl/StreamSpec;", "useCaseStreamSpecs", "Landroidx/camera/core/impl/AttachedSurfaceInfo;", "attachedSurfaceStreamSpecs", "", "maxSupportedFrameRate", "<init>", "(Ljava/util/Map;Ljava/util/Map;I)V", "component1", "()Ljava/util/Map;", "component2", "component3", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getUseCaseStreamSpecs", "getAttachedSurfaceStreamSpecs", "I", "getMaxSupportedFrameRate", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SurfaceStreamSpecQueryResult {

    @NotNull
    private final Map<AttachedSurfaceInfo, StreamSpec> attachedSurfaceStreamSpecs;
    private final int maxSupportedFrameRate;

    @NotNull
    private final Map<UseCaseConfig<?>, StreamSpec> useCaseStreamSpecs;

    /* JADX WARN: Multi-variable type inference failed */
    public SurfaceStreamSpecQueryResult(@NotNull Map<UseCaseConfig<?>, ? extends StreamSpec> useCaseStreamSpecs, @NotNull Map<AttachedSurfaceInfo, ? extends StreamSpec> attachedSurfaceStreamSpecs, int i) {
        Intrinsics.checkNotNullParameter(useCaseStreamSpecs, "useCaseStreamSpecs");
        Intrinsics.checkNotNullParameter(attachedSurfaceStreamSpecs, "attachedSurfaceStreamSpecs");
        this.useCaseStreamSpecs = useCaseStreamSpecs;
        this.attachedSurfaceStreamSpecs = attachedSurfaceStreamSpecs;
        this.maxSupportedFrameRate = i;
    }

    @NotNull
    public final Map<UseCaseConfig<?>, StreamSpec> component1() {
        return this.useCaseStreamSpecs;
    }

    @NotNull
    public final Map<AttachedSurfaceInfo, StreamSpec> component2() {
        return this.attachedSurfaceStreamSpecs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxSupportedFrameRate() {
        return this.maxSupportedFrameRate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurfaceStreamSpecQueryResult)) {
            return false;
        }
        SurfaceStreamSpecQueryResult surfaceStreamSpecQueryResult = (SurfaceStreamSpecQueryResult) other;
        return Intrinsics.f(this.useCaseStreamSpecs, surfaceStreamSpecQueryResult.useCaseStreamSpecs) && Intrinsics.f(this.attachedSurfaceStreamSpecs, surfaceStreamSpecQueryResult.attachedSurfaceStreamSpecs) && this.maxSupportedFrameRate == surfaceStreamSpecQueryResult.maxSupportedFrameRate;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxSupportedFrameRate) + p.a.e(this.useCaseStreamSpecs.hashCode() * 31, 31, this.attachedSurfaceStreamSpecs);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb6.append(this.useCaseStreamSpecs);
        sb6.append(", attachedSurfaceStreamSpecs=");
        sb6.append(this.attachedSurfaceStreamSpecs);
        sb6.append(", maxSupportedFrameRate=");
        return j6.a.t(sb6, this.maxSupportedFrameRate, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
