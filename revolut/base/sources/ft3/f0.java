package ft3;

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
import qlm.v1;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lft3/f0;", "Lft3/q0;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class f0 implements q0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f137822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gt3.f f137823c;
    public final it3.k d;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f137824a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f137824a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("nonEmbeddedCreditInsuranceFtc", aVar, 4);
            pluginGeneratedSerialDescriptor.j("originalFacilityId", true);
            pluginGeneratedSerialDescriptor.j("productType", true);
            pluginGeneratedSerialDescriptor.j("productSubtype", true);
            pluginGeneratedSerialDescriptor.j("productMetadataType", true);
            pluginGeneratedSerialDescriptor.l(new v("application_type"));
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = f0.e;
            return new KSerializer[]{nlm.a.c(v1.f247718a), lazyArr[1].getValue(), nlm.a.c((KSerializer) lazyArr[2].getValue()), nlm.a.c((KSerializer) lazyArr[3].getValue())};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = f0.e;
            dVarBeginStructure.getClass();
            int i = 0;
            j1 j1Var = null;
            gt3.f fVar = null;
            it3.k kVar = null;
            String str = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    j1Var = (j1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), j1Var);
                    i |= 2;
                } else if (iD == 2) {
                    fVar = (gt3.f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), fVar);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    kVar = (it3.k) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), kVar);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new f0(i, j1Var, fVar, kVar, str);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            f0 value = (f0) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = f0.e;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f137821a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f137821a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f137822b != j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f137822b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f137823c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f137823c);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: ft3.f0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f137824a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new f(26)), yhm.j.c(kVar, new f(27)), yhm.j.c(kVar, new f(28))};
    }

    public /* synthetic */ f0(int i, j1 j1Var, gt3.f fVar, it3.k kVar, String str) {
        if ((i & 1) == 0) {
            this.f137821a = null;
        } else {
            this.f137821a = str;
        }
        this.f137822b = (i & 2) == 0 ? j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC : j1Var;
        if ((i & 4) == 0) {
            this.f137823c = null;
        } else {
            this.f137823c = fVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = kVar;
        }
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: A4, reason: from getter */
    public final gt3.f getD() {
        return this.f137823c;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: E2, reason: from getter */
    public final j1 getF137852c() {
        return this.f137822b;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final it3.k getF137851b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f0) && Intrinsics.f(this.f137821a, ((f0) obj2).f137821a);
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: f4, reason: from getter */
    public final String getF137850a() {
        return this.f137821a;
    }

    public final int hashCode() {
        String str = this.f137821a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public f0(String str) {
        this.f137821a = str;
        this.f137822b = j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC;
    }

    public f0() {
        this(null);
    }
}
