package androidx.camera.camera2.pipe.core;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.ConcurrentCameraGraphs;
import androidx.camera.camera2.pipe.InputStream;
import androidx.camera.camera2.pipe.InputStreamId;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.StreamId;
import cim.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import v0.a;
import xx9.f;
import zhm.v;
import zsc.p;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000f0\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J+\u0010\u0019\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010!\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/camera/camera2/pipe/core/Debug;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "name", "", "parameters", "", "appendParameters", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/Map;)V", "", "Lkotlin/Pair;", "parametersToSortedStringPairs", "(Ljava/util/Map;)Ljava/util/List;", "key", "keyNameToString", "(Ljava/lang/Object;)Ljava/lang/String;", "value", "valueToString", "", "limit", "formatParameterMap", "(Ljava/util/Map;I)Ljava/lang/String;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "metadata", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/CameraGraph;", "cameraGraph", "formatCameraGraphProperties", "(Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/CameraGraph;)Ljava/lang/String;", "Landroidx/camera/camera2/pipe/core/SystemTimeSource;", "systemTimeSource", "Landroidx/camera/camera2/pipe/core/SystemTimeSource;", "getSystemTimeSource$camera_camera2_pipe", "()Landroidx/camera/camera2/pipe/core/SystemTimeSource;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Debug {

    @NotNull
    public static final Debug INSTANCE = new Debug();

    @NotNull
    private static final SystemTimeSource systemTimeSource = new SystemTimeSource();

    private Debug() {
    }

    private final void appendParameters(StringBuilder builder, String name, Map<?, ? extends Object> parameters) {
        if (parameters.isEmpty()) {
            builder.append(name + ": (None)\n");
            return;
        }
        builder.append(name + '\n');
        Iterator<T> it8 = INSTANCE.parametersToSortedStringPairs(parameters).iterator();
        while (it8.hasNext()) {
            Pair pair = (Pair) it8.next();
            builder.append("  " + d0.a0((String) pair.f186385a, 50, p.SPACE_CHAR) + p.SPACE_CHAR + ((String) pair.f186386b) + '\n');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence formatParameterMap$lambda$0(Pair it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return ((String) it8.f186385a) + '=' + ((String) it8.f186386b);
    }

    private final String keyNameToString(Object key) {
        if (key instanceof CameraCharacteristics.Key) {
            String name = ((CameraCharacteristics.Key) key).getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }
        if (key instanceof CaptureRequest.Key) {
            String name2 = ((CaptureRequest.Key) key).getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            return name2;
        }
        if (!(key instanceof CaptureResult.Key)) {
            return String.valueOf(key);
        }
        String name3 = ((CaptureResult.Key) key).getName();
        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
        return name3;
    }

    private final List<Pair<String, String>> parametersToSortedStringPairs(Map<?, ? extends Object> parameters) {
        ArrayList arrayList = new ArrayList(parameters.size());
        for (Map.Entry<?, ? extends Object> entry : parameters.entrySet()) {
            Debug debug = INSTANCE;
            arrayList.add(new Pair(debug.keyNameToString(entry.getKey()), debug.valueToString(entry.getValue())));
        }
        return zhm.d0.P0(arrayList, new Comparator() { // from class: androidx.camera.camera2.pipe.core.Debug$parametersToSortedStringPairs$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return b.b((String) ((Pair) t2).f186385a, (String) ((Pair) t3).f186385a);
            }
        });
    }

    private final String valueToString(Object value) {
        return value instanceof Object[] ? d.d0((Object[]) value, null, "[", "]", new f(25), 25) : String.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence valueToString$lambda$0(Object obj2) {
        return INSTANCE.valueToString(obj2);
    }

    @NotNull
    public final String formatCameraGraphProperties(@NotNull CameraMetadata metadata, @NotNull CameraGraph.Config graphConfig, @NotNull CameraGraph cameraGraph) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(graphConfig, "graphConfig");
        Intrinsics.checkNotNullParameter(cameraGraph, "cameraGraph");
        ConcurrentCameraGraphs concurrentCameraGraphs = graphConfig.getConcurrentCameraGraphs();
        Set<CameraId> cameraIds = concurrentCameraGraphs != null ? concurrentCameraGraphs.getCameraIds() : null;
        CameraCharacteristics.Key LENS_FACING = CameraCharacteristics.LENS_FACING;
        Intrinsics.checkNotNullExpressionValue(LENS_FACING, "LENS_FACING");
        Integer num = (Integer) metadata.get(LENS_FACING);
        String str = "External";
        String str2 = "Unknown";
        String str3 = (num != null && num.intValue() == 0) ? "Front" : (num != null && num.intValue() == 1) ? "Back" : (num != null && num.intValue() == 2) ? "External" : "Unknown";
        CameraCharacteristics.Key INFO_SUPPORTED_HARDWARE_LEVEL = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        Intrinsics.checkNotNullExpressionValue(INFO_SUPPORTED_HARDWARE_LEVEL, "INFO_SUPPORTED_HARDWARE_LEVEL");
        Integer num2 = (Integer) metadata.get(INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num2 != null && num2.intValue() == 0) {
            str = "Limited";
        } else if (num2 != null && num2.intValue() == 1) {
            str = "Full";
        } else if (num2 != null && num2.intValue() == 2) {
            str = "Legacy";
        } else if (num2 != null && num2.intValue() == 3) {
            str = "Level 3";
        } else if (num2 == null || num2.intValue() != 4) {
            str = "Unknown";
        }
        int sessionMode = graphConfig.getSessionMode();
        CameraGraph.OperatingMode.Companion companion = CameraGraph.OperatingMode.INSTANCE;
        if (CameraGraph.OperatingMode.m170equalsimpl0(sessionMode, companion.m175getHIGH_SPEED2uNL3no())) {
            str2 = "High Speed";
        } else if (CameraGraph.OperatingMode.m170equalsimpl0(sessionMode, companion.m176getNORMAL2uNL3no())) {
            str2 = "Normal";
        } else if (CameraGraph.OperatingMode.m170equalsimpl0(sessionMode, companion.m174getEXTENSION2uNL3no())) {
            str2 = "Extension";
        }
        CameraCharacteristics.Key REQUEST_AVAILABLE_CAPABILITIES = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        Intrinsics.checkNotNullExpressionValue(REQUEST_AVAILABLE_CAPABILITIES, "REQUEST_AVAILABLE_CAPABILITIES");
        int[] iArr = (int[]) metadata.get(REQUEST_AVAILABLE_CAPABILITIES);
        String str4 = (iArr == null || !d.G(iArr, 11)) ? "Physical" : "Logical";
        StringBuilder sb6 = new StringBuilder();
        sb6.append(cameraGraph + " (Camera " + graphConfig.getCamera() + ")\n");
        if (cameraIds != null) {
            sb6.append("  Concurrent: " + cameraIds + '\n');
        }
        StringBuilder sbM = a.m("  Facing:    ", str3, " (", str4, ", ");
        sbM.append(str);
        sbM.append(")\n");
        sb6.append(sbM.toString());
        sb6.append("  Mode:      " + str2 + '\n');
        sb6.append("Outputs:\n");
        Iterator<CameraStream> it8 = cameraGraph.getStreams().getStreams().iterator();
        while (it8.hasNext()) {
            int i = 0;
            for (Object obj2 : it8.next().getOutputs()) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                OutputStream outputStream = (OutputStream) obj2;
                sb6.append("  ");
                sb6.append(d0.a0(i == 0 ? StreamId.m360toStringimpl(outputStream.getStream().getId()) : "", 12, p.SPACE_CHAR));
                sb6.append(d0.a0(OutputId.m249toStringimpl(outputStream.getId()), 12, p.SPACE_CHAR));
                String string = outputStream.getSize().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb6.append(d0.a0(string, 12, p.SPACE_CHAR));
                sb6.append(d0.a0(StreamFormat.m347getNameimpl(outputStream.getFormat()), 16, p.SPACE_CHAR));
                OutputStream.MirrorMode mirrorModeMo266getMirrorModedO1_9xk = outputStream.getMirrorMode();
                if (mirrorModeMo266getMirrorModedO1_9xk != null) {
                    sb6.append(" [" + ((Object) OutputStream.MirrorMode.m292toStringimpl(mirrorModeMo266getMirrorModedO1_9xk.getValue())) + ']');
                }
                outputStream.mo269getTimestampBasepcPfPbY();
                OutputStream.DynamicRangeProfile dynamicRangeProfileMo263getDynamicRangeProfileOoVcG5w = outputStream.getDynamicRangeProfile();
                if (dynamicRangeProfileMo263getDynamicRangeProfileOoVcG5w != null) {
                    sb6.append(" [" + ((Object) OutputStream.DynamicRangeProfile.m284toStringimpl(dynamicRangeProfileMo263getDynamicRangeProfileOoVcG5w.getValue())) + ']');
                }
                OutputStream.StreamUseCase streamUseCaseMo267getStreamUseCase8x2ez34 = outputStream.getStreamUseCase();
                if (streamUseCaseMo267getStreamUseCase8x2ez34 != null) {
                    sb6.append(" [" + ((Object) OutputStream.StreamUseCase.m300toStringimpl(streamUseCaseMo267getStreamUseCase8x2ez34.getValue())) + ']');
                }
                OutputStream.StreamUseHint streamUseHintMo268getStreamUseHintHIPxoCc = outputStream.getStreamUseHint();
                if (streamUseHintMo268getStreamUseHintHIPxoCc != null) {
                    sb6.append(" [" + ((Object) OutputStream.StreamUseHint.m310toStringimpl(streamUseHintMo268getStreamUseHintHIPxoCc.getValue())) + ']');
                }
                if (!CameraId.m184equalsimpl0(outputStream.getCamera(), graphConfig.getCamera())) {
                    sb6.append(" [");
                    sb6.append(CameraId.m181boximpl(outputStream.getCamera()));
                    sb6.append("]");
                }
                sb6.append("\n");
                i = i2;
            }
        }
        if (!cameraGraph.getStreams().getInputs().isEmpty()) {
            sb6.append("Inputs:\n");
            for (InputStream inputStream : cameraGraph.getStreams().getInputs()) {
                sb6.append(" ");
                sb6.append(d0.a0(InputStreamId.m233toStringimpl(inputStream.getId()), 12, p.SPACE_CHAR));
                sb6.append(d0.a0(StreamFormat.m349toStringimpl(inputStream.getFormat()), 12, p.SPACE_CHAR));
                sb6.append(d0.a0(String.valueOf(inputStream.getMaxImages()), 12, p.SPACE_CHAR));
                sb6.append("\n");
            }
        }
        sb6.append("Session Template: " + RequestTemplate.m328getNameimpl(graphConfig.getSessionTemplate()) + '\n');
        Debug debug = INSTANCE;
        debug.appendParameters(sb6, "Session Parameters", graphConfig.getSessionParameters());
        sb6.append("Default Template: " + RequestTemplate.m328getNameimpl(graphConfig.getDefaultTemplate()) + '\n');
        debug.appendParameters(sb6, "Default Parameters", graphConfig.getDefaultParameters());
        debug.appendParameters(sb6, "Required Parameters", graphConfig.getRequiredParameters());
        String string2 = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @NotNull
    public final String formatParameterMap(@NotNull Map<?, ? extends Object> parameters, int limit) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return zhm.d0.k0(parametersToSortedStringPairs(parameters), null, "{", "}", limit, new f(24), 17);
    }

    @NotNull
    public final SystemTimeSource getSystemTimeSource$camera_camera2_pipe() {
        return systemTimeSource;
    }
}
