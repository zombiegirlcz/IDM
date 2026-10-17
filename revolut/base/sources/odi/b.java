package odi;

import ie0.o;
import ip0.v7;
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
import ob1.e;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.t0;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lodi/b;", "", "<init>", "()V", "Companion", "b", "a", "c", "Lodi/b$a;", "Lodi/b$b;", "feature_rev_points_pocket_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g(with = c.class)
public abstract class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lodi/b$a;", "Lodi/b;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_rev_points_pocket_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy[] f224479b = {j.c(k.PUBLICATION, new e(18))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ddi.e f224480a;

        /* JADX INFO: renamed from: odi.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1246a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1246a f224481a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C1246a c1246a = new C1246a();
                f224481a = c1246a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature_rev_points_pocket_impl.network.model.RevPointsPocketDto.Absent", c1246a, 1);
                pluginGeneratedSerialDescriptor.j("state", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C1246a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{a.f224479b[0].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = a.f224479b;
                dVarBeginStructure.getClass();
                ddi.e eVar = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        eVar = (ddi.e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), eVar);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new a(i, eVar);
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
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (h) a.f224479b[0].getValue(), value.f224480a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: odi.b$a$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C1246a.f224481a;
            }
        }

        public a(int i, ddi.e eVar) {
            if (1 == (i & 1)) {
                this.f224480a = eVar;
            } else {
                j1.f(C1246a.f224481a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && this.f224480a == ((a) obj2).f224480a;
        }

        public final int hashCode() {
            return this.f224480a.hashCode();
        }
    }

    /* JADX INFO: renamed from: odi.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lodi/b$b;", "Lodi/b;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_rev_points_pocket_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class C1248b extends b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Lazy[] f224482h = {null, null, j.c(k.PUBLICATION, new e(19)), null, null, null, null};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f224483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f224484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ddi.e f224485c;
        public final long d;
        public final dj0.d e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f224486g;

        /* JADX INFO: renamed from: odi.b$b$a */
        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f224487a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f224487a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature_rev_points_pocket_impl.network.model.RevPointsPocketDto.Active", aVar, 7);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("name", false);
                pluginGeneratedSerialDescriptor.j("state", false);
                pluginGeneratedSerialDescriptor.j("createdDate", false);
                pluginGeneratedSerialDescriptor.j("balance", false);
                pluginGeneratedSerialDescriptor.j("totalPointsEarned", false);
                pluginGeneratedSerialDescriptor.j("pointsEarnedThisMonth", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = C1248b.f224482h;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, lazyArr[2].getValue(), t0.f247706a, o.f160615a, nlm.a.c(v1Var), nlm.a.c(v1Var)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = C1248b.f224482h;
                dVarBeginStructure.getClass();
                String str = null;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                ddi.e eVar = null;
                dj0.d dVar = null;
                long jDecodeLongElement = 0;
                int i = 0;
                boolean z = true;
                String str2 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    switch (iD) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                            i |= 1;
                            break;
                        case 1:
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i |= 2;
                            break;
                        case 2:
                            eVar = (ddi.e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), eVar);
                            i |= 4;
                            break;
                        case 3:
                            jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
                            i |= 8;
                            break;
                        case 4:
                            dVar = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, o.f160615a, dVar);
                            i |= 16;
                            break;
                        case 5:
                            str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str);
                            i |= 32;
                            break;
                        case 6:
                            str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str2);
                            i |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new C1248b(i, strDecodeStringElement, strDecodeStringElement2, eVar, jDecodeLongElement, dVar, str, str2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                C1248b value = (C1248b) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = C1248b.f224482h;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f224483a);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f224484b);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), value.f224485c);
                compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.d);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, o.f160615a, value.e);
                v1 v1Var = v1.f247718a;
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, value.f);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, value.f224486g);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: odi.b$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f224487a;
            }
        }

        public C1248b(int i, String str, String str2, ddi.e eVar, long j2, dj0.d dVar, String str3, String str4) {
            if (127 != (i & CertificateBody.profileType)) {
                j1.f(a.f224487a.getDescriptor(), i, CertificateBody.profileType);
                throw null;
            }
            this.f224483a = str;
            this.f224484b = str2;
            this.f224485c = eVar;
            this.d = j2;
            this.e = dVar;
            this.f = str3;
            this.f224486g = str4;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1248b)) {
                return false;
            }
            C1248b c1248b = (C1248b) obj2;
            return Intrinsics.f(this.f224483a, c1248b.f224483a) && Intrinsics.f(this.f224484b, c1248b.f224484b) && this.f224485c == c1248b.f224485c && this.d == c1248b.d && Intrinsics.f(this.e, c1248b.e) && Intrinsics.f(this.f, c1248b.f) && Intrinsics.f(this.f224486g, c1248b.f224486g);
        }

        public final int hashCode() {
            int iC = v7.c(a0.d.c((this.f224485c.hashCode() + p.a.c(this.f224483a.hashCode() * 31, 31, this.f224484b)) * 31, 31, this.d), 31, this.e);
            String str = this.f;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f224486g;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: odi.b$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return c.d;
        }
    }

    private b() {
    }
}
