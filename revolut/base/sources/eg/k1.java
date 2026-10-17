package eg;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f125460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f125461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f125462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(Looper looper) {
        super(looper);
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.f125462c = new ArrayList();
    }

    public final void a() {
        v0.Companion.getClass();
        v0 v0VarC = ((i) ((u) nim.a.m().b(u.class))).c();
        c1.Companion.getClass();
        r0 sessionDetails = b1.a().e;
        if (sessionDetails == null) {
            Intrinsics.r("currentSession");
            throw null;
        }
        z0 z0Var = (z0) v0VarC;
        z0Var.getClass();
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        skm.e0.C(skm.e0.c(z0Var.e), null, null, new x0(z0Var, sessionDetails, null), 3);
        for (Messenger it8 : new ArrayList(this.f125462c)) {
            Intrinsics.checkNotNullExpressionValue(it8, "it");
            b(it8);
        }
    }

    public final void b(Messenger messenger) {
        try {
            if (this.f125460a) {
                c1.Companion.getClass();
                r0 r0Var = b1.a().e;
                if (r0Var != null) {
                    d(messenger, r0Var.f125486a);
                    return;
                } else {
                    Intrinsics.r("currentSession");
                    throw null;
                }
            }
            i0.Companion.getClass();
            x xVar = (x) ((p0) ((i) ((u) nim.a.m().b(u.class))).b()).f125477c.get();
            String str = xVar != null ? xVar.f125499a : null;
            if (str != null) {
                d(messenger, str);
            }
        } catch (IllegalStateException e) {
        }
    }

    public final void c() {
        try {
            c1.Companion.getClass();
            c1 c1VarA = b1.a();
            int i = c1VarA.d + 1;
            c1VarA.d = i;
            c1VarA.e = new r0(c1VarA.d, i == 0 ? c1VarA.f125412c : c1VarA.a(), c1VarA.f125412c, ((p1) c1VarA.f125410a).a());
            a();
            i0.Companion.getClass();
            i0 i0VarB = ((i) ((u) nim.a.m().b(u.class))).b();
            r0 r0Var = b1.a().e;
            Continuation continuation = null;
            if (r0Var == null) {
                Intrinsics.r("currentSession");
                throw null;
            }
            String sessionId = r0Var.f125486a;
            p0 p0Var = (p0) i0VarB;
            p0Var.getClass();
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            skm.e0.C(skm.e0.c(p0Var.f125475a), null, null, new afe.a(p0Var, sessionId, continuation, 4), 3);
        } catch (IllegalStateException e) {
        }
    }

    public final void d(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message messageObtain = Message.obtain(null, 3, 0, 0);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
            String str2 = "Removing dead client from list: " + messenger;
            this.f125462c.remove(messenger);
        } catch (Exception e) {
            String str3 = "Unable to push new session to " + messenger + CoreConstants.DOT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r10) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.k1.handleMessage(android.os.Message):void");
    }
}
