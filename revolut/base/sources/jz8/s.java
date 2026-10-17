package jz8;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b7\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0006\u0005\u0007¨\u0006\t"}, d2 = {"Ljz8/s;", "", "<init>", "()V", "Companion", "jz8/y", "jz8/v", "jz8/b0", "a", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public abstract class s {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f179658a = yhm.j.c(yhm.k.PUBLICATION, new jxi.a(16));

    /* JADX INFO: renamed from: jz8.s$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) s.f179658a.getValue();
        }
    }

    private s() {
    }
}
