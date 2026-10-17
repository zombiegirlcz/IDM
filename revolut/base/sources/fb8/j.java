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
public final /* synthetic */ class j implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f133514a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        f133514a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.junior.pending_graduation.impl.data.model.JuniorGraduationEntity", jVar, 3);
        pluginGeneratedSerialDescriptor.j("juniorId", false);
        pluginGeneratedSerialDescriptor.j("graduationAge", false);
        pluginGeneratedSerialDescriptor.j("details", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{v1.f247718a, n0.f247680a, nlm.a.c(l.f133515a)};
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
        n nVar = null;
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
                nVar = (n) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, l.f133515a, nVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new r(i, strDecodeStringElement, iDecodeIntElement, nVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        r value = (r) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f133522a);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f133523b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, l.f133515a, value.f133524c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
