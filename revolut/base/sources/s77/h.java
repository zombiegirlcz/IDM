package s77;

import java.math.BigDecimal;
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

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f260542a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h hVar = new h();
        f260542a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.global_markets.impl.data.network.HistoricalPercentageValueDto", hVar, 4);
        pluginGeneratedSerialDescriptor.j("last", false);
        pluginGeneratedSerialDescriptor.j("updatedAt", false);
        pluginGeneratedSerialDescriptor.j("previous", false);
        pluginGeneratedSerialDescriptor.j("previousUpdatedAt", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        a aVar = a.f260526a;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{aVar, v1Var, nlm.a.c(aVar), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        BigDecimal bigDecimal = null;
        String strDecodeStringElement = null;
        BigDecimal bigDecimal2 = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                bigDecimal = (BigDecimal) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a.f260526a, bigDecimal);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                bigDecimal2 = (BigDecimal) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, a.f260526a, bigDecimal2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j(i, bigDecimal, strDecodeStringElement, bigDecimal2, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        j value = (j) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        a aVar = a.f260526a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, aVar, value.f260543a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f260544b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, aVar, value.f260545c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
