package krj;

import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.retail.feature.impl.budgeting.database.BudgetingDatabase;
import com.revolut.retail.feature.impl.budgeting.network.services.BudgetingService;
import kotlin.jvm.internal.Intrinsics;
import od0.e;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import te0.w;
import w4l.f;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BudgetingService f188880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BudgetingDatabase f188881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f188882c;
    public final f d;

    public d(BudgetingService service, BudgetingDatabase database, b80.c connectivityRepository, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f188880a = service;
        this.f188881b = database;
        this.f188882c = memoryCache;
        this.d = new f(w.k0(connectivityRepository, new b(this, 0)), new b(this, 1), new c(this, 0), new b(this, 2), new c(this, 1), null, null, null, BERTags.FLAGS);
    }

    public final void a(String str) {
        this.d.k(new WalletId(str), this.f188881b.g().c(str));
    }

    @Override // od0.e
    public final void clear() {
        this.f188882c.clear();
    }
}
