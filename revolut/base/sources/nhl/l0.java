package nhl;

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

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class l0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f215535a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l0 l0Var = new l0();
        f215535a = l0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener.models.ScreenerSearchEntity", l0Var, 3);
        pluginGeneratedSerialDescriptor.j("count", false);
        pluginGeneratedSerialDescriptor.j("securities", false);
        pluginGeneratedSerialDescriptor.j("sortingOptions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private l0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qlm.n0.f247680a, n0.d[1].getValue(), u0.f215569a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = n0.d;
        dVarBeginStructure.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        int iDecodeIntElement = 0;
        w0 w0Var = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                w0Var = (w0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, u0.f215569a, w0Var);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new n0(i, iDecodeIntElement, list, w0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        n0 value = (n0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = n0.d;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, value.f215539a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f215540b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, u0.f215569a, value.f215541c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
