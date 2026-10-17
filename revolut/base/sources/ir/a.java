package ir;

import ir.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.f0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lir/a;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f167911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f167912b;

    /* JADX INFO: renamed from: ir.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0938a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0938a f167913a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C0938a c0938a = new C0938a();
            f167913a = c0938a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.dynamic_instructions.BiometricVerificationDynamicInstructionsResponseDto", c0938a, 2);
            pluginGeneratedSerialDescriptor.j("instructions", true);
            pluginGeneratedSerialDescriptor.j("error", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C0938a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(b.f167914a), nlm.a.c(e.a.f167921a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            d dVar = null;
            boolean z = true;
            int i = 0;
            e eVar = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    dVar = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, b.f167914a, dVar);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    eVar = (e) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, e.a.f167921a, eVar);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, dVar, eVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            a value = (a) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f167911a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, b.f167914a, value.f167911a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f167912b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, e.a.f167921a, value.f167912b);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: ir.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C0938a.f167913a;
        }
    }

    public a() {
        this.f167911a = null;
        this.f167912b = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f167911a, aVar.f167911a) && Intrinsics.f(this.f167912b, aVar.f167912b);
    }

    public final int hashCode() {
        d dVar = this.f167911a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        e eVar = this.f167912b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public /* synthetic */ a(int i, d dVar, e eVar) {
        if ((i & 1) == 0) {
            this.f167911a = null;
        } else {
            this.f167911a = dVar;
        }
        if ((i & 2) == 0) {
            this.f167912b = null;
        } else {
            this.f167912b = eVar;
        }
    }
}
