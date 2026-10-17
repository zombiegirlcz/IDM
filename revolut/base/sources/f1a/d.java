package f1a;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f131196a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f131196a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.payments.splitbill.impl.data.splitbilllink.models.SplitBillLinkDetailsDto", dVar, 10);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("username", false);
        pluginGeneratedSerialDescriptor.j("expiryDate", false);
        pluginGeneratedSerialDescriptor.j("transactionCreationDate", true);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("logo", true);
        pluginGeneratedSerialDescriptor.j("category", false);
        pluginGeneratedSerialDescriptor.j("requestedAmount", true);
        pluginGeneratedSerialDescriptor.j("totalAmount", false);
        pluginGeneratedSerialDescriptor.j("paidAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        t0 t0Var = t0.f247706a;
        KSerializer kSerializerC = nlm.a.c(t0Var);
        KSerializer kSerializerC2 = nlm.a.c(v1Var);
        ie0.o oVar = ie0.o.f160615a;
        return new KSerializer[]{v1Var, v1Var, t0Var, kSerializerC, v1Var, kSerializerC2, v1Var, nlm.a.c(oVar), oVar, nlm.a.c(oVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        dj0.d dVar = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        Long l2 = null;
        String strDecodeStringElement3 = null;
        String str = null;
        String strDecodeStringElement4 = null;
        long jDecodeLongElement = 0;
        boolean z = true;
        int i = 0;
        dj0.d dVar2 = null;
        dj0.d dVar3 = null;
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
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, t0.f247706a, l2);
                    i |= 8;
                    break;
                case 4:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str);
                    i |= 32;
                    break;
                case 6:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    dVar = (dj0.d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ie0.o.f160615a, dVar);
                    i |= 128;
                    break;
                case 8:
                    dVar2 = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, ie0.o.f160615a, dVar2);
                    i |= 256;
                    break;
                case 9:
                    dVar3 = (dj0.d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, ie0.o.f160615a, dVar3);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f(i, strDecodeStringElement, strDecodeStringElement2, jDecodeLongElement, l2, strDecodeStringElement3, str, strDecodeStringElement4, dVar, dVar2, dVar3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f value = (f) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f131197a;
        dj0.d dVar = value.f131202j;
        dj0.d dVar2 = value.f131201h;
        String str2 = value.f;
        Long l2 = value.d;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f131198b);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.f131199c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, t0.f247706a, l2);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str2);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f131200g);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || dVar2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, ie0.o.f160615a, dVar2);
        }
        ie0.o oVar = ie0.o.f160615a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, oVar, value.i);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || dVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, oVar, dVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
