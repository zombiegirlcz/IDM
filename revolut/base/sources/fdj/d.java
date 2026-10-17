package fdj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.leaf.PriceTargetsFaqLeafScreenContract$InputData;
import fd2.n;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriceTargetsFaqLeafScreenContract$InputData f133963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f133964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f133965c;

    public d(a aVar, b bVar, PriceTargetsFaqLeafScreenContract$InputData priceTargetsFaqLeafScreenContract$InputData) {
        this.f133963a = priceTargetsFaqLeafScreenContract$InputData;
        int i = 3;
        this.f133964b = e4m.b.b(new n(this, 1, i));
        this.f133965c = e4m.b.b(new n(this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
