package com.onfido.api.client.data;

import bl.a;
import java.util.Date;
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
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.t0;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/onfido/api/client/data/DocumentUpload.$serializer", "Lqlm/f0;", "Lcom/onfido/api/client/data/DocumentUpload;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/onfido/api/client/data/DocumentUpload;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/onfido/api/client/data/DocumentUpload;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class DocumentUpload$$serializer implements f0 {

    @NotNull
    public static final DocumentUpload$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DocumentUpload$$serializer documentUpload$$serializer = new DocumentUpload$$serializer();
        INSTANCE = documentUpload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.api.client.data.DocumentUpload", documentUpload$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("file_name", false);
        pluginGeneratedSerialDescriptor.j("file_type", false);
        pluginGeneratedSerialDescriptor.j("file_size", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("side", true);
        pluginGeneratedSerialDescriptor.j("sdk_warnings", true);
        pluginGeneratedSerialDescriptor.j("issuing_country", true);
        pluginGeneratedSerialDescriptor.j("href", false);
        pluginGeneratedSerialDescriptor.j("download_href", false);
        pluginGeneratedSerialDescriptor.j("applicant_id", false);
        pluginGeneratedSerialDescriptor.j("document_features", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DocumentUpload$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, a.f16438a, v1Var, v1Var, t0.f247706a, DocType$$serializer.INSTANCE, nlm.a.c(v1Var), nlm.a.c(DocumentValidationWarningsBundle$$serializer.INSTANCE), nlm.a.c(v1Var), v1Var, v1Var, v1Var, nlm.a.c(DocumentFeatures$$serializer.INSTANCE)};
    }

    @Override // mlm.b
    @NotNull
    public DocumentUpload deserialize(@NotNull Decoder decoder) {
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        dVarBeginStructure.getClass();
        String str = null;
        DocumentFeatures documentFeatures = null;
        String strDecodeStringElement = null;
        Date date = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        DocType docType = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String strDecodeStringElement6 = null;
        long jDecodeLongElement = 0;
        int i = 0;
        boolean z3 = true;
        DocumentValidationWarningsBundle documentValidationWarningsBundle = null;
        String str2 = null;
        while (z3) {
            int iD = dVarBeginStructure.d(descriptor2);
            switch (iD) {
                case -1:
                    z3 = false;
                    continue;
                case 0:
                    z = z3;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    z = z3;
                    date = (Date) dVarBeginStructure.decodeSerializableElement(descriptor2, 1, a.f16438a, date);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(descriptor2, 2);
                    i |= 4;
                    continue;
                case 3:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(descriptor2, 3);
                    i |= 8;
                    continue;
                case 4:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(descriptor2, 4);
                    i |= 16;
                    continue;
                case 5:
                    z = z3;
                    docType = (DocType) dVarBeginStructure.decodeSerializableElement(descriptor2, 5, DocType$$serializer.INSTANCE, docType);
                    i |= 32;
                    break;
                case 6:
                    z = z3;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 6, v1.f247718a, str);
                    i |= 64;
                    break;
                case 7:
                    z = z3;
                    documentValidationWarningsBundle = (DocumentValidationWarningsBundle) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 7, DocumentValidationWarningsBundle$$serializer.INSTANCE, documentValidationWarningsBundle);
                    i |= 128;
                    break;
                case 8:
                    z = z3;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 8, v1.f247718a, str2);
                    i |= 256;
                    break;
                case 9:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(descriptor2, 9);
                    i |= 512;
                    continue;
                case 10:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(descriptor2, 10);
                    i |= 1024;
                    continue;
                case 11:
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(descriptor2, 11);
                    i |= 2048;
                    continue;
                case 12:
                    z = z3;
                    documentFeatures = (DocumentFeatures) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 12, DocumentFeatures$$serializer.INSTANCE, documentFeatures);
                    i |= 4096;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            z3 = z;
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new DocumentUpload(i, strDecodeStringElement, date, strDecodeStringElement2, strDecodeStringElement3, jDecodeLongElement, docType, str, documentValidationWarningsBundle, str2, strDecodeStringElement4, strDecodeStringElement5, strDecodeStringElement6, documentFeatures, (SerializationConstructorMarker) null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull DocumentUpload value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        DocumentUpload.write$Self$onfido_api_client(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
