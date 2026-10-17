package nx1;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends gim.c {
    public int A;
    public List u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f220070w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f220071x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f220072y;
    public final /* synthetic */ u z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u uVar, gim.c cVar) {
        super(cVar);
        this.z = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f220072y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, null, this);
    }
}
