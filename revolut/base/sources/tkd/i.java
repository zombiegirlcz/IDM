package tkd;

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
import tkd.l;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f271942a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        f271942a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.impl.model.SlotResponse", iVar, 1);
        pluginGeneratedSerialDescriptor.j("slots", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private i() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l.a.f271949a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        l lVar = null;
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
                lVar = (l) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, l.a.f271949a, lVar);
                i = 1;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k(i, lVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k value = (k) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, l.a.f271949a, value.f271943a);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
