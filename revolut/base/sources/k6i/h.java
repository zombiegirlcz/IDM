package k6i;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ k B;
    public int C;
    public String u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f181736w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Map.Entry f181737x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f181738y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.B = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.d(null, this);
    }
}
