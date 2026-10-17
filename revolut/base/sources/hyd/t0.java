package hyd;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f156831a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        t0 t0Var = new t0();
        f156831a = t0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.statements.impl.documents_hub.dto.DocumentsHubTabDto", t0Var, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("sections", true);
        pluginGeneratedSerialDescriptor.j("customisation", true);
        pluginGeneratedSerialDescriptor.j("footer", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private t0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c((KSerializer) v0.f[2].getValue());
        KSerializer kSerializerC2 = nlm.a.c(j.f156806a);
        KSerializer kSerializerC3 = nlm.a.c(s.f156827a);
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, kSerializerC, kSerializerC2, kSerializerC3};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = v0.f;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        List list = null;
        l lVar = null;
        u uVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                i |= 4;
            } else if (iD == 3) {
                lVar = (l) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, j.f156806a, lVar);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                uVar = (u) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s.f156827a, uVar);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new v0(i, strDecodeStringElement, strDecodeStringElement2, list, lVar, uVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        v0 value = (v0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = v0.f;
        String str = value.f156835a;
        u uVar = value.e;
        l lVar = value.d;
        List list = value.f156837c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f156836b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || lVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, j.f156806a, lVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || uVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, s.f156827a, uVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
