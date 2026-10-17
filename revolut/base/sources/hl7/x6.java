package hl7;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x6 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x6 f153366a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        x6 x6Var = new x6();
        f153366a = x6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.PlanDto", x6Var, 9);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("displayName", false);
        pluginGeneratedSerialDescriptor.j("shortDisplayName", false);
        pluginGeneratedSerialDescriptor.j("pricingToggles", false);
        pluginGeneratedSerialDescriptor.j("basicOffering", false);
        pluginGeneratedSerialDescriptor.j("smartDrivingOffering", false);
        pluginGeneratedSerialDescriptor.j("benefitCategories", false);
        pluginGeneratedSerialDescriptor.j("provider", false);
        pluginGeneratedSerialDescriptor.j("disclaimer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private x6() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = z6.f153393j;
        qlm.v1 v1Var = qlm.v1.f247718a;
        w5 w5Var = w5.f153351a;
        return new KSerializer[]{v1Var, v1Var, v1Var, e8.f153081a, nlm.a.c(w5Var), nlm.a.c(w5Var), lazyArr[6].getValue(), p4.f153253a, nlm.a.c((KSerializer) lazyArr[8].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = z6.f153393j;
        dVarBeginStructure.getClass();
        List list = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        g8 g8Var = null;
        y5 y5Var = null;
        y5 y5Var2 = null;
        List list2 = null;
        r4 r4Var = null;
        boolean z = true;
        int i = 0;
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
                    g8Var = (g8) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, e8.f153081a, g8Var);
                    i |= 8;
                    break;
                case 4:
                    y5Var = (y5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, w5.f153351a, y5Var);
                    i |= 16;
                    break;
                case 5:
                    y5Var2 = (y5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, w5.f153351a, y5Var2);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    r4Var = (r4) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, p4.f153253a, r4Var);
                    i |= 128;
                    break;
                case 8:
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new z6(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, g8Var, y5Var, y5Var2, list2, r4Var, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        z6 value = (z6) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = z6.f153393j;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f153394a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f153395b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f153396c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, e8.f153081a, value.d);
        w5 w5Var = w5.f153351a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, w5Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, w5Var, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f153397g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, p4.f153253a, value.f153398h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
