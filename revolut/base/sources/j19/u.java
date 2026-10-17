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
public final /* synthetic */ class u implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f170263a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        u uVar = new u();
        f170263a = uVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("BRAND_GRID_CAROUSEL", uVar, 6);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("componentId", true);
        pluginGeneratedSerialDescriptor.j("placementId", true);
        pluginGeneratedSerialDescriptor.j("contentSource", true);
        pluginGeneratedSerialDescriptor.j("refreshStrategy", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        Intrinsics.checkNotNullParameter("contentType", "discriminator");
        pluginGeneratedSerialDescriptor.l(new hi9.g(7, false));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private u() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = f0.f170197g;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[3].getValue()), nlm.a.c(i19.d.f157595a), nlm.a.c(w.f170270a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = f0.f170197g;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String str = null;
        String str2 = null;
        a aVar = null;
        i19.g gVar = null;
        e0 e0Var = null;
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
                    e0Var = (e0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, w.f170270a, e0Var);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f0(i, strDecodeStringElement, str, str2, aVar, gVar, e0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f0 value = (f0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = f0.f170197g;
        String str = value.f170198a;
        e0 e0Var = value.f;
        i19.g gVar = value.e;
        a aVar = value.d;
        String str2 = value.f170200c;
        String str3 = value.f170199b;
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
        if (compositeEncoderBeginStructure.d(serialDescriptor) || e0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, w.f170270a, e0Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
