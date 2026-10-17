package cd8;

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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f23209a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f23209a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.junior_consent.impl.data.dto.consents_track.JuniorConsentsTrackSerializable", dVar, 3);
        pluginGeneratedSerialDescriptor.j("youthId", false);
        pluginGeneratedSerialDescriptor.j("firstPartyMarketing", false);
        pluginGeneratedSerialDescriptor.j("thirdPartyMarketing", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        a aVar = a.f23207a;
        return new KSerializer[]{v1.f247718a, nlm.a.c(aVar), nlm.a.c(aVar)};
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
        c cVar = null;
        c cVar2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                cVar = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, a.f23207a, cVar);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                cVar2 = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, a.f23207a, cVar2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f(i, strDecodeStringElement, cVar, cVar2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f value = (f) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f23210a);
        a aVar = a.f23207a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, aVar, value.f23211b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, aVar, value.f23212c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
