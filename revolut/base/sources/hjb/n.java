package hjb;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f152691a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        n nVar = new n();
        f152691a = nVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("money_market_fund", nVar, 1);
        pluginGeneratedSerialDescriptor.j("primaryRateInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private n() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u.f152697a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        w wVar = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else {
                if (iD != 0) {
                    throw new UnknownFieldException(iD);
                }
                wVar = (w) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, u.f152697a, wVar);
                i = 1;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new p(i, wVar);
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
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, u.f152697a, value.f152692a);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
