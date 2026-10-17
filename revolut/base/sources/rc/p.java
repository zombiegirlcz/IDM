package rc;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.integrity.internal.af;
import zc.z;

/* JADX INFO: loaded from: classes16.dex */
public abstract class p extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f253168b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f253168b = qVar;
    }

    @Override // zc.z
    public final void a(Exception exc2) {
        if (!(exc2 instanceof af)) {
            super.a(exc2);
        } else if (q.d(this.f253168b)) {
            super.a(new StandardIntegrityException(-2, exc2));
        } else {
            super.a(new StandardIntegrityException(-9, exc2));
        }
    }
}
