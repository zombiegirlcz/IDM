package o45;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
public final /* synthetic */ class d0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f222037a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d0 d0Var = new d0();
        f222037a = d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.credit.loan.impl.database.entity.LoanEntity.LoanInstalmentDescriptor", d0Var, 9);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("repaymentDate", false);
        pluginGeneratedSerialDescriptor.j("actualRepaymentTime", false);
        pluginGeneratedSerialDescriptor.j("estimatedCollectionDate", false);
        pluginGeneratedSerialDescriptor.j("currency", false);
        pluginGeneratedSerialDescriptor.j("amount", false);
        pluginGeneratedSerialDescriptor.j("principal", false);
        pluginGeneratedSerialDescriptor.j("isInterestOnly", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        ie0.m mVar = ie0.m.f160609a;
        KSerializer kSerializerC2 = nlm.a.c(ie0.n.f160612a);
        KSerializer kSerializerC3 = nlm.a.c(mVar);
        qlm.t0 t0Var = qlm.t0.f247706a;
        return new KSerializer[]{v1Var, kSerializerC, mVar, kSerializerC2, kSerializerC3, v1Var, t0Var, t0Var, qlm.h.f247648a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        boolean zDecodeBooleanElement = false;
        String strDecodeStringElement = null;
        String str = null;
        LocalDate localDate = null;
        LocalDateTime localDateTime = null;
        LocalDate localDate2 = null;
        String strDecodeStringElement2 = null;
        long jDecodeLongElement = 0;
        long jDecodeLongElement2 = 0;
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
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                    i |= 2;
                    break;
                case 2:
                    localDate = (LocalDate) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.m.f160609a, localDate);
                    i |= 4;
                    break;
                case 3:
                    localDateTime = (LocalDateTime) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ie0.n.f160612a, localDateTime);
                    i |= 8;
                    break;
                case 4:
                    localDate2 = (LocalDate) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ie0.m.f160609a, localDate2);
                    i |= 16;
                    break;
                case 5:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f0(i, strDecodeStringElement, str, localDate, localDateTime, localDate2, strDecodeStringElement2, jDecodeLongElement, jDecodeLongElement2, zDecodeBooleanElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f0 value = (f0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f222048a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, value.f222049b);
        ie0.m mVar = ie0.m.f160609a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, mVar, value.f222050c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, ie0.n.f160612a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, mVar, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, value.f222051g);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 7, value.f222052h);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
