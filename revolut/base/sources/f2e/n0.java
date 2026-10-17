package f2e;

import java.util.List;
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

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f131663a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        n0 n0Var = new n0();
        f131663a = n0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.impl.data.network.model.DealsComponentDto", n0Var, 7);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("tiles", true);
        pluginGeneratedSerialDescriptor.j("mapBox", true);
        pluginGeneratedSerialDescriptor.j("outlets", true);
        pluginGeneratedSerialDescriptor.j("campaignOffers", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private n0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = p0.f131684h;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[3].getValue()), nlm.a.c(h2.f131612a), nlm.a.c((KSerializer) lazyArr[5].getValue()), nlm.a.c((KSerializer) lazyArr[6].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = p0.f131684h;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str = null;
        List list = null;
        j2 j2Var = null;
        List list2 = null;
        List list3 = null;
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
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str);
                    i |= 4;
                    break;
                case 3:
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    j2Var = (j2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, h2.f131612a, j2Var);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list3);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new p0(i, strDecodeStringElement, strDecodeStringElement2, str, list, j2Var, list2, list3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        p0 value = (p0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = p0.f131684h;
        String str = value.f131685a;
        List list = value.f131688g;
        List list2 = value.f;
        j2 j2Var = value.e;
        List list3 = value.d;
        String str2 = value.f131687c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f131686b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), list3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || j2Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, h2.f131612a, j2Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
