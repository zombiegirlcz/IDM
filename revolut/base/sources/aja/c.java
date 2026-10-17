package aja;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public NaviCommand u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f5529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5530x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f5529w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f5530x |= Integer.MIN_VALUE;
        return this.f5529w.b(null, null, this);
    }
}
