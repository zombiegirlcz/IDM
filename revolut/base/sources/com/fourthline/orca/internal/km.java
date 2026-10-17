package com.fourthline.orca.internal;

import com.fourthline.orca.internal.gd0;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002\u0015\u001fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0015\u0010%¨\u0006'"}, d2 = {"Lcom/fourthline/orca/internal/km;", "", "", "enabled", "", "kind", "Lcom/fourthline/orca/internal/gd0;", "deviceAntennaSettings", "<init>", "(ZLjava/lang/String;Lcom/fourthline/orca/internal/gd0;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lcom/fourthline/orca/internal/gd0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/km;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "b", "()Z", "Ljava/lang/String;", "getKind", "c", "Lcom/fourthline/orca/internal/gd0;", "()Lcom/fourthline/orca/internal/gd0;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class km {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String kind;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final gd0 deviceAntennaSettings;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30317b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f30316a = aVar;
            f30317b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.kyc.internal.flow.document.DocumentNfcConfig", aVar, 3);
            pluginGeneratedSerialDescriptor.j("enabled", false);
            pluginGeneratedSerialDescriptor.j("kind", false);
            pluginGeneratedSerialDescriptor.j("deviceAntennaSettings", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final km deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            boolean zDecodeBooleanElement = false;
            String strDecodeStringElement = null;
            gd0 gd0Var = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    gd0Var = (gd0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, gd0.a.f28852a, gd0Var);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new km(i, zDecodeBooleanElement, strDecodeStringElement, gd0Var, (SerializationConstructorMarker) null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{qlm.h.f247648a, qlm.v1.f247718a, nlm.a.c(gd0.a.f28852a)};
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
        public final void serialize(Encoder encoder, km value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            km.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.km$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f30316a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ km(int i, boolean z, String str, gd0 gd0Var, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            qlm.j1.f(a.f30316a.getDescriptor(), i, 3);
            throw null;
        }
        this.enabled = z;
        this.kind = str;
        if ((i & 4) == 0) {
            this.deviceAntennaSettings = null;
        } else {
            this.deviceAntennaSettings = gd0Var;
        }
    }

    public static final /* synthetic */ void a(km self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.enabled);
        output.encodeStringElement(serialDesc, 1, self.kind);
        if (!output.d(serialDesc) && self.deviceAntennaSettings == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, gd0.a.f28852a, self.deviceAntennaSettings);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof km)) {
            return false;
        }
        km kmVar = (km) other;
        return this.enabled == kmVar.enabled && Intrinsics.f(this.kind, kmVar.kind) && Intrinsics.f(this.deviceAntennaSettings, kmVar.deviceAntennaSettings);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.enabled) * 31) + this.kind.hashCode()) * 31;
        gd0 gd0Var = this.deviceAntennaSettings;
        return iHashCode + (gd0Var == null ? 0 : gd0Var.hashCode());
    }

    public String toString() {
        return "DocumentNfcConfig(enabled=" + this.enabled + ", kind=" + this.kind + ", deviceAntennaSettings=" + this.deviceAntennaSettings + ")";
    }

    public km(boolean z, String kind, gd0 gd0Var) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.enabled = z;
        this.kind = kind;
        this.deviceAntennaSettings = gd0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final gd0 getDeviceAntennaSettings() {
        return this.deviceAntennaSettings;
    }

    public /* synthetic */ km(boolean z, String str, gd0 gd0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? null : gd0Var);
    }
}
