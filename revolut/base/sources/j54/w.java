package j54;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes22.dex */
public final class w extends gim.c {
    public NaviCommand u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f171575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f171576x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, gim.c cVar) {
        super(cVar);
        this.f171575w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f171576x |= Integer.MIN_VALUE;
        return this.f171575w.Z2(null, null, this);
    }
}
