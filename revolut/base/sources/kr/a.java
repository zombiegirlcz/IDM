package kr;

import java.util.Map;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkr/a;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new kl7.w0(20)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f188453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f188455c;

    /* JADX INFO: renamed from: kr.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1067a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1067a f188456a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C1067a c1067a = new C1067a();
            f188456a = c1067a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.media.BiometricVerificationCompactSelfieExtraMetadataDto", c1067a, 3);
            pluginGeneratedSerialDescriptor.j("extras", true);
            pluginGeneratedSerialDescriptor.j("stepId", true);
            pluginGeneratedSerialDescriptor.j("attemptIndex", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C1067a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c((KSerializer) a.d[0].getValue()), nlm.a.c(qlm.v1.f247718a), nlm.a.c(qlm.n0.f247680a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = a.d;
            dVarBeginStructure.getClass();
            Map map = null;
            boolean z = true;
            int i = 0;
            String str = null;
            Integer num = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    map = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), map);
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
            return new a(i, map, str, num);
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
            Lazy[] lazyArr = a.d;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f188453a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f188453a);
            }
            String str = value.f188454b;
            if (str != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
            }
            Integer num = value.f188455c;
            if (num != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.n0.f247680a, num);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: kr.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C1067a.f188456a;
        }
    }

    public /* synthetic */ a(int i, Map map, String str, Integer num) {
        if ((i & 1) == 0) {
            this.f188453a = null;
        } else {
            this.f188453a = map;
        }
        if ((i & 2) == 0) {
            this.f188454b = null;
        } else {
            this.f188454b = str;
        }
        if ((i & 4) == 0) {
            this.f188455c = null;
        } else {
            this.f188455c = num;
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
        return Intrinsics.f(this.f188453a, aVar.f188453a) && Intrinsics.f(this.f188454b, aVar.f188454b) && Intrinsics.f(this.f188455c, aVar.f188455c);
    }

    public final int hashCode() {
        Map map = this.f188453a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.f188454b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f188455c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public a(Map map, String str, Integer num) {
        this.f188453a = map;
        this.f188454b = str;
        this.f188455c = num;
    }

    public a() {
        this(null, null, null);
    }
}
