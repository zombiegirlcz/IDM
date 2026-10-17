package svh;

import a0.d;
import android.content.Context;
import androidx.glance.GlanceId;
import androidx.glance.appwidget.GlanceAppWidgetManager;
import androidx.glance.appwidget.SizeMode;
import androidx.work.Constraints;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.revolut.feature_account_widget.impl.AccountAppWidgetUpdateWorker;
import com.revolut.feature_account_widget.impl.AccountWidgetProvider;
import fq.j;
import kii.e;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vvh.l;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends com.revolut.appwidget_core.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SizeMode.Exact f265865h = SizeMode.Exact.INSTANCE;
    public final Class i = AccountWidgetProvider.class;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f265866j = "AccountBalanceWidgetSmall";

    @Override // com.revolut.appwidget_core.a
    public final Object d(Context context, gq.a aVar) {
        WorkManager.INSTANCE.getInstance(context).enqueueUniqueWork("account_widget_update", ExistingWorkPolicy.APPEND_OR_REPLACE, new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) AccountAppWidgetUpdateWorker.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).addTag("rev_widget_update").build());
        return Unit.f186387a;
    }

    @Override // com.revolut.appwidget_core.a
    public final String e() {
        return this.f265866j;
    }

    @Override // com.revolut.appwidget_core.a
    public final r1e.b g(Context context) {
        phm.a aVar = (phm.a) e.l(context, "context", context, rvh.b.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return ((uvh.b) ((rvh.b) aVar2.b())).a();
        }
        throw new IllegalStateException(d.q("Api ", rvh.b.class, " is not found"));
    }

    @Override // androidx.glance.appwidget.GlanceAppWidget
    public final SizeMode getSizeMode() {
        return this.f265865h;
    }

    @Override // com.revolut.appwidget_core.a
    public final Class h() {
        return this.i;
    }

    @Override // com.revolut.appwidget_core.a
    public final Object i(Context context, GlanceId glanceId, j jVar) {
        phm.a aVar = (phm.a) j6.a.i(context, uvh.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(d.q("Api ", uvh.a.class, " is not found"));
        }
        Object objB = aVar2.b();
        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature_account_widget.impl.di.AccountWidgetInternalComponent");
        l lVarB = ((uvh.e) objB).b();
        Intrinsics.checkNotNullParameter(glanceId, "glanceId");
        fim.a aVarC = c(lVarB.f(((GlanceAppWidgetManager) this.e.getValue()).getAppWidgetId(glanceId)), jVar);
        return aVarC == fim.a.COROUTINE_SUSPENDED ? aVarC : Unit.f186387a;
    }
}
