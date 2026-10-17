package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseShot f49145b;

    public /* synthetic */ a(BaseShot baseShot, int i) {
        this.f49144a = i;
        this.f49145b = baseShot;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49144a) {
            case 0:
                BaseShot.onDetachedFromWindow$lambda$0(this.f49145b);
                break;
            default:
                this.f49145b.animateContentIn();
                break;
        }
    }
}
