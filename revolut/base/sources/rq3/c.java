package rq3;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ d B;
    public int C;
    public String u;
    public Collection v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f256454w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f256455x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f256456y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.B = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(null, null, this);
    }
}
