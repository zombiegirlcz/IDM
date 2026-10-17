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
public final /* synthetic */ class na implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final na f153234a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        na naVar = new na();
        f153234a = naVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.ToggleDetailsDto", naVar, 4);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("faqLink", false);
        pluginGeneratedSerialDescriptor.j("howItWorks", false);
        pluginGeneratedSerialDescriptor.j("background", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private na() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qlm.v1.f247718a, r3.f153286a, pa.e[2].getValue(), nlm.a.c(ja.f153165a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = pa.e;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        t3 t3Var = null;
        List list = null;
        la laVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                t3Var = (t3) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, r3.f153286a, t3Var);
                i |= 2;
            } else if (iD == 2) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                laVar = (la) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ja.f153165a, laVar);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new pa(i, strDecodeStringElement, t3Var, list, laVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        pa value = (pa) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = pa.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f153260a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, r3.f153286a, value.f153261b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f153262c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, ja.f153165a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
