package ci6;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.c {
    public ArrayList u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f24395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f24396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f24397y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f24397y = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f24396x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f24397y.b(null, null, null, this);
    }
}
