package ne0;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import efm.c0;
import java.io.IOException;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import okhttp3.Call;
import okhttp3.Response;
import ulm.j1;
import ulm.x0;

/* JADX INFO: loaded from: classes19.dex */
public final class p implements ulm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f214400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f214401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f214402c;
    public final Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public p(long j2, c0 c0Var, Function1 load) {
        Intrinsics.checkNotNullParameter(load, "load");
        this.f214400a = j2;
        this.f214401b = c0Var;
        this.f214402c = (q) load;
        this.d = new HashMap();
    }

    @Override // ulm.p
    public void onFailure(Call call, IOException iOException) {
        rf.d dVar = (rf.d) this.f214402c;
        j1 j1VarRequest = call.request();
        if (j1VarRequest != null) {
            x0 x0Var = j1VarRequest.f281095a;
            if (x0Var != null) {
                dVar.W(x0Var.k().toString());
            }
            String str = j1VarRequest.f281096b;
            if (str != null) {
                dVar.c(str);
            }
        }
        dVar.j(this.f214400a);
        t61.a.v((Timer) this.d, dVar, dVar);
        ((ulm.p) this.f214401b).onFailure(call, iOException);
    }

    @Override // ulm.p
    public void onResponse(Call call, Response response) throws IOException {
        FirebasePerfOkHttpClient.a(response, (rf.d) this.f214402c, this.f214400a, ((Timer) this.d).a());
        ((ulm.p) this.f214401b).onResponse(call, response);
    }

    public p(ulm.p pVar, wf.e eVar, Timer timer, long j2) {
        this.f214401b = pVar;
        this.f214402c = new rf.d(eVar);
        this.f214400a = j2;
        this.d = timer;
    }
}
