package kq;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends gim.c {
    public final /* synthetic */ h A;
    public int B;
    public Function1 u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i[] f188266w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f188267x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f188268y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, gim.c cVar) {
        super(cVar);
        this.A = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, this);
    }
}
