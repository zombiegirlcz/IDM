package hjb;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f152693a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        q qVar = new q();
        f152693a = qVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("multiple_product_types", qVar, 3);
        pluginGeneratedSerialDescriptor.j("primaryRateInfo", false);
        pluginGeneratedSerialDescriptor.j("secondaryRateInfo", true);
        pluginGeneratedSerialDescriptor.j("kind", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private q() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        u uVar = u.f152697a;
        return new KSerializer[]{uVar, nlm.a.c(uVar), nlm.a.c(v1.f247718a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        w wVar = null;
        boolean z = true;
        int i = 0;
        w wVar2 = null;
        String str = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                wVar = (w) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, u.f152697a, wVar);
                i |= 1;
            } else if (iD == 1) {
                wVar2 = (w) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, u.f152697a, wVar2);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new s(i, wVar, wVar2, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        s value = (s) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        u uVar = u.f152697a;
        w wVar = value.f152694a;
        String str = value.f152696c;
        w wVar2 = value.f152695b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, uVar, wVar);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || wVar2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, uVar, wVar2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
