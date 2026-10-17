package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f7388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f7389c;

    public /* synthetic */ c(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th10, int i) {
        this.f7387a = i;
        this.f7388b = credentialProviderCreatePublicKeyCredentialController;
        this.f7389c = th10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7387a) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$7.invoke$lambda$0(this.f7388b, this.f7389c);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.AnonymousClass2.invoke$lambda$0(this.f7388b, this.f7389c);
                break;
        }
    }
}
