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
public final /* synthetic */ class o9 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o9 f153246a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        o9 o9Var = new o9();
        f153246a = o9Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.ReservationDto", o9Var, 7);
        pluginGeneratedSerialDescriptor.j("reservationId", false);
        pluginGeneratedSerialDescriptor.j("startDate", false);
        pluginGeneratedSerialDescriptor.j("optionIds", false);
        pluginGeneratedSerialDescriptor.j("smartDriving", false);
        pluginGeneratedSerialDescriptor.j("payment", false);
        pluginGeneratedSerialDescriptor.j("planPreview", false);
        pluginGeneratedSerialDescriptor.j("documentsCategories", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private o9() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = q9.f153272h;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, lazyArr[2].getValue(), qlm.h.f247648a, l6.f153186a, d7.f153067a, lazyArr[6].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = q9.f153272h;
        dVarBeginStructure.getClass();
        int i = 0;
        boolean zDecodeBooleanElement = false;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        List list = null;
        n6 n6Var = null;
        f7 f7Var = null;
        List list2 = null;
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
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    n6Var = (n6) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, l6.f153186a, n6Var);
                    i |= 16;
                    break;
                case 5:
                    f7Var = (f7) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, d7.f153067a, f7Var);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list2);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new q9(i, strDecodeStringElement, strDecodeStringElement2, list, zDecodeBooleanElement, n6Var, f7Var, list2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        q9 value = (q9) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = q9.f153272h;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f153273a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f153274b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f153275c);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, l6.f153186a, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, d7.f153067a, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f153276g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
