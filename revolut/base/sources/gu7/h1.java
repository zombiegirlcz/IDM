package gu7;

import com.revolut.feature.insurance_common.data.model.Banner;
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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f146755a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h1 h1Var = new h1();
        f146755a = h1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.Coverage", h1Var, 3);
        pluginGeneratedSerialDescriptor.j("sections", false);
        pluginGeneratedSerialDescriptor.j("banner", false);
        pluginGeneratedSerialDescriptor.j("announcement", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{j1.d[0].getValue(), nlm.a.c(h4.f146760a), nlm.a.c(Banner.a.f75712a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = j1.d;
        dVarBeginStructure.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        j4 j4Var = null;
        Banner banner = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                i |= 1;
            } else if (iD == 1) {
                j4Var = (j4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, h4.f146760a, j4Var);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                banner = (Banner) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Banner.a.f75712a, banner);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j1(i, list, j4Var, banner);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        j1 value = (j1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) j1.d[0].getValue(), value.f146768a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, h4.f146760a, value.f146769b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, Banner.a.f75712a, value.f146770c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
