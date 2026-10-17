package vtf;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import do3.n;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.c {
    public MoneyRequest u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f292112w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f292113x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f292114y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f292113x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f292112w = obj2;
        this.f292114y |= Integer.MIN_VALUE;
        return f.a(this.f292113x, null, null, this);
    }
}
