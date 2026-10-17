package clm;

import akl.s;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.Unit;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements efm.d, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ skm.l f25067a;

    public /* synthetic */ b(skm.l lVar) {
        this.f25067a = lVar;
    }

    @Override // efm.d
    public void onComplete() {
        m.Companion companion = yhm.m.INSTANCE;
        this.f25067a.resumeWith(Unit.f186387a);
    }

    @Override // efm.d
    public void onError(Throwable th10) {
        m.Companion companion = yhm.m.INSTANCE;
        this.f25067a.resumeWith(yhm.o.a(th10));
    }

    @Override // efm.d
    public void onSubscribe(ifm.c cVar) {
        this.f25067a.r(new s(cVar, 5));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception exception = task.getException();
        skm.l lVar = this.f25067a;
        if (exception != null) {
            m.Companion companion = yhm.m.INSTANCE;
            lVar.resumeWith(yhm.o.a(exception));
        } else if (task.isCanceled()) {
            lVar.a(null);
        } else {
            m.Companion companion2 = yhm.m.INSTANCE;
            lVar.resumeWith(task.getResult());
        }
    }
}
