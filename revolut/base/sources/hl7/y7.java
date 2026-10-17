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
public final /* synthetic */ class y7 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y7 f153380a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        y7 y7Var = new y7();
        f153380a = y7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.PricingDto", y7Var, 3);
        pluginGeneratedSerialDescriptor.j("price", false);
        pluginGeneratedSerialDescriptor.j("options", false);
        pluginGeneratedSerialDescriptor.j("premiumUpgrade", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private y7() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ie0.o.f160615a, a8.d[1].getValue(), nlm.a.c(qa.f153277a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = a8.d;
        dVarBeginStructure.getClass();
        dj0.d dVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        sa saVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                dVar = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.o.f160615a, dVar);
                i |= 1;
            } else if (iD == 1) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                saVar = (sa) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qa.f153277a, saVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new a8(i, dVar, list, saVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        a8 value = (a8) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = a8.d;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, ie0.o.f160615a, value.f153022a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f153023b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qa.f153277a, value.f153024c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
