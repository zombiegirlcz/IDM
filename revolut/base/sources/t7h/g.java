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
public final /* synthetic */ class g implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f268700a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        f268700a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.wealth.impl.data.network.margin_borrowing.dto.WealthMarginBorrowingStatusDto", gVar, 5);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("borrowedFunds", false);
        pluginGeneratedSerialDescriptor.j("requiredMinimum", false);
        pluginGeneratedSerialDescriptor.j("requiredTopUp", true);
        pluginGeneratedSerialDescriptor.j("marginCallLevel", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        a.C1001a c1001a = a.C1001a.f176860a;
        return new KSerializer[]{i.f[0].getValue(), c1001a, c1001a, nlm.a.c(c1001a), nlm.a.c(c1001a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = i.f;
        dVarBeginStructure.getClass();
        int i = 0;
        k kVar = null;
        jo3.a aVar = null;
        jo3.a aVar2 = null;
        jo3.a aVar3 = null;
        jo3.a aVar4 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                kVar = (k) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), kVar);
                i |= 1;
            } else if (iD == 1) {
                aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar);
                i |= 2;
            } else if (iD == 2) {
                aVar2 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, aVar2);
                i |= 4;
            } else if (iD == 3) {
                aVar3 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, aVar3);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                aVar4 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, a.C1001a.f176860a, aVar4);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new i(i, kVar, aVar, aVar2, aVar3, aVar4);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        i value = (i) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = i.f;
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f268701a != k.UNKNOWN) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f268701a);
        }
        a.C1001a c1001a = a.C1001a.f176860a;
        jo3.a aVar = value.f268702b;
        jo3.a aVar2 = value.e;
        jo3.a aVar3 = value.d;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, c1001a, aVar);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, c1001a, value.f268703c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || aVar3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, c1001a, aVar3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || aVar2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, c1001a, aVar2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
