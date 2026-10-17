package androidx.camera.camera2.pipe.compat;

import android.view.Surface;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.StreamId;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006\""}, d2 = {"Landroidx/camera/camera2/pipe/compat/OutputConfigurations;", "", "", "Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "all", "", "Landroidx/camera/camera2/pipe/StreamId;", "deferred", "postviewOutput", "Landroidx/camera/camera2/pipe/OutputId;", "Landroid/view/Surface;", "outputSurfaceMap", "<init>", "(Ljava/util/List;Ljava/util/Map;Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAll", "()Ljava/util/List;", "Ljava/util/Map;", "getDeferred", "()Ljava/util/Map;", "Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "getPostviewOutput", "()Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "getOutputSurfaceMap", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OutputConfigurations {

    @NotNull
    private final List<OutputConfigurationWrapper> all;

    @NotNull
    private final Map<StreamId, OutputConfigurationWrapper> deferred;

    @NotNull
    private final Map<OutputId, Surface> outputSurfaceMap;
    private final OutputConfigurationWrapper postviewOutput;

    /* JADX WARN: Multi-variable type inference failed */
    public OutputConfigurations(@NotNull List<? extends OutputConfigurationWrapper> all2, @NotNull Map<StreamId, ? extends OutputConfigurationWrapper> deferred, OutputConfigurationWrapper outputConfigurationWrapper, @NotNull Map<OutputId, ? extends Surface> outputSurfaceMap) {
        Intrinsics.checkNotNullParameter(all2, "all");
        Intrinsics.checkNotNullParameter(deferred, "deferred");
        Intrinsics.checkNotNullParameter(outputSurfaceMap, "outputSurfaceMap");
        this.all = all2;
        this.deferred = deferred;
        this.postviewOutput = outputConfigurationWrapper;
        this.outputSurfaceMap = outputSurfaceMap;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutputConfigurations)) {
            return false;
        }
        OutputConfigurations outputConfigurations = (OutputConfigurations) other;
        return Intrinsics.f(this.all, outputConfigurations.all) && Intrinsics.f(this.deferred, outputConfigurations.deferred) && Intrinsics.f(this.postviewOutput, outputConfigurations.postviewOutput) && Intrinsics.f(this.outputSurfaceMap, outputConfigurations.outputSurfaceMap);
    }

    @NotNull
    public final List<OutputConfigurationWrapper> getAll() {
        return this.all;
    }

    @NotNull
    public final Map<StreamId, OutputConfigurationWrapper> getDeferred() {
        return this.deferred;
    }

    @NotNull
    public final Map<OutputId, Surface> getOutputSurfaceMap() {
        return this.outputSurfaceMap;
    }

    public final OutputConfigurationWrapper getPostviewOutput() {
        return this.postviewOutput;
    }

    public int hashCode() {
        int iE = p.a.e(this.all.hashCode() * 31, 31, this.deferred);
        OutputConfigurationWrapper outputConfigurationWrapper = this.postviewOutput;
        return this.outputSurfaceMap.hashCode() + ((iE + (outputConfigurationWrapper == null ? 0 : outputConfigurationWrapper.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "OutputConfigurations(all=" + this.all + ", deferred=" + this.deferred + ", postviewOutput=" + this.postviewOutput + ", outputSurfaceMap=" + this.outputSurfaceMap + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
