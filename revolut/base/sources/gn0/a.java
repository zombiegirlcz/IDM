package gn0;

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

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f144894a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f144894a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.core.security.repository.guardian.model.ApplicationInfo", aVar, 4);
        pluginGeneratedSerialDescriptor.j("package_name", true);
        pluginGeneratedSerialDescriptor.j("apkSha1", true);
        pluginGeneratedSerialDescriptor.j("apkSha256", true);
        pluginGeneratedSerialDescriptor.j("apkSha512", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(v1.f247718a);
        e eVar = e.f144898a;
        return new KSerializer[]{kSerializerC, nlm.a.c(eVar), nlm.a.c(eVar), nlm.a.c(eVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                i |= 1;
            } else if (iD == 1) {
                f fVar = (f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, e.f144898a, str2 != null ? new f(str2) : null);
                str2 = fVar != null ? fVar.f144900a : null;
                i |= 2;
            } else if (iD == 2) {
                f fVar2 = (f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, e.f144898a, str3 != null ? new f(str3) : null);
                str3 = fVar2 != null ? fVar2.f144900a : null;
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                f fVar3 = (f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, e.f144898a, str4 != null ? new f(str4) : null);
                str4 = fVar3 != null ? fVar3.f144900a : null;
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, str, str2, str3, str4);
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
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f144895a != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f144895a);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f144896b != null) {
            e eVar = e.f144898a;
            String str = value.f144896b;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, eVar, str != null ? new f(str) : null);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f144897c != null) {
            e eVar2 = e.f144898a;
            String str2 = value.f144897c;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, eVar2, str2 != null ? new f(str2) : null);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
            e eVar3 = e.f144898a;
            String str3 = value.d;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, eVar3, str3 != null ? new f(str3) : null);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
