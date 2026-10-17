package dpd;

import tof.a3;
import tof.i3;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.c {
    public a3 u;
    public i3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f116866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f116867x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f116868y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f116867x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f116866w = obj2;
        this.f116868y |= Integer.MIN_VALUE;
        return this.f116867x.f3(null, null, this);
    }
}
