package zq5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends gim.c {
    public ArrayList u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f324359w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f324360x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f324361y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f324360x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f324359w = obj2;
        this.f324361y |= Integer.MIN_VALUE;
        return this.f324360x.b(null, null, this);
    }
}
