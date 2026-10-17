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
public final /* synthetic */ class m1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f222082a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m1 m1Var = new m1();
        f222082a = m1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("OVERDUE", m1Var, 6);
        pluginGeneratedSerialDescriptor.j("overduePrincipal", false);
        pluginGeneratedSerialDescriptor.j("rescheduledPrincipal", false);
        pluginGeneratedSerialDescriptor.j("overdueAccruedInterest", false);
        pluginGeneratedSerialDescriptor.j("penaltyInterest", false);
        pluginGeneratedSerialDescriptor.j("overdueTotal", false);
        pluginGeneratedSerialDescriptor.j("latePaymentRisk", false);
        pluginGeneratedSerialDescriptor.l(new p1("state"));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.t0 t0Var = qlm.t0.f247706a;
        KSerializer kSerializerC = nlm.a.c(t0Var);
        a aVar = a.f222005a;
        return new KSerializer[]{t0Var, kSerializerC, aVar, nlm.a.c(aVar), t0Var, nlm.a.c(qlm.v1.f247718a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String str = null;
        int i = 0;
        long jDecodeLongElement = 0;
        long jDecodeLongElement2 = 0;
        Long l2 = null;
        c cVar = null;
        c cVar2 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.t0.f247706a, l2);
                    i |= 2;
                    break;
                case 2:
                    cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a.f222005a, cVar);
                    i |= 4;
                    break;
                case 3:
                    cVar2 = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a.f222005a, cVar2);
                    i |= 8;
                    break;
                case 4:
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new o1(i, jDecodeLongElement, l2, cVar, cVar2, jDecodeLongElement2, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        o1 value = (o1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f222085b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.t0.f247706a, value.f222086c);
        a aVar = a.f222005a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, aVar, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, aVar, value.e);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, value.f222087g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
