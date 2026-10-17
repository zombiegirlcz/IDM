package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.exceptions.CreateCredentialException;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f7382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7383c;

    public /* synthetic */ a(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Object obj2, int i) {
        this.f7381a = i;
        this.f7382b = credentialProviderCreatePublicKeyCredentialController;
        this.f7383c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7381a) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$2.invoke$lambda$0(this.f7382b, (CreateCredentialException) this.f7383c);
                break;
            case 1:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$4.invoke$lambda$0(this.f7382b, (CreateCredentialException) this.f7383c);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$5.invoke$lambda$0(this.f7382b, (CreateCredentialResponse) this.f7383c);
                break;
        }
    }
}
