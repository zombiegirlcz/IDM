package ecd;

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

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2 f124710a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        y2 y2Var = new y2();
        f124710a = y2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.savings.impl.product.data.dto.SavingsOnboardingDataDto", y2Var, 4);
        pluginGeneratedSerialDescriptor.j("products", false);
        pluginGeneratedSerialDescriptor.j("groups", false);
        pluginGeneratedSerialDescriptor.j("onboardingConfig", false);
        pluginGeneratedSerialDescriptor.j("screensConfig", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private y2() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = a3.e;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), nlm.a.c(a.f124480a), nlm.a.c(e6.f124542a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = a3.e;
        dVarBeginStructure.getClass();
        int i = 0;
        List list = null;
        List list2 = null;
        o oVar = null;
        g6 g6Var = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                i |= 1;
            } else if (iD == 1) {
                list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list2);
                i |= 2;
            } else if (iD == 2) {
                oVar = (o) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, a.f124480a, oVar);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                g6Var = (g6) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, e6.f124542a, g6Var);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new a3(i, list, list2, oVar, g6Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        a3 value = (a3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = a3.e;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f124488a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f124489b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, a.f124480a, value.f124490c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, e6.f124542a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
