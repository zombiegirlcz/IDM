package jfb;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f173783b;

    public /* synthetic */ a1(c1 c1Var, int i) {
        this.f173782a = i;
        this.f173783b = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f173782a;
        c1 c1Var = this.f173783b;
        switch (i) {
            case 0:
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "ReverywhereJS", "closeApp", null, null, 16);
                c1Var.f173792b.invoke();
                break;
            default:
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "ReverywhereJS", "didSessionExpire", null, null, 16);
                c1Var.d.invoke();
                break;
        }
    }
}
