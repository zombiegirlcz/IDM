package ij3;

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

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class q implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f161688a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        q qVar = new q();
        f161688a = qVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.cms.stories.impl.data.network.model.CmsStoryScreenDto", qVar, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("background", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private q() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, nlm.a.c(d.f161676a), nlm.a.c(v1Var), nlm.a.c(v1Var), a.f161673a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        f fVar = null;
        String str = null;
        String str2 = null;
        c cVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                fVar = (f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, d.f161676a, fVar);
                i |= 2;
            } else if (iD == 2) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                i |= 4;
            } else if (iD == 3) {
                str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, a.f161673a, cVar);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new s(i, strDecodeStringElement, fVar, str, str2, cVar);
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
        String str = value.f161689a;
        String str2 = value.d;
        String str3 = value.f161691c;
        f fVar = value.f161690b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || fVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, d.f161676a, fVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, a.f161673a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
