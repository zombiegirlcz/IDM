package xgk;

import java.util.List;
import nb6.p;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public List u;
    public p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public zm3.a f305766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f305767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f305768y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f305768y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f305767x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f305768y.Z2(null, null, this);
    }
}
