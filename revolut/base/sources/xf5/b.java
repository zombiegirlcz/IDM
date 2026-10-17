package xf5;

import ie0.o;
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
import qlm.x;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f304777a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        f304777a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CryptoExchangePricingFee", bVar, 3);
        pluginGeneratedSerialDescriptor.j("from", false);
        pluginGeneratedSerialDescriptor.j("to", false);
        pluginGeneratedSerialDescriptor.j("percentage", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        o oVar = o.f160615a;
        return new KSerializer[]{oVar, nlm.a.c(oVar), x.f247723a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        dj0.d dVar = null;
        dj0.d dVar2 = null;
        double dDecodeDoubleElement = 0.0d;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                dVar = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, o.f160615a, dVar);
                i |= 1;
            } else if (iD == 1) {
                dVar2 = (dj0.d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, o.f160615a, dVar2);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new d(i, dVar, dVar2, dDecodeDoubleElement);
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
        o oVar = o.f160615a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, oVar, value.f304778a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, oVar, value.f304779b);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 2, value.f304780c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
