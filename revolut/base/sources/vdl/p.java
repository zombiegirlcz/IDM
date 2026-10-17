package vdl;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends gim.c {
    public Set u;
    public LinkedHashSet v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f288023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f288024x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f288025y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, gim.c cVar) {
        super(cVar);
        this.f288024x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f288023w = obj2;
        this.f288025y |= Integer.MIN_VALUE;
        return r.a(this.f288024x, null, this);
    }
}
