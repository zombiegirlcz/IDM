package dx6;

import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.models.ProductId;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.c {
    public com.revolut.feature.freelancer.impl.ui.extension.a u;
    public MainScreenTab v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ProductId f120901w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f120902x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.extension.a f120903y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.freelancer.impl.ui.extension.a aVar, gim.c cVar) {
        super(cVar);
        this.f120903y = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f120902x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.extension.a.b3(this.f120903y, this);
    }
}
