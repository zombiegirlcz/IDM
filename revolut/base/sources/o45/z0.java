package o45;

import java.time.ZonedDateTime;
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
public final /* synthetic */ class z0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f222161a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        z0 z0Var = new z0();
        f222161a = z0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.credit.loan.impl.database.entity.LoanEntity.LoanRepaymentDescriptor", z0Var, 15);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("transactionId", false);
        pluginGeneratedSerialDescriptor.j("repaymentDateTime", false);
        pluginGeneratedSerialDescriptor.j("currency", false);
        pluginGeneratedSerialDescriptor.j("amount", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("clientId", false);
        pluginGeneratedSerialDescriptor.j("firstName", false);
        pluginGeneratedSerialDescriptor.j("lastName", false);
        pluginGeneratedSerialDescriptor.j("principal", false);
        pluginGeneratedSerialDescriptor.j("accruedInterest", false);
        pluginGeneratedSerialDescriptor.j("lateRepaymentInterest", false);
        pluginGeneratedSerialDescriptor.j("transferType", false);
        pluginGeneratedSerialDescriptor.j("accountDetails", false);
        pluginGeneratedSerialDescriptor.j("insuranceType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private z0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        qlm.t0 t0Var = qlm.t0.f247706a;
        return new KSerializer[]{v1Var, v1Var, ie0.l.f160606a, v1Var, t0Var, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(v1Var), nlm.a.c(z1.f222162a), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String str2 = null;
        String str3 = null;
        b2 b2Var = null;
        Long l2 = null;
        Long l3 = null;
        String strDecodeStringElement = null;
        ZonedDateTime zonedDateTime = null;
        String strDecodeStringElement2 = null;
        Long l4 = null;
        String str4 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        long jDecodeLongElement = 0;
        int i = 0;
        boolean z = true;
        String str5 = null;
        String str6 = null;
        while (true) {
            String str7 = strDecodeStringElement;
            if (!z) {
                dVarBeginStructure.endStructure(serialDescriptor);
                return new b1(i, strDecodeStringElement4, str7, zonedDateTime, strDecodeStringElement2, jDecodeLongElement, strDecodeStringElement3, str2, str5, str6, l2, l3, l4, str4, b2Var, str3);
            }
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    str = strDecodeStringElement2;
                    z = false;
                    strDecodeStringElement = str7;
                    strDecodeStringElement2 = str;
                    break;
                case 0:
                    str = strDecodeStringElement2;
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    strDecodeStringElement = str7;
                    strDecodeStringElement2 = str;
                    break;
                case 1:
                    str = strDecodeStringElement2;
                    i |= 2;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    strDecodeStringElement2 = str;
                    break;
                case 2:
                    str = strDecodeStringElement2;
                    zonedDateTime = (ZonedDateTime) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.l.f160606a, zonedDateTime);
                    i |= 4;
                    strDecodeStringElement = str7;
                    strDecodeStringElement2 = str;
                    break;
                case 3:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    strDecodeStringElement = str7;
                    break;
                case 4:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 4);
                    i |= 16;
                    strDecodeStringElement = str7;
                    break;
                case 5:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    strDecodeStringElement = str7;
                    break;
                case 6:
                    str = strDecodeStringElement2;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str2);
                    i |= 64;
                    strDecodeStringElement = str7;
                    strDecodeStringElement2 = str;
                    break;
                case 7:
                    str = strDecodeStringElement2;
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str5);
                    i |= 128;
                    strDecodeStringElement = str7;
                    strDecodeStringElement2 = str;
                    break;
                case 8:
                    str = strDecodeStringElement2;
                    str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.v1.f247718a, str6);
                    i |= 256;
                    strDecodeStringElement = str7;
                    strDecodeStringElement2 = str;
                    break;
                case 9:
                    str = strDecodeStringElement2;
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.t0.f247706a, l2);
                    i |= 512;
                    strDecodeStringElement = str7;
                    strDecodeStringElement2 = str;
                    break;
                case 10:
                    str = strDecodeStringElement2;
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, qlm.t0.f247706a, l3);
                    i |= 1024;
                    strDecodeStringElement = str7;
                    strDecodeStringElement2 = str;
                    break;
                case 11:
                    str = strDecodeStringElement2;
                    l4 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, qlm.t0.f247706a, l4);
                    i |= 2048;
                    strDecodeStringElement = str7;
                    strDecodeStringElement2 = str;
                    break;
                case 12:
                    str = strDecodeStringElement2;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, qlm.v1.f247718a, str4);
                    i |= 4096;
                    strDecodeStringElement = str7;
                    strDecodeStringElement2 = str;
                    break;
                case 13:
                    str = strDecodeStringElement2;
                    b2Var = (b2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, z1.f222162a, b2Var);
                    i |= 8192;
                    strDecodeStringElement = str7;
                    strDecodeStringElement2 = str;
                    break;
                case 14:
                    str = strDecodeStringElement2;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, qlm.v1.f247718a, str3);
                    i |= 16384;
                    strDecodeStringElement = str7;
                    strDecodeStringElement2 = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        b1 value = (b1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f222007a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f222008b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, ie0.l.f160606a, value.f222009c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, value.f222010g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, value.f222011h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, value.i);
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, t0Var, value.f222012j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, t0Var, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, t0Var, value.f222013l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, v1Var, value.f222014m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, z1.f222162a, value.f222015n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, v1Var, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
