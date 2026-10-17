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
public final /* synthetic */ class i0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f137838a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i0 i0Var = new i0();
        f137838a = i0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("postTerminationPartialSettlements", i0Var, 4);
        pluginGeneratedSerialDescriptor.j("originalFacilityId", false);
        pluginGeneratedSerialDescriptor.j("productType", true);
        pluginGeneratedSerialDescriptor.j("productSubtype", true);
        pluginGeneratedSerialDescriptor.j("productMetadataType", true);
        pluginGeneratedSerialDescriptor.l(new v("application_type"));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private i0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = k0.e;
        return new KSerializer[]{v1.f247718a, lazyArr[1].getValue(), nlm.a.c((KSerializer) lazyArr[2].getValue()), nlm.a.c((KSerializer) lazyArr[3].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = k0.e;
        dVarBeginStructure.getClass();
        int i = 0;
        j1 j1Var = null;
        gt3.f fVar = null;
        it3.k kVar = null;
        String strDecodeStringElement = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                j1Var = (j1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), j1Var);
                i |= 2;
            } else if (iD == 2) {
                fVar = (gt3.f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), fVar);
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
        return new k0(i, j1Var, fVar, kVar, strDecodeStringElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k0 value = (k0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = k0.e;
        String str = value.f137843a;
        it3.k kVar = value.d;
        gt3.f fVar = value.f137845c;
        j1 j1Var = value.f137844b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || j1Var != j1.POST_TERMINATION_PARTIAL_SETTLEMENTS) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), j1Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || fVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), fVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || kVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), kVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
