package com.onfido.android.sdk.capture.internal.analytics.inhouse.network;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nlm.a;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/onfido/android/sdk/capture/internal/analytics/inhouse/network/AnalyticsEventNetworkModel.$serializer", "Lqlm/f0;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/AnalyticsEventNetworkModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/AnalyticsEventNetworkModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/AnalyticsEventNetworkModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class AnalyticsEventNetworkModel$$serializer implements f0 {

    @NotNull
    public static final AnalyticsEventNetworkModel$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AnalyticsEventNetworkModel$$serializer analyticsEventNetworkModel$$serializer = new AnalyticsEventNetworkModel$$serializer();
        INSTANCE = analyticsEventNetworkModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.android.sdk.capture.internal.analytics.inhouse.network.AnalyticsEventNetworkModel", analyticsEventNetworkModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("event", false);
        pluginGeneratedSerialDescriptor.j("event_uuid", false);
        pluginGeneratedSerialDescriptor.j("workflow_run_uuid", false);
        pluginGeneratedSerialDescriptor.j("event_time", false);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.j("applicant_uuid", false);
        pluginGeneratedSerialDescriptor.j("anonymous_uuid", false);
        pluginGeneratedSerialDescriptor.j("client_uuid", false);
        pluginGeneratedSerialDescriptor.j("session_uuid", false);
        pluginGeneratedSerialDescriptor.j("properties", true);
        pluginGeneratedSerialDescriptor.j("source_metadata", false);
        pluginGeneratedSerialDescriptor.j("event_metadata", true);
        pluginGeneratedSerialDescriptor.j("sdk_config", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AnalyticsEventNetworkModel$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = AnalyticsEventNetworkModel.$childSerializers;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, a.c(v1Var), v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, kSerializerArr[9], SourceMetaData$$serializer.INSTANCE, a.c(EventMetaData$$serializer.INSTANCE), SdkConfig$$serializer.INSTANCE};
    }

    @Override // mlm.b
    @NotNull
    public AnalyticsEventNetworkModel deserialize(@NotNull Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = AnalyticsEventNetworkModel.$childSerializers;
        dVarBeginStructure.getClass();
        Map map = null;
        SdkConfig sdkConfig = null;
        SourceMetaData sourceMetaData = null;
        EventMetaData eventMetaData = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String strDecodeStringElement6 = null;
        String strDecodeStringElement7 = null;
        String strDecodeStringElement8 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            KSerializer[] kSerializerArr2 = kSerializerArr;
            int iD = dVarBeginStructure.d(descriptor2);
            switch (iD) {
                case -1:
                    str = strDecodeStringElement;
                    z = false;
                    kSerializerArr = kSerializerArr2;
                    strDecodeStringElement = str;
                    break;
                case 0:
                    i |= 1;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(descriptor2, 0);
                    kSerializerArr = kSerializerArr2;
                    break;
                case 1:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(descriptor2, 1);
                    i |= 2;
                    kSerializerArr = kSerializerArr2;
                    break;
                case 2:
                    str = strDecodeStringElement;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 2, v1.f247718a, str2);
                    i |= 4;
                    kSerializerArr = kSerializerArr2;
                    strDecodeStringElement = str;
                    break;
                case 3:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(descriptor2, 3);
                    i |= 8;
                    kSerializerArr = kSerializerArr2;
                    break;
                case 4:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(descriptor2, 4);
                    i |= 16;
                    kSerializerArr = kSerializerArr2;
                    break;
                case 5:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(descriptor2, 5);
                    i |= 32;
                    kSerializerArr = kSerializerArr2;
                    break;
                case 6:
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(descriptor2, 6);
                    i |= 64;
                    kSerializerArr = kSerializerArr2;
                    break;
                case 7:
                    strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(descriptor2, 7);
                    i |= 128;
                    kSerializerArr = kSerializerArr2;
                    break;
                case 8:
                    strDecodeStringElement8 = dVarBeginStructure.decodeStringElement(descriptor2, 8);
                    i |= 256;
                    kSerializerArr = kSerializerArr2;
                    break;
                case 9:
                    str = strDecodeStringElement;
                    map = (Map) dVarBeginStructure.decodeSerializableElement(descriptor2, 9, kSerializerArr2[9], map);
                    i |= 512;
                    kSerializerArr = kSerializerArr2;
                    strDecodeStringElement = str;
                    break;
                case 10:
                    str = strDecodeStringElement;
                    sourceMetaData = (SourceMetaData) dVarBeginStructure.decodeSerializableElement(descriptor2, 10, SourceMetaData$$serializer.INSTANCE, sourceMetaData);
                    i |= 1024;
                    kSerializerArr = kSerializerArr2;
                    strDecodeStringElement = str;
                    break;
                case 11:
                    str = strDecodeStringElement;
                    eventMetaData = (EventMetaData) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 11, EventMetaData$$serializer.INSTANCE, eventMetaData);
                    i |= 2048;
                    kSerializerArr = kSerializerArr2;
                    strDecodeStringElement = str;
                    break;
                case 12:
                    str = strDecodeStringElement;
                    sdkConfig = (SdkConfig) dVarBeginStructure.decodeSerializableElement(descriptor2, 12, SdkConfig$$serializer.INSTANCE, sdkConfig);
                    i |= 4096;
                    kSerializerArr = kSerializerArr2;
                    strDecodeStringElement = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new AnalyticsEventNetworkModel(i, strDecodeStringElement, strDecodeStringElement2, str2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, strDecodeStringElement6, strDecodeStringElement7, strDecodeStringElement8, map, sourceMetaData, eventMetaData, sdkConfig, (SerializationConstructorMarker) null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull AnalyticsEventNetworkModel value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        AnalyticsEventNetworkModel.write$Self$onfido_capture_sdk_core_release(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
