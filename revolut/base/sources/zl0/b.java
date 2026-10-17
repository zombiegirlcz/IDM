package zl0;

import an0.g;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import rm0.q;
import zhm.h0;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f323153a = new b();

    private b() {
    }

    public static an0.c a(Context context) {
        an0.c cVar = null;
        try {
            Object objI = ue0.e.i(ue0.e.j(context), an0.c.class);
            if (objI instanceof an0.c) {
                cVar = (an0.c) objI;
            }
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
        if (cVar != null) {
            return cVar;
        }
        Object objC = g.Companion.c();
        Intrinsics.i(objC, "null cannot be cast to non-null type com.revolut.core.security.provider.session.di.SessionComponent");
        return (an0.c) objC;
    }

    public static e b(Context context, a promptInfoFactory, wl0.a biometricCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(promptInfoFactory, "promptInfoFactory");
        Intrinsics.checkNotNullParameter(biometricCallback, "biometricCallback");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(promptInfoFactory, "promptInfoFactory");
        Intrinsics.checkNotNullParameter(biometricCallback, "biometricCallback");
        return new e(biometricCallback, promptInfoFactory, (q) a(context).o.get(), a(context).a(), a(context).g());
    }
}
