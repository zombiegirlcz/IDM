package kr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkr/n;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class n {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f188535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f188537c;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f188538a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f188538a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.media.BiometricVerificationDiagnosticImageExtraMetadataDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("face_quality_diagnostics", true);
            pluginGeneratedSerialDescriptor.j("stepId", true);
            pluginGeneratedSerialDescriptor.j("attemptIndex", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{qlm.h.f247648a, nlm.a.c(qlm.v1.f247718a), nlm.a.c(qlm.n0.f247680a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String str = null;
            boolean z = true;
            int i = 0;
            boolean zDecodeBooleanElement = false;
            Integer num = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.n0.f247680a, num);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new n(i, num, str, zDecodeBooleanElement);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            n value = (n) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, value.f188535a);
            String str = value.f188536b;
            if (str != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
            }
            Integer num = value.f188537c;
            if (num != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.n0.f247680a, num);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: kr.n$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f188538a;
        }
    }

    public n() {
        this(7, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f188535a == nVar.f188535a && Intrinsics.f(this.f188536b, nVar.f188536b) && Intrinsics.f(this.f188537c, nVar.f188537c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f188535a) * 31;
        String str = this.f188536b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f188537c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public /* synthetic */ n(int i, Integer num, String str, boolean z) {
        this.f188535a = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.f188536b = null;
        } else {
            this.f188536b = str;
        }
        if ((i & 4) == 0) {
            this.f188537c = null;
        } else {
            this.f188537c = num;
        }
    }

    public n(int i, String str, Integer num) {
        str = (i & 2) != 0 ? null : str;
        num = (i & 4) != 0 ? null : num;
        this.f188535a = true;
        this.f188536b = str;
        this.f188537c = num;
    }
}
