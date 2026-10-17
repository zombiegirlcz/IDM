package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes14.dex */
public final class m0 extends gim.c {
    public aci.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f290071w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ aci.d f290072x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f290073y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(aci.d dVar, Continuation continuation) {
        super(continuation);
        this.f290072x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f290071w |= Integer.MIN_VALUE;
        return this.f290072x.emit(null, this);
    }
}
