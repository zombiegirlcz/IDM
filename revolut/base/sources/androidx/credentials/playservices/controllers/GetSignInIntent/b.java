package androidx.credentials.playservices.controllers.GetSignInIntent;

import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderGetSignInIntentController f7396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7397c;

    public /* synthetic */ b(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Object obj2, int i) {
        this.f7395a = i;
        this.f7396b = credentialProviderGetSignInIntentController;
        this.f7397c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7395a) {
            case 0:
                CredentialProviderGetSignInIntentController$handleResponse$3.invoke$lambda$0(this.f7396b, (GetCredentialResponse) this.f7397c);
                break;
            case 1:
                CredentialProviderGetSignInIntentController$handleResponse$4.invoke$lambda$0(this.f7396b, (Ref$ObjectRef) this.f7397c);
                break;
            case 2:
                CredentialProviderGetSignInIntentController$handleResponse$6.invoke$lambda$0(this.f7396b, (GetCredentialUnknownException) this.f7397c);
                break;
            default:
                CredentialProviderGetSignInIntentController.AnonymousClass1.invoke$lambda$0(this.f7396b, (Exception) this.f7397c);
                break;
        }
    }
}
