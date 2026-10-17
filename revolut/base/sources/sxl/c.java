package sxl;

import android.app.Activity;
import android.content.Context;
import com.revolut.ui_kit.nudge.core.R$id;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import yhm.n;
import yhm.o;
import yp0.c0;
import yp0.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f266526a = new c();

    private c() {
    }

    public static f a(Context context) throws Throwable {
        Object objA;
        Activity activityM;
        Intrinsics.checkNotNullParameter(context, "context");
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            m.Companion companion = m.INSTANCE;
            activityM = kli.a.m(context);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (activityM == null) {
            throw new IllegalArgumentException("Activity not found for NudgeRegistry");
        }
        int i = R$id.internal_nudge_registry_tag;
        d0 d0Var = d0.f315718a;
        c0 c0VarA = d0.a(activityM);
        Object objA2 = c0VarA.a(i);
        if (objA2 == null) {
            objA2 = new f();
            c0VarA.b(i, objA2);
        }
        objA = (f) objA2;
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof n) {
            objA = null;
        }
        f fVar = (f) objA;
        return fVar != null ? fVar : new f();
    }
}
