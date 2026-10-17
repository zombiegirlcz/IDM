package com.onfido.api.client.data;

import com.onfido.api.client.data.CameraMetadata;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import nlm.a;
import org.jetbrains.annotations.NotNull;
import qlm.e0;
import qlm.f0;
import qlm.h;
import qlm.j1;
import qlm.n0;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/onfido/api/client/data/CameraMetadata.CameraInfo.$serializer", "Lqlm/f0;", "Lcom/onfido/api/client/data/CameraMetadata$CameraInfo;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/onfido/api/client/data/CameraMetadata$CameraInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/onfido/api/client/data/CameraMetadata$CameraInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class CameraMetadata$CameraInfo$$serializer implements f0 {

    @NotNull
    public static final CameraMetadata$CameraInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CameraMetadata$CameraInfo$$serializer cameraMetadata$CameraInfo$$serializer = new CameraMetadata$CameraInfo$$serializer();
        INSTANCE = cameraMetadata$CameraInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.api.client.data.CameraMetadata.CameraInfo", cameraMetadata$CameraInfo$$serializer, 18);
        pluginGeneratedSerialDescriptor.j("camera_id", false);
        pluginGeneratedSerialDescriptor.j("hardware_level", false);
        pluginGeneratedSerialDescriptor.j("available_capabilities", false);
        pluginGeneratedSerialDescriptor.j("backward_compatible", false);
        pluginGeneratedSerialDescriptor.j("lens_facing", false);
        pluginGeneratedSerialDescriptor.j("available_focal_lengths", false);
        pluginGeneratedSerialDescriptor.j("minimum_focus_distance", false);
        pluginGeneratedSerialDescriptor.j("optical_stabilisation_modes", false);
        pluginGeneratedSerialDescriptor.j("sensor_physical_width_mm", false);
        pluginGeneratedSerialDescriptor.j("sensor_physical_height_mm", false);
        pluginGeneratedSerialDescriptor.j("sensor_pixel_array_width", false);
        pluginGeneratedSerialDescriptor.j("sensor_pixel_array_height", false);
        pluginGeneratedSerialDescriptor.j("sensor_orientation_degrees", false);
        pluginGeneratedSerialDescriptor.j("max_analog_sensitivity", false);
        pluginGeneratedSerialDescriptor.j("ae_available_fps_ranges", false);
        pluginGeneratedSerialDescriptor.j("noise_reduction_modes", false);
        pluginGeneratedSerialDescriptor.j("has_flash_unit", false);
        pluginGeneratedSerialDescriptor.j("is_external_camera", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CameraMetadata$CameraInfo$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = CameraMetadata.CameraInfo.$childSerializers;
        KSerializer kSerializerC = a.c(v1.f247718a);
        n0 n0Var = n0.f247680a;
        KSerializer kSerializerC2 = a.c(n0Var);
        KSerializer kSerializerC3 = a.c(kSerializerArr[2]);
        h hVar = h.f247648a;
        KSerializer kSerializerC4 = a.c(hVar);
        KSerializer kSerializerC5 = a.c(n0Var);
        KSerializer kSerializerC6 = a.c(kSerializerArr[5]);
        e0 e0Var = e0.f247634a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, a.c(e0Var), a.c(kSerializerArr[7]), a.c(e0Var), a.c(e0Var), a.c(n0Var), a.c(n0Var), a.c(n0Var), a.c(n0Var), a.c(kSerializerArr[14]), a.c(kSerializerArr[15]), a.c(hVar), a.c(hVar)};
    }

    @Override // mlm.b
    @NotNull
    public CameraMetadata.CameraInfo deserialize(@NotNull Decoder decoder) {
        Float f;
        int i;
        Integer num;
        Float f4;
        List list;
        Integer num2;
        Integer num3;
        Float f5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = CameraMetadata.CameraInfo.$childSerializers;
        dVarBeginStructure.getClass();
        Float f6 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Float f32 = null;
        Integer num7 = null;
        List list2 = null;
        List list3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        List list4 = null;
        Float f35 = null;
        List list5 = null;
        String str = null;
        Integer num8 = null;
        List list6 = null;
        Boolean bool3 = null;
        Integer num9 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            List list7 = list4;
            int iD = dVarBeginStructure.d(descriptor2);
            switch (iD) {
                case -1:
                    num = num4;
                    f4 = f35;
                    list = list6;
                    num2 = num5;
                    z = false;
                    num5 = num2;
                    list4 = list7;
                    f35 = f4;
                    num4 = num;
                    list6 = list;
                    break;
                case 0:
                    num = num4;
                    f4 = f35;
                    list = list6;
                    num2 = num5;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 0, v1.f247718a, str);
                    i2 |= 1;
                    num5 = num2;
                    list4 = list7;
                    f35 = f4;
                    num4 = num;
                    list6 = list;
                    break;
                case 1:
                    num3 = num4;
                    f5 = f35;
                    num8 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 1, n0.f247680a, num8);
                    i2 |= 2;
                    list6 = list6;
                    list4 = list7;
                    f35 = f5;
                    num4 = num3;
                    break;
                case 2:
                    num3 = num4;
                    f5 = f35;
                    list6 = (List) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 2, kSerializerArr[2], list6);
                    i2 |= 4;
                    list4 = list7;
                    f35 = f5;
                    num4 = num3;
                    break;
                case 3:
                    num3 = num4;
                    f5 = f35;
                    bool3 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 3, h.f247648a, bool3);
                    i2 |= 8;
                    list4 = list7;
                    f35 = f5;
                    num4 = num3;
                    break;
                case 4:
                    num3 = num4;
                    f5 = f35;
                    num9 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 4, n0.f247680a, num9);
                    i2 |= 16;
                    list4 = list7;
                    f35 = f5;
                    num4 = num3;
                    break;
                case 5:
                    num3 = num4;
                    f5 = f35;
                    list4 = (List) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 5, kSerializerArr[5], list7);
                    i2 |= 32;
                    f35 = f5;
                    num4 = num3;
                    break;
                case 6:
                    num3 = num4;
                    f35 = (Float) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 6, e0.f247634a, f35);
                    i2 |= 64;
                    list4 = list7;
                    num4 = num3;
                    break;
                case 7:
                    f = f35;
                    list5 = (List) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 7, kSerializerArr[7], list5);
                    i2 |= 128;
                    list4 = list7;
                    f35 = f;
                    break;
                case 8:
                    f = f35;
                    f6 = (Float) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 8, e0.f247634a, f6);
                    i2 |= 256;
                    list4 = list7;
                    f35 = f;
                    break;
                case 9:
                    f = f35;
                    f32 = (Float) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 9, e0.f247634a, f32);
                    i2 |= 512;
                    list4 = list7;
                    f35 = f;
                    break;
                case 10:
                    f = f35;
                    num7 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 10, n0.f247680a, num7);
                    i2 |= 1024;
                    list4 = list7;
                    f35 = f;
                    break;
                case 11:
                    f = f35;
                    num6 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 11, n0.f247680a, num6);
                    i2 |= 2048;
                    list4 = list7;
                    f35 = f;
                    break;
                case 12:
                    f = f35;
                    num5 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 12, n0.f247680a, num5);
                    i2 |= 4096;
                    list4 = list7;
                    f35 = f;
                    break;
                case 13:
                    f = f35;
                    num4 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 13, n0.f247680a, num4);
                    i2 |= 8192;
                    list4 = list7;
                    f35 = f;
                    break;
                case 14:
                    f = f35;
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 14, kSerializerArr[14], list2);
                    i2 |= 16384;
                    list4 = list7;
                    f35 = f;
                    break;
                case 15:
                    f = f35;
                    list3 = (List) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 15, kSerializerArr[15], list3);
                    i = 32768;
                    i2 |= i;
                    list4 = list7;
                    f35 = f;
                    break;
                case 16:
                    f = f35;
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 16, h.f247648a, bool);
                    i = 65536;
                    i2 |= i;
                    list4 = list7;
                    f35 = f;
                    break;
                case 17:
                    f = f35;
                    bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 17, h.f247648a, bool2);
                    i = 131072;
                    i2 |= i;
                    list4 = list7;
                    f35 = f;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        Integer num10 = num4;
        Float f36 = f35;
        dVarBeginStructure.endStructure(descriptor2);
        return new CameraMetadata.CameraInfo(i2, str, num8, list6, bool3, num9, list4, f36, list5, f6, f32, num7, num6, num5, num10, list2, list3, bool, bool2, null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull CameraMetadata.CameraInfo value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        CameraMetadata.CameraInfo.write$Self$onfido_api_client(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
