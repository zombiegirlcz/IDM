package hy3;

import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.c {
    public Iterator u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f156719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f156720x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f156721y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, gim.c cVar) {
        super(cVar);
        this.f156720x = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f156719w = obj2;
        this.f156721y |= Integer.MIN_VALUE;
        return j.a(this.f156720x, this);
    }
}
