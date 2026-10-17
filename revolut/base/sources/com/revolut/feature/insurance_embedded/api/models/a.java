package com.revolut.feature.insurance_embedded.api.models;

import com.revolut.feature.insurance_embedded.api.models.RemoteDocument;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f75847a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f75847a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.api.models.InsuranceDocuments", aVar, 6);
        pluginGeneratedSerialDescriptor.j("termsAndConditions", false);
        pluginGeneratedSerialDescriptor.j("policySummary", false);
        pluginGeneratedSerialDescriptor.j("guideToBenefits", false);
        pluginGeneratedSerialDescriptor.j("claimsEligibilityStatement", false);
        pluginGeneratedSerialDescriptor.j("productSummaryBannerDocument", false);
        pluginGeneratedSerialDescriptor.j("statementOfInsurance", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        RemoteDocument.a aVar = RemoteDocument.a.f75846a;
        return new KSerializer[]{nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c(aVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        RemoteDocument remoteDocument = null;
        RemoteDocument remoteDocument2 = null;
        RemoteDocument remoteDocument3 = null;
        RemoteDocument remoteDocument4 = null;
        RemoteDocument remoteDocument5 = null;
        RemoteDocument remoteDocument6 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    remoteDocument = (RemoteDocument) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, RemoteDocument.a.f75846a, remoteDocument);
                    i |= 1;
                    break;
                case 1:
                    remoteDocument2 = (RemoteDocument) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, RemoteDocument.a.f75846a, remoteDocument2);
                    i |= 2;
                    break;
                case 2:
                    remoteDocument3 = (RemoteDocument) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, RemoteDocument.a.f75846a, remoteDocument3);
                    i |= 4;
                    break;
                case 3:
                    remoteDocument4 = (RemoteDocument) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, RemoteDocument.a.f75846a, remoteDocument4);
                    i |= 8;
                    break;
                case 4:
                    remoteDocument5 = (RemoteDocument) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, RemoteDocument.a.f75846a, remoteDocument5);
                    i |= 16;
                    break;
                case 5:
                    remoteDocument6 = (RemoteDocument) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, RemoteDocument.a.f75846a, remoteDocument6);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new b(i, remoteDocument, remoteDocument2, remoteDocument3, remoteDocument4, remoteDocument5, remoteDocument6);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        b value = (b) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RemoteDocument.a aVar = RemoteDocument.a.f75846a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, aVar, value.f75848a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, aVar, value.f75849b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, aVar, value.f75850c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, aVar, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, aVar, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, aVar, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
