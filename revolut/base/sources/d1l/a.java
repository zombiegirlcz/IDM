package d1l;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends gim.c {
    public String u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f110659w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f110660x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f110661y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f110661y = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f110660x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f110661y.a(null, false, null, this);
    }
}
