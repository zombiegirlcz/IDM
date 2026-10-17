package gu7;

import kotlin.Lazy;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lgu7/a;", "", "", "toString", "()Ljava/lang/String;", "Companion", "gu7/b", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146706c = {yhm.j.c(yhm.k.PUBLICATION, new gr2.j0(21)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f146707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4 f146708b;

    /* JADX INFO: renamed from: gu7.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0847a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0847a f146709a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C0847a c0847a = new C0847a();
            f146709a = c0847a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.Action", c0847a, 2);
            pluginGeneratedSerialDescriptor.j("type", true);
            pluginGeneratedSerialDescriptor.j("productDetailsParams", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C0847a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{a.f146706c[0].getValue(), nlm.a.c(k4.f146781a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = a.f146706c;
            dVarBeginStructure.getClass();
            b bVar = null;
            boolean z = true;
            int i = 0;
            m4 m4Var = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    bVar = (b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), bVar);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    m4Var = (m4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, k4.f146781a, m4Var);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, bVar, m4Var);
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
            Lazy[] lazyArr = a.f146706c;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f146707a != b.UNKNOWN) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f146707a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f146708b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, k4.f146781a, value.f146708b);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: gu7.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C0847a.f146709a;
        }
    }

    public /* synthetic */ a(int i, b bVar, m4 m4Var) {
        this.f146707a = (i & 1) == 0 ? b.UNKNOWN : bVar;
        if ((i & 2) == 0) {
            this.f146708b = null;
        } else {
            this.f146708b = m4Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f146707a == aVar.f146707a && Intrinsics.f(this.f146708b, aVar.f146708b);
    }

    public final int hashCode() {
        int iHashCode = this.f146707a.hashCode() * 31;
        m4 m4Var = this.f146708b;
        return iHashCode + (m4Var == null ? 0 : m4Var.hashCode());
    }

    public a() {
        b type = b.UNKNOWN;
        Intrinsics.checkNotNullParameter(type, "type");
        this.f146707a = type;
        this.f146708b = null;
    }
}
