package w19;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0005\b¨\u0006\t"}, d2 = {"Lw19/g;", "", "<init>", "()V", "Companion", "w19/h", "b", "a", "Lw19/g$b;", "feature_lifestyle_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public abstract class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f293809a = j.c(k.PUBLICATION, new vo8.b(27));

    /* JADX INFO: renamed from: w19.g$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) g.f293809a.getValue();
        }
    }

    public static final class b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f293810b = new b();

        private b() {
        }
    }

    private g() {
    }
}
