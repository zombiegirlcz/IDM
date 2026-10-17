package w26;

import jo3.a;
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
public final /* synthetic */ class l implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f293963a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l lVar = new l();
        f293963a = lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.common.impl.data.network.dto.DeFiQuoteErrorDto.ParamsDto", lVar, 5);
        pluginGeneratedSerialDescriptor.j("reason", false);
        pluginGeneratedSerialDescriptor.j("minimumTradeAmount", false);
        pluginGeneratedSerialDescriptor.j("maximumTradeAmount", false);
        pluginGeneratedSerialDescriptor.j("maximumTradeFiatAmount", false);
        pluginGeneratedSerialDescriptor.j("limit", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private l() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(v1.f247718a);
        b bVar = b.f293951a;
        return new KSerializer[]{kSerializerC, nlm.a.c(bVar), nlm.a.c(bVar), nlm.a.c(a.C1001a.f176860a), nlm.a.c(i.f293959a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String str = null;
        d dVar = null;
        d dVar2 = null;
        jo3.a aVar = null;
        k kVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                i |= 1;
            } else if (iD == 1) {
                dVar = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b.f293951a, dVar);
                i |= 2;
            } else if (iD == 2) {
                dVar2 = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b.f293951a, dVar2);
                i |= 4;
            } else if (iD == 3) {
                aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, aVar);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                kVar = (k) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, i.f293959a, kVar);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new n(i, str, dVar, dVar2, aVar, kVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        n value = (n) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f293964a);
        b bVar = b.f293951a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, bVar, value.f293965b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, bVar, value.f293966c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, i.f293959a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
