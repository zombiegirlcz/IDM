package vx2;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends gim.c {
    public jc8.c u;
    public NaviCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f292803w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f292804x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f292805y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f292805y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f292804x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f292805y.a(null, null, null, this);
    }
}
