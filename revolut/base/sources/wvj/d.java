package wvj;

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
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f300520a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f300520a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.trips.network.CreateTripResponseDto", dVar, 2);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("createdDate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{v1.f247718a, t0.f247706a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        long jDecodeLongElement = 0;
        boolean z = true;
        int i = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f(i, jDecodeLongElement, strDecodeStringElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f value = (f) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f300521a);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.f300522b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
