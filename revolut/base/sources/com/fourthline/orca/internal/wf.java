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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002\u0015 B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB;\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u0015\u0010&¨\u0006("}, d2 = {"Lcom/fourthline/orca/internal/wf;", "", "", "enabled", "", "minimumAge", "", "imageUploadTimeoutMs", "backendProcessingTimeoutMs", "<init>", "(ZIJJ)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZIJJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/wf;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "b", "()Z", "I", "d", "c", "J", "()J", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class wf {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minimumAge;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long imageUploadTimeoutMs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long backendProcessingTimeoutMs;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34670b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f34669a = aVar;
            f34670b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.kyc.internal.flow.document.DocumentAnalysisConfig", aVar, 4);
            pluginGeneratedSerialDescriptor.j("enabled", false);
            pluginGeneratedSerialDescriptor.j("minimumAge", false);
            pluginGeneratedSerialDescriptor.j("imageUploadTimeoutMs", false);
            pluginGeneratedSerialDescriptor.j("backendProcessingTimeoutMs", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wf deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            boolean zDecodeBooleanElement = false;
            int iDecodeIntElement = 0;
            long jDecodeLongElement = 0;
            long jDecodeLongElement2 = 0;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new wf(i, zDecodeBooleanElement, iDecodeIntElement, jDecodeLongElement, jDecodeLongElement2, null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.t0 t0Var = qlm.t0.f247706a;
            return new KSerializer[]{qlm.h.f247648a, qlm.n0.f247680a, t0Var, t0Var};
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
        public final void serialize(Encoder encoder, wf value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            wf.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.wf$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f34669a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ wf(int i, boolean z, int i2, long j2, long j3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            qlm.j1.f(a.f34669a.getDescriptor(), i, 15);
            throw null;
        }
        this.enabled = z;
        this.minimumAge = i2;
        this.imageUploadTimeoutMs = j2;
        this.backendProcessingTimeoutMs = j3;
    }

    public static final /* synthetic */ void a(wf self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.enabled);
        output.encodeIntElement(serialDesc, 1, self.minimumAge);
        output.encodeLongElement(serialDesc, 2, self.imageUploadTimeoutMs);
        output.encodeLongElement(serialDesc, 3, self.backendProcessingTimeoutMs);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getImageUploadTimeoutMs() {
        return this.imageUploadTimeoutMs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMinimumAge() {
        return this.minimumAge;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof wf)) {
            return false;
        }
        wf wfVar = (wf) other;
        return this.enabled == wfVar.enabled && this.minimumAge == wfVar.minimumAge && this.imageUploadTimeoutMs == wfVar.imageUploadTimeoutMs && this.backendProcessingTimeoutMs == wfVar.backendProcessingTimeoutMs;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.enabled) * 31) + Integer.hashCode(this.minimumAge)) * 31) + Long.hashCode(this.imageUploadTimeoutMs)) * 31) + Long.hashCode(this.backendProcessingTimeoutMs);
    }

    public String toString() {
        return "DocumentAnalysisConfig(enabled=" + this.enabled + ", minimumAge=" + this.minimumAge + ", imageUploadTimeoutMs=" + this.imageUploadTimeoutMs + ", backendProcessingTimeoutMs=" + this.backendProcessingTimeoutMs + ")";
    }

    public wf(boolean z, int i, long j2, long j3) {
        this.enabled = z;
        this.minimumAge = i;
        this.imageUploadTimeoutMs = j2;
        this.backendProcessingTimeoutMs = j3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBackendProcessingTimeoutMs() {
        return this.backendProcessingTimeoutMs;
    }
}
