package vc;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import sgm.e3;

/* JADX INFO: loaded from: classes16.dex */
public final class g extends wc.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f287583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f287584c;
    public final /* synthetic */ TaskCompletionSource d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, TaskCompletionSource taskCompletionSource, List list, TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.f287583b = i;
        this.e = iVar;
        this.f287584c = list;
        this.d = taskCompletionSource2;
    }

    @Override // wc.s
    public final void c() {
        switch (this.f287583b) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.d;
                List list = (List) this.f287584c;
                i iVar = (i) this.e;
                try {
                    iVar.f287588b.f296286m.e(iVar.f287587a, i.a(list), i.b(), new h(iVar, taskCompletionSource, 1));
                    return;
                } catch (RemoteException e) {
                    i.f287586c.d(e, "deferredUninstall(%s)", list);
                    taskCompletionSource.trySetException(new RuntimeException(e));
                    return;
                }
            case 1:
                TaskCompletionSource taskCompletionSource2 = this.d;
                List list2 = (List) this.f287584c;
                i iVar2 = (i) this.e;
                try {
                    iVar2.f287588b.f296286m.b(iVar2.f287587a, i.a(list2), i.b(), new h(iVar2, taskCompletionSource2, 0));
                    return;
                } catch (RemoteException e2) {
                    i.f287586c.d(e2, "deferredInstall(%s)", list2);
                    taskCompletionSource2.trySetException(new RuntimeException(e2));
                    return;
                }
            default:
                synchronized (((wc.c) this.e).f) {
                    try {
                        wc.c cVar = (wc.c) this.e;
                        TaskCompletionSource taskCompletionSource3 = this.d;
                        cVar.e.add(taskCompletionSource3);
                        taskCompletionSource3.getTask().addOnCompleteListener(new e3(cVar, taskCompletionSource3, 12));
                        if (((wc.c) this.e).k.getAndIncrement() > 0) {
                            ((wc.c) this.e).f296280b.e("Already connected to the service.", new Object[0]);
                        }
                        wc.c.b((wc.c) this.e, (wc.s) this.f287584c);
                    } catch (Throwable th10) {
                        throw th10;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(wc.c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, wc.s sVar) {
        super(taskCompletionSource);
        this.f287583b = 2;
        this.e = cVar;
        this.d = taskCompletionSource2;
        this.f287584c = sVar;
    }
}
