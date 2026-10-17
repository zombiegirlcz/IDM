package nel;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class k0 implements Serializable {

    public static final class b extends k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f214585a;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f214585a, ((b) obj2).f214585a);
        }

        public final int hashCode() {
            return this.f214585a.hashCode();
        }

        public b(int i) {
            c fallbackSortingOption = new c(0);
            Intrinsics.checkNotNullParameter(fallbackSortingOption, "fallbackSortingOption");
            this.f214585a = fallbackSortingOption;
        }
    }

    public static final class c extends k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f214586a;

        public c() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && this.f214586a == ((c) obj2).f214586a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f214586a);
        }

        public c(int i) {
            this.f214586a = true;
        }
    }

    private k0() {
    }

    public static final class a extends k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f214584a;

        public a(int i) {
            this.f214584a = true;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && this.f214584a == ((a) obj2).f214584a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f214584a);
        }

        public a() {
            this(0);
        }
    }
}
