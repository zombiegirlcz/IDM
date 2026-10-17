package qf;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f245201c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f245202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f245203b = false;

    public a() {
        b bVar;
        synchronized (b.class) {
            try {
                if (b.f245204b == null) {
                    b.f245204b = new b(0);
                }
                bVar = b.f245204b;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        this.f245202a = bVar;
    }

    public static a d() {
        if (f245201c == null) {
            synchronized (a.class) {
                try {
                    if (f245201c == null) {
                        f245201c = new a();
                    }
                } finally {
                }
            }
        }
        return f245201c;
    }

    public final void a(String str) {
        if (this.f245203b) {
            this.f245202a.getClass();
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.f245203b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.f245202a.getClass();
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.f245203b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.f245202a.getClass();
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.f245203b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.f245202a.getClass();
        }
    }

    public final void f(String str) {
        if (this.f245203b) {
            this.f245202a.getClass();
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.f245203b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.f245202a.getClass();
        }
    }
}
