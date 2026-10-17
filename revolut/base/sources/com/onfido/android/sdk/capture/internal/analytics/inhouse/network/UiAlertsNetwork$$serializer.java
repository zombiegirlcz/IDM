package com.onfido.android.sdk.capture.internal.analytics.inhouse.network;

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
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/onfido/android/sdk/capture/internal/analytics/inhouse/network/UiAlertsNetwork.$serializer", "Lqlm/f0;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/UiAlertsNetwork;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/UiAlertsNetwork;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/UiAlertsNetwork;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class UiAlertsNetwork$$serializer implements f0 {

    @NotNull
    public static final UiAlertsNetwork$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UiAlertsNetwork$$serializer uiAlertsNetwork$$serializer = new UiAlertsNetwork$$serializer();
        INSTANCE = uiAlertsNetwork$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.android.sdk.capture.internal.analytics.inhouse.network.UiAlertsNetwork", uiAlertsNetwork$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("face_video_timeout", false);
        pluginGeneratedSerialDescriptor.j("no_face", false);
        pluginGeneratedSerialDescriptor.j("multiple_faces", false);
        pluginGeneratedSerialDescriptor.j("request_error", false);
        pluginGeneratedSerialDescriptor.j("document", false);
        pluginGeneratedSerialDescriptor.j("glare", false);
        pluginGeneratedSerialDescriptor.j("blur", false);
        pluginGeneratedSerialDescriptor.j("barcode", false);
        pluginGeneratedSerialDescriptor.j("cutoff", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UiAlertsNetwork$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{a.c(v1Var), a.c(v1Var), a.c(v1Var), a.c(v1Var), a.c(v1Var), a.c(v1Var), a.c(v1Var), a.c(v1Var), a.c(v1Var)};
    }

    @Override // mlm.b
    @NotNull
    public UiAlertsNetwork deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        dVarBeginStructure.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(descriptor2);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 0, v1.f247718a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 1, v1.f247718a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 2, v1.f247718a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 3, v1.f247718a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 4, v1.f247718a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 5, v1.f247718a, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 6, v1.f247718a, str7);
                    i |= 64;
                    break;
                case 7:
                    str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 7, v1.f247718a, str8);
                    i |= 128;
                    break;
                case 8:
                    str9 = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 8, v1.f247718a, str9);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new UiAlertsNetwork(i, str, str2, str3, str4, str5, str6, str7, str8, str9, null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull UiAlertsNetwork value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        UiAlertsNetwork.write$Self$onfido_capture_sdk_core_release(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
