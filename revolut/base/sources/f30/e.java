package f30;

import java.util.List;
import r10.v;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ h B;
    public int C;
    public c0 u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v f131860w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f131861x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f131862y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, gim.c cVar) {
        super(cVar);
        this.B = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(null, this);
    }
}
