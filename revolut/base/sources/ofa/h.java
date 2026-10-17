package ofa;

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
public final /* synthetic */ class h implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f224771a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h hVar = new h();
        f224771a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.post_activation.impl.model.PostActivationStep.Card.Params", hVar, 2);
        pluginGeneratedSerialDescriptor.j("cardType", false);
        pluginGeneratedSerialDescriptor.j("isCredit", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l.f224775c[0].getValue(), qlm.h.f247648a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = l.f224775c;
        dVarBeginStructure.getClass();
        j jVar = null;
        boolean z = true;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                jVar = (j) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), jVar);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l(i, jVar, zDecodeBooleanElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        l value = (l) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) l.f224775c[0].getValue(), value.f224776a);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, value.f224777b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
