package rqj;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public int A;
    public h u;
    public ArrayList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f256560w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f256561x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f256562y;
    public final /* synthetic */ h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(continuation);
        this.z = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f256562y = obj2;
        this.A |= Integer.MIN_VALUE;
        return h.e(this.z, null, 0L, 0L, null, this);
    }
}
