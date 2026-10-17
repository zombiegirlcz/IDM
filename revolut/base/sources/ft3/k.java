package ft3;

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

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f137842a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        k kVar = new k();
        f137842a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("creditCardLimitDecrease", kVar, 4);
        pluginGeneratedSerialDescriptor.j("originalFacilityId", false);
        pluginGeneratedSerialDescriptor.j("productSubtype", false);
        pluginGeneratedSerialDescriptor.j("productType", true);
        pluginGeneratedSerialDescriptor.j("productMetadataType", true);
        pluginGeneratedSerialDescriptor.l(new v("application_type"));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = m.e;
        return new KSerializer[]{v1.f247718a, nlm.a.c((KSerializer) lazyArr[1].getValue()), lazyArr[2].getValue(), nlm.a.c((KSerializer) lazyArr[3].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = m.e;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        gt3.b bVar = null;
        j1 j1Var = null;
        it3.k kVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                bVar = (gt3.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), bVar);
                i |= 2;
            } else if (iD == 2) {
                j1Var = (j1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), j1Var);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                kVar = (it3.k) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), kVar);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new m(i, strDecodeStringElement, bVar, j1Var, kVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        m value = (m) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = m.e;
        String str = value.f137847a;
        it3.k kVar = value.d;
        j1 j1Var = value.f137849c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f137848b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || j1Var != j1.CREDIT_CARD_LIMIT_DECREASE) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), j1Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || kVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), kVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
