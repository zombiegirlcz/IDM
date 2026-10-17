package yh0;

import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityServiceException;
import efm.d0;
import ihm.j;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import pc.k;
import rc.f;
import rc.h;
import ufm.g;
import ufm.i;
import wp5.y;
import ye1.m;
import zc.a0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f313687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i90.b f313688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f313689c;
    public final j d;

    public c(g playTokenWrapper, i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(playTokenWrapper, "playTokenWrapper");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.f313687a = playTokenWrapper;
        this.f313688b = uuidUtils;
        this.f313689c = new ConcurrentHashMap();
        this.d = p.a.h("toSerialized(...)");
    }

    public final d0 a(String nonce) {
        Task taskForException;
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        yg0.e eVar = (yg0.e) this.f313689c.get(nonce);
        if (eVar != null) {
            ufm.b bVarM = d0.m(eVar);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        String nonce2 = !kotlin.text.d0.W(nonce) ? nonce : null;
        if (nonce2 == null) {
            nonce2 = y.u(this.f313688b, "toString(...)");
        }
        Intrinsics.checkNotNullParameter(nonce2, "nonce");
        rc.c cVar = (rc.c) ((Lazy) this.f313687a.f279886c).getValue();
        k kVarA = h.a();
        byte[] bytes = nonce2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        kVarA.b(Base64.encodeToString(bytes, 2));
        h hVarA = kVarA.a();
        f fVar = cVar.f253144a;
        zc.c cVar2 = fVar.e;
        if (cVar2 == null) {
            taskForException = Tasks.forException(new IntegrityServiceException(-2, null));
        } else if (zc.d.a(fVar.f253150c) >= 82380000) {
            try {
                byte[] bArrDecode = Base64.decode(hVarA.c(), 10);
                Long lB = hVarA.b();
                fVar.f253148a.b("requestIntegrityToken(%s)", hVarA);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                rc.d dVar = new rc.d(fVar, taskCompletionSource, bArrDecode, lB, taskCompletionSource, hVarA);
                cVar2.a().post(new a0(cVar2, dVar.c(), taskCompletionSource, dVar));
                taskForException = taskCompletionSource.getTask();
            } catch (IllegalArgumentException e) {
                taskForException = Tasks.forException(new IntegrityServiceException(-13, e));
            }
        } else {
            taskForException = Tasks.forException(new IntegrityServiceException(-14, null));
        }
        Intrinsics.checkNotNullExpressionValue(taskForException, "requestIntegrityToken(...)");
        i iVar = new i(rd0.e.t(taskForException), new ya6.f(new m(25), 24), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.f fVar2 = new ufm.f(new ufm.f(iVar, new ya6.f(new b(this, nonce, 0), 22), 3), new ya6.f(new b(this, nonce, 1), 23), 1);
        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnError(...)");
        return fVar2;
    }
}
