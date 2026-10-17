package jrk;

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

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class j implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f178061a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        f178061a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.stockdetails.impl.data.network.model.IndexMarketSentimentDto", jVar, 3);
        pluginGeneratedSerialDescriptor.j("sentiment", false);
        pluginGeneratedSerialDescriptor.j("chart", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{v1.f247718a, k.f178065a, m2l.m.f202217a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        boolean z = true;
        int i = 0;
        p pVar = null;
        m2l.o oVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                pVar = (p) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, k.f178065a, pVar);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                oVar = (m2l.o) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, m2l.m.f202217a, oVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new r(i, strDecodeStringElement, pVar, oVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        r value = (r) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f178073a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, k.f178065a, value.f178074b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, m2l.m.f202217a, value.f178075c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
