package p1e;

import a0.d;
import android.content.Context;
import androidx.glance.GlanceId;
import androidx.glance.appwidget.SizeMode;
import androidx.work.Constraints;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import com.revolut.feature.stock_widget.impl.StockAppWidgetUpdateWorker;
import com.revolut.feature.stock_widget.impl.StockWidgetProvider;
import fq.j;
import java.util.concurrent.TimeUnit;
import kii.e;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import q1e.c;
import r1e.b;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends com.revolut.appwidget_core.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f231895h = StockWidgetProvider.class;
    public final String i = "StockSmallWidget";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SizeMode.Exact f231896j = SizeMode.Exact.INSTANCE;

    @Override // com.revolut.appwidget_core.a
    public final String e() {
        return this.i;
    }

    @Override // com.revolut.appwidget_core.a
    public final b g(Context context) {
        phm.a aVar = (phm.a) e.l(context, "context", context, o1e.b.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return ((q1e.a) ((o1e.b) aVar2.b())).a();
        }
        throw new IllegalStateException(d.q("Api ", o1e.b.class, " is not found"));
    }

    @Override // androidx.glance.appwidget.GlanceAppWidget
    public final SizeMode getSizeMode() {
        return this.f231896j;
    }

    @Override // com.revolut.appwidget_core.a
    public final Class h() {
        return this.f231895h;
    }

    @Override // com.revolut.appwidget_core.a
    public final Object i(Context context, GlanceId glanceId, j jVar) {
        WorkManager.INSTANCE.getInstance(context).enqueueUniquePeriodicWork("stock_widget_sync", ExistingPeriodicWorkPolicy.KEEP, new PeriodicWorkRequest.Builder(StockAppWidgetUpdateWorker.class, 1L, TimeUnit.HOURS).addTag("rev_widget_update").setInitialDelay(30L, TimeUnit.MINUTES).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
        phm.a aVar = (phm.a) ue0.e.j(context).a().get(q1e.d.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(d.q("Api ", q1e.d.class, " is not found"));
        }
        Object objB = aVar2.b();
        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.stock_widget.impl.di.StockWidgetInternalComponent");
        fim.a aVarC = c(((c) objB).a().c(), jVar);
        return aVarC == fim.a.COROUTINE_SUSPENDED ? aVarC : Unit.f186387a;
    }
}
