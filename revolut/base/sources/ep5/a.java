package ep5;

import jo3.a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f128077a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f128077a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.withdraw.impl.models.entity.CryptoWithdrawLimitsEntity", aVar, 7);
        pluginGeneratedSerialDescriptor.j("dailyWithdrawalLimit", false);
        pluginGeneratedSerialDescriptor.j("dailyWithdrawalUsage", false);
        pluginGeneratedSerialDescriptor.j("monthlyWithdrawalLimit", false);
        pluginGeneratedSerialDescriptor.j("monthlyWithdrawalUsage", false);
        pluginGeneratedSerialDescriptor.j("limitType", false);
        pluginGeneratedSerialDescriptor.j("limitExpiresAt", false);
        pluginGeneratedSerialDescriptor.j("minimumWithdrawalAmount", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        a.C1001a c1001a = a.C1001a.f176860a;
        return new KSerializer[]{c1001a, c1001a, c1001a, c1001a, nlm.a.c(v1.f247718a), nlm.a.c(t0.f247706a), nlm.a.c(c1001a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        jo3.a aVar = null;
        jo3.a aVar2 = null;
        jo3.a aVar3 = null;
        jo3.a aVar4 = null;
        String str = null;
        Long l2 = null;
        jo3.a aVar5 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                    i |= 1;
                    break;
                case 1:
                    aVar2 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar2);
                    i |= 2;
                    break;
                case 2:
                    aVar3 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, aVar3);
                    i |= 4;
                    break;
                case 3:
                    aVar4 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, aVar4);
                    i |= 8;
                    break;
                case 4:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str);
                    i |= 16;
                    break;
                case 5:
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, t0.f247706a, l2);
                    i |= 32;
                    break;
                case 6:
                    aVar5 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, a.C1001a.f176860a, aVar5);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, aVar, aVar2, aVar3, aVar4, str, l2, aVar5);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c value = (c) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, c1001a, value.f128078a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, c1001a, value.f128079b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, c1001a, value.f128080c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, c1001a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, t0.f247706a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, c1001a, value.f128081g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
