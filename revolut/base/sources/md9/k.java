package md9;

import blj.t;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.c {
    public Data u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f204541w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f204542x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t tVar, Continuation continuation) {
        super(continuation);
        this.f204541w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f204542x |= Integer.MIN_VALUE;
        return this.f204541w.a(null, this);
    }
}
