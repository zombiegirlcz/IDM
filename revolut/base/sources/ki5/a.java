package ki5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends gim.c {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f184177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f184178x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f184179y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(continuation);
        this.f184178x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f184177w = obj2;
        this.f184179y |= Integer.MIN_VALUE;
        return this.f184178x.d(null, this);
    }
}
