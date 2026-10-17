package com.onfido.android.sdk.capture.ui.userconsent;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class d implements igm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserConsentViewModel f50097b;

    public /* synthetic */ d(UserConsentViewModel userConsentViewModel, int i) {
        this.f50096a = i;
        this.f50097b = userConsentViewModel;
    }

    @Override // igm.a
    public final void run() {
        switch (this.f50096a) {
            case 0:
                UserConsentViewModel.onAcceptClicked$lambda$0(this.f50097b);
                break;
            case 1:
                UserConsentViewModel.onAcceptClicked$lambda$1(this.f50097b);
                break;
            case 2:
                UserConsentViewModel.onRejectClicked$lambda$2(this.f50097b);
                break;
            default:
                UserConsentViewModel.onRejectClicked$lambda$3(this.f50097b);
                break;
        }
    }
}
