package ac8;

import a9j.s;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f3098w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s sVar, Continuation continuation) {
        super(continuation);
        this.f3098w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f3098w.emit(null, this);
    }
}
