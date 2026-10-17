package yfe;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b7\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0007"}, d2 = {"Lyfe/t1;", "", "<init>", "()V", "Companion", "yfe/w1", "a", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public abstract class t1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f313307a = yhm.j.c(yhm.k.PUBLICATION, new yfd.c(29));

    /* JADX INFO: renamed from: yfe.t1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) t1.f313307a.getValue();
        }
    }

    private t1() {
    }
}
