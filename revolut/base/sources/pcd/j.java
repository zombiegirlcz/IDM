package pcd;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j {

    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f234864a = new a();

        private a() {
        }
    }

    public static final class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f234865a = new b();

        private b() {
        }
    }

    public static final class c extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f234866a = new c();

        private c() {
        }
    }

    public static final class d extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f234867a = new d();

        private d() {
        }
    }

    private j() {
    }

    public final pcd.b a() {
        if (this instanceof c) {
            return pcd.b.PERSONAL_JOINT;
        }
        if (this instanceof d) {
            return pcd.b.PERSONAL;
        }
        if ((this instanceof l) || (this instanceof b)) {
            return pcd.b.YOUTH;
        }
        if ((this instanceof k) || (this instanceof a)) {
            return pcd.b.PERSONAL_UNDER_18;
        }
        throw new NoWhenBranchMatchedException();
    }
}
