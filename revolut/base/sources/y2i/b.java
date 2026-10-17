package y2i;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f310664a = new a();

        private a() {
        }

        @Override // y2i.b
        public final String a() {
            return "STOP_LOSS";
        }
    }

    /* JADX INFO: renamed from: y2i.b$b, reason: collision with other inner class name */
    public static final class C1728b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1728b f310665a = new C1728b();

        private C1728b() {
        }

        @Override // y2i.b
        public final String a() {
            return "TAKE_PROFIT";
        }
    }

    private b() {
    }

    public abstract String a();
}
