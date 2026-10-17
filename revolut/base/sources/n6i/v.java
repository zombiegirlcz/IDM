package n6i;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.feature_move_money.api.model.AccountSource;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends gim.c {
    public int A;
    public j8l.a u;
    public TextClause v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LayeredImage f212821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AccountSource.VaultSource f212822x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f212823y;
    public final /* synthetic */ x z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, gim.c cVar) {
        super(cVar);
        this.z = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f212823y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(null, this);
    }
}
