package df;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f113735a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f113735a = taskCompletionSource;
    }

    @Override // df.i
    public final boolean a(Exception exc2) {
        return false;
    }

    @Override // df.i
    public final boolean b(ef.a aVar) {
        ef.c cVar = aVar.f125243b;
        if (cVar != ef.c.UNREGISTERED && cVar != ef.c.REGISTERED && cVar != ef.c.REGISTER_ERROR) {
            return false;
        }
        this.f113735a.trySetResult(aVar.f125242a);
        return true;
    }
}
