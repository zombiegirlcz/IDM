package ayc;

import gr2.w;
import gr2.y;
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

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f11124a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        f11124a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.selfserve.entity.config.shared.repository.EntityConfigRepositoryImpl.ConfigWrapper", cVar, 1);
        pluginGeneratedSerialDescriptor.j("config", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private c() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(w.f145872a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        y yVar = null;
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
                yVar = (y) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, w.f145872a, yVar);
                i = 1;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new e(i, yVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        e value = (e) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, w.f145872a, value.f11125a);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
