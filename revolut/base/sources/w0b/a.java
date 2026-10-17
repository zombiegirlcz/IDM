package w0b;

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
import qlm.h;
import qlm.n0;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f293677a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f293677a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.advanced_charts.impl.domain.model.ChartHistoryRequestInfo", aVar, 5);
        pluginGeneratedSerialDescriptor.j("from", false);
        pluginGeneratedSerialDescriptor.j("to", false);
        pluginGeneratedSerialDescriptor.j("countBack", false);
        pluginGeneratedSerialDescriptor.j("symbol", false);
        pluginGeneratedSerialDescriptor.j("firstDataRequest", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(h.f247648a);
        t0 t0Var = t0.f247706a;
        return new KSerializer[]{t0Var, t0Var, n0.f247680a, v1.f247718a, kSerializerC};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        long jDecodeLongElement = 0;
        long jDecodeLongElement2 = 0;
        String strDecodeStringElement = null;
        Boolean bool = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, h.f247648a, bool);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, jDecodeLongElement, jDecodeLongElement2, iDecodeIntElement, strDecodeStringElement, bool);
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
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f293678a);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.f293679b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.f293680c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, h.f247648a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
