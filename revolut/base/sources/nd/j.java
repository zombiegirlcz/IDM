package nd;

import kl.b0;
import kl.c0;

/* JADX INFO: loaded from: classes17.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f214261b = new j(new k(0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f214262c = new j(new o());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f214263a;

    static {
        new j(new k(1));
        new j(new p());
        new j(new l());
        int i = 0;
        new j(new n(i));
        new j(new m(i));
    }

    public j(q qVar) {
        if (ed.d.a()) {
            this.f214263a = new kpj.f(qVar, 20);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f214263a = new b0(qVar, 21);
        } else {
            this.f214263a = new c0(qVar, 23);
        }
    }
}
