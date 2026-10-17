package nid;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public final /* synthetic */ d A;
    public int B;
    public Collection u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Collection f215675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f215676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f215677y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.A = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.c(null, this);
    }
}
