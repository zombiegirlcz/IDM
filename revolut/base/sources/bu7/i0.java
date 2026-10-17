package bu7;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0005\u0006¨\u0006\b"}, d2 = {"Lbu7/i0;", "", "<init>", "()V", "Companion", "bu7/l0", "bu7/o0", "a", "feature_insurance_embedded_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public abstract class i0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f18717a = yhm.j.c(yhm.k.PUBLICATION, new y(3));

    /* JADX INFO: renamed from: bu7.i0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) i0.f18717a.getValue();
        }
    }

    private i0() {
    }
}
