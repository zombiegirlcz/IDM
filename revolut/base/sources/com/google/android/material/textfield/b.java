package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f49152b;

    public /* synthetic */ b(EndIconDelegate endIconDelegate, int i) {
        this.f49151a = i;
        this.f49152b = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f49151a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f49152b).lambda$new$1(view, z);
                break;
            default:
                ((DropdownMenuEndIconDelegate) this.f49152b).lambda$new$1(view, z);
                break;
        }
    }
}
