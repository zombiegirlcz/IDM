package j19;

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
public final /* synthetic */ class u1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1 f170268a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        u1 u1Var = new u1();
        f170268a = u1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.lifestyle.content_gateway.api.model.slot.LifestyleContentGatewaySlotPost.Content", u1Var, 9);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("assets", false);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("badges", true);
        pluginGeneratedSerialDescriptor.j("footer", true);
        pluginGeneratedSerialDescriptor.j("priceLine", true);
        pluginGeneratedSerialDescriptor.j("analyticsRef", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private u1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = w1.f170271j;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, k19.k.f180159a, k19.u.f180170a, k19.a.f180142a, nlm.a.c((KSerializer) lazyArr[5].getValue()), nlm.a.c(k19.r.f180166a), nlm.a.c(k19.d.f180150a), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = w1.f170271j;
        dVarBeginStructure.getClass();
        String str = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        k19.m mVar = null;
        k19.w wVar = null;
        k19.c cVar = null;
        List list = null;
        k19.t tVar = null;
        k19.j jVar = null;
        boolean z = true;
        int i = 0;
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
                    mVar = (k19.m) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, k19.k.f180159a, mVar);
                    i |= 4;
                    break;
                case 3:
                    wVar = (k19.w) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, k19.u.f180170a, wVar);
                    i |= 8;
                    break;
                case 4:
                    cVar = (k19.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, k19.a.f180142a, cVar);
                    i |= 16;
                    break;
                case 5:
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    tVar = (k19.t) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, k19.r.f180166a, tVar);
                    i |= 64;
                    break;
                case 7:
                    jVar = (k19.j) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, k19.d.f180150a, jVar);
                    i |= 128;
                    break;
                case 8:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.v1.f247718a, str);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new w1(i, strDecodeStringElement, strDecodeStringElement2, mVar, wVar, cVar, list, tVar, jVar, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        w1 value = (w1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = w1.f170271j;
        String str = value.f170272a;
        String str2 = value.i;
        k19.j jVar = value.f170276h;
        k19.t tVar = value.f170275g;
        List list = value.f;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f170273b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, k19.k.f180159a, value.f170274c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, k19.u.f180170a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, k19.a.f180142a, value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || tVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, k19.r.f180166a, tVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || jVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, k19.d.f180150a, jVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, qlm.v1.f247718a, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
