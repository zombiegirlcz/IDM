package bu7;

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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f18705a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f18705a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.api.models.Contact", dVar, 4);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("value", false);
        pluginGeneratedSerialDescriptor.j("displayValue", true);
        pluginGeneratedSerialDescriptor.j("description", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{g.e[0].getValue(), v1Var, v1Var, nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = g.e;
        dVarBeginStructure.getClass();
        int i = 0;
        f fVar = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                fVar = (f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), fVar);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new g(i, fVar, strDecodeStringElement, strDecodeStringElement2, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        g value = (g) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        mlm.h hVar = (mlm.h) g.e[0].getValue();
        f fVar = value.f18713a;
        String str = value.d;
        String str2 = value.f18715c;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, fVar);
        String str3 = value.f18714b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, str3);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(str2, str3)) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
