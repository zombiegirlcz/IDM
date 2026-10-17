package fdl;

import java.time.Instant;
import java.util.List;
import jed.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class u1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1 f134369a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        u1 u1Var = new u1();
        f134369a = u1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.wealth.domain.impl.data.network.model.IpoInstrumentDto", u1Var, 12);
        pluginGeneratedSerialDescriptor.j("documents", false);
        pluginGeneratedSerialDescriptor.j("details", false);
        pluginGeneratedSerialDescriptor.j("sections", false);
        pluginGeneratedSerialDescriptor.j("launchDate", false);
        pluginGeneratedSerialDescriptor.j("priceRange", false);
        pluginGeneratedSerialDescriptor.j("bookBuildingAvailable", false);
        pluginGeneratedSerialDescriptor.j("disclaimerWorkflowId", true);
        pluginGeneratedSerialDescriptor.j("acknowledgementWorkflowId", true);
        pluginGeneratedSerialDescriptor.j("cancellationDeadline", true);
        pluginGeneratedSerialDescriptor.j("finalPriceDate", true);
        pluginGeneratedSerialDescriptor.j("barChartDetails", true);
        pluginGeneratedSerialDescriptor.j("lineChartDetails", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private u1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        ie0.k kVar = ie0.k.f160604a;
        qlm.v1 v1Var = qlm.v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c(v1Var);
        KSerializer kSerializerC3 = nlm.a.c(kVar);
        KSerializer kSerializerC4 = nlm.a.c(kVar);
        f1 f1Var = f1.f134095a;
        return new KSerializer[]{r1.f134257a, l1.f134183a, i2.f134157b, kVar, g.a.f173356a, qlm.h.f247648a, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, nlm.a.c(f1Var), nlm.a.c(f1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Instant instant = null;
        h1 h1Var = null;
        h1 h1Var2 = null;
        t1 t1Var = null;
        n1 n1Var = null;
        List list = null;
        Instant instant2 = null;
        jed.g gVar = null;
        String str = null;
        String str2 = null;
        Instant instant3 = null;
        int i = 0;
        boolean z3 = true;
        boolean zDecodeBooleanElement = false;
        while (z3) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z3 = false;
                    continue;
                case 0:
                    z = z3;
                    t1Var = (t1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, r1.f134257a, t1Var);
                    i |= 1;
                    break;
                case 1:
                    z = z3;
                    n1Var = (n1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, l1.f134183a, n1Var);
                    i |= 2;
                    break;
                case 2:
                    z = z3;
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, i2.f134157b, list);
                    i |= 4;
                    break;
                case 3:
                    z = z3;
                    instant2 = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, ie0.k.f160604a, instant2);
                    i |= 8;
                    break;
                case 4:
                    z = z3;
                    gVar = (jed.g) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, g.a.f173356a, gVar);
                    i |= 16;
                    break;
                case 5:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    z = z3;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str);
                    i |= 64;
                    break;
                case 7:
                    z = z3;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str2);
                    i |= 128;
                    break;
                case 8:
                    z = z3;
                    instant3 = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ie0.k.f160604a, instant3);
                    i |= 256;
                    break;
                case 9:
                    z = z3;
                    instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, ie0.k.f160604a, instant);
                    i |= 512;
                    break;
                case 10:
                    z = z3;
                    h1Var = (h1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, f1.f134095a, h1Var);
                    i |= 1024;
                    break;
                case 11:
                    z = z3;
                    h1Var2 = (h1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, f1.f134095a, h1Var2);
                    i |= 2048;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            z3 = z;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new w1(i, t1Var, n1Var, list, instant2, gVar, zDecodeBooleanElement, str, str2, instant3, instant, h1Var, h1Var2);
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
        r1 r1Var = r1.f134257a;
        t1 t1Var = value.f134387a;
        h1 h1Var = value.f134393l;
        h1 h1Var2 = value.k;
        Instant instant = value.f134392j;
        Instant instant2 = value.i;
        String str = value.f134391h;
        String str2 = value.f134390g;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, r1Var, t1Var);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, l1.f134183a, value.f134388b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, i2.f134157b, value.f134389c);
        ie0.k kVar = ie0.k.f160604a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, kVar, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, g.a.f173356a, value.e);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, value.f);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || instant2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, kVar, instant2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || instant != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, kVar, instant);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || h1Var2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, f1.f134095a, h1Var2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || h1Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, f1.f134095a, h1Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
