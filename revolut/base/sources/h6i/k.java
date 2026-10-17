package h6i;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.feature_move_money.api.model.AccountSource;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.c {
    public final /* synthetic */ o A;
    public int B;
    public String u;
    public j8l.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextClause f149684w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CurrencyImage f149685x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AccountSource.PocketSource f149686y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, gim.c cVar) {
        super(cVar);
        this.A = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.d(this, null, null);
    }
}
