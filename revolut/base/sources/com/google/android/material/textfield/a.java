package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f49150b;

    public /* synthetic */ a(EndIconDelegate endIconDelegate, int i) {
        this.f49149a = i;
        this.f49150b = endIconDelegate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f49149a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f49150b).lambda$new$0(view);
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f49150b).lambda$new$0(view);
                break;
            default:
                ((PasswordToggleEndIconDelegate) this.f49150b).lambda$new$0(view);
                break;
        }
    }
}
