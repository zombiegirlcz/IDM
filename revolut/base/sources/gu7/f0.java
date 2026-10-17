package gu7;

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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f146742a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        f0 f0Var = new f0();
        f146742a = f0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.ContactsLayout.ContactsLayoutFooterButton", f0Var, 2);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private f0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qlm.v1.f247718a, nlm.a.c((KSerializer) com.revolut.feature.insurance_embedded.impl.data.model.p.f76026c[1].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = com.revolut.feature.insurance_embedded.impl.data.model.p.f76026c;
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        boolean z = true;
        int i = 0;
        com.revolut.feature.insurance_embedded.impl.data.model.s sVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                sVar = (com.revolut.feature.insurance_embedded.impl.data.model.s) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), sVar);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new com.revolut.feature.insurance_embedded.impl.data.model.p(i, strDecodeStringElement, sVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        com.revolut.feature.insurance_embedded.impl.data.model.p value = (com.revolut.feature.insurance_embedded.impl.data.model.p) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = com.revolut.feature.insurance_embedded.impl.data.model.p.f76026c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f76027a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f76028b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
