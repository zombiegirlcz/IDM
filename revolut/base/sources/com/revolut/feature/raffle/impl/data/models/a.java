package com.revolut.feature.raffle.impl.data.models;

import bta.h;
import bta.j;
import bta.k;
import com.revolut.feature.raffle.impl.data.models.RaffleCampaign$ShareInfo;
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
import plm.d;
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f81629a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f81629a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.raffle.impl.data.models.RaffleCampaign", aVar, 8);
        pluginGeneratedSerialDescriptor.j("competitionId", false);
        pluginGeneratedSerialDescriptor.j("checklistId", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("items", false);
        pluginGeneratedSerialDescriptor.j("footer", false);
        pluginGeneratedSerialDescriptor.j("primaryAction", false);
        pluginGeneratedSerialDescriptor.j("shareInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = b.i;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, lazyArr[2].getValue(), bta.b.f18483a, lazyArr[4].getValue(), nlm.a.c(v1Var), nlm.a.c(h.f18490a), nlm.a.c(RaffleCampaign$ShareInfo.a.f81628a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = b.i;
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        k kVar = null;
        bta.d dVar = null;
        List list = null;
        String str = null;
        j jVar = null;
        RaffleCampaign$ShareInfo raffleCampaign$ShareInfo = null;
        int i = 0;
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
                    kVar = (k) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), kVar);
                    i |= 4;
                    break;
                case 3:
                    dVar = (bta.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, bta.b.f18483a, dVar);
                    i |= 8;
                    break;
                case 4:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str);
                    i |= 32;
                    break;
                case 6:
                    jVar = (j) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, h.f18490a, jVar);
                    i |= 64;
                    break;
                case 7:
                    raffleCampaign$ShareInfo = (RaffleCampaign$ShareInfo) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, RaffleCampaign$ShareInfo.a.f81628a, raffleCampaign$ShareInfo);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new b(i, strDecodeStringElement, strDecodeStringElement2, kVar, dVar, list, str, jVar, raffleCampaign$ShareInfo);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        b value = (b) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = b.i;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f81630a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f81631b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f81632c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, bta.b.f18483a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, h.f18490a, value.f81633g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, RaffleCampaign$ShareInfo.a.f81628a, value.f81634h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
