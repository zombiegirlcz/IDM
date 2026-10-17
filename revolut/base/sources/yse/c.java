package yse;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public ArrayList u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f316452w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f316453x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f316452w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f316453x |= Integer.MIN_VALUE;
        return this.f316452w.b(null, this);
    }
}
