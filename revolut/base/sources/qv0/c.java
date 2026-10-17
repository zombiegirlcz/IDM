package qv0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class c {

    public static final class a extends c implements qv0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f249510a;

        public a() {
            this(0);
        }

        @Override // qv0.a
        public final h a() {
            return this.f249510a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && this.f249510a == ((a) obj2).f249510a;
        }

        public final int hashCode() {
            return this.f249510a.hashCode();
        }

        public a(h cornerRadius) {
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            this.f249510a = cornerRadius;
        }

        public /* synthetic */ a(int i) {
            this(h.EXTRA_LARGE);
        }
    }

    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f249511a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: qv0.c$c, reason: collision with other inner class name */
    public static final class C1364c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1364c f249512a = new C1364c();

        private C1364c() {
        }
    }

    public static final class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f249513a = new d();

        private d() {
        }
    }

    public static final class e extends c implements qv0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f249514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f249515b;

        public e() {
            this((h) null, 3);
        }

        @Override // qv0.a
        public final h a() {
            return this.f249514a;
        }

        @Override // qv0.c
        public final boolean b() {
            return this.f249515b;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return this.f249514a == eVar.f249514a && this.f249515b == eVar.f249515b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f249515b) + (this.f249514a.hashCode() * 31);
        }

        public e(h cornerRadius, boolean z) {
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            this.f249514a = cornerRadius;
            this.f249515b = z;
        }

        public /* synthetic */ e(h hVar, int i) {
            this((i & 1) != 0 ? h.EXTRA_LARGE : hVar, false);
        }
    }

    public static final class f extends c implements qv0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f249516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f249517b;

        public f() {
            this((h) null, 3);
        }

        @Override // qv0.a
        public final h a() {
            return this.f249516a;
        }

        @Override // qv0.c
        public final boolean b() {
            return this.f249517b;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return this.f249516a == fVar.f249516a && this.f249517b == fVar.f249517b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f249517b) + (this.f249516a.hashCode() * 31);
        }

        public f(h cornerRadius, boolean z) {
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            this.f249516a = cornerRadius;
            this.f249517b = z;
        }

        public /* synthetic */ f(h hVar, int i) {
            this((i & 1) != 0 ? h.EXTRA_LARGE : hVar, false);
        }
    }

    private c() {
    }

    public boolean b() {
        return false;
    }
}
