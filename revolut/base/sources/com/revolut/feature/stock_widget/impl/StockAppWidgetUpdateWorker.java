package com.revolut.feature.stock_widget.impl;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.revolut.appwidget_core.AppWidgetUpdateWorker;
import fq.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1e.a;
import q1e.c;
import q1e.d;
import ue0.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/stock_widget/impl/StockAppWidgetUpdateWorker;", "Lcom/revolut/appwidget_core/AppWidgetUpdateWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "feature_stock_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockAppWidgetUpdateWorker extends AppWidgetUpdateWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f88417a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockAppWidgetUpdateWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f88417a = new a();
    }

    @Override // com.revolut.appwidget_core.AppWidgetUpdateWorker
    public final com.revolut.appwidget_core.a b() {
        return this.f88417a;
    }

    @Override // com.revolut.appwidget_core.AppWidgetUpdateWorker
    public final Object d(o oVar) {
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        phm.a aVar = (phm.a) e.j(applicationContext).a().get(d.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
        }
        Object objB = ((c) aVar2.b()).a().b(oVar);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }
}
