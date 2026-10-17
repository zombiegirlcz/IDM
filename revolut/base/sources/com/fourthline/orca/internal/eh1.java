package com.fourthline.orca.internal;

import com.fourthline.orca.internal.lf;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u0000 22\u00020\u0001:\u0002\u0018$BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010\u001b¨\u00063"}, d2 = {"Lcom/fourthline/orca/internal/eh1;", "", "", "formality", "locale", "sdkVersion", "userAgent", "platform", "Lcom/fourthline/orca/internal/lf;", "deviceMetaData", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fourthline/orca/internal/lf;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fourthline/orca/internal/lf;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/eh1;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFormality", "b", "getLocale", "c", "getSdkVersion", "d", "getUserAgent", "e", "getPlatform", "f", "Lcom/fourthline/orca/internal/lf;", "getDeviceMetaData", "()Lcom/fourthline/orca/internal/lf;", "g", "getKey", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class eh1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String formality;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String locale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String sdkVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String userAgent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String platform;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final lf deviceMetaData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String key;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28141b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f28140a = aVar;
            f28141b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.backend.model.WorkflowStartSessionRequest", aVar, 7);
            pluginGeneratedSerialDescriptor.j("formality", false);
            pluginGeneratedSerialDescriptor.j("locale", false);
            pluginGeneratedSerialDescriptor.j("sdkVersion", false);
            pluginGeneratedSerialDescriptor.j("userAgent", false);
            pluginGeneratedSerialDescriptor.j("platform", false);
            pluginGeneratedSerialDescriptor.j("deviceMetaData", true);
            pluginGeneratedSerialDescriptor.j("key", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final eh1 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            lf lfVar = null;
            String strDecodeStringElement6 = null;
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
                        strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        lfVar = (lf) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, lf.a.f30610a, lfVar);
                        i |= 32;
                        break;
                    case 6:
                        strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new eh1(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, lfVar, strDecodeStringElement6, null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerC = nlm.a.c(lf.a.f30610a);
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, v1Var, kSerializerC, v1Var};
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
        public final void serialize(Encoder encoder, eh1 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            eh1.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.eh1$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f28140a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ eh1(int i, String str, String str2, String str3, String str4, String str5, lf lfVar, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (95 != (i & 95)) {
            qlm.j1.f(a.f28140a.getDescriptor(), i, 95);
            throw null;
        }
        this.formality = str;
        this.locale = str2;
        this.sdkVersion = str3;
        this.userAgent = str4;
        this.platform = str5;
        if ((i & 32) == 0) {
            this.deviceMetaData = null;
        } else {
            this.deviceMetaData = lfVar;
        }
        this.key = str6;
    }

    public static final /* synthetic */ void a(eh1 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.formality);
        output.encodeStringElement(serialDesc, 1, self.locale);
        output.encodeStringElement(serialDesc, 2, self.sdkVersion);
        output.encodeStringElement(serialDesc, 3, self.userAgent);
        output.encodeStringElement(serialDesc, 4, self.platform);
        if (output.d(serialDesc) || self.deviceMetaData != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, lf.a.f30610a, self.deviceMetaData);
        }
        output.encodeStringElement(serialDesc, 6, self.key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof eh1)) {
            return false;
        }
        eh1 eh1Var = (eh1) other;
        return Intrinsics.f(this.formality, eh1Var.formality) && Intrinsics.f(this.locale, eh1Var.locale) && Intrinsics.f(this.sdkVersion, eh1Var.sdkVersion) && Intrinsics.f(this.userAgent, eh1Var.userAgent) && Intrinsics.f(this.platform, eh1Var.platform) && Intrinsics.f(this.deviceMetaData, eh1Var.deviceMetaData) && Intrinsics.f(this.key, eh1Var.key);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.formality.hashCode() * 31) + this.locale.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31) + this.userAgent.hashCode()) * 31) + this.platform.hashCode()) * 31;
        lf lfVar = this.deviceMetaData;
        return ((iHashCode + (lfVar == null ? 0 : lfVar.hashCode())) * 31) + this.key.hashCode();
    }

    public String toString() {
        return "WorkflowStartSessionRequest(formality=" + this.formality + ", locale=" + this.locale + ", sdkVersion=" + this.sdkVersion + ", userAgent=" + this.userAgent + ", platform=" + this.platform + ", deviceMetaData=" + this.deviceMetaData + ", key=" + this.key + ")";
    }

    public eh1(String formality, String locale, String sdkVersion, String userAgent, String platform, lf lfVar, String key) {
        Intrinsics.checkNotNullParameter(formality, "formality");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(key, "key");
        this.formality = formality;
        this.locale = locale;
        this.sdkVersion = sdkVersion;
        this.userAgent = userAgent;
        this.platform = platform;
        this.deviceMetaData = lfVar;
        this.key = key;
    }
}
