package t7e;

import com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.c {
    public CreateSubaccountProductArticleConfig.ResolveBySubaccountType u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f268651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f268652x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f268653y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f268652x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f268651w = obj2;
        this.f268653y |= Integer.MIN_VALUE;
        return this.f268652x.a(null, null, this);
    }
}
