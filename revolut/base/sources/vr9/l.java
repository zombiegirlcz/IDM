package vr9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l {

    @NotNull
    public static final b Companion = new b();

    public static final class a extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f291528a;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && this.f291528a == ((a) obj2).f291528a;
        }

        public final int hashCode() {
            return this.f291528a.hashCode();
        }

        public a(o selectedTab) {
            Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
            this.f291528a = selectedTab;
        }

        public /* synthetic */ a(int i) {
            this(o.OWES);
        }
    }

    public static final class b {
        private b() {
        }

        public static l a(hr9.a type) {
            Intrinsics.checkNotNullParameter(type, "type");
            int i = m.f291531a[type.ordinal()];
            if (i == 1) {
                return d.f291530a;
            }
            if (i == 2) {
                return c.f291529a;
            }
            if (i == 3) {
                return new a(0);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class c extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f291529a = new c();

        private c() {
        }
    }

    public static final class d extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f291530a = new d();

        private d() {
        }
    }

    private l() {
    }
}
