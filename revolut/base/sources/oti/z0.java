package oti;

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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class z0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f229709a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        z0 z0Var = new z0();
        f229709a = z0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airport.security_fast_track.impl.network.dto.AsftPassDto", z0Var, 21);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("bookingDate", false);
        pluginGeneratedSerialDescriptor.j("revealableDate", false);
        pluginGeneratedSerialDescriptor.j("cityName", false);
        pluginGeneratedSerialDescriptor.j("cipName", false);
        pluginGeneratedSerialDescriptor.j("cipLocation", false);
        pluginGeneratedSerialDescriptor.j("terminalName", false);
        pluginGeneratedSerialDescriptor.j("airportDescription", false);
        pluginGeneratedSerialDescriptor.j("airportTimeZone", false);
        pluginGeneratedSerialDescriptor.j("iataCode", false);
        pluginGeneratedSerialDescriptor.j("flightNumber", false);
        pluginGeneratedSerialDescriptor.j("revealedDate", false);
        pluginGeneratedSerialDescriptor.j("cancellableUntilDate", false);
        pluginGeneratedSerialDescriptor.j("freeCancellationUntilDate", false);
        pluginGeneratedSerialDescriptor.j("countryCode", false);
        pluginGeneratedSerialDescriptor.j("childMinAge", false);
        pluginGeneratedSerialDescriptor.j("cancellationDate", false);
        pluginGeneratedSerialDescriptor.j("travellersCount", false);
        pluginGeneratedSerialDescriptor.j("admissions", false);
        pluginGeneratedSerialDescriptor.j("refundBreakdown", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private z0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = b1.v;
        qlm.v1 v1Var = qlm.v1.f247718a;
        qlm.t0 t0Var = qlm.t0.f247706a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c(t0Var);
        KSerializer kSerializerC3 = nlm.a.c(t0Var);
        KSerializer kSerializerC4 = nlm.a.c(v1Var);
        KSerializer kSerializerC5 = nlm.a.c(t0Var);
        KSerializer kSerializerC6 = nlm.a.c((KSerializer) lazyArr[19].getValue());
        KSerializer kSerializerC7 = nlm.a.c(c1.f229621a);
        qlm.n0 n0Var = qlm.n0.f247680a;
        return new KSerializer[]{v1Var, v1Var, t0Var, t0Var, v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, v1Var, n0Var, kSerializerC5, n0Var, kSerializerC6, kSerializerC7};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr2 = b1.v;
        dVarBeginStructure.getClass();
        String str = null;
        String str2 = null;
        Long l2 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        List list = null;
        e1 e1Var = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String strDecodeStringElement6 = null;
        String strDecodeStringElement7 = null;
        String strDecodeStringElement8 = null;
        String strDecodeStringElement9 = null;
        String strDecodeStringElement10 = null;
        long jDecodeLongElement = 0;
        long jDecodeLongElement2 = 0;
        int i2 = 0;
        boolean z = true;
        int iDecodeIntElement = 0;
        int iDecodeIntElement2 = 0;
        Long l3 = null;
        Long l4 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    lazyArr = lazyArr2;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                    lazyArr2 = lazyArr;
                    break;
                case 1:
                    lazyArr = lazyArr2;
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                    lazyArr2 = lazyArr;
                    break;
                case 2:
                    lazyArr = lazyArr2;
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i2 |= 4;
                    lazyArr2 = lazyArr;
                    break;
                case 3:
                    lazyArr = lazyArr2;
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
                    i2 |= 8;
                    lazyArr2 = lazyArr;
                    break;
                case 4:
                    lazyArr = lazyArr2;
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i2 |= 16;
                    lazyArr2 = lazyArr;
                    break;
                case 5:
                    lazyArr = lazyArr2;
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i2 |= 32;
                    lazyArr2 = lazyArr;
                    break;
                case 6:
                    lazyArr = lazyArr2;
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i2 |= 64;
                    lazyArr2 = lazyArr;
                    break;
                case 7:
                    lazyArr = lazyArr2;
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                    i2 |= 128;
                    lazyArr2 = lazyArr;
                    break;
                case 8:
                    lazyArr = lazyArr2;
                    strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(serialDescriptor, 8);
                    i2 |= 256;
                    lazyArr2 = lazyArr;
                    break;
                case 9:
                    lazyArr = lazyArr2;
                    strDecodeStringElement8 = dVarBeginStructure.decodeStringElement(serialDescriptor, 9);
                    i2 |= 512;
                    lazyArr2 = lazyArr;
                    break;
                case 10:
                    lazyArr = lazyArr2;
                    strDecodeStringElement9 = dVarBeginStructure.decodeStringElement(serialDescriptor, 10);
                    i2 |= 1024;
                    lazyArr2 = lazyArr;
                    break;
                case 11:
                    lazyArr = lazyArr2;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, qlm.v1.f247718a, str);
                    i2 |= 2048;
                    lazyArr2 = lazyArr;
                    break;
                case 12:
                    lazyArr = lazyArr2;
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, qlm.t0.f247706a, l3);
                    i2 |= 4096;
                    lazyArr2 = lazyArr;
                    break;
                case 13:
                    lazyArr = lazyArr2;
                    l4 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, qlm.t0.f247706a, l4);
                    i2 |= 8192;
                    lazyArr2 = lazyArr;
                    break;
                case 14:
                    lazyArr = lazyArr2;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, qlm.v1.f247718a, str2);
                    i2 |= 16384;
                    lazyArr2 = lazyArr;
                    break;
                case 15:
                    lazyArr = lazyArr2;
                    strDecodeStringElement10 = dVarBeginStructure.decodeStringElement(serialDescriptor, 15);
                    i = 32768;
                    i2 |= i;
                    lazyArr2 = lazyArr;
                    break;
                case 16:
                    lazyArr = lazyArr2;
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 16);
                    i = 65536;
                    i2 |= i;
                    lazyArr2 = lazyArr;
                    break;
                case 17:
                    lazyArr = lazyArr2;
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, qlm.t0.f247706a, l2);
                    i = 131072;
                    i2 |= i;
                    lazyArr2 = lazyArr;
                    break;
                case 18:
                    lazyArr = lazyArr2;
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 18);
                    i = 262144;
                    i2 |= i;
                    lazyArr2 = lazyArr;
                    break;
                case 19:
                    lazyArr = lazyArr2;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, (mlm.b) lazyArr[19].getValue(), list);
                    i = 524288;
                    i2 |= i;
                    lazyArr2 = lazyArr;
                    break;
                case 20:
                    lazyArr = lazyArr2;
                    e1Var = (e1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, c1.f229621a, e1Var);
                    i = PKIFailureInfo.badCertTemplate;
                    i2 |= i;
                    lazyArr2 = lazyArr;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new b1(i2, strDecodeStringElement, strDecodeStringElement2, jDecodeLongElement, jDecodeLongElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, strDecodeStringElement6, strDecodeStringElement7, strDecodeStringElement8, strDecodeStringElement9, str, l3, l4, str2, strDecodeStringElement10, iDecodeIntElement, l2, iDecodeIntElement2, list, e1Var);
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
        Lazy[] lazyArr = b1.v;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f229602a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f229603b);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.f229604c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f229605g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.f229606h);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.f229607j);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 10, value.k);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, v1Var, value.f229608l);
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, t0Var, value.f229609m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, t0Var, value.f229610n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, v1Var, value.o);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 15, value.f229611p);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 16, value.f229612q);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, t0Var, value.f229613r);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 18, value.f229614s);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, (mlm.h) lazyArr[19].getValue(), value.f229615t);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, c1.f229621a, value.u);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
