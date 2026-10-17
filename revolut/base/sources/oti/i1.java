package oti;

import jo3.a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f229647a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i1 i1Var = new i1();
        f229647a = i1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airport.security_fast_track.impl.network.dto.AsftPriceBreakdownDto", i1Var, 6);
        pluginGeneratedSerialDescriptor.j("pricePerPassenger", false);
        pluginGeneratedSerialDescriptor.j("pointsOption", false);
        pluginGeneratedSerialDescriptor.j("pricePerGuest", false);
        pluginGeneratedSerialDescriptor.j("pointsOptionPerGuest", false);
        pluginGeneratedSerialDescriptor.j("planName", false);
        pluginGeneratedSerialDescriptor.j("pricePerCompanion", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private i1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        a.C1001a c1001a = a.C1001a.f176860a;
        k1 k1Var = k1.f229653a;
        return new KSerializer[]{c1001a, nlm.a.c(k1Var), nlm.a.c(c1001a), nlm.a.c(k1Var), nlm.a.c(qlm.v1.f247718a), nlm.a.c(c1001a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        jo3.a aVar = null;
        m1 m1Var = null;
        jo3.a aVar2 = null;
        m1 m1Var2 = null;
        String str = null;
        jo3.a aVar3 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                    i |= 1;
                    break;
                case 1:
                    m1Var = (m1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, k1.f229653a, m1Var);
                    i |= 2;
                    break;
                case 2:
                    aVar2 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, aVar2);
                    i |= 4;
                    break;
                case 3:
                    m1Var2 = (m1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, k1.f229653a, m1Var2);
                    i |= 8;
                    break;
                case 4:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str);
                    i |= 16;
                    break;
                case 5:
                    aVar3 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, a.C1001a.f176860a, aVar3);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new n1(i, aVar, m1Var, aVar2, m1Var2, str, aVar3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        n1 value = (n1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, c1001a, value.f229669a);
        k1 k1Var = k1.f229653a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, k1Var, value.f229670b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, c1001a, value.f229671c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, k1Var, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, c1001a, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
