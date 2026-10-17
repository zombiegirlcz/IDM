package lxl;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.c {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Function1 f200597w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f200598x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f200599y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f200599y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f200598x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f200599y.c(0, null, this);
    }
}
