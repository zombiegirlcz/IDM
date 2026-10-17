package bk1;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16214a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f16214a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.air.tip.learn.impl.data.network.model.LearnAirTipDto", aVar, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("typeId", true);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("assistantQuery", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, v1Var};
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
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
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
            } else if (iD == 3) {
                strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c value = (c) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f16215a;
        String str2 = value.f16216b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(str2, "airtip_learn")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, str2);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f16217c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
