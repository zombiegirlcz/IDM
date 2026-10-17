package gg2;

import gim.c;
import io3.d;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends c {
    public d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ twg.c f143596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f143597x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(twg.c cVar, c cVar2) {
        super(cVar2);
        this.f143596w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f143597x |= Integer.MIN_VALUE;
        return this.f143596w.w(this);
    }
}
