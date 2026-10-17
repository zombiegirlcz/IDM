package xd;

import android.app.Application;
import android.content.Context;
import ce.j;
import ce.p;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import pd.g;

/* JADX INFO: loaded from: classes.dex */
public final class a implements zd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f304190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cf.b f304191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f304192c;
    public final f d;
    public final Executor e;
    public final Executor f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f304193g;

    public a(g gVar, cf.b bVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        Preconditions.checkNotNull(gVar);
        Preconditions.checkNotNull(bVar);
        this.f304190a = gVar;
        this.f304191b = bVar;
        new ArrayList();
        new ArrayList();
        gVar.a();
        Context context = gVar.f235023a;
        String strD = gVar.d();
        d dVar = new d();
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(strD);
        dVar.f304196a = new p(new af.c(context, 1, "com.google.firebase.appcheck.store." + strD));
        this.f304192c = dVar;
        gVar.a();
        Context context2 = (Context) Preconditions.checkNotNull(context);
        new ufm.g((a) Preconditions.checkNotNull(this), executor2, scheduledExecutorService);
        new ch.b(19);
        f fVar = new f();
        BackgroundDetector.initialize((Application) context2.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new e());
        this.d = fVar;
        this.e = executor;
        this.f = executor2;
        this.f304193g = executor3;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor3.execute(new j(this, taskCompletionSource, 23));
        taskCompletionSource.getTask();
    }
}
