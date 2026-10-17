package androidx.credentials.playservices;

import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f7365b;

    public /* synthetic */ a(int i, Function1 function1) {
        this.f7364a = i;
        this.f7365b = function1;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public final void onSuccess(Object obj2) {
        switch (this.f7364a) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(this.f7365b, obj2);
                break;
            case 1:
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$0(this.f7365b, obj2);
                break;
            case 2:
                HiddenActivity.handleCreatePassword$lambda$14$lambda$12(this.f7365b, obj2);
                break;
            case 3:
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$4(this.f7365b, obj2);
                break;
            default:
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$8(this.f7365b, obj2);
                break;
        }
    }
}
