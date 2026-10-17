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
public final /* synthetic */ class y implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f229705a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        y yVar = new y();
        f229705a = yVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airport.security_fast_track.impl.network.dto.AsftCheckoutPriceBreakdownDto", yVar, 9);
        pluginGeneratedSerialDescriptor.j("pricePerPassenger", false);
        pluginGeneratedSerialDescriptor.j("finalPrice", false);
        pluginGeneratedSerialDescriptor.j("pointsOptionsContainer", false);
        pluginGeneratedSerialDescriptor.j("guestsFinalPrice", false);
        pluginGeneratedSerialDescriptor.j("pricePerGuest", false);
        pluginGeneratedSerialDescriptor.j("planName", false);
        pluginGeneratedSerialDescriptor.j("originalPrice", false);
        pluginGeneratedSerialDescriptor.j("pricePerCompanion", false);
        pluginGeneratedSerialDescriptor.j("companionPasses", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private y() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        a.C1001a c1001a = a.C1001a.f176860a;
        return new KSerializer[]{c1001a, c1001a, nlm.a.c(s.f229685a), nlm.a.c(c1001a), nlm.a.c(c1001a), nlm.a.c(qlm.v1.f247718a), nlm.a.c(c1001a), nlm.a.c(c1001a), nlm.a.c(qlm.n0.f247680a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        jo3.a aVar = null;
        jo3.a aVar2 = null;
        u uVar = null;
        jo3.a aVar3 = null;
        jo3.a aVar4 = null;
        String str = null;
        jo3.a aVar5 = null;
        jo3.a aVar6 = null;
        Integer num = null;
        int i = 0;
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
                    aVar2 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar2);
                    i |= 2;
                    break;
                case 2:
                    uVar = (u) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s.f229685a, uVar);
                    i |= 4;
                    break;
                case 3:
                    aVar3 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, aVar3);
                    i |= 8;
                    break;
                case 4:
                    aVar4 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, a.C1001a.f176860a, aVar4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str);
                    i |= 32;
                    break;
                case 6:
                    aVar5 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, a.C1001a.f176860a, aVar5);
                    i |= 64;
                    break;
                case 7:
                    aVar6 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, a.C1001a.f176860a, aVar6);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.n0.f247680a, num);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new a0(i, aVar, aVar2, uVar, aVar3, aVar4, str, aVar5, aVar6, num);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        a0 value = (a0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, c1001a, value.f229595a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, c1001a, value.f229596b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, s.f229685a, value.f229597c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, c1001a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, c1001a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, c1001a, value.f229598g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, c1001a, value.f229599h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, qlm.n0.f247680a, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
