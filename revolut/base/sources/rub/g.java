package rub;

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
import qlm.t0;
import qlm.v1;
import qlm.x;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f257516a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        f257516a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rev_points.buying.api.model.PointsBuyingPackage.RecurringPackage", gVar, 9);
        pluginGeneratedSerialDescriptor.j("pointsAmount", false);
        pluginGeneratedSerialDescriptor.j("price", false);
        pluginGeneratedSerialDescriptor.j("quoteToken", false);
        pluginGeneratedSerialDescriptor.j("discountPercent", false);
        pluginGeneratedSerialDescriptor.j("orderId", false);
        pluginGeneratedSerialDescriptor.j("nextPurchase", false);
        pluginGeneratedSerialDescriptor.j("period", false);
        pluginGeneratedSerialDescriptor.j("strikethroughPrice", false);
        pluginGeneratedSerialDescriptor.j("isDeprecated", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private g() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c(v1Var);
        KSerializer kSerializerC3 = nlm.a.c(t0.f247706a);
        KSerializer kSerializerC4 = nlm.a.c(qlm.h.f247648a);
        x xVar = x.f247723a;
        ie0.o oVar = ie0.o.f160615a;
        return new KSerializer[]{xVar, oVar, kSerializerC, xVar, kSerializerC2, kSerializerC3, v1Var, oVar, kSerializerC4};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Long l2 = null;
        double dDecodeDoubleElement = 0.0d;
        double dDecodeDoubleElement2 = 0.0d;
        dj0.d dVar = null;
        Boolean bool = null;
        dj0.d dVar2 = null;
        String str = null;
        String str2 = null;
        String strDecodeStringElement = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    dVar2 = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ie0.o.f160615a, dVar2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                    i |= 4;
                    break;
                case 3:
                    dDecodeDoubleElement2 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
                    i |= 16;
                    break;
                case 5:
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, t0.f247706a, l2);
                    i |= 32;
                    break;
                case 6:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    dVar = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, ie0.o.f160615a, dVar);
                    i |= 128;
                    break;
                case 8:
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.h.f247648a, bool);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new i(i, dDecodeDoubleElement, dVar2, str, dDecodeDoubleElement2, str2, l2, strDecodeStringElement, dVar, bool);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        i value = (i) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 0, value.f257517a);
        ie0.o oVar = ie0.o.f160615a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, oVar, value.f257518b);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f257519c);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, t0.f247706a, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f257520g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, oVar, value.f257521h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, qlm.h.f247648a, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
