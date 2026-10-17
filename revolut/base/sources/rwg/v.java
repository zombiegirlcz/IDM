package rwg;

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

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f257945a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v vVar = new v();
        f257945a = vVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.wealth.analytics.insights.network.model.PortfolioInsightsResponseDto", vVar, 3);
        pluginGeneratedSerialDescriptor.j("usageRequirements", false);
        pluginGeneratedSerialDescriptor.j("summary", false);
        pluginGeneratedSerialDescriptor.j("insights", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f0.f257921a, nlm.a.c(y.f257949a), x.d[2].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x.d;
        dVarBeginStructure.getClass();
        h0 h0Var = null;
        boolean z = true;
        int i = 0;
        a0 a0Var = null;
        List list = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                h0Var = (h0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, f0.f257921a, h0Var);
                i |= 1;
            } else if (iD == 1) {
                a0Var = (a0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, y.f257949a, a0Var);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new x(i, h0Var, a0Var, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x value = (x) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x.d;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, f0.f257921a, value.f257946a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, y.f257949a, value.f257947b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f257948c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
