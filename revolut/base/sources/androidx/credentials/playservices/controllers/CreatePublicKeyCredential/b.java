package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import org.json.JSONException;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f7385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONException f7386c;

    public /* synthetic */ b(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException, int i) {
        this.f7384a = i;
        this.f7385b = credentialProviderCreatePublicKeyCredentialController;
        this.f7386c = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7384a) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$6.invoke$lambda$0(this.f7385b, this.f7386c);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.AnonymousClass1.invoke$lambda$0(this.f7385b, this.f7386c);
                break;
        }
    }
}
