package com.google.android.material.search;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49129b;

    public /* synthetic */ m(Object obj2, int i) {
        this.f49128a = i;
        this.f49129b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49128a) {
            case 0:
                ((SearchViewAnimationHelper) this.f49129b).lambda$startShowAnimationExpand$0();
                break;
            case 1:
                ((SearchViewAnimationHelper) this.f49129b).lambda$startShowAnimationTranslate$1();
                break;
            default:
                ((SearchBar) this.f49129b).lambda$startOnLoadAnimation$1();
                break;
        }
    }
}
