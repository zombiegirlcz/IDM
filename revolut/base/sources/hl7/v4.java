package hl7;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v4 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v4 f153337a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v4 v4Var = new v4();
        f153337a = v4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.LicencePenaltiesDto", v4Var, 3);
        pluginGeneratedSerialDescriptor.j("points", false);
        pluginGeneratedSerialDescriptor.j("determinedByJudge", false);
        pluginGeneratedSerialDescriptor.j("acquiredForSpecificReasons", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v4() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{qlm.v1.f247718a, nlm.a.c(hVar), nlm.a.c(hVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.h.f247648a, bool);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.h.f247648a, bool2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new x4(bool, i, bool2, strDecodeStringElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x4 value = (x4) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f153363a);
        qlm.h hVar = qlm.h.f247648a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, hVar, value.f153364b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, hVar, value.f153365c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
