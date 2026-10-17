package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49156b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f49155a = i;
        this.f49156b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49155a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f49156b).lambda$tearDown$2();
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f49156b).lambda$afterEditTextChanged$3();
                break;
            default:
                ((TextInputLayout) this.f49156b).lambda$onGlobalLayout$1();
                break;
        }
    }
}
