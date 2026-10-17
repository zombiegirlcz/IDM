package sue;

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
import qlm.t0;
import qlm.v1;
import que.a;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f265735a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        f265735a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.topup_screen.impl.data.network.model.india.IndiaStoredMethodDetailDto", eVar, 8);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("failureReason", false);
        pluginGeneratedSerialDescriptor.j("lastUsedAt", false);
        pluginGeneratedSerialDescriptor.j("logo", false);
        pluginGeneratedSerialDescriptor.j("details", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(t0.f247706a), nlm.a.c(a.C1363a.f249436a), nlm.a.c(f.f265736a)};
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
        String str = null;
        String str2 = null;
        Long l2 = null;
        que.a aVar = null;
        h hVar = null;
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
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
                    i |= 16;
                    break;
                case 5:
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, t0.f247706a, l2);
                    i |= 32;
                    break;
                case 6:
                    aVar = (que.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, a.C1363a.f249436a, aVar);
                    i |= 64;
                    break;
                case 7:
                    hVar = (h) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, f.f265736a, hVar);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, str, str2, l2, aVar, hVar);
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
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f265739a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f265740b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f265741c);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, t0.f247706a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, a.C1363a.f249436a, value.f265742g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, f.f265736a, value.f265743h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
