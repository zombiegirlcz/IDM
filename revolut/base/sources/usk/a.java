package usk;

import kotlin.coroutines.Continuation;
import urd.m;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f282978w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m mVar, Continuation continuation) {
        super(continuation);
        this.f282978w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f282978w.emit(null, this);
    }
}
