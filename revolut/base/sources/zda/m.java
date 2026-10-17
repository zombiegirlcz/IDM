package zda;

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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f321398a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        f321398a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.pockets.impl.details_v2.entities.AccountDetailsEntity", mVar, 5);
        pluginGeneratedSerialDescriptor.j("accounts", false);
        pluginGeneratedSerialDescriptor.j("countries", false);
        pluginGeneratedSerialDescriptor.j("preview", false);
        pluginGeneratedSerialDescriptor.j("internationalPreview", false);
        pluginGeneratedSerialDescriptor.j("displayAccountNumber", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = o.f;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{lazyArr[0].getValue(), v.f321419a, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[4].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = o.f;
        dVarBeginStructure.getClass();
        int i = 0;
        List list = null;
        x xVar = null;
        String str = null;
        String str2 = null;
        List list2 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                i |= 1;
            } else if (iD == 1) {
                xVar = (x) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, v.f321419a, xVar);
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
                list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list2);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new o(i, list, xVar, str, str2, list2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        o value = (o) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = o.f;
        mlm.h hVar = (mlm.h) lazyArr[0].getValue();
        List list = value.f321402a;
        List list2 = value.e;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, list);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, v.f321419a, value.f321403b);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f321404c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, value.d);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), list2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
