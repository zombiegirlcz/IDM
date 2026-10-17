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
public final /* synthetic */ class i9 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i9 f153151a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i9 i9Var = new i9();
        f153151a = i9Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.RequestedDocumentsResponseDto", i9Var, 3);
        pluginGeneratedSerialDescriptor.j("remainingDays", false);
        pluginGeneratedSerialDescriptor.j("documents", false);
        pluginGeneratedSerialDescriptor.j("batchState", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private i9() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(qlm.n0.f247680a), k9.d[1].getValue(), qlm.v1.f247718a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = k9.d;
        dVarBeginStructure.getClass();
        Integer num = null;
        boolean z = true;
        int i = 0;
        List list = null;
        String strDecodeStringElement = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.n0.f247680a, num);
                i |= 1;
            } else if (iD == 1) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k9(i, num, strDecodeStringElement, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k9 value = (k9) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = k9.d;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.n0.f247680a, value.f153175a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f153176b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f153177c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
