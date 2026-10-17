package pne;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f237731a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        p pVar = new p();
        f237731a = pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.tax_residency.impl.exemption.models.dto.LimitExemptionOrderDto", pVar, 7);
        pluginGeneratedSerialDescriptor.j("code", false);
        pluginGeneratedSerialDescriptor.j("taxYear", false);
        pluginGeneratedSerialDescriptor.j("validityPeriod", false);
        pluginGeneratedSerialDescriptor.j("partnerInformation", false);
        pluginGeneratedSerialDescriptor.j("currentLimit", false);
        pluginGeneratedSerialDescriptor.j("utilisedAmount", false);
        pluginGeneratedSerialDescriptor.j("formId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private p() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v.f237740a);
        KSerializer kSerializerC2 = nlm.a.c(v1Var);
        ie0.o oVar = ie0.o.f160615a;
        return new KSerializer[]{v1Var, v1Var, f0.f237718a, kSerializerC, oVar, oVar, kSerializerC2};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        h0 h0Var = null;
        x xVar = null;
        dj0.d dVar = null;
        dj0.d dVar2 = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    h0Var = (h0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, f0.f237718a, h0Var);
                    i |= 4;
                    break;
                case 3:
                    xVar = (x) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v.f237740a, xVar);
                    i |= 8;
                    break;
                case 4:
                    dVar = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, ie0.o.f160615a, dVar);
                    i |= 16;
                    break;
                case 5:
                    dVar2 = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, ie0.o.f160615a, dVar2);
                    i |= 32;
                    break;
                case 6:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new r(i, strDecodeStringElement, strDecodeStringElement2, h0Var, xVar, dVar, dVar2, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        r value = (r) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f237732a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f237733b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, f0.f237718a, value.f237734c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v.f237740a, value.d);
        ie0.o oVar = ie0.o.f160615a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, oVar, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, oVar, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, value.f237735g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
