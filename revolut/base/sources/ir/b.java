package ir;

import java.util.List;
import jr.e0;
import jr.p;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import qlm.f0;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f167914a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        f167914a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.dynamic_instructions.DynamicInstructionsDto", bVar, 3);
        pluginGeneratedSerialDescriptor.j("step", false);
        pluginGeneratedSerialDescriptor.j("resources", true);
        pluginGeneratedSerialDescriptor.j(ib.b.Features, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = d.d;
        return new KSerializer[]{lazyArr[0].getValue(), nlm.a.c((KSerializer) lazyArr[1].getValue()), nlm.a.c(p.a.f177822a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = d.d;
        dVarBeginStructure.getClass();
        e0 e0Var = null;
        boolean z = true;
        int i = 0;
        List list = null;
        p pVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                e0Var = (e0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), e0Var);
                i |= 1;
            } else if (iD == 1) {
                list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                pVar = (p) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, p.a.f177822a, pVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new d(i, e0Var, list, pVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        d value = (d) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = d.d;
        h hVar = (h) lazyArr[0].getValue();
        e0 e0Var = value.f167915a;
        p pVar = value.f167917c;
        List list = value.f167916b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, e0Var);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || pVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, p.a.f177822a, pVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
