package a76;

import a3i.h;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f1772w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Continuation continuation) {
        super(continuation);
        this.f1772w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f1772w.emit(null, this);
    }
}
