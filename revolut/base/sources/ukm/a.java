package ukm;

import d9.e1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import skm.g1;

/* JADX INFO: loaded from: classes14.dex */
public class a extends v implements b {
    public a(CoroutineContext coroutineContext, q qVar, boolean z) {
        super(coroutineContext, qVar, false, z);
        R((Job) coroutineContext.get(g1.f263979a));
    }

    @Override // skm.r1
    public final boolean P(Throwable th10) {
        skm.e0.v(this.f263953c, th10);
        return true;
    }

    @Override // skm.r1
    public final void Z(Throwable th10) {
        if (th10 != null) {
            cancellationExceptionA = th10 instanceof CancellationException ? (CancellationException) th10 : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = e1.a(getClass().getSimpleName().concat(" was cancelled"), th10);
            }
        }
        this.d.m(cancellationExceptionA);
    }
}
