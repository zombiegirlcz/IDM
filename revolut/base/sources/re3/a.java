package re3;

import ie0.k;
import java.time.Instant;
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
import qlm.x;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f253503a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f253503a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.category_boost.impl.data.model.CategoryBoostDto", aVar, 9);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("category", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("booster", false);
        pluginGeneratedSerialDescriptor.j("startsAt", false);
        pluginGeneratedSerialDescriptor.j("endsAt", false);
        pluginGeneratedSerialDescriptor.j("cap", true);
        pluginGeneratedSerialDescriptor.j("pointsEarned", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        x xVar = x.f247723a;
        KSerializer kSerializerC = nlm.a.c(xVar);
        KSerializer kSerializerC2 = nlm.a.c(xVar);
        v1 v1Var = v1.f247718a;
        k kVar = k.f160604a;
        return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, xVar, kVar, kVar, kSerializerC, kSerializerC2};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Instant instant = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        Instant instant2 = null;
        double dDecodeDoubleElement = 0.0d;
        boolean z = true;
        int i = 0;
        Double d = null;
        Double d5 = null;
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
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    instant2 = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, k.f160604a, instant2);
                    i |= 32;
                    break;
                case 6:
                    instant = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, k.f160604a, instant);
                    i |= 64;
                    break;
                case 7:
                    d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, x.f247723a, d);
                    i |= 128;
                    break;
                case 8:
                    d5 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, x.f247723a, d5);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, dDecodeDoubleElement, instant2, instant, d, d5);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c value = (c) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f253504a;
        Double d = value.i;
        Double d5 = value.f253508h;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f253505b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f253506c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 4, value.e);
        k kVar = k.f160604a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, kVar, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, kVar, value.f253507g);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, x.f247723a, d5);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, x.f247723a, d);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
