package ecd;

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
public final /* synthetic */ class e1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f124534a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e1 e1Var = new e1();
        f124534a = e1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.savings.impl.product.data.dto.ProductGroupDto.ProductArticleDto", e1Var, 4);
        pluginGeneratedSerialDescriptor.j("templateId", false);
        pluginGeneratedSerialDescriptor.j("substitutions", false);
        pluginGeneratedSerialDescriptor.j("displayAlways", false);
        pluginGeneratedSerialDescriptor.j("deeplink", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = g1.e;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, lazyArr[1].getValue(), nlm.a.c(qlm.h.f247648a), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = g1.e;
        dVarBeginStructure.getClass();
        int i = 0;
        Boolean bool = null;
        String strDecodeStringElement = null;
        String str = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                i |= 2;
            } else if (iD == 2) {
                bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.h.f247648a, bool);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new g1(i, bool, strDecodeStringElement, str, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        g1 value = (g1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = g1.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f124551a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f124552b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.h.f247648a, value.f124553c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
