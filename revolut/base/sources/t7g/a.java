package t7g;

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
import qlm.n0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f268666a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f268666a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.travel.flights.models.dto.common.BoundDto", aVar, 5);
        pluginGeneratedSerialDescriptor.j("departure", false);
        pluginGeneratedSerialDescriptor.j("arrival", false);
        pluginGeneratedSerialDescriptor.j("totalDurationMinutes", false);
        pluginGeneratedSerialDescriptor.j("numberOfStops", false);
        pluginGeneratedSerialDescriptor.j("segments", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = c.f;
        g gVar = g.f268674a;
        n0 n0Var = n0.f247680a;
        return new KSerializer[]{gVar, gVar, n0Var, n0Var, lazyArr[4].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = c.f;
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        int iDecodeIntElement2 = 0;
        i iVar = null;
        i iVar2 = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                iVar = (i) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, g.f268674a, iVar);
                i |= 1;
            } else if (iD == 1) {
                iVar2 = (i) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, g.f268674a, iVar2);
                i |= 2;
            } else if (iD == 2) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, iVar, iVar2, iDecodeIntElement, iDecodeIntElement2, list);
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
        Lazy[] lazyArr = c.f;
        g gVar = g.f268674a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, gVar, value.f268667a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, gVar, value.f268668b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.f268669c);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
