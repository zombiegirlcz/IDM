package zge;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public Map u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f322108w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f322109x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f322110y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, gim.c cVar) {
        super(cVar);
        this.f322109x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f322108w = obj2;
        this.f322110y |= Integer.MIN_VALUE;
        return i.e(this.f322109x, null, null, this);
    }
}
