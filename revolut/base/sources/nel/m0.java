package nel;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import nel.k0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class m0 implements Serializable {
    private m0() {
    }

    public abstract l0 a();

    public static final class a extends m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f214594a;

        public a(l0 configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f214594a = configuration;
        }

        @Override // nel.m0
        public final l0 a() {
            return this.f214594a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f214594a, ((a) obj2).f214594a);
        }

        public final int hashCode() {
            return this.f214594a.hashCode();
        }

        public a() {
            this(new l0(new k0.b(0), 2));
        }
    }
}
