package vc;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wc.l f287591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wc.l f287592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wc.l f287593c;

    public n(wc.l lVar, wc.l lVar2, wc.l lVar3) {
        this.f287591a = lVar;
        this.f287592b = lVar2;
        this.f287593c = lVar3;
    }

    @Override // vc.b
    public final Task a(tb4.t tVar) {
        return h().a(tVar);
    }

    @Override // vc.b
    public final Task b(List list) {
        return h().b(list);
    }

    @Override // vc.b
    public final Task c(List list) {
        return h().c(list);
    }

    @Override // vc.b
    public final boolean d(c cVar, Activity activity, int i) {
        return h().d(cVar, activity, i);
    }

    @Override // vc.b
    public final void e(uh0.d dVar) {
        h().e(dVar);
    }

    @Override // vc.b
    public final Set f() {
        return h().f();
    }

    @Override // vc.b
    public final void g(uh0.d dVar) {
        h().g(dVar);
    }

    public final b h() {
        return this.f287593c.zza() != null ? (b) this.f287592b.zza() : (b) this.f287591a.zza();
    }
}
