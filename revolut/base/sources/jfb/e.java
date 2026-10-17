package jfb;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.c {
    public Function0 u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f173799w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f173800x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f173801y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f173800x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f173799w = obj2;
        this.f173801y |= Integer.MIN_VALUE;
        return this.f173800x.a(null, false, null, this);
    }
}
