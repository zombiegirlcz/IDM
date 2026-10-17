package k29;

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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lk29/a;", "", "<init>", "()V", "Companion", "b", "d", "c", "a", "Lk29/a$b;", "Lk29/a$c;", "Lk29/a$d;", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g(with = k29.b.class)
public abstract class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: k29.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return k29.b.d;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lk29/a$b;", "Lk29/a;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f180402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f180403b;

        /* JADX INFO: renamed from: k29.a$b$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1029a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1029a f180404a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C1029a c1029a = new C1029a();
                f180404a = c1029a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.lifestyle.core.impl.data.model.dto.wrapped.LifestyleWrappedCardAssetDto.Image", c1029a, 2);
                pluginGeneratedSerialDescriptor.j("primary", false);
                pluginGeneratedSerialDescriptor.j("dark", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C1029a() {
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
                return new b(i, strDecodeStringElement, str);
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
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f180402a);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f180403b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: k29.a$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C1029a.f180404a;
            }
        }

        public b(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(C1029a.f180404a.getDescriptor(), i, 3);
                throw null;
            }
            this.f180402a = str;
            this.f180403b = str2;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f180402a, bVar.f180402a) && Intrinsics.f(this.f180403b, bVar.f180403b);
        }

        public final int hashCode() {
            int iHashCode = this.f180402a.hashCode() * 31;
            String str = this.f180403b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk29/a$c;", "Lk29/a;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class c extends a {

        @NotNull
        public static final c INSTANCE = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f180405a = yhm.j.c(yhm.k.PUBLICATION, new k16.d(9));

        private c() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f180405a.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lk29/a$d;", "Lk29/a;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d extends a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f180406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f180407b;

        /* JADX INFO: renamed from: k29.a$d$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1031a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1031a f180408a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C1031a c1031a = new C1031a();
                f180408a = c1031a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.lifestyle.core.impl.data.model.dto.wrapped.LifestyleWrappedCardAssetDto.Video", c1031a, 2);
                pluginGeneratedSerialDescriptor.j("primary", false);
                pluginGeneratedSerialDescriptor.j("dark", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C1031a() {
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
                return new d(i, strDecodeStringElement, str);
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
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f180406a);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f180407b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: k29.a$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C1031a.f180408a;
            }
        }

        public d(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(C1031a.f180408a.getDescriptor(), i, 3);
                throw null;
            }
            this.f180406a = str;
            this.f180407b = str2;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.f180406a, dVar.f180406a) && Intrinsics.f(this.f180407b, dVar.f180407b);
        }

        public final int hashCode() {
            int iHashCode = this.f180406a.hashCode() * 31;
            String str = this.f180407b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    private a() {
    }
}
