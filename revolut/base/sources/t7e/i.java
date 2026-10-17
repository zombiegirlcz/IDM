package t7e;

import com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.c {
    public CreateSubaccountProductArticleConfig.Config u;
    public c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public sii.a f268648w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f268649x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.subaccount.impl.ui.create.flow.main.c f268650y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f268650y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f268649x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.feature.subaccount.impl.ui.create.flow.main.c.J2(this.f268650y, null, null, null, this);
    }
}
