package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.core.impl.DeferrableSurface;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u001a\u0010\u0015\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloserImpl;", "Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser;", "<init>", "()V", "lock", "", "configuredOutputs", "", "Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloserImpl$ConfiguredOutput;", "configure", "", "streamId", "Landroidx/camera/camera2/pipe/StreamId;", "deferrableSurface", "Landroidx/camera/core/impl/DeferrableSurface;", "graph", "Landroidx/camera/camera2/pipe/CameraGraph;", "configure-hB7JTeY", "(ILandroidx/camera/core/impl/DeferrableSurface;Landroidx/camera/camera2/pipe/CameraGraph;)V", "onSurfaceInactive", "closeAll", "closeIfConfigured", "", "ConfiguredOutput", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InactiveSurfaceCloserImpl implements InactiveSurfaceCloser {

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private final List<ConfiguredOutput> configuredOutputs = new ArrayList();

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloserImpl$ConfiguredOutput;", "", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "Landroidx/camera/core/impl/DeferrableSurface;", "deferrableSurface", "Landroidx/camera/camera2/pipe/CameraGraph;", "graph", "<init>", "(ILandroidx/camera/core/impl/DeferrableSurface;Landroidx/camera/camera2/pipe/CameraGraph;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "close", "()V", "", "contains", "(Landroidx/camera/core/impl/DeferrableSurface;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getStreamId-ptHMqGs", "Landroidx/camera/core/impl/DeferrableSurface;", "getDeferrableSurface", "()Landroidx/camera/core/impl/DeferrableSurface;", "Landroidx/camera/camera2/pipe/CameraGraph;", "getGraph", "()Landroidx/camera/camera2/pipe/CameraGraph;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConfiguredOutput {

        @NotNull
        private final DeferrableSurface deferrableSurface;

        @NotNull
        private final CameraGraph graph;
        private final int streamId;

        public /* synthetic */ ConfiguredOutput(int i, DeferrableSurface deferrableSurface, CameraGraph cameraGraph, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, deferrableSurface, cameraGraph);
        }

        public final void close() {
            this.graph.mo180setSurfaceNYG5g8E(this.streamId, null);
            this.deferrableSurface.close();
        }

        public final boolean contains(@NotNull DeferrableSurface deferrableSurface) {
            Intrinsics.checkNotNullParameter(deferrableSurface, "deferrableSurface");
            return Intrinsics.f(this.deferrableSurface, deferrableSurface);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfiguredOutput)) {
                return false;
            }
            ConfiguredOutput configuredOutput = (ConfiguredOutput) other;
            return StreamId.m358equalsimpl0(this.streamId, configuredOutput.streamId) && Intrinsics.f(this.deferrableSurface, configuredOutput.deferrableSurface) && Intrinsics.f(this.graph, configuredOutput.graph);
        }

        public int hashCode() {
            return this.graph.hashCode() + ((this.deferrableSurface.hashCode() + (StreamId.m359hashCodeimpl(this.streamId) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "ConfiguredOutput(streamId=" + ((Object) StreamId.m360toStringimpl(this.streamId)) + ", deferrableSurface=" + this.deferrableSurface + ", graph=" + this.graph + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        private ConfiguredOutput(int i, DeferrableSurface deferrableSurface, CameraGraph graph) {
            Intrinsics.checkNotNullParameter(deferrableSurface, "deferrableSurface");
            Intrinsics.checkNotNullParameter(graph, "graph");
            this.streamId = i;
            this.deferrableSurface = deferrableSurface;
            this.graph = graph;
        }
    }

    private final void closeIfConfigured(List<ConfiguredOutput> list, DeferrableSurface deferrableSurface) {
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            if (((ConfiguredOutput) it8.next()).contains(deferrableSurface)) {
                deferrableSurface.close();
            }
        }
    }

    @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
    public void closeAll() {
        synchronized (this.lock) {
            try {
                Iterator<T> it8 = this.configuredOutputs.iterator();
                while (it8.hasNext()) {
                    ((ConfiguredOutput) it8.next()).close();
                }
                this.configuredOutputs.clear();
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
    /* JADX INFO: renamed from: configure-hB7JTeY */
    public void mo12configurehB7JTeY(int streamId, @NotNull DeferrableSurface deferrableSurface, @NotNull CameraGraph graph) {
        Intrinsics.checkNotNullParameter(deferrableSurface, "deferrableSurface");
        Intrinsics.checkNotNullParameter(graph, "graph");
        synchronized (this.lock) {
            this.configuredOutputs.add(new ConfiguredOutput(streamId, deferrableSurface, graph, null));
        }
    }

    @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
    public void onSurfaceInactive(@NotNull DeferrableSurface deferrableSurface) {
        Intrinsics.checkNotNullParameter(deferrableSurface, "deferrableSurface");
        synchronized (this.lock) {
            closeIfConfigured(this.configuredOutputs, deferrableSurface);
            Unit unit = Unit.f186387a;
        }
    }
}
