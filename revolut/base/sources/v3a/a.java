package v3a;

import com.revolut.retail.core.navigation.NaviCommand;
import qua.p;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends gim.c {
    public p u;
    public NaviCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f285860w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f285861x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f285862y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f285861x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f285860w = obj2;
        this.f285862y |= Integer.MIN_VALUE;
        return this.f285861x.c(null, null, this);
    }
}
