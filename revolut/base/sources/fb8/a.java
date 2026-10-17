package fb8;

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
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f133502a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f133502a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.junior.pending_graduation.impl.data.model.JuniorDependantGraduationDto", aVar, 3);
        pluginGeneratedSerialDescriptor.j("youthId", false);
        pluginGeneratedSerialDescriptor.j("graduationAge", false);
        pluginGeneratedSerialDescriptor.j("graduation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{v1.f247718a, n0.f247680a, nlm.a.c(c.f133503a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        boolean z = true;
        int i = 0;
        int iDecodeIntElement = 0;
        e eVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                eVar = (e) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, c.f133503a, eVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f(i, strDecodeStringElement, iDecodeIntElement, eVar);
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
        String str = value.f133507a;
        e eVar = value.f133509c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f133508b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || eVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, c.f133503a, eVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
