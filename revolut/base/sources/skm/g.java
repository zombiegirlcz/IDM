package skm;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends gim.c {
    public Iterator u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f263978w;

    public g(Continuation continuation) {
        super(continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f263978w |= Integer.MIN_VALUE;
        return e0.z(null, this);
    }
}
