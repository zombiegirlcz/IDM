package m2l;

import java.time.Instant;
import jo3.a;
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

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class p implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f202221a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        p pVar = new p();
        f202221a = pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.wealth.data.core.insights.InsightsDto", pVar, 8);
        pluginGeneratedSerialDescriptor.j("overall", false);
        pluginGeneratedSerialDescriptor.j("stepOneRecommendation", true);
        pluginGeneratedSerialDescriptor.j("referenceIndex", false);
        pluginGeneratedSerialDescriptor.j("expectedAnnualReturn", true);
        pluginGeneratedSerialDescriptor.j("sharpeRatio", true);
        pluginGeneratedSerialDescriptor.j("recommendedBuyPrice", true);
        pluginGeneratedSerialDescriptor.j("recommendedSellPrice", true);
        pluginGeneratedSerialDescriptor.j("recommendationTimestamp", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private p() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = r.i;
        a.C1001a c1001a = a.C1001a.f176860a;
        return new KSerializer[]{lazyArr[0].getValue(), nlm.a.c((KSerializer) lazyArr[1].getValue()), v1.f247718a, nlm.a.c(j.f202211a), nlm.a.c(a0.f202188a), nlm.a.c(c1001a), nlm.a.c(c1001a), nlm.a.c(ie0.j.f160602a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = r.i;
        dVarBeginStructure.getClass();
        k0 k0Var = null;
        k0 k0Var2 = null;
        String strDecodeStringElement = null;
        l lVar = null;
        c0 c0Var = null;
        jo3.a aVar = null;
        jo3.a aVar2 = null;
        Instant instant = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    k0Var = (k0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), k0Var);
                    i |= 1;
                    break;
                case 1:
                    k0Var2 = (k0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), k0Var2);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    lVar = (l) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, j.f202211a, lVar);
                    i |= 8;
                    break;
                case 4:
                    c0Var = (c0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, a0.f202188a, c0Var);
                    i |= 16;
                    break;
                case 5:
                    aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, a.C1001a.f176860a, aVar);
                    i |= 32;
                    break;
                case 6:
                    aVar2 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, a.C1001a.f176860a, aVar2);
                    i |= 64;
                    break;
                case 7:
                    instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ie0.j.f160602a, instant);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new r(i, k0Var, k0Var2, strDecodeStringElement, lVar, c0Var, aVar, aVar2, instant);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        r value = (r) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = r.i;
        mlm.h hVar = (mlm.h) lazyArr[0].getValue();
        k0 k0Var = value.f202222a;
        Instant instant = value.f202226h;
        jo3.a aVar = value.f202225g;
        jo3.a aVar2 = value.f;
        c0 c0Var = value.e;
        l lVar = value.d;
        k0 k0Var2 = value.f202223b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, k0Var);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || k0Var2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), k0Var2);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f202224c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || lVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, j.f202211a, lVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || c0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, a0.f202188a, c0Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || aVar2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, a.C1001a.f176860a, aVar2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || aVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, a.C1001a.f176860a, aVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || instant != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, ie0.j.f160602a, instant);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
