package o9b;

import gim.c;
import nd.m;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends c {
    public i9b.a u;
    public oqb.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f223181w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f223182x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f223183y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m mVar, c cVar) {
        super(cVar);
        this.f223182x = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f223181w = obj2;
        this.f223183y |= Integer.MIN_VALUE;
        return this.f223182x.f(null, null, this);
    }
}
