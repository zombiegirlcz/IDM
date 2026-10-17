package rub;

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
import qlm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f257522a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        k kVar = new k();
        f257522a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rev_points.buying.api.model.PointsBuyingPackagesResponse", kVar, 3);
        pluginGeneratedSerialDescriptor.j("oneOff", false);
        pluginGeneratedSerialDescriptor.j("recurring", false);
        pluginGeneratedSerialDescriptor.j("activeRecurring", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = m.d;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), nlm.a.c(g.f257516a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = m.d;
        dVarBeginStructure.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        List list2 = null;
        i iVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                i |= 1;
            } else if (iD == 1) {
                list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list2);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                iVar = (i) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, g.f257516a, iVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new m(i, list, list2, iVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        m value = (m) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = m.d;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f257523a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f257524b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, g.f257516a, value.f257525c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
