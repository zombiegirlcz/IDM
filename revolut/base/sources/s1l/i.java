package s1l;

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
public final /* synthetic */ class i implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f259181a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        f259181a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.travel_status.impl.data.dto.partner.TravelStatusPartnerLayoutDto.ContentLinkDto", iVar, 3);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("url", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private i() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), v1Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String strDecodeStringElement = null;
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
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k(i, str, str2, strDecodeStringElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k value = (k) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f259184a != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f259184a);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f259185b != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f259185b);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f259186c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
