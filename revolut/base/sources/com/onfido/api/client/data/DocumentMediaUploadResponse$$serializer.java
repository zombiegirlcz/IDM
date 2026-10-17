package com.onfido.api.client.data;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nlm.a;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/onfido/api/client/data/DocumentMediaUploadResponse.$serializer", "Lqlm/f0;", "Lcom/onfido/api/client/data/DocumentMediaUploadResponse;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/onfido/api/client/data/DocumentMediaUploadResponse;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/onfido/api/client/data/DocumentMediaUploadResponse;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class DocumentMediaUploadResponse$$serializer implements f0 {

    @NotNull
    public static final DocumentMediaUploadResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DocumentMediaUploadResponse$$serializer documentMediaUploadResponse$$serializer = new DocumentMediaUploadResponse$$serializer();
        INSTANCE = documentMediaUploadResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.api.client.data.DocumentMediaUploadResponse", documentMediaUploadResponse$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("binary_media", false);
        pluginGeneratedSerialDescriptor.j("sdk_warnings", true);
        pluginGeneratedSerialDescriptor.j("document_fields", true);
        pluginGeneratedSerialDescriptor.j("content_type", true);
        pluginGeneratedSerialDescriptor.j("document_features", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DocumentMediaUploadResponse$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        return new KSerializer[]{DocumentBinaryMedia$$serializer.INSTANCE, a.c(DocumentValidationWarningsBundle$$serializer.INSTANCE), a.c(DocumentMediaUploadResponse.$childSerializers[2]), a.c(v1.f247718a), a.c(DocumentFeatures$$serializer.INSTANCE)};
    }

    @Override // mlm.b
    @NotNull
    public DocumentMediaUploadResponse deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = DocumentMediaUploadResponse.$childSerializers;
        dVarBeginStructure.getClass();
        int i = 0;
        DocumentBinaryMedia documentBinaryMedia = null;
        DocumentValidationWarningsBundle documentValidationWarningsBundle = null;
        List list = null;
        String str = null;
        DocumentFeatures documentFeatures = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(descriptor2);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                documentBinaryMedia = (DocumentBinaryMedia) dVarBeginStructure.decodeSerializableElement(descriptor2, 0, DocumentBinaryMedia$$serializer.INSTANCE, documentBinaryMedia);
                i |= 1;
            } else if (iD == 1) {
                documentValidationWarningsBundle = (DocumentValidationWarningsBundle) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 1, DocumentValidationWarningsBundle$$serializer.INSTANCE, documentValidationWarningsBundle);
                i |= 2;
            } else if (iD == 2) {
                list = (List) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 2, kSerializerArr[2], list);
                i |= 4;
            } else if (iD == 3) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 3, v1.f247718a, str);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                documentFeatures = (DocumentFeatures) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 4, DocumentFeatures$$serializer.INSTANCE, documentFeatures);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new DocumentMediaUploadResponse(i, documentBinaryMedia, documentValidationWarningsBundle, list, str, documentFeatures, (SerializationConstructorMarker) null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull DocumentMediaUploadResponse value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        DocumentMediaUploadResponse.write$Self$onfido_api_client(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
