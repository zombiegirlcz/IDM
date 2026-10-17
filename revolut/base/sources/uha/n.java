package uha;

import java.util.Map;
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
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f280175a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        n nVar = new n();
        f280175a = nVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("productArticleParams", nVar, 3);
        pluginGeneratedSerialDescriptor.j("articleReference", false);
        pluginGeneratedSerialDescriptor.j("substitutionData", true);
        pluginGeneratedSerialDescriptor.j("skip", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private n() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = p.d;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), qlm.h.f247648a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = p.d;
        dVarBeginStructure.getClass();
        x xVar = null;
        boolean z = true;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        Map map = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                xVar = (x) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), xVar);
                i |= 1;
            } else if (iD == 1) {
                map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), map);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new p(i, xVar, map, zDecodeBooleanElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        p value = (p) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = p.d;
        mlm.h hVar = (mlm.h) lazyArr[0].getValue();
        x xVar = value.f280176a;
        Map map = value.f280177b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, xVar);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(map, r0.g())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), map);
        }
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, value.f280178c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
