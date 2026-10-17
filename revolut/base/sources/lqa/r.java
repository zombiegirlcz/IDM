package lqa;

import java.util.List;
import kotlin.Lazy;
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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f199269a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        r rVar = new r();
        f199269a = rVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.push_to_card.impl.dto.EligibilityDto", rVar, 10);
        pluginGeneratedSerialDescriptor.j("addressRequired", false);
        pluginGeneratedSerialDescriptor.j("cityRequired", false);
        pluginGeneratedSerialDescriptor.j("issuerCountry", false);
        pluginGeneratedSerialDescriptor.j("billingCurrency", false);
        pluginGeneratedSerialDescriptor.j("scheme", false);
        pluginGeneratedSerialDescriptor.j("issuerName", false);
        pluginGeneratedSerialDescriptor.j("logoUrl", false);
        pluginGeneratedSerialDescriptor.j("eligible", false);
        pluginGeneratedSerialDescriptor.j("ineligibleReason", false);
        pluginGeneratedSerialDescriptor.j("additionalFields", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private r() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = t.k;
        v1 v1Var = v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c(u.f199276a);
        KSerializer kSerializerC3 = nlm.a.c((KSerializer) lazyArr[9].getValue());
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{hVar, hVar, v1Var, v1Var, v1Var, v1Var, kSerializerC, hVar, kSerializerC2, kSerializerC3};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = t.k;
        dVarBeginStructure.getClass();
        w wVar = null;
        List list = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String str = null;
        boolean z = true;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        boolean zDecodeBooleanElement2 = false;
        boolean zDecodeBooleanElement3 = false;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str);
                    i |= 64;
                    break;
                case 7:
                    zDecodeBooleanElement3 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    wVar = (w) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, u.f199276a, wVar);
                    i |= 256;
                    break;
                case 9:
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new t(i, zDecodeBooleanElement, zDecodeBooleanElement2, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, str, zDecodeBooleanElement3, wVar, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        t value = (t) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = t.k;
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, value.f199270a);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, value.f199271b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f199272c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, value.f199273g);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, value.f199274h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, u.f199276a, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.f199275j);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
