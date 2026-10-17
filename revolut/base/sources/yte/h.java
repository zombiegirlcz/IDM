package yte;

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
import qlm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f316713a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h hVar = new h();
        f316713a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.topup_screen.api.model.PostActivationConfig.TopUp", hVar, 2);
        pluginGeneratedSerialDescriptor.j("suggestedAmounts", false);
        pluginGeneratedSerialDescriptor.j("defaultAmount", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{j.f316714c[0].getValue(), ie0.o.f160615a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = j.f316714c;
        dVarBeginStructure.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        dj0.d dVar = null;
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
                dVar = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ie0.o.f160615a, dVar);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j(i, dVar, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        j value = (j) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) j.f316714c[0].getValue(), value.f316715a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, ie0.o.f160615a, value.f316716b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
