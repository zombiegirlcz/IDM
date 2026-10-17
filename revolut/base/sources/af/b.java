package af;

import android.content.Context;
import ce.t;
import ce.v;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ce.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f3805b;

    public /* synthetic */ b(t tVar, int i) {
        this.f3804a = i;
        this.f3805b = tVar;
    }

    @Override // ce.f
    public final Object m(v vVar) {
        switch (this.f3804a) {
            case 0:
                return new e((Context) vVar.a(Context.class), ((pd.g) vVar.a(pd.g.class)).d(), vVar.g(t.a(f.class)), vVar.c(yf.b.class), (Executor) vVar.d(this.f3805b));
            case 1:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f3805b, vVar);
            case 2:
                return FirebasePerfRegistrar.lambda$getComponents$0(this.f3805b, vVar);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.f3805b, vVar);
        }
    }
}
