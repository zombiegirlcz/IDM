package gkl;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class x0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f144501a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        x0 x0Var = new x0();
        f144501a = x0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.sso.impl.domain.models.SessionToken.Payload", x0Var, 3);
        pluginGeneratedSerialDescriptor.j("profile", false);
        pluginGeneratedSerialDescriptor.j("iat", false);
        pluginGeneratedSerialDescriptor.j("exp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private x0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        ie0.i iVar = ie0.i.f160600a;
        return new KSerializer[]{nlm.a.c(hkl.a.f152966a), iVar, iVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        e1 e1Var = null;
        boolean z = true;
        int i = 0;
        Instant instant = null;
        Instant instant2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                e1Var = (e1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, hkl.a.f152966a, e1Var);
                i |= 1;
            } else if (iD == 1) {
                instant = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ie0.i.f160600a, instant);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                instant2 = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.i.f160600a, instant2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f1(i, e1Var, instant, instant2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f1 value = (f1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, hkl.a.f152966a, value.f144448a);
        ie0.i iVar = ie0.i.f160600a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, iVar, value.f144449b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, iVar, value.f144450c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
