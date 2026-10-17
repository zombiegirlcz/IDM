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
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f133515a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l lVar = new l();
        f133515a = lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.junior.pending_graduation.impl.data.model.JuniorGraduationEntity.Details", lVar, 3);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("migrateAssetsPermission", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private l() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{v1.f247718a, o98.b.f223139a, nlm.a.c(o.f133519a)};
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
        p98.a aVar = null;
        q qVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                aVar = (p98.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, o98.b.f223139a, aVar);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                qVar = (q) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, o.f133519a, qVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new n(i, strDecodeStringElement, aVar, qVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        n value = (n) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f133516a;
        q qVar = value.f133518c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, o98.b.f223139a, value.f133517b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || qVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, o.f133519a, qVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
