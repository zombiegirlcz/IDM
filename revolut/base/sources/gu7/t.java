package gu7;

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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f146833a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        t tVar = new t();
        f146833a = tVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.ContactsLayout", tVar, 4);
        pluginGeneratedSerialDescriptor.j("policyNumber", false);
        pluginGeneratedSerialDescriptor.j("contacts", false);
        pluginGeneratedSerialDescriptor.j("claimUrl", false);
        pluginGeneratedSerialDescriptor.j("footer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private t() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = m0.e;
        return new KSerializer[]{nlm.a.c(qlm.v1.f247718a), nlm.a.c((KSerializer) lazyArr[1].getValue()), nlm.a.c((KSerializer) lazyArr[2].getValue()), nlm.a.c(c0.f146720a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = m0.e;
        dVarBeginStructure.getClass();
        int i = 0;
        String str = null;
        List list = null;
        u uVar = null;
        e0 e0Var = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                i |= 1;
            } else if (iD == 1) {
                list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                i |= 2;
            } else if (iD == 2) {
                uVar = (u) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), uVar);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                e0Var = (e0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, c0.f146720a, e0Var);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new m0(i, str, list, uVar, e0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        m0 value = (m0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = m0.e;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, value.f146790a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f146791b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f146792c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, c0.f146720a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
