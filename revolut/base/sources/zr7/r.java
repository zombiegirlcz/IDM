package zr7;

import ds7.b;
import is7.a;
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
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f324654a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        r rVar = new r();
        f324654a = rVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_credit.impl.data.dto.InsuranceDetailsDto", rVar, 9);
        pluginGeneratedSerialDescriptor.j("product", false);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("documents", false);
        pluginGeneratedSerialDescriptor.j("getHelp", false);
        pluginGeneratedSerialDescriptor.j("claims", false);
        pluginGeneratedSerialDescriptor.j("conditions", false);
        pluginGeneratedSerialDescriptor.j("policyInfo", false);
        pluginGeneratedSerialDescriptor.j("coverages", false);
        pluginGeneratedSerialDescriptor.j("actions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private r() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = t.f324655j;
        return new KSerializer[]{v1.f247718a, hs7.a.f155004a, nlm.a.c(gs7.a.f146330a), nlm.a.c(es7.a.f128876a), nlm.a.c((KSerializer) lazyArr[4].getValue()), nlm.a.c(b.a.f117261a), nlm.a.c(a.C0940a.f168153a), nlm.a.c((KSerializer) lazyArr[7].getValue()), nlm.a.c((KSerializer) lazyArr[8].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = t.f324655j;
        dVarBeginStructure.getClass();
        List list = null;
        String strDecodeStringElement = null;
        hs7.f fVar = null;
        gs7.p pVar = null;
        es7.f fVar2 = null;
        cs7.b bVar = null;
        ds7.b bVar2 = null;
        is7.a aVar = null;
        List list2 = null;
        boolean z = true;
        int i = 0;
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
                    fVar = (hs7.f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, hs7.a.f155004a, fVar);
                    i |= 2;
                    break;
                case 2:
                    pVar = (gs7.p) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, gs7.a.f146330a, pVar);
                    i |= 4;
                    break;
                case 3:
                    fVar2 = (es7.f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, es7.a.f128876a, fVar2);
                    i |= 8;
                    break;
                case 4:
                    bVar = (cs7.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), bVar);
                    i |= 16;
                    break;
                case 5:
                    bVar2 = (ds7.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, b.a.f117261a, bVar2);
                    i |= 32;
                    break;
                case 6:
                    aVar = (is7.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, a.C0940a.f168153a, aVar);
                    i |= 64;
                    break;
                case 7:
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr[7].getValue(), list2);
                    i |= 128;
                    break;
                case 8:
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new t(i, strDecodeStringElement, fVar, pVar, fVar2, bVar, bVar2, aVar, list2, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        t value = (t) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = t.f324655j;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f324656a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, hs7.a.f155004a, value.f324657b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, gs7.a.f146330a, value.f324658c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, es7.a.f128876a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, b.a.f117261a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, a.C0940a.f168153a, value.f324659g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, (mlm.h) lazyArr[7].getValue(), value.f324660h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
