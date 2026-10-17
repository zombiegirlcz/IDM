package gu7;

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
public final /* synthetic */ class l3 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l3 f146786a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l3 l3Var = new l3();
        f146786a = l3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("UPGRADE", l3Var, 2);
        pluginGeneratedSerialDescriptor.j("planIds", false);
        pluginGeneratedSerialDescriptor.j("selectedPlanId", false);
        pluginGeneratedSerialDescriptor.l(new bka.b(29));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private l3() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{n3.d[0].getValue(), nlm.a.c(qlm.v1.f247718a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = n3.d;
        dVarBeginStructure.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new n3(i, list, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        n3 value = (n3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) n3.d[0].getValue(), value.f146802b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, value.f146803c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
