package com.revolut.appwidget_core;

import a0.d;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import fq.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ue0.e;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/appwidget_core/AppWidgetUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "a", "appwidget_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AppWidgetUpdateWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetUpdateWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0166, code lost:
    
        if (androidx.glance.appwidget.GlanceAppWidgetKt.updateAll(r2, r4, r0) == r1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0 A[Catch: Exception -> 0x0037, TRY_ENTER, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0032, B:66:0x0169, B:63:0x0150, B:23:0x0049, B:56:0x0136, B:58:0x013e, B:26:0x0050, B:51:0x0117, B:53:0x011b, B:29:0x0057, B:42:0x00c3, B:46:0x00d3, B:47:0x00d8, B:48:0x00d9, B:39:0x00b0), top: B:80:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0032, B:66:0x0169, B:63:0x0150, B:23:0x0049, B:56:0x0136, B:58:0x013e, B:26:0x0050, B:51:0x0117, B:53:0x011b, B:29:0x0057, B:42:0x00c3, B:46:0x00d3, B:47:0x00d8, B:48:0x00d9, B:39:0x00b0), top: B:80:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011b A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0032, B:66:0x0169, B:63:0x0150, B:23:0x0049, B:56:0x0136, B:58:0x013e, B:26:0x0050, B:51:0x0117, B:53:0x011b, B:29:0x0057, B:42:0x00c3, B:46:0x00d3, B:47:0x00d8, B:48:0x00d9, B:39:0x00b0), top: B:80:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0032, B:66:0x0169, B:63:0x0150, B:23:0x0049, B:56:0x0136, B:58:0x013e, B:26:0x0050, B:51:0x0117, B:53:0x011b, B:29:0x0057, B:42:0x00c3, B:46:0x00d3, B:47:0x00d8, B:48:0x00d9, B:39:0x00b0), top: B:80:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150 A[Catch: Exception -> 0x0037, PHI: r9 r10
      0x0150: PHI (r9v19 com.revolut.appwidget_core.AppWidgetUpdateWorker) = (r9v16 com.revolut.appwidget_core.AppWidgetUpdateWorker), (r9v21 com.revolut.appwidget_core.AppWidgetUpdateWorker) binds: [B:57:0x013c, B:62:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r10v34 boolean) = (r10v33 boolean), (r10v37 boolean) binds: [B:57:0x013c, B:62:0x014e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0032, B:66:0x0169, B:63:0x0150, B:23:0x0049, B:56:0x0136, B:58:0x013e, B:26:0x0050, B:51:0x0117, B:53:0x011b, B:29:0x0057, B:42:0x00c3, B:46:0x00d3, B:47:0x00d8, B:48:0x00d9, B:39:0x00b0), top: B:80:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(com.revolut.appwidget_core.AppWidgetUpdateWorker r9, kotlin.coroutines.Continuation r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.appwidget_core.AppWidgetUpdateWorker.a(com.revolut.appwidget_core.AppWidgetUpdateWorker, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract a b();

    public final iq.b c() {
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        phm.a aVar = (phm.a) e.j(applicationContext).a().get(iq.b.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (iq.b) aVar2.b();
        }
        throw new IllegalStateException(d.q("Api ", iq.b.class, " is not found"));
    }

    public abstract Object d(o oVar);

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(Continuation continuation) {
        return a(this, continuation);
    }
}
