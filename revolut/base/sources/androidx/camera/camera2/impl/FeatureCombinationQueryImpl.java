package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.ZslControlNoOpImpl;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.TemplateParamsQuirkOverride;
import androidx.camera.camera2.config.CameraConfig;
import androidx.camera.camera2.impl.CameraGraphConfigProvider;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.ConfigQueryResult;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.core.Logger;
import androidx.camera.core.featuregroup.impl.FeatureCombinationQuery;
import androidx.camera.core.impl.SessionConfig;
import ch.qos.logback.core.net.SyslogConstants;
import fim.a;
import gim.d;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/camera/camera2/impl/FeatureCombinationQueryImpl;", "Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery;", "cameraMetadata", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraPipe", "Landroidx/camera/camera2/pipe/CameraPipe;", "cameraQuirks", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "<init>", "(Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/pipe/CameraPipe;Landroidx/camera/camera2/compat/quirk/CameraQuirks;)V", "isSupported", "", "sessionConfig", "Landroidx/camera/core/impl/SessionConfig;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FeatureCombinationQueryImpl implements FeatureCombinationQuery {

    @NotNull
    private final CameraMetadata cameraMetadata;

    @NotNull
    private final CameraPipe cameraPipe;

    @NotNull
    private final CameraQuirks cameraQuirks;

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.FeatureCombinationQueryImpl$isSupported$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.impl.FeatureCombinationQueryImpl$isSupported$1", f = "FeatureCombinationQueryImpl.kt", l = {59}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ CameraGraphConfigProvider.CameraGraphCreationResult $creationResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CameraGraphConfigProvider.CameraGraphCreationResult cameraGraphCreationResult, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$creationResult = cameraGraphCreationResult;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return FeatureCombinationQueryImpl.this.new AnonymousClass1(this.$creationResult, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                CameraPipe cameraPipe = FeatureCombinationQueryImpl.this.cameraPipe;
                CameraGraph.Config config = this.$creationResult.getConfig();
                this.label = 1;
                obj2 = cameraPipe.mo192isConfigSupportedNpXggIU(config, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            CameraGraphConfigProvider.CameraGraphCreationResult cameraGraphCreationResult = this.$creationResult;
            ConfigQueryResult configQueryResult = (ConfigQueryResult) obj2;
            int value = configQueryResult.getValue();
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused = Camera2Logger.TRUNCATED_TAG;
                List<CameraStream.Config> streams = cameraGraphCreationResult.getConfig().getStreams();
                ArrayList arrayList = new ArrayList(w.t(streams, 10));
                Iterator<T> it8 = streams.iterator();
                while (it8.hasNext()) {
                    List<OutputStream.Config> outputs = ((CameraStream.Config) it8.next()).getOutputs();
                    ArrayList arrayList2 = new ArrayList(w.t(outputs, 10));
                    for (OutputStream.Config config2 : outputs) {
                        arrayList2.add("size=" + config2.getSize() + ", format=" + ((Object) StreamFormat.m349toStringimpl(config2.getFormat())) + ", dynamicRangeProfile" + config2.getDynamicRangeProfile());
                    }
                    arrayList.add(arrayList2);
                }
                String str = "FeatureCombinationQueryImpl#isSupported: result = " + ((Object) ConfigQueryResult.m205toStringimpl(value)) + " for sessionParameters = " + cameraGraphCreationResult.getConfig().getSessionParameters() + " and streams = " + arrayList;
            }
            return Boolean.valueOf(ConfigQueryResult.m203equalsimpl0(configQueryResult.getValue(), ConfigQueryResult.INSTANCE.m207getSUPPORTEDXp6DSB4()));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public FeatureCombinationQueryImpl(@NotNull CameraMetadata cameraMetadata, @NotNull CameraPipe cameraPipe, @NotNull CameraQuirks cameraQuirks) {
        Intrinsics.checkNotNullParameter(cameraMetadata, "cameraMetadata");
        Intrinsics.checkNotNullParameter(cameraPipe, "cameraPipe");
        Intrinsics.checkNotNullParameter(cameraQuirks, "cameraQuirks");
        this.cameraMetadata = cameraMetadata;
        this.cameraPipe = cameraPipe;
        this.cameraQuirks = cameraQuirks;
    }

    @Override // androidx.camera.core.featuregroup.impl.FeatureCombinationQuery
    public boolean isSupported(@NotNull SessionConfig sessionConfig) {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        return ((Boolean) e0.E(g.f186406a, new AnonymousClass1(CameraGraphConfigProvider.m20create79VDu0o$default(new CameraGraphConfigProvider(new CameraCallbackMap(), new ComboRequestListener(), new CameraConfig(this.cameraMetadata.getCamera(), null), this.cameraQuirks, new ZslControlNoOpImpl(), new TemplateParamsQuirkOverride(this.cameraQuirks.getQuirks()), this.cameraMetadata, null, null, 384, null), CameraGraph.OperatingMode.INSTANCE.m176getNORMAL2uNL3no(), sessionConfig, true, null, null, null, null, SyslogConstants.LOG_CLOCK, null), null))).booleanValue();
    }
}
