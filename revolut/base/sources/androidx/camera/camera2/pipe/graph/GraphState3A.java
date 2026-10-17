package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.FlashMode;
import hx7.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rkm.h;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0097\u0001\u0010\u0018\u001a\u00020\u00152\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010&\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphState3A;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "Landroidx/camera/camera2/pipe/AfMode;", "afMode", "Landroidx/camera/camera2/pipe/AwbMode;", "awbMode", "Landroidx/camera/camera2/pipe/FlashMode;", "flashMode", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "", "aeLock", "afLock", "awbLock", "", "update-7jOEVJU", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Landroidx/camera/camera2/pipe/FlashMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "update", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "toCaptureRequestParametersMap", "()Ljava/util/Map;", "Lrkm/h;", "Landroidx/camera/camera2/pipe/graph/State3A;", "_state", "Lrkm/h;", "value", "getCurrent", "()Landroidx/camera/camera2/pipe/graph/State3A;", "setCurrent", "(Landroidx/camera/camera2/pipe/graph/State3A;)V", "current", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GraphState3A {

    @NotNull
    private final h _state = b.j(new State3A(null, null, null, null, null, null, null, null, null, null, 1023, null));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: update-7jOEVJU$default, reason: not valid java name */
    public static /* synthetic */ void m461update7jOEVJU$default(GraphState3A graphState3A, AeMode aeMode, AfMode afMode, AwbMode awbMode, FlashMode flashMode, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj2) {
        if ((i & 1) != 0) {
            aeMode = null;
        }
        if ((i & 2) != 0) {
            afMode = null;
        }
        if ((i & 4) != 0) {
            awbMode = null;
        }
        if ((i & 8) != 0) {
            flashMode = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        if ((i & 32) != 0) {
            list2 = null;
        }
        if ((i & 64) != 0) {
            list3 = null;
        }
        if ((i & 128) != 0) {
            bool = null;
        }
        if ((i & 256) != 0) {
            bool2 = null;
        }
        if ((i & 512) != 0) {
            bool3 = null;
        }
        graphState3A.m462update7jOEVJU(aeMode, afMode, awbMode, flashMode, list, list2, list3, bool, bool2, bool3);
    }

    @NotNull
    public final State3A getCurrent() {
        return (State3A) this._state.f254900a;
    }

    @NotNull
    public final Map<CaptureRequest.Key<?>, Object> toCaptureRequestParametersMap() {
        return GraphState3AKt.toCaptureRequestParameterMap(getCurrent());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX INFO: renamed from: update-7jOEVJU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m462update7jOEVJU(androidx.camera.camera2.pipe.AeMode r15, androidx.camera.camera2.pipe.AfMode r16, androidx.camera.camera2.pipe.AwbMode r17, androidx.camera.camera2.pipe.FlashMode r18, java.util.List<android.hardware.camera2.params.MeteringRectangle> r19, java.util.List<android.hardware.camera2.params.MeteringRectangle> r20, java.util.List<android.hardware.camera2.params.MeteringRectangle> r21, java.lang.Boolean r22, java.lang.Boolean r23, java.lang.Boolean r24) {
        /*
            r14 = this;
            rkm.h r0 = r14._state
        L2:
            java.lang.Object r1 = r0.f254900a
            r2 = r1
            androidx.camera.camera2.pipe.graph.State3A r2 = (androidx.camera.camera2.pipe.graph.State3A) r2
            if (r15 != 0) goto Le
            androidx.camera.camera2.pipe.AeMode r3 = r2.getAeMode()
            goto Lf
        Le:
            r3 = r15
        Lf:
            if (r16 != 0) goto L16
            androidx.camera.camera2.pipe.AfMode r4 = r2.getAfMode()
            goto L18
        L16:
            r4 = r16
        L18:
            if (r17 != 0) goto L1f
            androidx.camera.camera2.pipe.AwbMode r5 = r2.getAwbMode()
            goto L21
        L1f:
            r5 = r17
        L21:
            if (r18 != 0) goto L28
            androidx.camera.camera2.pipe.FlashMode r6 = r2.getFlashMode()
            goto L2a
        L28:
            r6 = r18
        L2a:
            r7 = 0
            if (r19 == 0) goto L3c
            r8 = r19
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L38
            r8 = r7
        L38:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L40
        L3c:
            java.util.List r8 = r2.getAeRegions()
        L40:
            if (r20 == 0) goto L51
            r9 = r20
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L4d
            r9 = r7
        L4d:
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L55
        L51:
            java.util.List r9 = r2.getAfRegions()
        L55:
            if (r21 == 0) goto L67
            r10 = r21
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L62
            goto L63
        L62:
            r7 = r10
        L63:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L6b
        L67:
            java.util.List r7 = r2.getAwbRegions()
        L6b:
            if (r22 != 0) goto L72
            java.lang.Boolean r10 = r2.getAeLock()
            goto L74
        L72:
            r10 = r22
        L74:
            if (r23 != 0) goto L7b
            java.lang.Boolean r11 = r2.getAfLock()
            goto L7d
        L7b:
            r11 = r23
        L7d:
            if (r24 != 0) goto L88
            java.lang.Boolean r12 = r2.getAwbLock()
            r13 = r9
            r9 = r7
            r7 = r8
            r8 = r13
            goto L8e
        L88:
            r12 = r9
            r9 = r7
            r7 = r8
            r8 = r12
            r12 = r24
        L8e:
            androidx.camera.camera2.pipe.graph.State3A r2 = r2.m468copy7jOEVJU(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r1 = r0.a(r1, r2)
            if (r1 == 0) goto L2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.GraphState3A.m462update7jOEVJU(androidx.camera.camera2.pipe.AeMode, androidx.camera.camera2.pipe.AfMode, androidx.camera.camera2.pipe.AwbMode, androidx.camera.camera2.pipe.FlashMode, java.util.List, java.util.List, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void");
    }
}
