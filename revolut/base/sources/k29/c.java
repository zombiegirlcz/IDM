package k29;

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
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lk29/c;", "", "<init>", "()V", "Companion", "d", "b", "c", "a", "Lk29/c$b;", "Lk29/c$c;", "Lk29/c$d;", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@rlm.g(discriminator = "type")
@mlm.g
public abstract class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f180409a = yhm.j.c(yhm.k.PUBLICATION, new k16.d(10));

    /* JADX INFO: renamed from: k29.c$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) c.f180409a.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lk29/c$b;", "Lk29/c;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class b extends c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Lazy[] f180410h = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new k16.d(11))};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f180411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f180412c;
        public final String d;
        public final k29.a e;
        public final g f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f180413g;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f180414a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f180414a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("LISTED", aVar, 6);
                pluginGeneratedSerialDescriptor.j("header", false);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("subtitle", false);
                pluginGeneratedSerialDescriptor.j("asset", false);
                pluginGeneratedSerialDescriptor.j("cta", false);
                pluginGeneratedSerialDescriptor.j("items", false);
                pluginGeneratedSerialDescriptor.l(new k29.d());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = b.f180410h;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(k29.b.d), nlm.a.c(e.f180423a), lazyArr[5].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = b.f180410h;
                dVarBeginStructure.getClass();
                int i = 0;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                String str = null;
                k29.a aVar = null;
                g gVar = null;
                List list = null;
                boolean z = true;
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
                            str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                            i |= 4;
                            break;
                        case 3:
                            aVar = (k29.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, k29.b.d, aVar);
                            i |= 8;
                            break;
                        case 4:
                            gVar = (g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, e.f180423a, gVar);
                            i |= 16;
                            break;
                        case 5:
                            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list);
                            i |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new b(i, strDecodeStringElement, strDecodeStringElement2, str, aVar, gVar, list);
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
                Lazy[] lazyArr = b.f180410h;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f180411b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f180412c);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, value.d);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, k29.b.d, value.e);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, e.f180423a, value.f);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f180413g);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: k29.c$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f180414a;
            }
        }

        public /* synthetic */ b(int i, String str, String str2, String str3, k29.a aVar, g gVar, List list) {
            if (63 != (i & 63)) {
                j1.f(a.f180414a.getDescriptor(), i, 63);
                throw null;
            }
            this.f180411b = str;
            this.f180412c = str2;
            this.d = str3;
            this.e = aVar;
            this.f = gVar;
            this.f180413g = list;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f180411b, bVar.f180411b) && Intrinsics.f(this.f180412c, bVar.f180412c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f180413g, bVar.f180413g);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f180411b.hashCode() * 31, 31, this.f180412c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            k29.a aVar = this.e;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            g gVar = this.f;
            return this.f180413g.hashCode() + ((iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31);
        }
    }

    /* JADX INFO: renamed from: k29.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lk29/c$c;", "Lk29/c;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class C1033c extends c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] i = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new k16.d(12)), null};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f180415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f180416c;
        public final String d;
        public final k29.a e;
        public final g f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f180417g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f180418h;

        /* JADX INFO: renamed from: k29.c$c$a */
        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f180419a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f180419a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("QUIZ", aVar, 7);
                pluginGeneratedSerialDescriptor.j("header", false);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("subtitle", false);
                pluginGeneratedSerialDescriptor.j("asset", false);
                pluginGeneratedSerialDescriptor.j("cta", false);
                pluginGeneratedSerialDescriptor.j("questions", false);
                pluginGeneratedSerialDescriptor.j("revealText", false);
                pluginGeneratedSerialDescriptor.l(new k29.d());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = C1033c.i;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(k29.b.d), nlm.a.c(e.f180423a), lazyArr[5].getValue(), v1Var};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = C1033c.i;
                dVarBeginStructure.getClass();
                int i = 0;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                String str = null;
                k29.a aVar = null;
                g gVar = null;
                List list = null;
                String strDecodeStringElement3 = null;
                boolean z = true;
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
                            str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                            i |= 4;
                            break;
                        case 3:
                            aVar = (k29.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, k29.b.d, aVar);
                            i |= 8;
                            break;
                        case 4:
                            gVar = (g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, e.f180423a, gVar);
                            i |= 16;
                            break;
                        case 5:
                            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list);
                            i |= 32;
                            break;
                        case 6:
                            strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                            i |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new C1033c(i, strDecodeStringElement, strDecodeStringElement2, str, aVar, gVar, list, strDecodeStringElement3);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                C1033c value = (C1033c) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = C1033c.i;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f180415b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f180416c);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, value.d);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, k29.b.d, value.e);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, e.f180423a, value.f);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f180417g);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f180418h);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: k29.c$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f180419a;
            }
        }

        public /* synthetic */ C1033c(int i2, String str, String str2, String str3, k29.a aVar, g gVar, List list, String str4) {
            if (127 != (i2 & CertificateBody.profileType)) {
                j1.f(a.f180419a.getDescriptor(), i2, CertificateBody.profileType);
                throw null;
            }
            this.f180415b = str;
            this.f180416c = str2;
            this.d = str3;
            this.e = aVar;
            this.f = gVar;
            this.f180417g = list;
            this.f180418h = str4;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1033c)) {
                return false;
            }
            C1033c c1033c = (C1033c) obj2;
            return Intrinsics.f(this.f180415b, c1033c.f180415b) && Intrinsics.f(this.f180416c, c1033c.f180416c) && Intrinsics.f(this.d, c1033c.d) && Intrinsics.f(this.e, c1033c.e) && Intrinsics.f(this.f, c1033c.f) && Intrinsics.f(this.f180417g, c1033c.f180417g) && Intrinsics.f(this.f180418h, c1033c.f180418h);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f180415b.hashCode() * 31, 31, this.f180416c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            k29.a aVar = this.e;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            g gVar = this.f;
            return this.f180418h.hashCode() + p.a.d((iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31, this.f180417g);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lk29/c$d;", "Lk29/c;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d extends c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f180420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f180421c;
        public final String d;
        public final k29.a e;
        public final g f;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f180422a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f180422a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("SIMPLE", aVar, 5);
                pluginGeneratedSerialDescriptor.j("header", false);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("subtitle", false);
                pluginGeneratedSerialDescriptor.j("asset", false);
                pluginGeneratedSerialDescriptor.j("cta", false);
                pluginGeneratedSerialDescriptor.l(new k29.d());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(k29.b.d), nlm.a.c(e.f180423a)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                String str = null;
                k29.a aVar = null;
                g gVar = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    } else if (iD == 2) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                        i |= 4;
                    } else if (iD == 3) {
                        aVar = (k29.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, k29.b.d, aVar);
                        i |= 8;
                    } else {
                        if (iD != 4) {
                            throw new UnknownFieldException(iD);
                        }
                        gVar = (g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, e.f180423a, gVar);
                        i |= 16;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new d(i, strDecodeStringElement, strDecodeStringElement2, str, aVar, gVar);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                d value = (d) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f180420b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f180421c);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, value.d);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, k29.b.d, value.e);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, e.f180423a, value.f);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: k29.c$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f180422a;
            }
        }

        public /* synthetic */ d(int i, String str, String str2, String str3, k29.a aVar, g gVar) {
            if (31 != (i & 31)) {
                j1.f(a.f180422a.getDescriptor(), i, 31);
                throw null;
            }
            this.f180420b = str;
            this.f180421c = str2;
            this.d = str3;
            this.e = aVar;
            this.f = gVar;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.f180420b, dVar.f180420b) && Intrinsics.f(this.f180421c, dVar.f180421c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f180420b.hashCode() * 31, 31, this.f180421c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            k29.a aVar = this.e;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            g gVar = this.f;
            return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }
    }

    private c() {
    }
}
