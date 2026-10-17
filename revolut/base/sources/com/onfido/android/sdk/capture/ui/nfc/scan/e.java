package com.onfido.android.sdk.capture.ui.nfc.scan;

import android.view.View;
import com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanFragment;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f50077b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f50076a = i;
        this.f50077b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f50076a) {
            case 0:
                NfcScanFragment.C21361.accept$lambda$1$lambda$0((NfcScanFragment) this.f50077b, view);
                break;
            default:
                NfcScanBottomDialog.binding$lambda$3$lambda$2((NfcScanBottomDialog) this.f50077b, view);
                break;
        }
    }
}
