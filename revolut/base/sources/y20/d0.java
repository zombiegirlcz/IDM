package y20;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 extends gim.c {
    public Object A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ uvl.c E;
    public int F;
    public Function2 u;
    public Map v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Map f310481w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f310482x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a f310483y;
    public Map z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(uvl.c cVar, gim.c cVar2) {
        super(cVar2);
        this.E = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return uvl.c.g(this.E, null, null, this);
    }
}
