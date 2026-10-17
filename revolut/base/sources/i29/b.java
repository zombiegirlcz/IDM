package i29;

import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
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
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Li29/b;", "", "<init>", "()V", "Companion", "b", "c", "a", "Li29/b$b;", "Li29/b$c;", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g(with = a.class)
public abstract class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: i29.b$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.d;
        }
    }

    /* JADX INFO: renamed from: i29.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Li29/b$b;", "Li29/b;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class C0906b extends b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] f = {null, null, j.c(k.PUBLICATION, new hzl.a(12)), null, null};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f157901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f157902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f157903c;
        public final String d;
        public final RevPointsTextWithLinks e;

        /* JADX INFO: renamed from: i29.b$b$a */
        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f157904a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f157904a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.lifestyle.core.impl.data.model.dto.onboarding.LifestyleOnboardingInfoStateDto.Info", aVar, 5);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("subtitle", false);
                pluginGeneratedSerialDescriptor.j("items", false);
                pluginGeneratedSerialDescriptor.j("cta", false);
                pluginGeneratedSerialDescriptor.j("disclaimer", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = C0906b.f;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, lazyArr[2].getValue(), v1Var, nlm.a.c(RevPointsTextWithLinks.a.f84053a)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = C0906b.f;
                dVarBeginStructure.getClass();
                int i = 0;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                List list = null;
                String strDecodeStringElement3 = null;
                RevPointsTextWithLinks revPointsTextWithLinks = null;
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
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                        i |= 4;
                    } else if (iD == 3) {
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                    } else {
                        if (iD != 4) {
                            throw new UnknownFieldException(iD);
                        }
                        revPointsTextWithLinks = (RevPointsTextWithLinks) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, RevPointsTextWithLinks.a.f84053a, revPointsTextWithLinks);
                        i |= 16;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new C0906b(i, strDecodeStringElement, strDecodeStringElement2, list, strDecodeStringElement3, revPointsTextWithLinks);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                C0906b value = (C0906b) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = C0906b.f;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f157901a);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f157902b);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), value.f157903c);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, RevPointsTextWithLinks.a.f84053a, value.e);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: i29.b$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f157904a;
            }
        }

        public C0906b(int i, String str, String str2, List list, String str3, RevPointsTextWithLinks revPointsTextWithLinks) {
            if (31 != (i & 31)) {
                j1.f(a.f157904a.getDescriptor(), i, 31);
                throw null;
            }
            this.f157901a = str;
            this.f157902b = str2;
            this.f157903c = list;
            this.d = str3;
            this.e = revPointsTextWithLinks;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0906b)) {
                return false;
            }
            C0906b c0906b = (C0906b) obj2;
            return Intrinsics.f(this.f157901a, c0906b.f157901a) && Intrinsics.f(this.f157902b, c0906b.f157902b) && Intrinsics.f(this.f157903c, c0906b.f157903c) && Intrinsics.f(this.d, c0906b.d) && Intrinsics.f(this.e, c0906b.e);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.d(p.a.c(this.f157901a.hashCode() * 31, 31, this.f157902b), 31, this.f157903c), 31, this.d);
            RevPointsTextWithLinks revPointsTextWithLinks = this.e;
            return iC + (revPointsTextWithLinks == null ? 0 : revPointsTextWithLinks.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li29/b$c;", "Li29/b;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final class c extends b {

        @NotNull
        public static final c INSTANCE = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f157905a = j.c(k.PUBLICATION, new hzl.a(13));

        private c() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f157905a.getValue();
        }
    }

    private b() {
    }
}
