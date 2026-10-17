package kj7;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public String u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184317w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f184318x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f184319y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f184319y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f184318x = obj2;
        this.z |= Integer.MIN_VALUE;
        return f.b(this.f184319y, null, null, this);
    }
}
