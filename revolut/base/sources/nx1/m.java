package nx1;

import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.c {
    public int A;
    public n02.b u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f220064w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f220065x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f220066y;
    public final /* synthetic */ u z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u uVar, gim.c cVar) {
        super(cVar);
        this.z = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f220066y = obj2;
        this.A |= Integer.MIN_VALUE;
        return u.d(this.z, null, 0, null, this);
    }
}
