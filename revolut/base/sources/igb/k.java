package igb;

import igb.s;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f161140a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        k kVar = new k();
        f161140a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.salary_account.impl.salary_hub.data.dto.SalaryHubDataDto", kVar, 8);
        pluginGeneratedSerialDescriptor.j("salaried", false);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("availableRewards", false);
        pluginGeneratedSerialDescriptor.j("salaryDraw", true);
        pluginGeneratedSerialDescriptor.j("salaryReferral", true);
        pluginGeneratedSerialDescriptor.j("freePremium", true);
        pluginGeneratedSerialDescriptor.j("termsAndConditions", true);
        pluginGeneratedSerialDescriptor.j("gracePeriodDeadline", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qlm.h.f247648a, t.f161151a, f0.i[2].getValue(), nlm.a.c(w.f161155a), nlm.a.c(z.f161158a), nlm.a.c(s.a.f161150a), nlm.a.c(c0.f161119a), nlm.a.c(ie0.j.f160602a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = f0.i;
        dVarBeginStructure.getClass();
        v vVar = null;
        List list = null;
        y yVar = null;
        b0 b0Var = null;
        s sVar = null;
        e0 e0Var = null;
        Instant instant = null;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    vVar = (v) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, t.f161151a, vVar);
                    i |= 2;
                    break;
                case 2:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    yVar = (y) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, w.f161155a, yVar);
                    i |= 8;
                    break;
                case 4:
                    b0Var = (b0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, z.f161158a, b0Var);
                    i |= 16;
                    break;
                case 5:
                    sVar = (s) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s.a.f161150a, sVar);
                    i |= 32;
                    break;
                case 6:
                    e0Var = (e0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, c0.f161119a, e0Var);
                    i |= 64;
                    break;
                case 7:
                    instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ie0.j.f160602a, instant);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f0(i, zDecodeBooleanElement, vVar, list, yVar, b0Var, sVar, e0Var, instant);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f0 value = (f0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = f0.i;
        boolean z = value.f161125a;
        Instant instant = value.f161129h;
        e0 e0Var = value.f161128g;
        s sVar = value.f;
        b0 b0Var = value.e;
        y yVar = value.d;
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, z);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, t.f161151a, value.f161126b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f161127c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || yVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, w.f161155a, yVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || b0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, z.f161158a, b0Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || sVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, s.a.f161150a, sVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || e0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, c0.f161119a, e0Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || instant != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, ie0.j.f160602a, instant);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
