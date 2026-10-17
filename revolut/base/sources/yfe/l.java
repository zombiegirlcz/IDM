package yfe;

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
public final /* synthetic */ class l implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f313279a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l lVar = new l();
        f313279a = lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("joint_snapshot", lVar, 4);
        pluginGeneratedSerialDescriptor.j("money", false);
        pluginGeneratedSerialDescriptor.j("count", false);
        pluginGeneratedSerialDescriptor.j("userAvatar", false);
        pluginGeneratedSerialDescriptor.j("partnerAvatar", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private l() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ie0.o.f160615a, qlm.n0.f247680a, j1.f313271a, g1.f313256a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        dj0.d dVar = null;
        l1 l1Var = null;
        i1 i1Var = null;
        boolean z = true;
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
            } else if (iD == 2) {
                l1Var = (l1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, j1.f313271a, l1Var);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                i1Var = (i1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, g1.f313256a, i1Var);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new n(i, dVar, iDecodeIntElement, l1Var, i1Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        n value = (n) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        m mVar = n.Companion;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, ie0.o.f160615a, value.f313283c);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, j1.f313271a, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, g1.f313256a, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
