package androidx.credentials.playservices;

import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class e implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f7404b;

    public /* synthetic */ e(HiddenActivity hiddenActivity, int i) {
        this.f7403a = i;
        this.f7404b = hiddenActivity;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc2) {
        switch (this.f7403a) {
            case 0:
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1(this.f7404b, exc2);
                break;
            case 1:
                HiddenActivity.handleCreatePassword$lambda$14$lambda$13(this.f7404b, exc2);
                break;
            case 2:
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5(this.f7404b, exc2);
                break;
            default:
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$9(this.f7404b, exc2);
                break;
        }
    }
}
