package t3f;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ o C;
    public int D;
    public String u;
    public Function1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Ref$ObjectRef f267768w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f267770y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.C = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.k(null, null, this);
    }
}
