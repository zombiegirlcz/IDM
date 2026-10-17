package ahe;

import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends gim.c {
    public Data u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f4972w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4973x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f4972w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f4973x |= Integer.MIN_VALUE;
        return this.f4972w.emit(null, this);
    }
}
