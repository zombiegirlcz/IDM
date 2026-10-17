package vgf;

import java.util.List;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public a3 u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f289077w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f289078x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f289079y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f289078x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f289077w = obj2;
        this.f289079y |= Integer.MIN_VALUE;
        return this.f289078x.b(null, null, this);
    }
}
