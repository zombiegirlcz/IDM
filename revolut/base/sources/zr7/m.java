package zr7;

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
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lzr7/m;", "", "<init>", "()V", "Companion", "c", "d", "b", "a", "Lzr7/m$b;", "Lzr7/m$c;", "Lzr7/m$d;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@rlm.g(discriminator = "type")
@mlm.g
public abstract class m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f324637a = yhm.j.c(yhm.k.PUBLICATION, new zr4.b(14));

    /* JADX INFO: renamed from: zr7.m$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) m.f324637a.getValue();
        }
    }

    private m() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lzr7/m$b;", "Lzr7/m;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class b extends m {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f324638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f324639c;
        public final String d;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f324640a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f324640a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PLAN_HEADER", aVar, 3);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("description", false);
                pluginGeneratedSerialDescriptor.l(new n());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, v1Var};
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
                String strDecodeStringElement3 = null;
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
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new b(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3);
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
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f324638b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f324639c);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: zr7.m$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f324640a;
            }
        }

        public /* synthetic */ b(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                j1.f(a.f324640a.getDescriptor(), i, 7);
                throw null;
            }
            this.f324638b = str;
            this.f324639c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f324638b, bVar.f324638b) && Intrinsics.f(this.f324639c, bVar.f324639c) && Intrinsics.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(this.f324638b.hashCode() * 31, 31, this.f324639c);
        }

        public b(String id10, String title, String description) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f324638b = id10;
            this.f324639c = title;
            this.d = description;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lzr7/m$c;", "Lzr7/m;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class c extends m {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f324641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f324642c;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f324643a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f324643a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ROW", aVar, 2);
                pluginGeneratedSerialDescriptor.j("name", false);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.l(new n());
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
                return new c(i, strDecodeStringElement, strDecodeStringElement2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                c value = (c) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f324641b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f324642c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: zr7.m$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f324643a;
            }
        }

        public /* synthetic */ c(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(a.f324643a.getDescriptor(), i, 3);
                throw null;
            }
            this.f324641b = str;
            this.f324642c = str2;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.f324641b, cVar.f324641b) && Intrinsics.f(this.f324642c, cVar.f324642c);
        }

        public final int hashCode() {
            return this.f324642c.hashCode() + (this.f324641b.hashCode() * 31);
        }

        public c(String name, String title) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f324641b = name;
            this.f324642c = title;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lzr7/m$d;", "Lzr7/m;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d extends m {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f324644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f324645c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f324646g;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f324647a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f324647a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ROW_NOTE", aVar, 6);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("titleIcon", false);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("titleStyle", false);
                pluginGeneratedSerialDescriptor.j("titleColor", false);
                pluginGeneratedSerialDescriptor.j("titleIconColor", false);
                pluginGeneratedSerialDescriptor.l(new n());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, nlm.a.c(v1Var), v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
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
                String str4 = null;
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
                            str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                            i |= 2;
                            break;
                        case 2:
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
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
                            str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str4);
                            i |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new d(strDecodeStringElement, i, str, strDecodeStringElement2, str2, str3, str4);
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
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f324644b);
                v1 v1Var = v1.f247718a;
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f324645c);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, value.e);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.f);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, value.f324646g);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: zr7.m$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f324647a;
            }
        }

        public /* synthetic */ d(String str, int i, String str2, String str3, String str4, String str5, String str6) {
            if (63 != (i & 63)) {
                j1.f(a.f324647a.getDescriptor(), i, 63);
                throw null;
            }
            this.f324644b = str;
            this.f324645c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.f324646g = str6;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.f324644b, dVar.f324644b) && Intrinsics.f(this.f324645c, dVar.f324645c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f324646g, dVar.f324646g);
        }

        public final int hashCode() {
            int iHashCode = this.f324644b.hashCode() * 31;
            String str = this.f324645c;
            int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f324646g;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public d(String id10, String str, String title, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f324644b = id10;
            this.f324645c = str;
            this.d = title;
            this.e = str2;
            this.f = str3;
            this.f324646g = str4;
        }
    }
}
