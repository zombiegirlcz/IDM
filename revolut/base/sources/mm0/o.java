package mm0;

import java.time.Clock;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f207117a;

    public static final class a extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f207118b = new a(0);

        private a() {
            super(0);
        }
    }

    public /* synthetic */ o(int i) {
        this();
    }

    public q a() {
        throw new SecurityException(p.a.p("No token for session(", getClass().getSimpleName(), ")"));
    }

    private o() {
        Clock clock = hzl.c.f157253a;
        this.f207117a = hzl.c.f157253a.millis();
    }
}
