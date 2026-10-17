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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lft3/g;", "Lft3/q0;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class g implements q0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gt3.c f137826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final it3.k f137827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f137828c;
    public final String d;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f137829a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f137829a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("creditCard", aVar, 4);
            pluginGeneratedSerialDescriptor.j("productSubtype", true);
            pluginGeneratedSerialDescriptor.j("productMetadataType", true);
            pluginGeneratedSerialDescriptor.j("productType", true);
            pluginGeneratedSerialDescriptor.j("originalFacilityId", true);
            pluginGeneratedSerialDescriptor.l(new v("application_type"));
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = g.e;
            return new KSerializer[]{nlm.a.c((KSerializer) lazyArr[0].getValue()), nlm.a.c((KSerializer) lazyArr[1].getValue()), lazyArr[2].getValue(), nlm.a.c(v1.f247718a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = g.e;
            dVarBeginStructure.getClass();
            int i = 0;
            gt3.c cVar = null;
            it3.k kVar = null;
            j1 j1Var = null;
            String str = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    cVar = (gt3.c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), cVar);
                    i |= 1;
                } else if (iD == 1) {
                    kVar = (it3.k) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), kVar);
                    i |= 2;
                } else if (iD == 2) {
                    j1Var = (j1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), j1Var);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new g(i, cVar, kVar, j1Var, str);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            g value = (g) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = g.e;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f137826a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f137826a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f137827b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f137827b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f137828c != j1.CREDIT_CARD) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f137828c);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, value.d);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: ft3.g$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f137829a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{yhm.j.c(kVar, new fnk.a(28)), yhm.j.c(kVar, new fnk.a(29)), yhm.j.c(kVar, new f(0)), null};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: A4 */
    public final gt3.f getD() {
        return this.f137826a;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: E2, reason: from getter */
    public final j1 getF137852c() {
        return this.f137828c;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final it3.k getF137851b() {
        return this.f137827b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f137826a == gVar.f137826a && this.f137827b == gVar.f137827b;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: f4, reason: from getter */
    public final String getF137850a() {
        return this.d;
    }

    public final int hashCode() {
        gt3.c cVar = this.f137826a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        it3.k kVar = this.f137827b;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    public /* synthetic */ g(int i, gt3.c cVar, it3.k kVar, j1 j1Var, String str) {
        if ((i & 1) == 0) {
            this.f137826a = null;
        } else {
            this.f137826a = cVar;
        }
        if ((i & 2) == 0) {
            this.f137827b = null;
        } else {
            this.f137827b = kVar;
        }
        if ((i & 4) == 0) {
            this.f137828c = j1.CREDIT_CARD;
        } else {
            this.f137828c = j1Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public g(gt3.c cVar, it3.k kVar) {
        this.f137826a = cVar;
        this.f137827b = kVar;
        this.f137828c = j1.CREDIT_CARD;
    }

    public /* synthetic */ g(gt3.c cVar, it3.k kVar, int i) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : kVar);
    }
}
