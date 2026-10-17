package mk0;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends gim.c {
    public int A;
    public List u;
    public ArrayList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hlm.c f206156w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f206157x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f206158y;
    public final /* synthetic */ o z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, Continuation continuation) {
        super(continuation);
        this.z = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f206158y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.q(null, false, this);
    }
}
