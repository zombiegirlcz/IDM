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
public final /* synthetic */ class o0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f170231a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        o0 o0Var = new o0();
        f170231a = o0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.lifestyle.content_gateway.api.model.slot.LifestyleContentGatewaySlotCollectionProducts.Content", o0Var, 3);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("items", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private o0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{k19.u.f180170a, k19.a.f180142a, t0.d[2].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = t0.d;
        dVarBeginStructure.getClass();
        k19.w wVar = null;
        boolean z = true;
        int i = 0;
        k19.c cVar = null;
        List list = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                wVar = (k19.w) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, k19.u.f180170a, wVar);
                i |= 1;
            } else if (iD == 1) {
                cVar = (k19.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, k19.a.f180142a, cVar);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new t0(i, wVar, cVar, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        t0 value = (t0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = t0.d;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, k19.u.f180170a, value.f170260a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, k19.a.f180142a, value.f170261b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f170262c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
