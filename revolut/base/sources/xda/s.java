package xda;

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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f304361a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        s sVar = new s();
        f304361a = sVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.pockets.impl.details_v2.dto.AccountDetailsDto", sVar, 2);
        pluginGeneratedSerialDescriptor.j("accounts", false);
        pluginGeneratedSerialDescriptor.j("countries", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private s() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u.f304363c[0].getValue(), a0.f304302a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = u.f304363c;
        dVarBeginStructure.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        c0 c0Var = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                c0Var = (c0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a0.f304302a, c0Var);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new u(i, list, c0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        u value = (u) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) u.f304363c[0].getValue(), value.f304364a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, a0.f304302a, value.f304365b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
