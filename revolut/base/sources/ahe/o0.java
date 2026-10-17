package ahe;

import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a3i.h f5019w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Data f5020x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5021y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(a3i.h hVar, Continuation continuation) {
        super(continuation);
        this.f5019w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f5019w.emit(null, this);
    }
}
