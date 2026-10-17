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
public final /* synthetic */ class l6 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l6 f153186a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l6 l6Var = new l6();
        f153186a = l6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.PaymentDto", l6Var, 4);
        pluginGeneratedSerialDescriptor.j("frequency", false);
        pluginGeneratedSerialDescriptor.j("total", false);
        pluginGeneratedSerialDescriptor.j("tax", false);
        pluginGeneratedSerialDescriptor.j("paymentBreakdownCategories", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private l6() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = n6.e;
        v7 v7Var = v7.f153340a;
        return new KSerializer[]{qlm.v1.f247718a, v7Var, v7Var, lazyArr[3].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = n6.e;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        x7 x7Var = null;
        x7 x7Var2 = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                x7Var = (x7) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, v7.f153340a, x7Var);
                i |= 2;
            } else if (iD == 2) {
                x7Var2 = (x7) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, v7.f153340a, x7Var2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new n6(i, strDecodeStringElement, x7Var, x7Var2, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        n6 value = (n6) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = n6.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f153227a);
        v7 v7Var = v7.f153340a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, v7Var, value.f153228b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, v7Var, value.f153229c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
