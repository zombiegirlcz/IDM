package rwg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.v1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f257949a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        y yVar = new y();
        f257949a = yVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.wealth.analytics.insights.network.model.PortfolioInsightsSummaryDto", yVar, 4);
        pluginGeneratedSerialDescriptor.j("gauge", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("highlightedInsight", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private y() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(g.f257922a);
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, kSerializerC};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        i iVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                iVar = (i) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, g.f257922a, iVar);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new a0(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, iVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        a0 value = (a0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f257905a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f257906b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f257907c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, g.f257922a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
