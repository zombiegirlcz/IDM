package bi2;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f15378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15379x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f15378w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f15379x |= Integer.MIN_VALUE;
        return f.a(this.f15378w, null, this);
    }
}
