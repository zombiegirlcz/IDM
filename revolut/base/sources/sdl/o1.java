package sdl;

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
public final /* synthetic */ class o1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f261992a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        o1 o1Var = new o1();
        f261992a = o1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingProductDetailsDto.Robo.Limits", o1Var, 5);
        pluginGeneratedSerialDescriptor.j("min-onboarding-topup", false);
        pluginGeneratedSerialDescriptor.j("min-general-topup", false);
        pluginGeneratedSerialDescriptor.j("min-recurring-topup", false);
        pluginGeneratedSerialDescriptor.j("min-withdrawal", false);
        pluginGeneratedSerialDescriptor.j("min-portfolio-value", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private o1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        ie0.o oVar = ie0.o.f160615a;
        return new KSerializer[]{oVar, oVar, oVar, oVar, oVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        dj0.d dVar = null;
        dj0.d dVar2 = null;
        dj0.d dVar3 = null;
        dj0.d dVar4 = null;
        dj0.d dVar5 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                dVar = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.o.f160615a, dVar);
                i |= 1;
            } else if (iD == 1) {
                dVar2 = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ie0.o.f160615a, dVar2);
                i |= 2;
            } else if (iD == 2) {
                dVar3 = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.o.f160615a, dVar3);
                i |= 4;
            } else if (iD == 3) {
                dVar4 = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, ie0.o.f160615a, dVar4);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                dVar5 = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, ie0.o.f160615a, dVar5);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new q1(i, dVar, dVar2, dVar3, dVar4, dVar5);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        q1 value = (q1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ie0.o oVar = ie0.o.f160615a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, oVar, value.f261993a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, oVar, value.f261994b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, oVar, value.f261995c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, oVar, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, oVar, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
