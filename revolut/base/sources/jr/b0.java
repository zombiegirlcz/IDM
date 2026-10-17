package jr;

import java.util.List;
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

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ljr/b0;", "Ljr/e0;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class b0 implements e0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f177760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f177761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f177762c;
    public final String d;
    public final Integer e;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f177763a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f177763a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("DOCUMENT", aVar, 5);
            pluginGeneratedSerialDescriptor.j("acceptedDocuments", false);
            pluginGeneratedSerialDescriptor.j("preparationSteps", false);
            pluginGeneratedSerialDescriptor.j("manualFallbackTimeout", false);
            pluginGeneratedSerialDescriptor.j("id", true);
            pluginGeneratedSerialDescriptor.j("attemptIndex", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = b0.f;
            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), qlm.t0.f247706a, nlm.a.c(qlm.v1.f247718a), nlm.a.c(qlm.n0.f247680a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = b0.f;
            dVarBeginStructure.getClass();
            int i = 0;
            List list = null;
            List list2 = null;
            String str = null;
            Integer num = null;
            long jDecodeLongElement = 0;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                    i |= 1;
                } else if (iD == 1) {
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list2);
                    i |= 2;
                } else if (iD == 2) {
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i |= 4;
                } else if (iD == 3) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.n0.f247680a, num);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b0(i, list, list2, jDecodeLongElement, str, num);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            b0 value = (b0) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = b0.f;
            mlm.h hVar = (mlm.h) lazyArr[0].getValue();
            List list = value.f177760a;
            Integer num = value.e;
            String str = value.d;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, list);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f177761b);
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.f177762c);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || num != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, qlm.n0.f247680a, num);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: jr.b0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f177763a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{yhm.j.c(kVar, new jp9.l(14)), yhm.j.c(kVar, new jp9.l(15)), null, null, null};
    }

    public /* synthetic */ b0(int i, List list, List list2, long j2, String str, Integer num) {
        if (7 != (i & 7)) {
            qlm.j1.f(a.f177763a.getDescriptor(), i, 7);
            throw null;
        }
        this.f177760a = list;
        this.f177761b = list2;
        this.f177762c = j2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
    }

    @Override // jr.e0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getE() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f177760a, b0Var.f177760a) && Intrinsics.f(this.f177761b, b0Var.f177761b) && this.f177762c == b0Var.f177762c && Intrinsics.f(this.d, b0Var.d) && Intrinsics.f(this.e, b0Var.e);
    }

    @Override // jr.e0
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.d(this.f177760a.hashCode() * 31, 31, this.f177761b), 31, this.f177762c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
