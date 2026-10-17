package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraColorSpace;
import androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b)\u0010\u0018R#\u0010\u000f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010\u0016¨\u0006/"}, d2 = {"Landroidx/camera/camera2/pipe/compat/SessionConfigData;", "", "", "sessionType", "", "Landroidx/camera/camera2/pipe/compat/InputConfigData;", "inputConfiguration", "Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "outputConfigurations", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper$StateCallback;", "stateCallback", "sessionTemplateId", "", "sessionParameters", "Landroidx/camera/camera2/pipe/CameraColorSpace;", "sessionColorSpace", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/concurrent/Executor;Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper$StateCallback;ILjava/util/Map;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSessionType", "Ljava/util/List;", "getInputConfiguration", "()Ljava/util/List;", "getOutputConfigurations", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper$StateCallback;", "getStateCallback", "()Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper$StateCallback;", "getSessionTemplateId", "Ljava/util/Map;", "getSessionParameters", "()Ljava/util/Map;", "Ljava/lang/String;", "getSessionColorSpace-dxVZaPA", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SessionConfigData {

    @NotNull
    private final Executor executor;
    private final List<InputConfigData> inputConfiguration;

    @NotNull
    private final List<OutputConfigurationWrapper> outputConfigurations;
    private final String sessionColorSpace;

    @NotNull
    private final Map<?, Object> sessionParameters;
    private final int sessionTemplateId;
    private final int sessionType;

    @NotNull
    private final CameraCaptureSessionWrapper.StateCallback stateCallback;

    public /* synthetic */ SessionConfigData(int i, List list, List list2, Executor executor, CameraCaptureSessionWrapper.StateCallback stateCallback, int i2, Map map, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, list2, executor, stateCallback, i2, map, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.camera2.pipe.compat.SessionConfigData
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.camera.camera2.pipe.compat.SessionConfigData r5 = (androidx.camera.camera2.pipe.compat.SessionConfigData) r5
            int r1 = r4.sessionType
            int r3 = r5.sessionType
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.List<androidx.camera.camera2.pipe.compat.InputConfigData> r1 = r4.inputConfiguration
            java.util.List<androidx.camera.camera2.pipe.compat.InputConfigData> r3 = r5.inputConfiguration
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.util.List<androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper> r1 = r4.outputConfigurations
            java.util.List<androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper> r3 = r5.outputConfigurations
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.util.concurrent.Executor r1 = r4.executor
            java.util.concurrent.Executor r3 = r5.executor
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper$StateCallback r1 = r4.stateCallback
            androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper$StateCallback r3 = r5.stateCallback
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            int r1 = r4.sessionTemplateId
            int r3 = r5.sessionTemplateId
            if (r1 == r3) goto L46
            return r2
        L46:
            java.util.Map<?, java.lang.Object> r1 = r4.sessionParameters
            java.util.Map<?, java.lang.Object> r3 = r5.sessionParameters
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L51
            return r2
        L51:
            java.lang.String r1 = r4.sessionColorSpace
            java.lang.String r5 = r5.sessionColorSpace
            if (r1 != 0) goto L5d
            if (r5 != 0) goto L5b
            r5 = r0
            goto L64
        L5b:
            r5 = r2
            goto L64
        L5d:
            if (r5 != 0) goto L60
            goto L5b
        L60:
            boolean r5 = androidx.camera.camera2.pipe.CameraColorSpace.m114equalsimpl0(r1, r5)
        L64:
            if (r5 != 0) goto L67
            return r2
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.SessionConfigData.equals(java.lang.Object):boolean");
    }

    @NotNull
    public final Executor getExecutor() {
        return this.executor;
    }

    public final List<InputConfigData> getInputConfiguration() {
        return this.inputConfiguration;
    }

    @NotNull
    public final List<OutputConfigurationWrapper> getOutputConfigurations() {
        return this.outputConfigurations;
    }

    /* JADX INFO: renamed from: getSessionColorSpace-dxVZaPA, reason: not valid java name and from getter */
    public final String getSessionColorSpace() {
        return this.sessionColorSpace;
    }

    @NotNull
    public final Map<?, Object> getSessionParameters() {
        return this.sessionParameters;
    }

    public final int getSessionTemplateId() {
        return this.sessionTemplateId;
    }

    public final int getSessionType() {
        return this.sessionType;
    }

    @NotNull
    public final CameraCaptureSessionWrapper.StateCallback getStateCallback() {
        return this.stateCallback;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.sessionType) * 31;
        List<InputConfigData> list = this.inputConfiguration;
        int iE = p.a.e(j6.a.b(this.sessionTemplateId, (this.stateCallback.hashCode() + ((this.executor.hashCode() + p.a.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.outputConfigurations)) * 31)) * 31, 31), 31, this.sessionParameters);
        String str = this.sessionColorSpace;
        return iE + (str != null ? CameraColorSpace.m115hashCodeimpl(str) : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("SessionConfigData(sessionType=");
        sb6.append(this.sessionType);
        sb6.append(", inputConfiguration=");
        sb6.append(this.inputConfiguration);
        sb6.append(", outputConfigurations=");
        sb6.append(this.outputConfigurations);
        sb6.append(", executor=");
        sb6.append(this.executor);
        sb6.append(", stateCallback=");
        sb6.append(this.stateCallback);
        sb6.append(", sessionTemplateId=");
        sb6.append(this.sessionTemplateId);
        sb6.append(", sessionParameters=");
        sb6.append(this.sessionParameters);
        sb6.append(", sessionColorSpace=");
        String str = this.sessionColorSpace;
        sb6.append((Object) (str == null ? "null" : CameraColorSpace.m117toStringimpl(str)));
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SessionConfigData(int i, List<InputConfigData> list, List<? extends OutputConfigurationWrapper> outputConfigurations, Executor executor, CameraCaptureSessionWrapper.StateCallback stateCallback, int i2, Map<?, ? extends Object> sessionParameters, String str) {
        Intrinsics.checkNotNullParameter(outputConfigurations, "outputConfigurations");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(stateCallback, "stateCallback");
        Intrinsics.checkNotNullParameter(sessionParameters, "sessionParameters");
        this.sessionType = i;
        this.inputConfiguration = list;
        this.outputConfigurations = outputConfigurations;
        this.executor = executor;
        this.stateCallback = stateCallback;
        this.sessionTemplateId = i2;
        this.sessionParameters = sessionParameters;
        this.sessionColorSpace = str;
    }
}
