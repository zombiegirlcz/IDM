package com.google.android.material.search;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f49119b;

    public /* synthetic */ g(SearchView searchView, int i) {
        this.f49118a = i;
        this.f49119b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49118a) {
            case 0:
                this.f49119b.lambda$clearFocusAndHideKeyboard$9();
                break;
            case 1:
                this.f49119b.lambda$requestFocusAndShowKeyboard$8();
                break;
            case 2:
                this.f49119b.show();
                break;
            default:
                this.f49119b.requestFocusAndShowKeyboardIfNeeded();
                break;
        }
    }
}
