package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public abstract class u {

    public static final class a extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f54793b;

        public a() {
            this(0, 3);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.f54792a == aVar.f54792a && this.f54793b == aVar.f54793b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f54793b) + (Integer.hashCode(this.f54792a) * 31);
        }

        public a(int i, boolean z) {
            this.f54792a = i;
            this.f54793b = z;
        }

        public /* synthetic */ a(int i, int i2) {
            this((i2 & 1) != 0 ? 4 : i, false);
        }
    }

    public static final class b extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f54794a = new b();

        private b() {
        }
    }

    private u() {
    }
}
