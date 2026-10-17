package o45;

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
public final /* synthetic */ class a0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f222006a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a0 a0Var = new a0();
        f222006a = a0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.credit.loan.impl.database.entity.LoanEntity.LoanEntryPointConfigDescriptor", a0Var, 9);
        pluginGeneratedSerialDescriptor.j("backupCardEnabled", false);
        pluginGeneratedSerialDescriptor.j("autoPay", false);
        pluginGeneratedSerialDescriptor.j("statementType", false);
        pluginGeneratedSerialDescriptor.j("repaymentDayChangeEnabled", false);
        pluginGeneratedSerialDescriptor.j("financialDifficultiesEnabled", false);
        pluginGeneratedSerialDescriptor.j("repaymentManagement", false);
        pluginGeneratedSerialDescriptor.j("cancellationEnabled", false);
        pluginGeneratedSerialDescriptor.j("helpTopic", false);
        pluginGeneratedSerialDescriptor.j("cooldownPeriodDays", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{hVar, v1Var, v1Var, hVar, hVar, v1Var, hVar, kSerializerC, qlm.n0.f247680a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String str = null;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        boolean zDecodeBooleanElement2 = false;
        boolean zDecodeBooleanElement3 = false;
        boolean zDecodeBooleanElement4 = false;
        int iDecodeIntElement = 0;
        boolean z = true;
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
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    zDecodeBooleanElement3 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    zDecodeBooleanElement4 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str);
                    i |= 128;
                    break;
                case 8:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c0(i, zDecodeBooleanElement, strDecodeStringElement, strDecodeStringElement2, zDecodeBooleanElement2, zDecodeBooleanElement3, strDecodeStringElement3, zDecodeBooleanElement4, str, iDecodeIntElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c0 value = (c0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, value.f222020a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f222021b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f222022c);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, value.f222023g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, value.f222024h);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
