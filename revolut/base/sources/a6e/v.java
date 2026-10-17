package a6e;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends gim.c {
    public final /* synthetic */ w A;
    public int B;
    public Collection u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1665x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1666y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, gim.c cVar) {
        super(cVar);
        this.A = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(null, this);
    }
}
