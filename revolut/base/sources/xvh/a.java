package xvh;

import yvh.d;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: xvh.a$a, reason: collision with other inner class name */
    public static final class C1716a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1716a f309267a = new C1716a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f309268b = d.JOINT;

        private C1716a() {
        }

        @Override // xvh.a
        public final d a() {
            return f309268b;
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f309269a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f309270b = d.PERSONAL;

        private b() {
        }

        @Override // xvh.a
        public final d a() {
            return f309270b;
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f309271a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f309272b = d.PRO;

        private c() {
        }

        @Override // xvh.a
        public final d a() {
            return f309272b;
        }
    }

    private a() {
    }

    public abstract d a();
}
