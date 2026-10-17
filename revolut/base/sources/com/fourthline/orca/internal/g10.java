package com.fourthline.orca.internal;

import com.fourthline.orca.internal.j10;
import kotlin.Lazy;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002\u0013!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/fourthline/orca/internal/g10;", "", "Lcom/fourthline/orca/internal/k10;", "verificationStatus", "Lcom/fourthline/orca/internal/j10;", "uploadStatus", "<init>", "(Lcom/fourthline/orca/internal/k10;Lcom/fourthline/orca/internal/j10;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/k10;Lcom/fourthline/orca/internal/j10;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/g10;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/k10;", "c", "()Lcom/fourthline/orca/internal/k10;", "b", "Lcom/fourthline/orca/internal/j10;", "getUploadStatus", "()Lcom/fourthline/orca/internal/j10;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class g10 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy[] f28728c = {yhm.j.c(yhm.k.PUBLICATION, new dl1(14)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k10 verificationStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j10 uploadStatus;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28732b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f28731a = aVar;
            f28732b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.backend.model.IdvStatus", aVar, 2);
            pluginGeneratedSerialDescriptor.j("verificationStatus", false);
            pluginGeneratedSerialDescriptor.j("uploadStatus", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g10 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = g10.f28728c;
            dVarBeginStructure.getClass();
            SerializationConstructorMarker serializationConstructorMarker = null;
            boolean z = true;
            int i = 0;
            k10 k10Var = null;
            j10 j10Var = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    k10Var = (k10) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), k10Var);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    j10Var = (j10) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, j10.a.f29784a, j10Var);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new g10(i, k10Var, j10Var, serializationConstructorMarker);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{g10.f28728c[0].getValue(), j10.a.f29784a};
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
        public final void serialize(Encoder encoder, g10 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            g10.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.g10$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f28731a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ g10(int i, k10 k10Var, j10 j10Var, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            qlm.j1.f(a.f28731a.getDescriptor(), i, 3);
            throw null;
        }
        this.verificationStatus = k10Var;
        this.uploadStatus = j10Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return k10.INSTANCE.serializer();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k10 getVerificationStatus() {
        return this.verificationStatus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g10)) {
            return false;
        }
        g10 g10Var = (g10) other;
        return this.verificationStatus == g10Var.verificationStatus && Intrinsics.f(this.uploadStatus, g10Var.uploadStatus);
    }

    public int hashCode() {
        return (this.verificationStatus.hashCode() * 31) + this.uploadStatus.hashCode();
    }

    public String toString() {
        return "IdvStatus(verificationStatus=" + this.verificationStatus + ", uploadStatus=" + this.uploadStatus + ")";
    }

    public g10(k10 verificationStatus, j10 uploadStatus) {
        Intrinsics.checkNotNullParameter(verificationStatus, "verificationStatus");
        Intrinsics.checkNotNullParameter(uploadStatus, "uploadStatus");
        this.verificationStatus = verificationStatus;
        this.uploadStatus = uploadStatus;
    }

    public static final /* synthetic */ void a(g10 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (mlm.h) f28728c[0].getValue(), self.verificationStatus);
        output.encodeSerializableElement(serialDesc, 1, j10.a.f29784a, self.uploadStatus);
    }
}
