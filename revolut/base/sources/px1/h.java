package px1;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ i C;
    public int D;
    public List u;
    public nx1.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ox1.d f240558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f240559x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n02.b f240560y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.C = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return i.d(this.C, null, null, this);
    }
}
