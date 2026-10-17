package egb;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f125578a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f125578a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.salary_account.impl.model.salary_promotion.SalaryPromotion", aVar, 4);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("blocks", false);
        pluginGeneratedSerialDescriptor.j("actions", true);
        pluginGeneratedSerialDescriptor.j("optIn", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = c.e;
        return new KSerializer[]{h0.f125593a, lazyArr[1].getValue(), nlm.a.c((KSerializer) lazyArr[2].getValue()), nlm.a.c(k0.f125601a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = c.e;
        dVarBeginStructure.getClass();
        int i = 0;
        j0 j0Var = null;
        List list = null;
        List list2 = null;
        q0 q0Var = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                j0Var = (j0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, h0.f125593a, j0Var);
                i |= 1;
            } else if (iD == 1) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                i |= 2;
            } else if (iD == 2) {
                list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                q0Var = (q0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, k0.f125601a, q0Var);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, j0Var, list, list2, q0Var);
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
        Lazy[] lazyArr = c.e;
        h0 h0Var = h0.f125593a;
        j0 j0Var = value.f125582a;
        q0 q0Var = value.d;
        List list = value.f125584c;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, h0Var, j0Var);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f125583b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || q0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, k0.f125601a, q0Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
