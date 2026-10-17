package com.revolut.feature.insurance_embedded.impl.data.model;

import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsuranceActivateCoverageWidget;
import gu7.b5;
import gu7.f5;
import gu7.h5;
import gu7.j5;
import gu7.l5;
import gu7.z4;
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
public final /* synthetic */ class n0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f76017a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        n0 n0Var = new n0();
        f76017a = n0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsuranceDetails", n0Var, 7);
        pluginGeneratedSerialDescriptor.j("backgroundImageUrl", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("orderCardWidget", false);
        pluginGeneratedSerialDescriptor.j("activateCoverageWidget", false);
        pluginGeneratedSerialDescriptor.j("summaries", false);
        pluginGeneratedSerialDescriptor.j("coverages", false);
        pluginGeneratedSerialDescriptor.j("contacts", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private n0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = o0.f76021h;
        KSerializer kSerializerC = nlm.a.c(j5.f146774a);
        KSerializer kSerializerC2 = nlm.a.c(SchemeInsuranceActivateCoverageWidget.a.f75968a);
        KSerializer kSerializerC3 = nlm.a.c((KSerializer) lazyArr[4].getValue());
        KSerializer kSerializerC4 = nlm.a.c(f5.f146749a);
        KSerializer kSerializerC5 = nlm.a.c(z4.f146879a);
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = o0.f76021h;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        l5 l5Var = null;
        SchemeInsuranceActivateCoverageWidget schemeInsuranceActivateCoverageWidget = null;
        List list = null;
        h5 h5Var = null;
        b5 b5Var = null;
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
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    l5Var = (l5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, j5.f146774a, l5Var);
                    i |= 4;
                    break;
                case 3:
                    schemeInsuranceActivateCoverageWidget = (SchemeInsuranceActivateCoverageWidget) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, SchemeInsuranceActivateCoverageWidget.a.f75968a, schemeInsuranceActivateCoverageWidget);
                    i |= 8;
                    break;
                case 4:
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    h5Var = (h5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, f5.f146749a, h5Var);
                    i |= 32;
                    break;
                case 6:
                    b5Var = (b5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, z4.f146879a, b5Var);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new o0(i, strDecodeStringElement, strDecodeStringElement2, l5Var, schemeInsuranceActivateCoverageWidget, list, h5Var, b5Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        o0 value = (o0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = o0.f76021h;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f76022a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f76023b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, j5.f146774a, value.f76024c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, SchemeInsuranceActivateCoverageWidget.a.f75968a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, f5.f146749a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, z4.f146879a, value.f76025g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
