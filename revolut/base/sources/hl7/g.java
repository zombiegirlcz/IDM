package hl7;

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
public final /* synthetic */ class g implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f153109a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        f153109a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.ApplicationFormDto", gVar, 10);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("policyStartDate", false);
        pluginGeneratedSerialDescriptor.j("vehicle", false);
        pluginGeneratedSerialDescriptor.j("mainDriver", false);
        pluginGeneratedSerialDescriptor.j("additionalDrivers", false);
        pluginGeneratedSerialDescriptor.j("eligibilityChecks", false);
        pluginGeneratedSerialDescriptor.j("replaceVehicles", false);
        pluginGeneratedSerialDescriptor.j("substituteVehicles", false);
        pluginGeneratedSerialDescriptor.j("additionalVehicles", false);
        pluginGeneratedSerialDescriptor.j("allowApplicationEdit", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private g() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = i.k;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, nlm.a.c(v1Var), nlm.a.c(k0.f153166a), nlm.a.c(y4.f153376a), nlm.a.c((KSerializer) lazyArr[4].getValue()), nlm.a.c((KSerializer) lazyArr[5].getValue()), nlm.a.c((KSerializer) lazyArr[6].getValue()), nlm.a.c((KSerializer) lazyArr[7].getValue()), nlm.a.c((KSerializer) lazyArr[8].getValue()), nlm.a.c(qlm.h.f247648a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr2 = i.k;
        dVarBeginStructure.getClass();
        List list = null;
        Boolean bool = null;
        String strDecodeStringElement = null;
        String str = null;
        m0 m0Var = null;
        a5 a5Var = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    lazyArr = lazyArr2;
                    z = false;
                    break;
                case 0:
                    lazyArr = lazyArr2;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    lazyArr = lazyArr2;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                    i |= 2;
                    break;
                case 2:
                    lazyArr = lazyArr2;
                    m0Var = (m0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, k0.f153166a, m0Var);
                    i |= 4;
                    break;
                case 3:
                    lazyArr = lazyArr2;
                    a5Var = (a5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, y4.f153376a, a5Var);
                    i |= 8;
                    break;
                case 4:
                    lazyArr = lazyArr2;
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    lazyArr = lazyArr2;
                    list3 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list3);
                    i |= 32;
                    break;
                case 6:
                    lazyArr = lazyArr2;
                    list4 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list4);
                    i |= 64;
                    break;
                case 7:
                    lazyArr = lazyArr2;
                    list5 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr[7].getValue(), list5);
                    i |= 128;
                    break;
                case 8:
                    lazyArr = lazyArr2;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    lazyArr = lazyArr2;
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.h.f247648a, bool);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            lazyArr2 = lazyArr;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new i(i, strDecodeStringElement, str, m0Var, a5Var, list2, list3, list4, list5, list, bool);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        i value = (i) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = i.k;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f153134a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, value.f153135b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, k0.f153166a, value.f153136c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, y4.f153376a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f153137g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, (mlm.h) lazyArr[7].getValue(), value.f153138h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, qlm.h.f247648a, value.f153139j);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
