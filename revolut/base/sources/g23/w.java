package g23;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes21.dex */
public final class w extends gim.c {
    public NaviCommand u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f139837w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f139838x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, gim.c cVar) {
        super(cVar);
        this.f139837w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f139838x |= Integer.MIN_VALUE;
        return this.f139837w.c(null, null, this);
    }
}
