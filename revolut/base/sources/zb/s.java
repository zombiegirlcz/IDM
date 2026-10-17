package zb;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static volatile k e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a f320797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a f320798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ec.d f320799c;
    public final fc.g d;

    public s(ic.a aVar, ic.a aVar2, ec.d dVar, fc.g gVar, com.google.firebase.messaging.t tVar) {
        this.f320797a = aVar;
        this.f320798b = aVar2;
        this.f320799c = dVar;
        this.d = gVar;
        ((Executor) tVar.f49543b).execute(new androidx.view.d(tVar, 11));
    }

    public static s a() {
        k kVar = e;
        if (kVar != null) {
            return kVar.f();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (s.class) {
                try {
                    if (e == null) {
                        context.getClass();
                        e = new k(context);
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
    }

    public final q c(l lVar) {
        byte[] bytes;
        Set setUnmodifiableSet = lVar != null ? Collections.unmodifiableSet(xb.a.d) : Collections.singleton(new wb.c("proto"));
        jpf.a aVarA = j.a();
        lVar.getClass();
        aVarA.f177267a = "cct";
        xb.a aVar = (xb.a) lVar;
        String str = aVar.f303916a;
        String str2 = aVar.f303917b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = a0.d.s("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        aVarA.f177268b = bytes;
        return new q(setUnmodifiableSet, aVarA.j(), this);
    }
}
