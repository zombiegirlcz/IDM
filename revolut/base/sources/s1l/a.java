package s1l;

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
import s1l.d0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f259157a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f259157a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.travel_status.impl.data.dto.partner.TravelStatusPartnerLayoutDto", aVar, 12);
        pluginGeneratedSerialDescriptor.j("popup", true);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("intro", true);
        pluginGeneratedSerialDescriptor.j("statusCard", true);
        pluginGeneratedSerialDescriptor.j("rewards", false);
        pluginGeneratedSerialDescriptor.j("transactions", true);
        pluginGeneratedSerialDescriptor.j("availableUntil", true);
        pluginGeneratedSerialDescriptor.j("helpTopic", true);
        pluginGeneratedSerialDescriptor.j("primaryButton", true);
        pluginGeneratedSerialDescriptor.j("termsAndConditions", true);
        pluginGeneratedSerialDescriptor.j("linkAccount", true);
        pluginGeneratedSerialDescriptor.j("linkConfirmation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(k0.f259187a), l.f259188a, nlm.a.c(u.f259211a), nlm.a.c(w0.f259217a), nlm.a.c(t0.f259210a), nlm.a.c((KSerializer) z0.f259225m[5].getValue()), nlm.a.c(b.f259161a), nlm.a.c(v1.f247718a), nlm.a.c(n0.f259196a), nlm.a.c(ld7.d.f194042a), nlm.a.c(d0.a.f259172a), nlm.a.c(e0.f259174a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        m0 m0Var;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = z0.f259225m;
        dVarBeginStructure.getClass();
        p0 p0Var = null;
        g0 g0Var = null;
        ld7.f fVar = null;
        d0 d0Var = null;
        m0 m0Var2 = null;
        n nVar = null;
        w wVar = null;
        y0 y0Var = null;
        v0 v0Var = null;
        List list = null;
        d dVar = null;
        String str = null;
        int i = 0;
        boolean z = true;
        while (z) {
            Lazy[] lazyArr2 = lazyArr;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    lazyArr = lazyArr2;
                    i = i;
                    continue;
                case 0:
                    m0Var2 = (m0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, k0.f259187a, m0Var2);
                    i |= 1;
                    lazyArr = lazyArr2;
                    continue;
                case 1:
                    m0Var = m0Var2;
                    nVar = (n) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, l.f259188a, nVar);
                    i |= 2;
                    break;
                case 2:
                    m0Var = m0Var2;
                    wVar = (w) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, u.f259211a, wVar);
                    i |= 4;
                    break;
                case 3:
                    m0Var = m0Var2;
                    y0Var = (y0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, w0.f259217a, y0Var);
                    i |= 8;
                    break;
                case 4:
                    m0Var = m0Var2;
                    v0Var = (v0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, t0.f259210a, v0Var);
                    i |= 16;
                    break;
                case 5:
                    m0Var = m0Var2;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr2[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    m0Var = m0Var2;
                    dVar = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, b.f259161a, dVar);
                    i |= 64;
                    break;
                case 7:
                    m0Var = m0Var2;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str);
                    i |= 128;
                    break;
                case 8:
                    m0Var = m0Var2;
                    p0Var = (p0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, n0.f259196a, p0Var);
                    i |= 256;
                    break;
                case 9:
                    m0Var = m0Var2;
                    fVar = (ld7.f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, ld7.d.f194042a, fVar);
                    i |= 512;
                    break;
                case 10:
                    m0Var = m0Var2;
                    d0Var = (d0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, d0.a.f259172a, d0Var);
                    i |= 1024;
                    break;
                case 11:
                    m0Var = m0Var2;
                    g0Var = (g0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, e0.f259174a, g0Var);
                    i |= 2048;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            lazyArr = lazyArr2;
            m0Var2 = m0Var;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new z0(i, m0Var2, nVar, wVar, y0Var, v0Var, list, dVar, str, p0Var, fVar, d0Var, g0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        z0 value = (z0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = z0.f259225m;
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f259226a != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, k0.f259187a, value.f259226a);
        }
        l lVar = l.f259188a;
        n nVar = value.f259227b;
        g0 g0Var = value.f259232l;
        d0 d0Var = value.k;
        ld7.f fVar = value.f259231j;
        p0 p0Var = value.i;
        String str = value.f259230h;
        d dVar = value.f259229g;
        List list = value.f;
        y0 y0Var = value.d;
        w wVar = value.f259228c;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, lVar, nVar);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || wVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, u.f259211a, wVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || y0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, w0.f259217a, y0Var);
        }
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, t0.f259210a, value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || dVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, b.f259161a, dVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || p0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, n0.f259196a, p0Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || fVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, ld7.d.f194042a, fVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, d0.a.f259172a, d0Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || g0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, e0.f259174a, g0Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
