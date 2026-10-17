package oc;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import pc.l;
import pc.p;

/* JADX INFO: loaded from: classes16.dex */
public final class g extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f224009b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f224010c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.e = iVar;
        this.d = str;
        this.f224010c = taskCompletionSource2;
    }

    @Override // pc.l
    public final void a() {
        switch (this.f224009b) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.f224010c;
                i iVar = (i) this.e;
                String str = (String) this.d;
                try {
                    iVar.f224013a.f234778m.f(iVar.f224014b, i.a(iVar, str), new h(iVar, taskCompletionSource, str));
                    return;
                } catch (RemoteException e) {
                    i.e.d(e, "requestUpdateInfo(%s)", str);
                    taskCompletionSource.trySetException(new RuntimeException(e));
                    return;
                }
            default:
                synchronized (((p) this.e).f) {
                    try {
                        p pVar = (p) this.e;
                        TaskCompletionSource taskCompletionSource2 = this.f224010c;
                        pVar.e.add(taskCompletionSource2);
                        taskCompletionSource2.getTask().addOnCompleteListener(new jx0.a(pVar, taskCompletionSource2, 21));
                        if (((p) this.e).k.getAndIncrement() > 0) {
                            ((p) this.e).f234772b.e("Already connected to the service.", new Object[0]);
                        }
                        p.b((p) this.e, (l) this.d);
                    } catch (Throwable th10) {
                        throw th10;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, l lVar) {
        super(taskCompletionSource);
        this.e = pVar;
        this.f224010c = taskCompletionSource2;
        this.d = lVar;
    }
}
