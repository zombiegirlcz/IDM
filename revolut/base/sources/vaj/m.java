package vaj;

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

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f287318a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        f287318a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.crypto.prelaunch.impl.data.network.dto.CryptoPreLaunchesResponseDto", mVar, 1);
        pluginGeneratedSerialDescriptor.j("launches", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{o.f287319b[0].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = o.f287319b;
        dVarBeginStructure.getClass();
        List list = null;
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
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                i = 1;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new o(i, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        o value = (o) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) o.f287319b[0].getValue(), value.f287320a);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
