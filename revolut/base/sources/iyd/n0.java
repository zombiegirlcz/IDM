package iyd;

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
public final /* synthetic */ class n0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f169681a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        n0 n0Var = new n0();
        f169681a = n0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.statements.impl.documents_hub.entity.DocumentsHubTabEntity", n0Var, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("sections", true);
        pluginGeneratedSerialDescriptor.j("customisation", true);
        pluginGeneratedSerialDescriptor.j("footer", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private n0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c((KSerializer) p0.f[2].getValue());
        KSerializer kSerializerC2 = nlm.a.c(d.f169656a);
        KSerializer kSerializerC3 = nlm.a.c(m.f169677a);
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, kSerializerC, kSerializerC2, kSerializerC3};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = p0.f;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        List list = null;
        f fVar = null;
        o oVar = null;
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
                fVar = (f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, d.f169656a, fVar);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                oVar = (o) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m.f169677a, oVar);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new p0(i, strDecodeStringElement, strDecodeStringElement2, list, fVar, oVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        p0 value = (p0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = p0.f;
        String str = value.f169685a;
        o oVar = value.e;
        f fVar = value.d;
        List list = value.f169687c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f169686b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || fVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, d.f169656a, fVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || oVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, m.f169677a, oVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
