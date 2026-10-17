package pyj;

import java.util.List;
import u09.v;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public int A;
    public jf0.c u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v f240847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f240848x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f240849y;
    public final /* synthetic */ h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.z = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f240849y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.e(null, this);
    }
}
