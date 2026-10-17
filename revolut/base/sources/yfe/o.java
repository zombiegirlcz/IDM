package yfe;

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

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f313287a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        o oVar = new o();
        f313287a = oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("linked_active", oVar, 3);
        pluginGeneratedSerialDescriptor.j("money", false);
        pluginGeneratedSerialDescriptor.j("count", false);
        pluginGeneratedSerialDescriptor.j("icons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private o() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ie0.o.f160615a, qlm.n0.f247680a, q.f[2].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = q.f;
        dVarBeginStructure.getClass();
        dj0.d dVar = null;
        boolean z = true;
        int i = 0;
        int iDecodeIntElement = 0;
        List list = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                dVar = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.o.f160615a, dVar);
                i |= 1;
            } else if (iD == 1) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
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
        return new q(i, dVar, iDecodeIntElement, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        q value = (q) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = q.f;
        ie0.o oVar = ie0.o.f160615a;
        dj0.d dVar = value.f313294c;
        List list = value.e;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, oVar, dVar);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.d);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
