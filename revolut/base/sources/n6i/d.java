package n6i;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public kel.b A;
    public /* synthetic */ Object B;
    public final /* synthetic */ e C;
    public int D;
    public String u;
    public TradingAccount v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j8l.a f212791w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Clause f212792x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Image f212793y;
    public Parcelable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.C = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, this);
    }
}
