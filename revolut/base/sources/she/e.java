package she;

import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public ProductAccountDescriptor$Value u;
    public TabAccountsInitialPayload.Action v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MainScreenTab f263468w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f263469x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f263470y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f263470y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f263469x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f263470y.c(null, null, this);
    }
}
