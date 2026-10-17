package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49162b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f49161a = i;
        this.f49162b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49161a) {
            case 0:
                ((RadialViewGroup) this.f49162b).updateLayoutParams();
                break;
            default:
                ((MaterialTimePicker) this.f49162b).lambda$onViewCreated$0();
                break;
        }
    }
}
