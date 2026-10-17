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
import kr.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkr/d1;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class d1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f188478b;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f188479a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f188479a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.media.BiometricVerificationNfcMetadataDto", aVar, 2);
            pluginGeneratedSerialDescriptor.j("type", true);
            pluginGeneratedSerialDescriptor.j("metadata", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{qlm.v1.f247718a, c1.a.f188469a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            c1 c1Var = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    c1Var = (c1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, c1.a.f188469a, c1Var);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new d1(i, strDecodeStringElement, c1Var);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            d1 value = (d1) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f188477a);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, c1.a.f188469a, value.f188478b);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: kr.d1$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f188479a;
        }
    }

    public d1() {
        this(null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f188477a, d1Var.f188477a) && Intrinsics.f(this.f188478b, d1Var.f188478b);
    }

    public final int hashCode() {
        return this.f188478b.hashCode() + (this.f188477a.hashCode() * 31);
    }

    public /* synthetic */ d1(int i, String str, c1 c1Var) {
        this.f188477a = (i & 1) == 0 ? "DOCUMENT_NFC_DATA" : str;
        if ((i & 2) == 0) {
            this.f188478b = new c1(null, null);
        } else {
            this.f188478b = c1Var;
        }
    }

    public d1(c1 extraMetadata, int i) {
        extraMetadata = (i & 2) != 0 ? new c1(null, null) : extraMetadata;
        Intrinsics.checkNotNullParameter("DOCUMENT_NFC_DATA", "scanType");
        Intrinsics.checkNotNullParameter(extraMetadata, "extraMetadata");
        this.f188477a = "DOCUMENT_NFC_DATA";
        this.f188478b = extraMetadata;
    }
}
