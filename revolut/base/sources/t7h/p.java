package t7h;

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
import qlm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f268710a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        p pVar = new p();
        f268710a = pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.wealth.impl.data.network.margin_borrowing.dto.WealthMarginStatusDto", pVar, 5);
        pluginGeneratedSerialDescriptor.j("buyingPower", false);
        pluginGeneratedSerialDescriptor.j("borrowingLimit", false);
        pluginGeneratedSerialDescriptor.j("equity", false);
        pluginGeneratedSerialDescriptor.j("marginStatus", false);
        pluginGeneratedSerialDescriptor.j("borrowingLimitUnavailableReason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private p() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = r.f;
        KSerializer kSerializerC = nlm.a.c(g.f268700a);
        KSerializer kSerializerC2 = nlm.a.c((KSerializer) lazyArr[4].getValue());
        a.C1001a c1001a = a.C1001a.f176860a;
        return new KSerializer[]{c1001a, c1001a, c1001a, kSerializerC, kSerializerC2};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = r.f;
        dVarBeginStructure.getClass();
        int i = 0;
        jo3.a aVar = null;
        jo3.a aVar2 = null;
        jo3.a aVar3 = null;
        i iVar = null;
        f fVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                i |= 1;
            } else if (iD == 1) {
                aVar2 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar2);
                i |= 2;
            } else if (iD == 2) {
                aVar3 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, aVar3);
                i |= 4;
            } else if (iD == 3) {
                iVar = (i) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, g.f268700a, iVar);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                fVar = (f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), fVar);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new r(i, aVar, aVar2, aVar3, iVar, fVar);
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
        Lazy[] lazyArr = r.f;
        a.C1001a c1001a = a.C1001a.f176860a;
        jo3.a aVar = value.f268711a;
        f fVar = value.e;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, c1001a, aVar);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, c1001a, value.f268712b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, c1001a, value.f268713c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, g.f268700a, value.d);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || fVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), fVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
