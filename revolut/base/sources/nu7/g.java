package nu7;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ j B;
    public int C;
    public List u;
    public Collection v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f219224w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f219225x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f219226y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, gim.c cVar) {
        super(cVar);
        this.B = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, this);
    }
}
