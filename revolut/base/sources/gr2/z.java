package gr2;

import gr2.b0;
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
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\r\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lgr2/z;", "", "<init>", "()V", "Companion", "l", "d", "k", "e", "i", "j", "f", "g", "m", "a", "h", "b", "c", "Lgr2/z$a;", "Lgr2/z$b;", "Lgr2/z$d;", "Lgr2/z$e;", "Lgr2/z$f;", "Lgr2/z$g;", "Lgr2/z$h;", "Lgr2/z$i;", "Lgr2/z$j;", "Lgr2/z$k;", "Lgr2/z$l;", "Lgr2/z$m;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@rlm.g(discriminator = "type")
@mlm.g
public abstract class z {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f145882a = yhm.j.c(yhm.k.PUBLICATION, new gla.k(24));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lgr2/z$a;", "Lgr2/z;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class a extends z {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] i = {null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new gla.k(25))};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f145883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f145884c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f145885g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f145886h;

        /* JADX INFO: renamed from: gr2.z$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0842a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0842a f145887a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C0842a c0842a = new C0842a();
                f145887a = c0842a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CELL_ACTION", c0842a, 7);
                pluginGeneratedSerialDescriptor.j("icon", true);
                pluginGeneratedSerialDescriptor.j("badge", true);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("subtitle", true);
                pluginGeneratedSerialDescriptor.j("subtitleColor", true);
                pluginGeneratedSerialDescriptor.j("deepLink", false);
                pluginGeneratedSerialDescriptor.j("tags", true);
                pluginGeneratedSerialDescriptor.l(new a0());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C0842a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = a.i;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), v1Var, nlm.a.c((KSerializer) lazyArr[6].getValue())};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = a.i;
                dVarBeginStructure.getClass();
                int i = 0;
                String str = null;
                String str2 = null;
                String strDecodeStringElement = null;
                String str3 = null;
                String str4 = null;
                String strDecodeStringElement2 = null;
                List list = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    switch (iD) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                            i |= 1;
                            break;
                        case 1:
                            str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                            i |= 2;
                            break;
                        case 2:
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                            i |= 4;
                            break;
                        case 3:
                            str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str3);
                            i |= 8;
                            break;
                        case 4:
                            str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str4);
                            i |= 16;
                            break;
                        case 5:
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                            i |= 32;
                            break;
                        case 6:
                            list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list);
                            i |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new a(i, str, str2, strDecodeStringElement, str3, str4, strDecodeStringElement2, list);
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
                Lazy[] lazyArr = a.i;
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f145883b != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f145883b);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f145884c != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f145884c);
                }
                String str = value.d;
                List list = value.f145886h;
                String str2 = value.f;
                String str3 = value.e;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, str);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str3);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
                }
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f145885g);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), list);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: gr2.z$a$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C0842a.f145887a;
            }
        }

        public /* synthetic */ a(int i2, String str, String str2, String str3, String str4, String str5, String str6, List list) {
            if (36 != (i2 & 36)) {
                j1.f(C0842a.f145887a.getDescriptor(), i2, 36);
                throw null;
            }
            if ((i2 & 1) == 0) {
                this.f145883b = null;
            } else {
                this.f145883b = str;
            }
            if ((i2 & 2) == 0) {
                this.f145884c = null;
            } else {
                this.f145884c = str2;
            }
            this.d = str3;
            if ((i2 & 8) == 0) {
                this.e = null;
            } else {
                this.e = str4;
            }
            if ((i2 & 16) == 0) {
                this.f = null;
            } else {
                this.f = str5;
            }
            this.f145885g = str6;
            if ((i2 & 64) == 0) {
                this.f145886h = null;
            } else {
                this.f145886h = list;
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
            return Intrinsics.f(this.f145883b, aVar.f145883b) && Intrinsics.f(this.f145884c, aVar.f145884c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f145885g, aVar.f145885g) && Intrinsics.f(this.f145886h, aVar.f145886h);
        }

        public final int hashCode() {
            String str = this.f145883b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f145884c;
            int iC = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
            String str3 = this.e;
            int iHashCode2 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            int iC2 = p.a.c((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f145885g);
            List list = this.f145886h;
            return iC2 + (list != null ? list.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lgr2/z$b;", "Lgr2/z;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class b extends z {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f145888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f145889c;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f145890a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f145890a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CELL_BUTTON", aVar, 2);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("deepLink", false);
                pluginGeneratedSerialDescriptor.l(new a0());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                String strDecodeStringElement2 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new b(i, strDecodeStringElement, strDecodeStringElement2);
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
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f145888b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f145889c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: gr2.z$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f145890a;
            }
        }

        public /* synthetic */ b(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(a.f145890a.getDescriptor(), i, 3);
                throw null;
            }
            this.f145888b = str;
            this.f145889c = str2;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f145888b, bVar.f145888b) && Intrinsics.f(this.f145889c, bVar.f145889c);
        }

        public final int hashCode() {
            return this.f145889c.hashCode() + (this.f145888b.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: gr2.z$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) z.f145882a.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lgr2/z$d;", "Lgr2/z;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d extends z {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f145891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f145892c;
        public final String d;
        public final String e;
        public final String f;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f145893a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f145893a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("WIDGET_COUNTER", aVar, 5);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("subtitle", true);
                pluginGeneratedSerialDescriptor.j("counterValue", false);
                pluginGeneratedSerialDescriptor.j("counterTextColor", true);
                pluginGeneratedSerialDescriptor.j("counterTextStyle", true);
                pluginGeneratedSerialDescriptor.l(new a0());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, nlm.a.c(v1Var), v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                String strDecodeStringElement = null;
                String str = null;
                String strDecodeStringElement2 = null;
                String str2 = null;
                String str3 = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                        i |= 2;
                    } else if (iD == 2) {
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                    } else if (iD == 3) {
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                        i |= 8;
                    } else {
                        if (iD != 4) {
                            throw new UnknownFieldException(iD);
                        }
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str3);
                        i |= 16;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new d(i, strDecodeStringElement, str, strDecodeStringElement2, str2, str3);
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
                String str = value.f145891b;
                String str2 = value.f;
                String str3 = value.e;
                String str4 = value.f145892c;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str4 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str4);
                }
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str3);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: gr2.z$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f145893a;
            }
        }

        public /* synthetic */ d(int i, String str, String str2, String str3, String str4, String str5) {
            if (5 != (i & 5)) {
                j1.f(a.f145893a.getDescriptor(), i, 5);
                throw null;
            }
            this.f145891b = str;
            if ((i & 2) == 0) {
                this.f145892c = null;
            } else {
                this.f145892c = str2;
            }
            this.d = str3;
            if ((i & 8) == 0) {
                this.e = null;
            } else {
                this.e = str4;
            }
            if ((i & 16) == 0) {
                this.f = null;
            } else {
                this.f = str5;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.f145891b, dVar.f145891b) && Intrinsics.f(this.f145892c, dVar.f145892c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
        }

        public final int hashCode() {
            int iHashCode = this.f145891b.hashCode() * 31;
            String str = this.f145892c;
            int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lgr2/z$e;", "Lgr2/z;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class e extends z {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f145894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f145895c;
        public final String d;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f145896a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f145896a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("WIDGET_ERROR", aVar, 3);
                pluginGeneratedSerialDescriptor.j("image", false);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("subtitle", true);
                pluginGeneratedSerialDescriptor.l(new a0());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                String strDecodeStringElement2 = null;
                String str = null;
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
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new e(i, strDecodeStringElement, strDecodeStringElement2, str);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                e value = (e) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                String str = value.f145894b;
                String str2 = value.d;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f145895c);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: gr2.z$e$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f145896a;
            }
        }

        public /* synthetic */ e(int i, String str, String str2, String str3) {
            if (3 != (i & 3)) {
                j1.f(a.f145896a.getDescriptor(), i, 3);
                throw null;
            }
            this.f145894b = str;
            this.f145895c = str2;
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.f145894b, eVar.f145894b) && Intrinsics.f(this.f145895c, eVar.f145895c) && Intrinsics.f(this.d, eVar.d);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f145894b.hashCode() * 31, 31, this.f145895c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lgr2/z$f;", "Lgr2/z;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class f extends z {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f145897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f145898c;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f145899a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f145899a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CELL_FAQ", aVar, 2);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("faqKey", false);
                pluginGeneratedSerialDescriptor.l(new a0());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                String strDecodeStringElement2 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new f(i, strDecodeStringElement, strDecodeStringElement2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                f value = (f) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f145897b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f145898c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: gr2.z$f$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f145899a;
            }
        }

        public /* synthetic */ f(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(a.f145899a.getDescriptor(), i, 3);
                throw null;
            }
            this.f145897b = str;
            this.f145898c = str2;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.f145897b, fVar.f145897b) && Intrinsics.f(this.f145898c, fVar.f145898c);
        }

        public final int hashCode() {
            return this.f145898c.hashCode() + (this.f145897b.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lgr2/z$g;", "Lgr2/z;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class g extends z {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f145900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f145901c;
        public final String d;
        public final String e;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f145902a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f145902a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CELL_FUNDS", aVar, 4);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("amount", false);
                pluginGeneratedSerialDescriptor.j("baseAmount", true);
                pluginGeneratedSerialDescriptor.j("image", true);
                pluginGeneratedSerialDescriptor.l(new a0());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var)};
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
                String str2 = null;
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
                    } else {
                        if (iD != 3) {
                            throw new UnknownFieldException(iD);
                        }
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                        i |= 8;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new g(i, strDecodeStringElement, strDecodeStringElement2, str, str2);
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
                String str = value.f145900b;
                String str2 = value.e;
                String str3 = value.d;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f145901c);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str3);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: gr2.z$g$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f145902a;
            }
        }

        public /* synthetic */ g(int i, String str, String str2, String str3, String str4) {
            if (3 != (i & 3)) {
                j1.f(a.f145902a.getDescriptor(), i, 3);
                throw null;
            }
            this.f145900b = str;
            this.f145901c = str2;
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
            if ((i & 8) == 0) {
                this.e = null;
            } else {
                this.e = str4;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.f145900b, gVar.f145900b) && Intrinsics.f(this.f145901c, gVar.f145901c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f145900b.hashCode() * 31, 31, this.f145901c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lgr2/z$h;", "Lgr2/z;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class h extends z {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f145903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f145904c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f145905g;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f145906a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f145906a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CELL_ACTION_NUMBERED", aVar, 6);
                pluginGeneratedSerialDescriptor.j("number", true);
                pluginGeneratedSerialDescriptor.j("badge", true);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("subtitle", true);
                pluginGeneratedSerialDescriptor.j("subtitleColor", true);
                pluginGeneratedSerialDescriptor.j("deepLink", false);
                pluginGeneratedSerialDescriptor.l(new a0());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                KSerializer kSerializerC = nlm.a.c(qlm.n0.f247680a);
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{kSerializerC, nlm.a.c(v1Var), v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), v1Var};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                Integer num = null;
                String str = null;
                String strDecodeStringElement = null;
                String str2 = null;
                String str3 = null;
                String strDecodeStringElement2 = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    switch (iD) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.n0.f247680a, num);
                            i |= 1;
                            break;
                        case 1:
                            str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                            i |= 2;
                            break;
                        case 2:
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                            i |= 4;
                            break;
                        case 3:
                            str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                            i |= 8;
                            break;
                        case 4:
                            str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str3);
                            i |= 16;
                            break;
                        case 5:
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                            i |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new h(i, num, str, strDecodeStringElement, str2, str3, strDecodeStringElement2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                h value = (h) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Companion companion = h.INSTANCE;
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f145903b != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.n0.f247680a, value.f145903b);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f145904c != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f145904c);
                }
                String str = value.d;
                String str2 = value.f;
                String str3 = value.e;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, str);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str3);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
                }
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f145905g);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: gr2.z$h$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f145906a;
            }
        }

        public /* synthetic */ h(int i, Integer num, String str, String str2, String str3, String str4, String str5) {
            if (36 != (i & 36)) {
                j1.f(a.f145906a.getDescriptor(), i, 36);
                throw null;
            }
            if ((i & 1) == 0) {
                this.f145903b = null;
            } else {
                this.f145903b = num;
            }
            if ((i & 2) == 0) {
                this.f145904c = null;
            } else {
                this.f145904c = str;
            }
            this.d = str2;
            if ((i & 8) == 0) {
                this.e = null;
            } else {
                this.e = str3;
            }
            if ((i & 16) == 0) {
                this.f = null;
            } else {
                this.f = str4;
            }
            this.f145905g = str5;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof h)) {
                return false;
            }
            h hVar = (h) obj2;
            return Intrinsics.f(this.f145903b, hVar.f145903b) && Intrinsics.f(this.f145904c, hVar.f145904c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f145905g, hVar.f145905g);
        }

        public final int hashCode() {
            Integer num = this.f145903b;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f145904c;
            int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return this.f145905g.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lgr2/z$i;", "Lgr2/z;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class i extends z {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Lazy[] f145907h = {null, null, yhm.j.c(yhm.k.PUBLICATION, new gla.k(26)), null, null, null};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f145908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b0 f145909c;
        public final List d;
        public final int e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f145910g;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f145911a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f145911a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("WIDGET_PROGRESSION", aVar, 6);
                pluginGeneratedSerialDescriptor.j("headerTitle", false);
                pluginGeneratedSerialDescriptor.j("headerAction", true);
                pluginGeneratedSerialDescriptor.j("steps", false);
                pluginGeneratedSerialDescriptor.j("currentStepIndex", false);
                pluginGeneratedSerialDescriptor.j("color", true);
                pluginGeneratedSerialDescriptor.j("animation", true);
                pluginGeneratedSerialDescriptor.l(new a0());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = i.f145907h;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, nlm.a.c(b0.a.f145817a), lazyArr[2].getValue(), qlm.n0.f247680a, nlm.a.c(v1Var), nlm.a.c(v1Var)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = i.f145907h;
                dVarBeginStructure.getClass();
                int i = 0;
                int iDecodeIntElement = 0;
                String strDecodeStringElement = null;
                b0 b0Var = null;
                List list = null;
                String str = null;
                String str2 = null;
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
                            b0Var = (b0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b0.a.f145817a, b0Var);
                            i |= 2;
                            break;
                        case 2:
                            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                            i |= 4;
                            break;
                        case 3:
                            iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
                            i |= 8;
                            break;
                        case 4:
                            str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str);
                            i |= 16;
                            break;
                        case 5:
                            str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str2);
                            i |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new i(i, strDecodeStringElement, b0Var, list, iDecodeIntElement, str, str2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                i value = (i) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = i.f145907h;
                String str = value.f145908b;
                String str2 = value.f145910g;
                String str3 = value.f;
                b0 b0Var = value.f145909c;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || b0Var != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, b0.a.f145817a, b0Var);
                }
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.d);
                compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, value.e);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str3);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str2);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: gr2.z$i$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f145911a;
            }
        }

        public /* synthetic */ i(int i, String str, b0 b0Var, List list, int i2, String str2, String str3) {
            if (13 != (i & 13)) {
                j1.f(a.f145911a.getDescriptor(), i, 13);
                throw null;
            }
            this.f145908b = str;
            if ((i & 2) == 0) {
                this.f145909c = null;
            } else {
                this.f145909c = b0Var;
            }
            this.d = list;
            this.e = i2;
            if ((i & 16) == 0) {
                this.f = null;
            } else {
                this.f = str2;
            }
            if ((i & 32) == 0) {
                this.f145910g = null;
            } else {
                this.f145910g = str3;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof i)) {
                return false;
            }
            i iVar = (i) obj2;
            return Intrinsics.f(this.f145908b, iVar.f145908b) && Intrinsics.f(this.f145909c, iVar.f145909c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f145910g, iVar.f145910g);
        }

        public final int hashCode() {
            int iHashCode = this.f145908b.hashCode() * 31;
            b0 b0Var = this.f145909c;
            int iB = j6.a.b(this.e, p.a.d((iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31, 31, this.d), 31);
            String str = this.f;
            int iHashCode2 = (iB + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f145910g;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lgr2/z$j;", "Lgr2/z;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class j extends z {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f145912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f145913c;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f145914a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f145914a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CELL_RESTRICTION", aVar, 2);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("icon", true);
                pluginGeneratedSerialDescriptor.l(new a0());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, nlm.a.c(v1Var)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                String str = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new j(i, strDecodeStringElement, str);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                j value = (j) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                String str = value.f145912b;
                String str2 = value.f145913c;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: gr2.z$j$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f145914a;
            }
        }

        public /* synthetic */ j(int i, String str, String str2) {
            if (1 != (i & 1)) {
                j1.f(a.f145914a.getDescriptor(), i, 1);
                throw null;
            }
            this.f145912b = str;
            if ((i & 2) == 0) {
                this.f145913c = null;
            } else {
                this.f145913c = str2;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof j)) {
                return false;
            }
            j jVar = (j) obj2;
            return Intrinsics.f(this.f145912b, jVar.f145912b) && Intrinsics.f(this.f145913c, jVar.f145913c);
        }

        public final int hashCode() {
            int iHashCode = this.f145912b.hashCode() * 31;
            String str = this.f145913c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lgr2/z$k;", "Lgr2/z;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class k extends z {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f145915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f145916c;
        public final String d;
        public final String e;
        public final String f;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f145917a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f145917a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("WIDGET_WARNING", aVar, 5);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("text", false);
                pluginGeneratedSerialDescriptor.j("actionIcon", true);
                pluginGeneratedSerialDescriptor.j("actionTitle", true);
                pluginGeneratedSerialDescriptor.j("actionDeeplink", true);
                pluginGeneratedSerialDescriptor.l(new a0());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
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
                String str2 = null;
                String str3 = null;
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
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                        i |= 8;
                    } else {
                        if (iD != 4) {
                            throw new UnknownFieldException(iD);
                        }
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str3);
                        i |= 16;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new k(i, strDecodeStringElement, strDecodeStringElement2, str, str2, str3);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                k value = (k) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                String str = value.f145915b;
                String str2 = value.f;
                String str3 = value.e;
                String str4 = value.d;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f145916c);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str4 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str4);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str3);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: gr2.z$k$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f145917a;
            }
        }

        public /* synthetic */ k(int i, String str, String str2, String str3, String str4, String str5) {
            if (3 != (i & 3)) {
                j1.f(a.f145917a.getDescriptor(), i, 3);
                throw null;
            }
            this.f145915b = str;
            this.f145916c = str2;
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
            if ((i & 8) == 0) {
                this.e = null;
            } else {
                this.e = str4;
            }
            if ((i & 16) == 0) {
                this.f = null;
            } else {
                this.f = str5;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof k)) {
                return false;
            }
            k kVar = (k) obj2;
            return Intrinsics.f(this.f145915b, kVar.f145915b) && Intrinsics.f(this.f145916c, kVar.f145916c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f145915b.hashCode() * 31, 31, this.f145916c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lgr2/z$l;", "Lgr2/z;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class l extends z {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f145918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f145919c;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f145920a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f145920a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("WIDGET_TEXT", aVar, 2);
                pluginGeneratedSerialDescriptor.j("title", true);
                pluginGeneratedSerialDescriptor.j("text", false);
                pluginGeneratedSerialDescriptor.l(new a0());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{nlm.a.c(v1Var), v1Var};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String str = null;
                boolean z = true;
                int i = 0;
                String strDecodeStringElement = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new l(i, str, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                l value = (l) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Companion companion = l.INSTANCE;
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f145918b != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f145918b);
                }
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f145919c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: gr2.z$l$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f145920a;
            }
        }

        public /* synthetic */ l(int i, String str, String str2) {
            if (2 != (i & 2)) {
                j1.f(a.f145920a.getDescriptor(), i, 2);
                throw null;
            }
            if ((i & 1) == 0) {
                this.f145918b = null;
            } else {
                this.f145918b = str;
            }
            this.f145919c = str2;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof l)) {
                return false;
            }
            l lVar = (l) obj2;
            return Intrinsics.f(this.f145918b, lVar.f145918b) && Intrinsics.f(this.f145919c, lVar.f145919c);
        }

        public final int hashCode() {
            String str = this.f145918b;
            return this.f145919c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lgr2/z$m;", "Lgr2/z;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class m extends z {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f145921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f145922c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f145923g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f145924h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f145925j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f145926l;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f145927a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f145927a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CELL_TRANSACTION", aVar, 11);
                pluginGeneratedSerialDescriptor.j("image", true);
                pluginGeneratedSerialDescriptor.j("transactionIcon", true);
                pluginGeneratedSerialDescriptor.j("icon", true);
                pluginGeneratedSerialDescriptor.j("badge", true);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("subtitle", true);
                pluginGeneratedSerialDescriptor.j("amount", false);
                pluginGeneratedSerialDescriptor.j("baseAmount", true);
                pluginGeneratedSerialDescriptor.j("deepLink", true);
                pluginGeneratedSerialDescriptor.j("status", true);
                pluginGeneratedSerialDescriptor.j("statusColor", true);
                pluginGeneratedSerialDescriptor.l(new a0());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), v1Var, nlm.a.c(v1Var), v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                boolean z;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String strDecodeStringElement = null;
                String str7 = null;
                String strDecodeStringElement2 = null;
                String str8 = null;
                String str9 = null;
                int i = 0;
                boolean z3 = true;
                while (z3) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    switch (iD) {
                        case -1:
                            z3 = false;
                            continue;
                        case 0:
                            z = z3;
                            str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str3);
                            i |= 1;
                            break;
                        case 1:
                            z = z3;
                            str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str4);
                            i |= 2;
                            break;
                        case 2:
                            z = z3;
                            str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str5);
                            i |= 4;
                            break;
                        case 3:
                            z = z3;
                            str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str6);
                            i |= 8;
                            break;
                        case 4:
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                            i |= 16;
                            continue;
                        case 5:
                            z = z3;
                            str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str7);
                            i |= 32;
                            break;
                        case 6:
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                            i |= 64;
                            continue;
                        case 7:
                            z = z3;
                            str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str8);
                            i |= 128;
                            break;
                        case 8:
                            z = z3;
                            str9 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str9);
                            i |= 256;
                            break;
                        case 9:
                            z = z3;
                            str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, v1.f247718a, str);
                            i |= 512;
                            break;
                        case 10:
                            z = z3;
                            str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, v1.f247718a, str2);
                            i |= 1024;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                    z3 = z;
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new m(i, str3, str4, str5, str6, strDecodeStringElement, str7, strDecodeStringElement2, str8, str9, str, str2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                m value = (m) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Companion companion = m.INSTANCE;
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f145921b != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f145921b);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f145922c != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f145922c);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, value.d);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.e != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, value.e);
                }
                String str = value.f;
                String str2 = value.f145926l;
                String str3 = value.k;
                String str4 = value.f145925j;
                String str5 = value.i;
                String str6 = value.f145923g;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, str);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str6 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str6);
                }
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f145924h);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str5 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str5);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str4 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str4);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, v1.f247718a, str3);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, v1.f247718a, str2);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: gr2.z$m$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f145927a;
            }
        }

        public /* synthetic */ m(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            if (80 != (i & 80)) {
                j1.f(a.f145927a.getDescriptor(), i, 80);
                throw null;
            }
            if ((i & 1) == 0) {
                this.f145921b = null;
            } else {
                this.f145921b = str;
            }
            if ((i & 2) == 0) {
                this.f145922c = null;
            } else {
                this.f145922c = str2;
            }
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
            if ((i & 8) == 0) {
                this.e = null;
            } else {
                this.e = str4;
            }
            this.f = str5;
            if ((i & 32) == 0) {
                this.f145923g = null;
            } else {
                this.f145923g = str6;
            }
            this.f145924h = str7;
            if ((i & 128) == 0) {
                this.i = null;
            } else {
                this.i = str8;
            }
            if ((i & 256) == 0) {
                this.f145925j = null;
            } else {
                this.f145925j = str9;
            }
            if ((i & 512) == 0) {
                this.k = null;
            } else {
                this.k = str10;
            }
            if ((i & 1024) == 0) {
                this.f145926l = null;
            } else {
                this.f145926l = str11;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof m)) {
                return false;
            }
            m mVar = (m) obj2;
            return Intrinsics.f(this.f145921b, mVar.f145921b) && Intrinsics.f(this.f145922c, mVar.f145922c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f145923g, mVar.f145923g) && Intrinsics.f(this.f145924h, mVar.f145924h) && Intrinsics.f(this.i, mVar.i) && Intrinsics.f(this.f145925j, mVar.f145925j) && Intrinsics.f(this.k, mVar.k) && Intrinsics.f(this.f145926l, mVar.f145926l);
        }

        public final int hashCode() {
            String str = this.f145921b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f145922c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int iC = p.a.c((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f);
            String str5 = this.f145923g;
            int iC2 = p.a.c((iC + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f145924h);
            String str6 = this.i;
            int iHashCode4 = (iC2 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f145925j;
            int iHashCode5 = (iHashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.k;
            int iHashCode6 = (iHashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.f145926l;
            return iHashCode6 + (str9 != null ? str9.hashCode() : 0);
        }
    }

    private z() {
    }
}
