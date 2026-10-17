package she;

import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public ProductAccountDescriptor$Value u;
    public MainScreenTab v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TabAccountsInitialPayload.Action f263462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f263463x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f263464y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f263464y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f263463x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f263464y.a(null, null, null, this);
    }
}
