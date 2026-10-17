package wkm;

import ard.b0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends gim.c {
    public b0 u;
    public Flow v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f298309w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b0 f298310x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f298311y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f298310x = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f298309w = obj2;
        this.f298311y |= Integer.MIN_VALUE;
        return this.f298310x.a(null, this);
    }
}
