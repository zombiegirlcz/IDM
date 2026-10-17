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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lft3/e0;", "Lft3/q0;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class e0 implements q0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f137815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gt3.f f137816c;
    public final it3.k d;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f137817a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f137817a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("nonEmbeddedCreditInsuranceCc", aVar, 4);
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
            Lazy[] lazyArr = e0.e;
            return new KSerializer[]{nlm.a.c(v1.f247718a), lazyArr[1].getValue(), nlm.a.c((KSerializer) lazyArr[2].getValue()), nlm.a.c((KSerializer) lazyArr[3].getValue())};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = e0.e;
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
            return new e0(i, j1Var, fVar, kVar, str);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            e0 value = (e0) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = e0.e;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f137814a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f137814a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f137815b != j1.NON_EMBEDDED_CREDIT_INSURANCE_CC) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f137815b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f137816c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f137816c);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: ft3.e0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f137817a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new f(23)), yhm.j.c(kVar, new f(24)), yhm.j.c(kVar, new f(25))};
    }

    public /* synthetic */ e0(int i, j1 j1Var, gt3.f fVar, it3.k kVar, String str) {
        if ((i & 1) == 0) {
            this.f137814a = null;
        } else {
            this.f137814a = str;
        }
        this.f137815b = (i & 2) == 0 ? j1.NON_EMBEDDED_CREDIT_INSURANCE_CC : j1Var;
        if ((i & 4) == 0) {
            this.f137816c = null;
        } else {
            this.f137816c = fVar;
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
        return this.f137816c;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: E2, reason: from getter */
    public final j1 getF137852c() {
        return this.f137815b;
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
        return (obj2 instanceof e0) && Intrinsics.f(this.f137814a, ((e0) obj2).f137814a);
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: f4, reason: from getter */
    public final String getF137850a() {
        return this.f137814a;
    }

    public final int hashCode() {
        String str = this.f137814a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public e0(String str) {
        this.f137814a = str;
        this.f137815b = j1.NON_EMBEDDED_CREDIT_INSURANCE_CC;
    }

    public e0() {
        this(null);
    }
}
