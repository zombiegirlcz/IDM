package o45;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class q0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f222094a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        q0 q0Var = new q0();
        f222094a = q0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.credit.loan.impl.database.entity.LoanEntity.LoanInterestRateDescriptor", q0Var, 7);
        pluginGeneratedSerialDescriptor.j("mode", false);
        pluginGeneratedSerialDescriptor.j("interestRate", false);
        pluginGeneratedSerialDescriptor.j("baseRate", false);
        pluginGeneratedSerialDescriptor.j("margin", false);
        pluginGeneratedSerialDescriptor.j("apr", false);
        pluginGeneratedSerialDescriptor.j("nextScheduleRegeneration", false);
        pluginGeneratedSerialDescriptor.j("fixedRatePeriodType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private q0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, nlm.a.c(r0.f222096a), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(ie0.m.f160609a), nlm.a.c(v1Var)};
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
        t0 t0Var = null;
        String str = null;
        String str2 = null;
        LocalDate localDate = null;
        String str3 = null;
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
                    t0Var = (t0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, r0.f222096a, t0Var);
                    i |= 4;
                    break;
                case 3:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str2);
                    i |= 16;
                    break;
                case 5:
                    localDate = (LocalDate) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ie0.m.f160609a, localDate);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str3);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new v0(i, strDecodeStringElement, strDecodeStringElement2, t0Var, str, str2, localDate, str3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        v0 value = (v0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f222113a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f222114b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, r0.f222096a, value.f222115c);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, ie0.m.f160609a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, value.f222116g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
