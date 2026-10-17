package oqk;

import kotlin.coroutines.Continuation;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.c {
    public a3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f227955w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f227956x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Continuation continuation) {
        super(continuation);
        this.f227955w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f227956x |= Integer.MIN_VALUE;
        return this.f227955w.l3(null, null, null, this);
    }
}
