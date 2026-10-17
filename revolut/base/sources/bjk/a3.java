package bjk;

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

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a3 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a3 f15699a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a3 a3Var = new a3();
        f15699a = a3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.pricing_plans.ui.impl.network.dto.PricingPlanLayoutFooterDto", a3Var, 2);
        pluginGeneratedSerialDescriptor.j("buttons", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a3() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c((KSerializer) c3.f15707c[0].getValue()), nlm.a.c(d3.f15837a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = c3.f15707c;
        dVarBeginStructure.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        i3 i3Var = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                i3Var = (i3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, d3.f15837a, i3Var);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c3(i, list, i3Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c3 value = (c3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (mlm.h) c3.f15707c[0].getValue(), value.f15708a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, d3.f15837a, value.f15709b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
