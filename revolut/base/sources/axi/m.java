package axi;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class m implements aii.r {

    public static final class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10959a = new b();

        private b() {
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public final int hashCode() {
            return 292088866;
        }
    }

    private m() {
    }

    public static final class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Pair f10958a;

        public a(Pair pair) {
            this.f10958a = pair;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f10958a, ((a) obj2).f10958a);
        }

        public final int hashCode() {
            Pair pair = this.f10958a;
            if (pair == null) {
                return 0;
            }
            return pair.hashCode();
        }

        public a() {
            this(null);
        }
    }
}
