package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderBeginSignInController f7374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7375c;

    public /* synthetic */ b(CredentialProviderBeginSignInController credentialProviderBeginSignInController, Object obj2, int i) {
        this.f7373a = i;
        this.f7374b = credentialProviderBeginSignInController;
        this.f7375c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7373a) {
            case 0:
                CredentialProviderBeginSignInController$handleResponse$3.invoke$lambda$0(this.f7374b, (GetCredentialResponse) this.f7375c);
                break;
            case 1:
                CredentialProviderBeginSignInController$handleResponse$4.invoke$lambda$0(this.f7374b, (Ref$ObjectRef) this.f7375c);
                break;
            default:
                CredentialProviderBeginSignInController$handleResponse$6.invoke$lambda$0(this.f7374b, (GetCredentialUnknownException) this.f7375c);
                break;
        }
    }
}
