package ag;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import le.l1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Continuation, hc.a, cf.a, ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4695c;

    public /* synthetic */ h(Object obj2, long j2, Object obj3) {
        this.f4694b = obj2;
        this.f4693a = j2;
        this.f4695c = obj3;
    }

    @Override // cf.a
    public void b(cf.b bVar) {
        ((fe.a) bVar.get()).d((String) this.f4694b, this.f4693a, (l1) this.f4695c);
    }

    @Override // hc.a
    public Object execute() {
        fc.g gVar = (fc.g) this.f4694b;
        zb.j jVar = (zb.j) this.f4695c;
        gc.d dVar = (gc.d) gVar.f133581c;
        long jB = ((ic.a) gVar.f133582g).b() + this.f4693a;
        gc.j jVar2 = (gc.j) dVar;
        jVar2.getClass();
        jVar2.g(new gc.f(jB, jVar));
        return null;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj2) {
        ((AnalyticsListener) obj2).onRenderedFirstFrame((AnalyticsListener.EventTime) this.f4694b, this.f4695c, this.f4693a);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((m) this.f4694b).c(task, this.f4693a, (HashMap) this.f4695c);
    }

    public /* synthetic */ h(Object obj2, Object obj3, long j2) {
        this.f4694b = obj2;
        this.f4695c = obj3;
        this.f4693a = j2;
    }
}
