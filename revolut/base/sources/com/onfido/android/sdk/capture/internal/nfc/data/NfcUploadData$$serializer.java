package com.onfido.android.sdk.capture.internal.nfc.data;

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
import qlm.m0;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/onfido/android/sdk/capture/internal/nfc/data/NfcUploadData.$serializer", "Lqlm/f0;", "Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcUploadData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcUploadData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcUploadData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class NfcUploadData$$serializer implements f0 {

    @NotNull
    public static final NfcUploadData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NfcUploadData$$serializer nfcUploadData$$serializer = new NfcUploadData$$serializer();
        INSTANCE = nfcUploadData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.android.sdk.capture.internal.nfc.data.NfcUploadData", nfcUploadData$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("dg1", false);
        pluginGeneratedSerialDescriptor.j("dg2", false);
        pluginGeneratedSerialDescriptor.j("dg11", false);
        pluginGeneratedSerialDescriptor.j("dg12", false);
        pluginGeneratedSerialDescriptor.j("dg13", false);
        pluginGeneratedSerialDescriptor.j("dg14", false);
        pluginGeneratedSerialDescriptor.j("dg15", false);
        pluginGeneratedSerialDescriptor.j("sod", false);
        pluginGeneratedSerialDescriptor.j("aa_signed_challenge", false);
        pluginGeneratedSerialDescriptor.j("non_icao", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NfcUploadData$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        m0 m0Var = m0.f247677c;
        return new KSerializer[]{m0Var, m0Var, a.c(m0Var), a.c(m0Var), a.c(m0Var), a.c(m0Var), a.c(m0Var), m0Var, a.c(m0Var), a.c(NonIcaoData$$serializer.INSTANCE)};
    }

    @Override // mlm.b
    @NotNull
    public NfcUploadData deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        dVarBeginStructure.getClass();
        NonIcaoData nonIcaoData = null;
        int[] iArr = null;
        int[] iArr2 = null;
        int[] iArr3 = null;
        int[] iArr4 = null;
        int[] iArr5 = null;
        int[] iArr6 = null;
        int[] iArr7 = null;
        int[] iArr8 = null;
        int[] iArr9 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iD = dVarBeginStructure.d(descriptor2);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iArr = (int[]) dVarBeginStructure.decodeSerializableElement(descriptor2, 0, m0.f247677c, iArr);
                    i |= 1;
                    break;
                case 1:
                    iArr2 = (int[]) dVarBeginStructure.decodeSerializableElement(descriptor2, 1, m0.f247677c, iArr2);
                    i |= 2;
                    break;
                case 2:
                    iArr3 = (int[]) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 2, m0.f247677c, iArr3);
                    i |= 4;
                    break;
                case 3:
                    iArr4 = (int[]) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 3, m0.f247677c, iArr4);
                    i |= 8;
                    break;
                case 4:
                    iArr5 = (int[]) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 4, m0.f247677c, iArr5);
                    i |= 16;
                    break;
                case 5:
                    iArr6 = (int[]) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 5, m0.f247677c, iArr6);
                    i |= 32;
                    break;
                case 6:
                    iArr7 = (int[]) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 6, m0.f247677c, iArr7);
                    i |= 64;
                    break;
                case 7:
                    iArr8 = (int[]) dVarBeginStructure.decodeSerializableElement(descriptor2, 7, m0.f247677c, iArr8);
                    i |= 128;
                    break;
                case 8:
                    iArr9 = (int[]) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 8, m0.f247677c, iArr9);
                    i |= 256;
                    break;
                case 9:
                    nonIcaoData = (NonIcaoData) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 9, NonIcaoData$$serializer.INSTANCE, nonIcaoData);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new NfcUploadData(i, iArr, iArr2, iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9, nonIcaoData, null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull NfcUploadData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        NfcUploadData.write$Self$onfido_capture_sdk_core_release(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
