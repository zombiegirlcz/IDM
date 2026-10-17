package df;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f113733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f113734b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f113733a = jVar;
        this.f113734b = taskCompletionSource;
    }

    @Override // df.i
    public final boolean a(Exception exc2) {
        this.f113734b.trySetException(exc2);
        return true;
    }

    @Override // df.i
    public final boolean b(ef.a aVar) {
        if (aVar.f125243b != ef.c.REGISTERED || this.f113733a.a(aVar)) {
            return false;
        }
        String str = aVar.f125244c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f113734b.setResult(new a(str, aVar.e, aVar.f));
        return true;
    }
}
