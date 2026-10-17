package as7;

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
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f8869a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        t tVar = new t();
        f8869a = tVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_credit.impl.data.dto.action.ScreenContentDto", tVar, 7);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("image", false);
        pluginGeneratedSerialDescriptor.j("linkAction", false);
        pluginGeneratedSerialDescriptor.j("primaryButton", false);
        pluginGeneratedSerialDescriptor.j("secondaryButton", false);
        pluginGeneratedSerialDescriptor.j("disclaimer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private t() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = v.f8870h;
        v1 v1Var = v1.f247718a;
        KSerializer kSerializerC = nlm.a.c((KSerializer) lazyArr[2].getValue());
        KSerializer kSerializerC2 = nlm.a.c(n.f8857a);
        a aVar = a.f8820a;
        return new KSerializer[]{v1Var, v1Var, kSerializerC, kSerializerC2, nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = v.f8870h;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        g gVar = null;
        p pVar = null;
        c cVar = null;
        c cVar2 = null;
        String str = null;
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
                    gVar = (g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), gVar);
                    i |= 4;
                    break;
                case 3:
                    pVar = (p) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, n.f8857a, pVar);
                    i |= 8;
                    break;
                case 4:
                    cVar = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, a.f8820a, cVar);
                    i |= 16;
                    break;
                case 5:
                    cVar2 = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, a.f8820a, cVar2);
                    i |= 32;
                    break;
                case 6:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new v(i, strDecodeStringElement, strDecodeStringElement2, gVar, pVar, cVar, cVar2, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        v value = (v) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = v.f8870h;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f8871a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f8872b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f8873c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, n.f8857a, value.d);
        a aVar = a.f8820a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, aVar, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, aVar, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, value.f8874g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
