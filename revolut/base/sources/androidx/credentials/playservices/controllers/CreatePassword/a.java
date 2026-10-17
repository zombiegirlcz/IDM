package androidx.credentials.playservices.controllers.CreatePassword;

import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.exceptions.CreateCredentialException;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePasswordController f7378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7379c;

    public /* synthetic */ a(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, Object obj2, int i) {
        this.f7377a = i;
        this.f7378b = credentialProviderCreatePasswordController;
        this.f7379c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7377a) {
            case 0:
                CredentialProviderCreatePasswordController$handleResponse$2.invoke$lambda$0(this.f7378b, (CreateCredentialException) this.f7379c);
                break;
            default:
                CredentialProviderCreatePasswordController$handleResponse$3.invoke$lambda$0(this.f7378b, (CreateCredentialResponse) this.f7379c);
                break;
        }
    }
}
