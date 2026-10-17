package zqe;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import no3.b;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f324470a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f324470a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.teen_profile.impl.models.TeenProfileDto", dVar, 9);
        pluginGeneratedSerialDescriptor.j("registeredIdentityId", false);
        pluginGeneratedSerialDescriptor.j("firstName", false);
        pluginGeneratedSerialDescriptor.j("lastName", false);
        pluginGeneratedSerialDescriptor.j("dateOfBirth", false);
        pluginGeneratedSerialDescriptor.j("address", false);
        pluginGeneratedSerialDescriptor.j("phone", false);
        pluginGeneratedSerialDescriptor.j("code", false);
        pluginGeneratedSerialDescriptor.j("username", false);
        pluginGeneratedSerialDescriptor.j("kycStatus", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, b.a.f217911a, nlm.a.c(v1Var), v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        no3.b bVar = null;
        String str = null;
        String strDecodeStringElement5 = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    bVar = (no3.b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, b.a.f217911a, bVar);
                    i |= 16;
                    break;
                case 5:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str);
                    i |= 32;
                    break;
                case 6:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str2);
                    i |= 128;
                    break;
                case 8:
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str3);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, bVar, str, strDecodeStringElement5, str2, str3);
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
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f324471a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f324472b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f324473c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, b.a.f217911a, value.e);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f324474g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, value.f324475h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
