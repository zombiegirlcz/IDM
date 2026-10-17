package jfb;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f173853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f173854c;

    public /* synthetic */ z0(c1 c1Var, String str, int i) {
        this.f173852a = i;
        this.f173853b = c1Var;
        this.f173854c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f173852a;
        String str = this.f173854c;
        c1 c1Var = this.f173853b;
        switch (i) {
            case 0:
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "ReverywhereJS", "didInit", null, null, 16);
                c1Var.f173793c.invoke(str);
                break;
            default:
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "ReverywhereJS", "didInitPayment", null, null, 16);
                c1Var.e.invoke(str);
                break;
        }
    }
}
