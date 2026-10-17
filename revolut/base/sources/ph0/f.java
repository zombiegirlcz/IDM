package ph0;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mic.a0;
import yhm.j;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends gi0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f236194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f236195b;

    public f(h internalGoogleSignIn) {
        Intrinsics.checkNotNullParameter(internalGoogleSignIn, "internalGoogleSignIn");
        this.f236194a = internalGoogleSignIn;
        this.f236195b = j.b(new pgk.f(this, 3));
    }

    public final ug0.e a(Intent intent) throws Throwable {
        try {
            i iVarA = this.f236194a.a(intent);
            return iVarA == null ? new ug0.b(new IllegalArgumentException("serverAuthCode is required")) : new ug0.d(iVarA.f236198a, iVarA.f236199b);
        } catch (ApiException e) {
            int statusCode = e.getStatusCode();
            return statusCode != 12501 ? statusCode != 12502 ? new ug0.b(e) : ug0.c.f279916a : ug0.a.f279914a;
        }
    }

    public final void b(Function0 onSuccess, Function1 onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Task<Void> taskSignOut = ((GoogleSignInClient) this.f236195b.getValue()).signOut();
        taskSignOut.addOnSuccessListener(new pfa.c(new ac1.b(15, onSuccess), 24));
        taskSignOut.addOnFailureListener(new a0(3, onFailure));
    }
}
