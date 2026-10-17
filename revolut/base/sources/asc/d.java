package asc;

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
public final /* synthetic */ class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f8917a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f8917a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.sca_prompt.impl.data.models.CheckScaRequiredResultDto", dVar, 3);
        pluginGeneratedSerialDescriptor.j("scaRequired", false);
        pluginGeneratedSerialDescriptor.j("fromCompany", false);
        pluginGeneratedSerialDescriptor.j("toCompany", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        f fVar = f.f8918a;
        return new KSerializer[]{qlm.h.f247648a, nlm.a.c(fVar), nlm.a.c(fVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        h hVar = null;
        boolean z = true;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        h hVar2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                hVar = (h) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, f.f8918a, hVar);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                hVar2 = (h) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, f.f8918a, hVar2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new i(i, zDecodeBooleanElement, hVar, hVar2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        i value = (i) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, value.f8921a);
        f fVar = f.f8918a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, fVar, value.f8922b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, fVar, value.f8923c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
