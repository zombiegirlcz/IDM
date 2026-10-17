package qgb;

import java.time.Instant;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f245747a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        f245747a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.data.dto.SalaryHubV3ResponseDto", jVar, 9);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("salaried", false);
        pluginGeneratedSerialDescriptor.j("gracePeriodDeadline", true);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("rewards", false);
        pluginGeneratedSerialDescriptor.j("salaryReferral", true);
        pluginGeneratedSerialDescriptor.j("optIn", false);
        pluginGeneratedSerialDescriptor.j("termsAndConditions", false);
        pluginGeneratedSerialDescriptor.j("salarySwitchActive", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = m0.f245755j;
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{v1.f247718a, hVar, nlm.a.c(ie0.j.f160602a), u.f245768a, lazyArr[4].getValue(), nlm.a.c(g0.f245738a), a0.f245725a, j0.f245748a, hVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = m0.f245755j;
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        Instant instant = null;
        w wVar = null;
        List list = null;
        i0 i0Var = null;
        c0 c0Var = null;
        l0 l0Var = null;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        boolean zDecodeBooleanElement2 = false;
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
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, ie0.j.f160602a, instant);
                    i |= 4;
                    break;
                case 3:
                    wVar = (w) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, u.f245768a, wVar);
                    i |= 8;
                    break;
                case 4:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    i0Var = (i0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, g0.f245738a, i0Var);
                    i |= 32;
                    break;
                case 6:
                    c0Var = (c0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, a0.f245725a, c0Var);
                    i |= 64;
                    break;
                case 7:
                    l0Var = (l0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, j0.f245748a, l0Var);
                    i |= 128;
                    break;
                case 8:
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new m0(i, strDecodeStringElement, zDecodeBooleanElement, instant, wVar, list, i0Var, c0Var, l0Var, zDecodeBooleanElement2);
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
        Lazy[] lazyArr = m0.f245755j;
        String str = value.f245756a;
        boolean z = value.i;
        i0 i0Var = value.f;
        Instant instant = value.f245758c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, value.f245757b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || instant != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, ie0.j.f160602a, instant);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, u.f245768a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || i0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, g0.f245738a, i0Var);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, a0.f245725a, value.f245759g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, j0.f245748a, value.f245760h);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
