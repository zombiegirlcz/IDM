package yt0;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f316538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f316539c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ lki.s e;

    public /* synthetic */ f(h hVar, View view, ViewGroup viewGroup, lki.s sVar, int i) {
        this.f316537a = i;
        this.f316538b = hVar;
        this.f316539c = view;
        this.d = viewGroup;
        this.e = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f316537a) {
            case 0:
                h hVar = this.f316538b;
                hVar.f316561a.setVisibility(0);
                hVar.v(this.f316539c, this.d, false, this.e);
                break;
            default:
                h hVar2 = this.f316538b;
                hVar2.f316561a.setVisibility(0);
                hVar2.v(this.f316539c, this.d, false, this.e);
                break;
        }
    }
}
