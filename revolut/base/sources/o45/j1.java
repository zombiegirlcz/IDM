package o45;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class j1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f222072a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j1 j1Var = new j1();
        f222072a = j1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("OUTSTANDING", j1Var, 4);
        pluginGeneratedSerialDescriptor.j("outstandingPrincipal", false);
        pluginGeneratedSerialDescriptor.j("rescheduledPrincipal", false);
        pluginGeneratedSerialDescriptor.j("outstandingInterest", false);
        pluginGeneratedSerialDescriptor.j("outstandingTotal", false);
        pluginGeneratedSerialDescriptor.l(new p1("state"));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.t0 t0Var = qlm.t0.f247706a;
        return new KSerializer[]{t0Var, nlm.a.c(t0Var), a.f222005a, t0Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        long jDecodeLongElement = 0;
        long jDecodeLongElement2 = 0;
        Long l2 = null;
        c cVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.t0.f247706a, l2);
                i |= 2;
            } else if (iD == 2) {
                cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a.f222005a, cVar);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l1(i, jDecodeLongElement, l2, cVar, jDecodeLongElement2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        l1 value = (l1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f222075b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.t0.f247706a, value.f222076c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, a.f222005a, value.d);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
