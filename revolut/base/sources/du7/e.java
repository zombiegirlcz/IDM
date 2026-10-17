package du7;

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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0007\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Ldu7/e;", "", "<init>", "()V", "Companion", "c", "g", "e", "b", "d", "f", "a", "Ldu7/e$b;", "Ldu7/e$c;", "Ldu7/e$d;", "Ldu7/e$e;", "Ldu7/e$f;", "Ldu7/e$g;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g(with = du7.f.class)
public abstract class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: du7.e$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return du7.f.d;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ldu7/e$b;", "Ldu7/e;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class b extends e {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f117647a;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f117648a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f117648a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.dto.BottomSheetDto.ActionDto.Deeplink", aVar, 1);
                pluginGeneratedSerialDescriptor.j("url", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{qlm.v1.f247718a};
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
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new b(i, strDecodeStringElement);
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
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f117647a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: du7.e$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f117648a;
            }
        }

        public b(int i, String str) {
            if (1 == (i & 1)) {
                this.f117647a = str;
            } else {
                qlm.j1.f(a.f117648a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f117647a, ((b) obj2).f117647a);
        }

        public final int hashCode() {
            return this.f117647a.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldu7/e$c;", "Ldu7/e;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class c extends e {

        @NotNull
        public static final c INSTANCE = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f117649a = yhm.j.c(yhm.k.PUBLICATION, new ds7.a(11));

        private c() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f117649a.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ldu7/e$d;", "Ldu7/e;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d extends e {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f117650a;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f117651a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f117651a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.dto.BottomSheetDto.ActionDto.DynamicContactUrl", aVar, 1);
                pluginGeneratedSerialDescriptor.j("policyId", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{qlm.v1.f247718a};
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
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new d(i, strDecodeStringElement);
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
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f117650a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: du7.e$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f117651a;
            }
        }

        public d(int i, String str) {
            if (1 == (i & 1)) {
                this.f117650a = str;
            } else {
                qlm.j1.f(a.f117651a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.f117650a, ((d) obj2).f117650a);
        }

        public final int hashCode() {
            return this.f117650a.hashCode();
        }
    }

    /* JADX INFO: renamed from: du7.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ldu7/e$e;", "Ldu7/e;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class C0701e extends e {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f117652a;

        /* JADX INFO: renamed from: du7.e$e$a */
        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f117653a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f117653a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.dto.BottomSheetDto.ActionDto.LearnMore", aVar, 1);
                pluginGeneratedSerialDescriptor.j("faqKey", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{qlm.v1.f247718a};
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
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new C0701e(i, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                C0701e value = (C0701e) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f117652a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: du7.e$e$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f117653a;
            }
        }

        public C0701e(int i, String str) {
            if (1 == (i & 1)) {
                this.f117652a = str;
            } else {
                qlm.j1.f(a.f117653a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C0701e) && Intrinsics.f(this.f117652a, ((C0701e) obj2).f117652a);
        }

        public final int hashCode() {
            return this.f117652a.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldu7/e$f;", "Ldu7/e;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class f extends e {

        @NotNull
        public static final f INSTANCE = new f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f117654a = yhm.j.c(yhm.k.PUBLICATION, new ds7.a(12));

        private f() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f117654a.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ldu7/e$g;", "Ldu7/e;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class g extends e {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy[] f117655c = {yhm.j.c(yhm.k.PUBLICATION, new ds7.a(13)), null};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f117656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f117657b;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f117658a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f117658a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.dto.BottomSheetDto.ActionDto.Upgrade", aVar, 2);
                pluginGeneratedSerialDescriptor.j("planIds", false);
                pluginGeneratedSerialDescriptor.j("selectedPlanId", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{g.f117655c[0].getValue(), nlm.a.c(qlm.v1.f247718a)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = g.f117655c;
                dVarBeginStructure.getClass();
                List list = null;
                boolean z = true;
                int i = 0;
                String str = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new g(i, list, str);
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
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) g.f117655c[0].getValue(), value.f117656a);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, value.f117657b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: du7.e$g$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f117658a;
            }
        }

        public g(int i, List list, String str) {
            if (3 != (i & 3)) {
                qlm.j1.f(a.f117658a.getDescriptor(), i, 3);
                throw null;
            }
            this.f117656a = list;
            this.f117657b = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.f117656a, gVar.f117656a) && Intrinsics.f(this.f117657b, gVar.f117657b);
        }

        public final int hashCode() {
            int iHashCode = this.f117656a.hashCode() * 31;
            String str = this.f117657b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    private e() {
    }
}
