package pl9;

import java.math.BigDecimal;
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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f237293a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        f237293a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.pay_with_smile.impl.data.dto.BiometricPaymentsSettingsDto", eVar, 4);
        pluginGeneratedSerialDescriptor.j("enabled", false);
        pluginGeneratedSerialDescriptor.j("passcodeSetUp", false);
        pluginGeneratedSerialDescriptor.j("optedIn", false);
        pluginGeneratedSerialDescriptor.j("optInRewardRevPoints", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(ie0.a.f160587a);
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{hVar, hVar, hVar, kSerializerC};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        boolean zDecodeBooleanElement = false;
        boolean zDecodeBooleanElement2 = false;
        boolean zDecodeBooleanElement3 = false;
        BigDecimal bigDecimal = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                zDecodeBooleanElement3 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                bigDecimal = (BigDecimal) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ie0.a.f160587a, bigDecimal);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new g(i, zDecodeBooleanElement, zDecodeBooleanElement2, zDecodeBooleanElement3, bigDecimal);
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
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, value.f237294a);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, value.f237295b);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, value.f237296c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, ie0.a.f160587a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
