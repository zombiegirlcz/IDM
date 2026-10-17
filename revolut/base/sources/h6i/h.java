package h6i;

import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.feature_move_money.api.model.AccountSource;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public int A;
    public j8l.a u;
    public CurrencyClause v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CurrencyImage f149670w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AccountSource.PocketSource f149671x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f149672y;
    public final /* synthetic */ o z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, gim.c cVar) {
        super(cVar);
        this.z = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f149672y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, this);
    }
}
