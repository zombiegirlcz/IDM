package s77;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f260528a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a0 a0Var = new a0();
        f260528a = a0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.global_markets.impl.data.network.RegionDetailsDto", a0Var, 9);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("region", false);
        pluginGeneratedSerialDescriptor.j("countryCode", false);
        pluginGeneratedSerialDescriptor.j("gdp", false);
        pluginGeneratedSerialDescriptor.j("retailSales", false);
        pluginGeneratedSerialDescriptor.j("inflationRate", false);
        pluginGeneratedSerialDescriptor.j("interestRate", false);
        pluginGeneratedSerialDescriptor.j("unemploymentRate", false);
        pluginGeneratedSerialDescriptor.j("consumerConfidence", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(e.f260538a);
        h hVar = h.f260542a;
        KSerializer kSerializerC2 = nlm.a.c(hVar);
        KSerializer kSerializerC3 = nlm.a.c(hVar);
        KSerializer kSerializerC4 = nlm.a.c(hVar);
        KSerializer kSerializerC5 = nlm.a.c(hVar);
        KSerializer kSerializerC6 = nlm.a.c(b.f260529a);
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6};
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
        g gVar = null;
        j jVar = null;
        j jVar2 = null;
        j jVar3 = null;
        j jVar4 = null;
        d dVar = null;
        int i = 0;
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
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    gVar = (g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, e.f260538a, gVar);
                    i |= 8;
                    break;
                case 4:
                    jVar = (j) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, h.f260542a, jVar);
                    i |= 16;
                    break;
                case 5:
                    jVar2 = (j) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, h.f260542a, jVar2);
                    i |= 32;
                    break;
                case 6:
                    jVar3 = (j) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, h.f260542a, jVar3);
                    i |= 64;
                    break;
                case 7:
                    jVar4 = (j) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, h.f260542a, jVar4);
                    i |= 128;
                    break;
                case 8:
                    dVar = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, b.f260529a, dVar);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c0(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, gVar, jVar, jVar2, jVar3, jVar4, dVar);
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
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f260530a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f260531b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f260532c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, e.f260538a, value.d);
        h hVar = h.f260542a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, hVar, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, hVar, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, hVar, value.f260533g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, hVar, value.f260534h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, b.f260529a, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
