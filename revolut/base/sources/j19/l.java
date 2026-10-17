package j19;

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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f170220a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l lVar = new l();
        f170220a = lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ACTION_LIST", lVar, 6);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("componentId", true);
        pluginGeneratedSerialDescriptor.j("placementId", true);
        pluginGeneratedSerialDescriptor.j("contentSource", true);
        pluginGeneratedSerialDescriptor.j("refreshStrategy", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        Intrinsics.checkNotNullParameter("contentType", "discriminator");
        pluginGeneratedSerialDescriptor.l(new hi9.g(6, false));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private l() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = t.f170256g;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[3].getValue()), nlm.a.c(i19.d.f157595a), nlm.a.c(n.f170229a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = t.f170256g;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String str = null;
        String str2 = null;
        a aVar = null;
        i19.g gVar = null;
        s sVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str2);
                    i |= 4;
                    break;
                case 3:
                    aVar = (a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), aVar);
                    i |= 8;
                    break;
                case 4:
                    gVar = (i19.g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, i19.d.f157595a, gVar);
                    i |= 16;
                    break;
                case 5:
                    sVar = (s) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, n.f170229a, sVar);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new t(i, strDecodeStringElement, str, str2, aVar, gVar, sVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        t value = (t) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = t.f170256g;
        String str = value.f170257a;
        s sVar = value.f;
        i19.g gVar = value.e;
        a aVar = value.d;
        String str2 = value.f170259c;
        String str3 = value.f170258b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || aVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), aVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || gVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, i19.d.f157595a, gVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || sVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, n.f170229a, sVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
