package com.onfido.api.client.data;

import com.onfido.api.client.data.PhotoDetection;
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
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/onfido/api/client/data/PhotoDetection.$serializer", "Lqlm/f0;", "Lcom/onfido/api/client/data/PhotoDetection;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/onfido/api/client/data/PhotoDetection;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/onfido/api/client/data/PhotoDetection;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class PhotoDetection$$serializer implements f0 {

    @NotNull
    public static final PhotoDetection$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PhotoDetection$$serializer photoDetection$$serializer = new PhotoDetection$$serializer();
        INSTANCE = photoDetection$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.api.client.data.PhotoDetection", photoDetection$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("glare_detection", false);
        pluginGeneratedSerialDescriptor.j("blur_detection", false);
        pluginGeneratedSerialDescriptor.j("barcode_detection", false);
        pluginGeneratedSerialDescriptor.j("mrz_extraction", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PhotoDetection$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        PhotoDetection$ProcessingResult$$serializer photoDetection$ProcessingResult$$serializer = PhotoDetection$ProcessingResult$$serializer.INSTANCE;
        return new KSerializer[]{a.c(photoDetection$ProcessingResult$$serializer), a.c(photoDetection$ProcessingResult$$serializer), a.c(photoDetection$ProcessingResult$$serializer), a.c(photoDetection$ProcessingResult$$serializer)};
    }

    @Override // mlm.b
    @NotNull
    public PhotoDetection deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        dVarBeginStructure.getClass();
        int i = 0;
        PhotoDetection.ProcessingResult processingResult = null;
        PhotoDetection.ProcessingResult processingResult2 = null;
        PhotoDetection.ProcessingResult processingResult3 = null;
        PhotoDetection.ProcessingResult processingResult4 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(descriptor2);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                processingResult = (PhotoDetection.ProcessingResult) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 0, PhotoDetection$ProcessingResult$$serializer.INSTANCE, processingResult);
                i |= 1;
            } else if (iD == 1) {
                processingResult2 = (PhotoDetection.ProcessingResult) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 1, PhotoDetection$ProcessingResult$$serializer.INSTANCE, processingResult2);
                i |= 2;
            } else if (iD == 2) {
                processingResult3 = (PhotoDetection.ProcessingResult) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 2, PhotoDetection$ProcessingResult$$serializer.INSTANCE, processingResult3);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                processingResult4 = (PhotoDetection.ProcessingResult) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 3, PhotoDetection$ProcessingResult$$serializer.INSTANCE, processingResult4);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new PhotoDetection(i, processingResult, processingResult2, processingResult3, processingResult4, null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull PhotoDetection value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        PhotoDetection.write$Self$onfido_api_client(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
