package kj7;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public int A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ f E;
    public int F;
    public List u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f184320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f184321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f184322y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.E = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return f.c(this.E, null, null, this);
    }
}
