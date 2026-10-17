package com.revolut.feature.insurance_embedded.impl.data.model;

import com.revolut.feature.insurance_embedded.impl.data.model.ActivateCoverageWidget;
import com.revolut.feature.insurance_embedded.impl.data.model.GenericBanner;
import com.revolut.feature.insurance_embedded.impl.data.model.OrderCardWidget;
import com.revolut.feature.insurance_embedded.impl.data.model.PricingPlanBanner;
import com.revolut.feature.insurance_embedded.impl.data.model.Promotion;
import gu7.d3;
import gu7.f1;
import gu7.k1;
import gu7.l2;
import gu7.n2;
import gu7.r1;
import gu7.s1;
import gu7.w2;
import gu7.x2;
import gu7.z2;
import gu7.z3;
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
public final /* synthetic */ class k0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f76002a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        k0 k0Var = new k0();
        f76002a = k0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.EmbeddedInsuranceDetailsLayout", k0Var, 15);
        pluginGeneratedSerialDescriptor.j("product", false);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("documents", false);
        pluginGeneratedSerialDescriptor.j("getHelp", false);
        pluginGeneratedSerialDescriptor.j("claims", false);
        pluginGeneratedSerialDescriptor.j("orderCardWidget", false);
        pluginGeneratedSerialDescriptor.j("activateCoverageWidget", false);
        pluginGeneratedSerialDescriptor.j("conditions", false);
        pluginGeneratedSerialDescriptor.j("coverages", false);
        pluginGeneratedSerialDescriptor.j("promotion", false);
        pluginGeneratedSerialDescriptor.j("pricingPlanBanner", false);
        pluginGeneratedSerialDescriptor.j("banner", false);
        pluginGeneratedSerialDescriptor.j("primaryButton", false);
        pluginGeneratedSerialDescriptor.j("footerText", false);
        pluginGeneratedSerialDescriptor.j("contacts", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private k0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{v1.f247718a, d3.f146729a, nlm.a.c(s1.f146828a), nlm.a.c(gu7.t.f146833a), nlm.a.c((KSerializer) l0.f76005p[4].getValue()), nlm.a.c(OrderCardWidget.a.f75956a), nlm.a.c(ActivateCoverageWidget.a.f75871a), nlm.a.c(gu7.l.f146782a), nlm.a.c(k1.f146776a), nlm.a.c(Promotion.a.f75963a), nlm.a.c(PricingPlanBanner.a.f75960a), nlm.a.c(GenericBanner.a.f75949a), nlm.a.c(n2.f146801a), nlm.a.c(x2.f146863a), nlm.a.c(gu7.n0.f146799a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        gu7.m0 m0Var;
        z2 z2Var;
        gu7.m0 m0Var2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = l0.f76005p;
        dVarBeginStructure.getClass();
        r1 r1Var = null;
        z2 z2Var2 = null;
        w2 w2Var = null;
        GenericBanner genericBanner = null;
        Promotion promotion = null;
        PricingPlanBanner pricingPlanBanner = null;
        f1 f1Var = null;
        l2 l2Var = null;
        gu7.m0 m0Var3 = null;
        j jVar = null;
        OrderCardWidget orderCardWidget = null;
        ActivateCoverageWidget activateCoverageWidget = null;
        gu7.s sVar = null;
        String strDecodeStringElement = null;
        z3 z3Var = null;
        int i = 0;
        boolean z = true;
        while (z) {
            l2 l2Var2 = l2Var;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    m0Var = m0Var3;
                    z = false;
                    l2Var = l2Var2;
                    m0Var3 = m0Var;
                    break;
                case 0:
                    z2Var = z2Var2;
                    m0Var2 = m0Var3;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    l2Var = l2Var2;
                    m0Var3 = m0Var2;
                    z2Var2 = z2Var;
                    break;
                case 1:
                    z2Var = z2Var2;
                    m0Var2 = m0Var3;
                    z3Var = (z3) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, d3.f146729a, z3Var);
                    i |= 2;
                    l2Var = l2Var2;
                    m0Var3 = m0Var2;
                    z2Var2 = z2Var;
                    break;
                case 2:
                    z2Var = z2Var2;
                    m0Var2 = m0Var3;
                    l2Var = (l2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1.f146828a, l2Var2);
                    i |= 4;
                    m0Var3 = m0Var2;
                    z2Var2 = z2Var;
                    break;
                case 3:
                    z2Var = z2Var2;
                    m0Var3 = (gu7.m0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, gu7.t.f146833a, m0Var3);
                    i |= 8;
                    l2Var = l2Var2;
                    z2Var2 = z2Var;
                    break;
                case 4:
                    m0Var = m0Var3;
                    jVar = (j) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), jVar);
                    i |= 16;
                    l2Var = l2Var2;
                    m0Var3 = m0Var;
                    break;
                case 5:
                    m0Var = m0Var3;
                    orderCardWidget = (OrderCardWidget) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, OrderCardWidget.a.f75956a, orderCardWidget);
                    i |= 32;
                    l2Var = l2Var2;
                    m0Var3 = m0Var;
                    break;
                case 6:
                    m0Var = m0Var3;
                    activateCoverageWidget = (ActivateCoverageWidget) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ActivateCoverageWidget.a.f75871a, activateCoverageWidget);
                    i |= 64;
                    l2Var = l2Var2;
                    m0Var3 = m0Var;
                    break;
                case 7:
                    m0Var = m0Var3;
                    sVar = (gu7.s) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, gu7.l.f146782a, sVar);
                    i |= 128;
                    l2Var = l2Var2;
                    m0Var3 = m0Var;
                    break;
                case 8:
                    m0Var = m0Var3;
                    r1Var = (r1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, k1.f146776a, r1Var);
                    i |= 256;
                    l2Var = l2Var2;
                    m0Var3 = m0Var;
                    break;
                case 9:
                    m0Var = m0Var3;
                    promotion = (Promotion) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, Promotion.a.f75963a, promotion);
                    i |= 512;
                    l2Var = l2Var2;
                    m0Var3 = m0Var;
                    break;
                case 10:
                    m0Var = m0Var3;
                    pricingPlanBanner = (PricingPlanBanner) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, PricingPlanBanner.a.f75960a, pricingPlanBanner);
                    i |= 1024;
                    l2Var = l2Var2;
                    m0Var3 = m0Var;
                    break;
                case 11:
                    m0Var = m0Var3;
                    genericBanner = (GenericBanner) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, GenericBanner.a.f75949a, genericBanner);
                    i |= 2048;
                    l2Var = l2Var2;
                    m0Var3 = m0Var;
                    break;
                case 12:
                    m0Var = m0Var3;
                    w2Var = (w2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, n2.f146801a, w2Var);
                    i |= 4096;
                    l2Var = l2Var2;
                    m0Var3 = m0Var;
                    break;
                case 13:
                    m0Var = m0Var3;
                    z2Var2 = (z2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, x2.f146863a, z2Var2);
                    i |= 8192;
                    l2Var = l2Var2;
                    m0Var3 = m0Var;
                    break;
                case 14:
                    m0Var = m0Var3;
                    f1Var = (f1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, gu7.n0.f146799a, f1Var);
                    i |= 16384;
                    l2Var = l2Var2;
                    m0Var3 = m0Var;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        l2 l2Var3 = l2Var;
        gu7.m0 m0Var4 = m0Var3;
        z3 z3Var2 = z3Var;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l0(i, strDecodeStringElement, z3Var2, l2Var3, m0Var4, jVar, orderCardWidget, activateCoverageWidget, sVar, r1Var, promotion, pricingPlanBanner, genericBanner, w2Var, z2Var2, f1Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        l0 value = (l0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = l0.f76005p;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f76006a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, d3.f146729a, value.f76007b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, s1.f146828a, value.f76008c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, gu7.t.f146833a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, OrderCardWidget.a.f75956a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, ActivateCoverageWidget.a.f75871a, value.f76009g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, gu7.l.f146782a, value.f76010h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, k1.f146776a, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, Promotion.a.f75963a, value.f76011j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, PricingPlanBanner.a.f75960a, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, GenericBanner.a.f75949a, value.f76012l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, n2.f146801a, value.f76013m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, x2.f146863a, value.f76014n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, gu7.n0.f146799a, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
