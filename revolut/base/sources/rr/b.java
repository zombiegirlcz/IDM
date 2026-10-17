package rr;

import java.util.Set;
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
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lrr/b;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, j.c(k.PUBLICATION, new rm0.k(28)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f256602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f256603c;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f256604a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f256604a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.domain.common.models.JwtModelDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("verification_id", true);
            pluginGeneratedSerialDescriptor.j("tags", true);
            pluginGeneratedSerialDescriptor.j("api_base_url", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = b.d;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[1].getValue()), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = b.d;
            dVarBeginStructure.getClass();
            String str = null;
            boolean z = true;
            int i = 0;
            Set set = null;
            String str2 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    set = (Set) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), set);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b(str, i, str2, set);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            b value = (b) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = b.d;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f256601a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f256601a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f256602b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f256602b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f256603c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, value.f256603c);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: rr.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f256604a;
        }
    }

    public b() {
        this.f256601a = null;
        this.f256602b = null;
        this.f256603c = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f256601a, bVar.f256601a) && Intrinsics.f(this.f256602b, bVar.f256602b) && Intrinsics.f(this.f256603c, bVar.f256603c);
    }

    public final int hashCode() {
        String str = this.f256601a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Set set = this.f256602b;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        String str2 = this.f256603c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ b(String str, int i, String str2, Set set) {
        if ((i & 1) == 0) {
            this.f256601a = null;
        } else {
            this.f256601a = str;
        }
        if ((i & 2) == 0) {
            this.f256602b = null;
        } else {
            this.f256602b = set;
        }
        if ((i & 4) == 0) {
            this.f256603c = null;
        } else {
            this.f256603c = str2;
        }
    }
}
