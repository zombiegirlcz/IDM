package bu7;

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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f18751a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        z zVar = new z();
        f18751a = zVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.api.models.InsuranceDetails", zVar, 15);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("subtype", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("policyNumber", false);
        pluginGeneratedSerialDescriptor.j("groupPolicyNumber", false);
        pluginGeneratedSerialDescriptor.j("summary", false);
        pluginGeneratedSerialDescriptor.j("restrictions", false);
        pluginGeneratedSerialDescriptor.j("coverage", false);
        pluginGeneratedSerialDescriptor.j("provider", false);
        pluginGeneratedSerialDescriptor.j("contactsGroup", false);
        pluginGeneratedSerialDescriptor.j("documents", false);
        pluginGeneratedSerialDescriptor.j("suitabilityStatement", false);
        pluginGeneratedSerialDescriptor.j("claimsInfo", false);
        pluginGeneratedSerialDescriptor.j("claimsBanner", false);
        pluginGeneratedSerialDescriptor.j("documentsBanner", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private z() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = b0.f18692p;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, lazyArr[1].getValue(), v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), lazyArr[5].getValue(), lazyArr[6].getValue(), lazyArr[7].getValue(), v0.f18743a, lazyArr[9].getValue(), com.revolut.feature.insurance_embedded.api.models.a.f75847a, lazyArr[11].getValue(), s.f18736a, nlm.a.c(a.f18691a), nlm.a.c(l.f18722a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        c cVar;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = b0.f18692p;
        dVarBeginStructure.getClass();
        x0 x0Var = null;
        c cVar2 = null;
        u uVar = null;
        List list = null;
        List list2 = null;
        com.revolut.feature.insurance_embedded.api.models.b bVar = null;
        n nVar = null;
        dl7.a aVar = null;
        String str3 = null;
        String str4 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            dl7.a aVar2 = aVar;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    str = str3;
                    z = false;
                    aVar = aVar2;
                    str3 = str;
                    break;
                case 0:
                    cVar = cVar2;
                    str2 = str3;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    aVar = aVar2;
                    str3 = str2;
                    cVar2 = cVar;
                    break;
                case 1:
                    cVar = cVar2;
                    str2 = str3;
                    aVar = (dl7.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), aVar2);
                    i |= 2;
                    str3 = str2;
                    cVar2 = cVar;
                    break;
                case 2:
                    cVar = cVar2;
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    aVar = aVar2;
                    cVar2 = cVar;
                    break;
                case 3:
                    cVar = cVar2;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str3);
                    i |= 8;
                    aVar = aVar2;
                    cVar2 = cVar;
                    break;
                case 4:
                    str = str3;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str4);
                    i |= 16;
                    aVar = aVar2;
                    str3 = str;
                    break;
                case 5:
                    str = str3;
                    list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list3);
                    i |= 32;
                    aVar = aVar2;
                    str3 = str;
                    break;
                case 6:
                    str = str3;
                    list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list4);
                    i |= 64;
                    aVar = aVar2;
                    str3 = str;
                    break;
                case 7:
                    str = str3;
                    list5 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr[7].getValue(), list5);
                    i |= 128;
                    aVar = aVar2;
                    str3 = str;
                    break;
                case 8:
                    str = str3;
                    x0Var = (x0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, v0.f18743a, x0Var);
                    i |= 256;
                    aVar = aVar2;
                    str3 = str;
                    break;
                case 9:
                    str = str3;
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list2);
                    i |= 512;
                    aVar = aVar2;
                    str3 = str;
                    break;
                case 10:
                    str = str3;
                    bVar = (com.revolut.feature.insurance_embedded.api.models.b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, com.revolut.feature.insurance_embedded.api.models.a.f75847a, bVar);
                    i |= 1024;
                    aVar = aVar2;
                    str3 = str;
                    break;
                case 11:
                    str = str3;
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, (mlm.b) lazyArr[11].getValue(), list);
                    i |= 2048;
                    aVar = aVar2;
                    str3 = str;
                    break;
                case 12:
                    str = str3;
                    uVar = (u) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 12, s.f18736a, uVar);
                    i |= 4096;
                    aVar = aVar2;
                    str3 = str;
                    break;
                case 13:
                    str = str3;
                    cVar2 = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, a.f18691a, cVar2);
                    i |= 8192;
                    aVar = aVar2;
                    str3 = str;
                    break;
                case 14:
                    str = str3;
                    nVar = (n) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, l.f18722a, nVar);
                    i |= 16384;
                    aVar = aVar2;
                    str3 = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        String str5 = str3;
        dVarBeginStructure.endStructure(serialDescriptor);
        n nVar2 = nVar;
        return new b0(i, strDecodeStringElement, aVar, strDecodeStringElement2, str5, str4, list3, list4, list5, x0Var, list2, bVar, list, uVar, cVar2, nVar2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        b0 value = (b0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = b0.f18692p;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f18693a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f18694b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f18695c);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f18696g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (mlm.h) lazyArr[7].getValue(), value.f18697h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, v0.f18743a, value.i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.f18698j);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, com.revolut.feature.insurance_embedded.api.models.a.f75847a, value.k);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, (mlm.h) lazyArr[11].getValue(), value.f18699l);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 12, s.f18736a, value.f18700m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, a.f18691a, value.f18701n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, l.f18722a, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
