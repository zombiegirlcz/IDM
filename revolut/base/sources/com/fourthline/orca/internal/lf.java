package com.fourthline.orca.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0081\b\u0018\u0000 72\u00020\u0001:\u0002\u001a%BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBs\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b4\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b6\u0010\u001d¨\u00068"}, d2 = {"Lcom/fourthline/orca/internal/lf;", "", "", "language", "sdkVersion", "sdkOrigin", "model", "", "osCompromised", "osVersion", "analyticsID", "appTrackerId", "region", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/lf;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLanguage", "b", "getSdkVersion", "c", "getSdkOrigin", "d", "getModel", "e", "Z", "getOsCompromised", "()Z", "f", "getOsVersion", "g", "getAnalyticsID", "h", "getAppTrackerId", "i", "getRegion", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class lf {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String language;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sdkVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String sdkOrigin;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String model;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean osCompromised;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String osVersion;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String analyticsID;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String appTrackerId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String region;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30611b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f30610a = aVar;
            f30611b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.kyc.internal.flow.upload_idv.upload.DeviceMetadataData", aVar, 9);
            pluginGeneratedSerialDescriptor.j("language", false);
            pluginGeneratedSerialDescriptor.j("sdkVersion", false);
            pluginGeneratedSerialDescriptor.j("sdkOrigin", false);
            pluginGeneratedSerialDescriptor.j("model", false);
            pluginGeneratedSerialDescriptor.j("osCompromised", false);
            pluginGeneratedSerialDescriptor.j("osVersion", false);
            pluginGeneratedSerialDescriptor.j("analyticsID", false);
            pluginGeneratedSerialDescriptor.j("appTrackerId", false);
            pluginGeneratedSerialDescriptor.j("region", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lf deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String str = null;
            String strDecodeStringElement6 = null;
            String str2 = null;
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
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str);
                        i |= 64;
                        break;
                    case 7:
                        strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        break;
                    case 8:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.v1.f247718a, str2);
                        i |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new lf(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, zDecodeBooleanElement, strDecodeStringElement5, str, strDecodeStringElement6, str2, null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, qlm.h.f247648a, v1Var, nlm.a.c(v1Var), v1Var, nlm.a.c(v1Var)};
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // qlm.f0
        public /* bridge */ KSerializer[] typeParametersSerializers() {
            return qlm.j1.f247666a;
        }

        @Override // mlm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, lf value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            lf.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.lf$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f30610a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ lf(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            qlm.j1.f(a.f30610a.getDescriptor(), i, 255);
            throw null;
        }
        this.language = str;
        this.sdkVersion = str2;
        this.sdkOrigin = str3;
        this.model = str4;
        this.osCompromised = z;
        this.osVersion = str5;
        this.analyticsID = str6;
        this.appTrackerId = str7;
        if ((i & 256) == 0) {
            this.region = null;
        } else {
            this.region = str8;
        }
    }

    public static final /* synthetic */ void a(lf self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.language);
        output.encodeStringElement(serialDesc, 1, self.sdkVersion);
        output.encodeStringElement(serialDesc, 2, self.sdkOrigin);
        output.encodeStringElement(serialDesc, 3, self.model);
        output.encodeBooleanElement(serialDesc, 4, self.osCompromised);
        output.encodeStringElement(serialDesc, 5, self.osVersion);
        qlm.v1 v1Var = qlm.v1.f247718a;
        output.encodeNullableSerializableElement(serialDesc, 6, v1Var, self.analyticsID);
        output.encodeStringElement(serialDesc, 7, self.appTrackerId);
        if (!output.d(serialDesc) && self.region == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, v1Var, self.region);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof lf)) {
            return false;
        }
        lf lfVar = (lf) other;
        return Intrinsics.f(this.language, lfVar.language) && Intrinsics.f(this.sdkVersion, lfVar.sdkVersion) && Intrinsics.f(this.sdkOrigin, lfVar.sdkOrigin) && Intrinsics.f(this.model, lfVar.model) && this.osCompromised == lfVar.osCompromised && Intrinsics.f(this.osVersion, lfVar.osVersion) && Intrinsics.f(this.analyticsID, lfVar.analyticsID) && Intrinsics.f(this.appTrackerId, lfVar.appTrackerId) && Intrinsics.f(this.region, lfVar.region);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.language.hashCode() * 31) + this.sdkVersion.hashCode()) * 31) + this.sdkOrigin.hashCode()) * 31) + this.model.hashCode()) * 31) + Boolean.hashCode(this.osCompromised)) * 31) + this.osVersion.hashCode()) * 31;
        String str = this.analyticsID;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.appTrackerId.hashCode()) * 31;
        String str2 = this.region;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DeviceMetadataData(language=" + this.language + ", sdkVersion=" + this.sdkVersion + ", sdkOrigin=" + this.sdkOrigin + ", model=" + this.model + ", osCompromised=" + this.osCompromised + ", osVersion=" + this.osVersion + ", analyticsID=" + this.analyticsID + ", appTrackerId=" + this.appTrackerId + ", region=" + this.region + ")";
    }

    public lf(String language, String sdkVersion, String sdkOrigin, String model, boolean z, String osVersion, String str, String appTrackerId, String str2) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sdkOrigin, "sdkOrigin");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(appTrackerId, "appTrackerId");
        this.language = language;
        this.sdkVersion = sdkVersion;
        this.sdkOrigin = sdkOrigin;
        this.model = model;
        this.osCompromised = z;
        this.osVersion = osVersion;
        this.analyticsID = str;
        this.appTrackerId = appTrackerId;
        this.region = str2;
    }
}
