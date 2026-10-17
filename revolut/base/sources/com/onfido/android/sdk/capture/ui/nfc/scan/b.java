package com.onfido.android.sdk.capture.ui.nfc.scan;

import android.view.View;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NfcPinEntryFragment f50073b;

    public /* synthetic */ b(NfcPinEntryFragment nfcPinEntryFragment, int i) {
        this.f50072a = i;
        this.f50073b = nfcPinEntryFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f50072a) {
            case 0:
                NfcPinEntryFragment.bindContinueButton$lambda$3(this.f50073b, view);
                break;
            default:
                NfcPinEntryFragment.bindSkipButton$lambda$4(this.f50073b, view);
                break;
        }
    }
}
