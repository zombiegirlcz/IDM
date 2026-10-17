package i48;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import io3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public ProductAccountId u;
    public d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f158310w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f158311x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f158312y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f158311x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f158310w = obj2;
        this.f158312y |= Integer.MIN_VALUE;
        return this.f158311x.c(null, this);
    }
}
