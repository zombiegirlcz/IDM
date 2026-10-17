package bfe;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends gim.c {
    public ArrayList u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f14968w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14969x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, gim.c cVar) {
        super(cVar);
        this.f14968w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f14969x |= Integer.MIN_VALUE;
        return this.f14968w.a(this);
    }
}
