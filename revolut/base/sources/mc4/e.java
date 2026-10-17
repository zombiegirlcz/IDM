package mc4;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f204272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f204273c;
    public final /* synthetic */ String d;

    public /* synthetic */ e(g gVar, String str, String str2, int i) {
        this.f204271a = i;
        this.f204272b = gVar;
        this.f204273c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f204271a;
        String str = this.d;
        String str2 = this.f204273c;
        g gVar = this.f204272b;
        switch (i) {
            case 0:
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "KontomatikSignInJS", a0.d.s("onTargetSelected name=", str2, ", officialName=", str), null, null, 16);
                gVar.f.invoke(str2, str);
                break;
            default:
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "KontomatikSignInJS", a0.d.s("onError exception=", str2, ", optionsJson=", str), null, null, 16);
                gVar.f204276c.invoke(str2, str, Boolean.valueOf(b.f204268a.contains(str2)));
                break;
        }
    }
}
