package com.onfido.android.sdk.capture.ui.userconsent;

import android.view.View;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserConsentFragment f50092b;

    public /* synthetic */ a(UserConsentFragment userConsentFragment, int i) {
        this.f50091a = i;
        this.f50092b = userConsentFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f50091a) {
            case 0:
                UserConsentFragment.onViewCreated$lambda$0(this.f50092b, view);
                break;
            default:
                UserConsentFragment.setDoNotAcceptButtonListener$lambda$2(this.f50092b, view);
                break;
        }
    }
}
