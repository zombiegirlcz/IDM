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
public final /* synthetic */ class r9 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r9 f153292a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        r9 r9Var = new r9();
        f153292a = r9Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.SurveyDto", r9Var, 6);
        pluginGeneratedSerialDescriptor.j("drivingLicence", false);
        pluginGeneratedSerialDescriptor.j("employment", false);
        pluginGeneratedSerialDescriptor.j("currentInsurance", false);
        pluginGeneratedSerialDescriptor.j("claims", false);
        pluginGeneratedSerialDescriptor.j("licencePenalties", false);
        pluginGeneratedSerialDescriptor.j("mileage", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private r9() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(n2.f153221a), nlm.a.c(l3.f153184a), nlm.a.c(p1.f153250a), nlm.a.c(g1.f153113a), nlm.a.c(v4.f153337a), nlm.a.c(qlm.v1.f247718a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        p2 p2Var = null;
        n3 n3Var = null;
        r1 r1Var = null;
        i1 i1Var = null;
        x4 x4Var = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    p2Var = (p2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, n2.f153221a, p2Var);
                    i |= 1;
                    break;
                case 1:
                    n3Var = (n3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, l3.f153184a, n3Var);
                    i |= 2;
                    break;
                case 2:
                    r1Var = (r1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, p1.f153250a, r1Var);
                    i |= 4;
                    break;
                case 3:
                    i1Var = (i1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, g1.f153113a, i1Var);
                    i |= 8;
                    break;
                case 4:
                    x4Var = (x4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v4.f153337a, x4Var);
                    i |= 16;
                    break;
                case 5:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new t9(i, p2Var, n3Var, r1Var, i1Var, x4Var, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        t9 value = (t9) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, n2.f153221a, value.f153318a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, l3.f153184a, value.f153319b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, p1.f153250a, value.f153320c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, g1.f153113a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v4.f153337a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
