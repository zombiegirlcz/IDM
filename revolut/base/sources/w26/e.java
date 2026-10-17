package w26;

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
public final /* synthetic */ class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f293955a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        f293955a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.common.impl.data.network.dto.DeFiQuoteErrorDto.AssetDto", eVar, 4);
        pluginGeneratedSerialDescriptor.j("externalAssetId", false);
        pluginGeneratedSerialDescriptor.j("ticker", false);
        pluginGeneratedSerialDescriptor.j("pocketId", false);
        pluginGeneratedSerialDescriptor.j("currencyCode", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                i |= 1;
            } else if (iD == 1) {
                str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                i |= 2;
            } else if (iD == 2) {
                str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str3);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str4);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new g(i, str, str2, str3, str4);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        g value = (g) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, value.f293956a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f293957b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f293958c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
