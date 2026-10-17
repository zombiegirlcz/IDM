package she;

import com.revolut.feature.rev10_main_screen.api.MainScreenTab;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.c {
    public MainScreenTab u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f263471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f263472x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f263471w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f263472x |= Integer.MIN_VALUE;
        return this.f263471w.b(null, this);
    }
}
