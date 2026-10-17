package fq;

import com.revolut.appwidget_core.AppWidgetUpdateWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class o extends gim.c {
    public AppWidgetUpdateWorker u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f137160w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AppWidgetUpdateWorker f137161x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f137162y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AppWidgetUpdateWorker appWidgetUpdateWorker, Continuation continuation) {
        super(continuation);
        this.f137161x = appWidgetUpdateWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f137160w = obj2;
        this.f137162y |= Integer.MIN_VALUE;
        return AppWidgetUpdateWorker.a(this.f137161x, this);
    }
}
