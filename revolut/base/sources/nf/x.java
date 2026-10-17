package nf;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class x implements OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RemoteConfigManager f214792a;

    public /* synthetic */ x(RemoteConfigManager remoteConfigManager) {
        this.f214792a = remoteConfigManager;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc2) {
        this.f214792a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc2);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public void onSuccess(Object obj2) {
        this.f214792a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj2);
    }
}
