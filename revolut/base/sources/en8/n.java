package en8;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Filter;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.vaults.common.SavingAccountType;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.q;
import yhm.m;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends oki.h implements h {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final djb.n f127780p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hj8.a f127781q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bn2.p f127782r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final an8.b f127783s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f127784t;
    public final y u;

    public n(f inputData, cli.n stateMapper, djb.n savingsAccountsDetailsInteractor, hj8.a juniorProfileInteractor, bn2.p backgroundsInteractor, an8.b juniorSavingProductInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(juniorSavingProductInteractor, "juniorSavingProductInteractor");
        this.o = inputData;
        this.f127780p = savingsAccountsDetailsInteractor;
        this.f127781q = juniorProfileInteractor;
        this.f127782r = backgroundsInteractor;
        this.f127783s = juniorSavingProductInteractor;
        this.f127784t = new vii.b();
        this.u = mra.d.b(this, new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public static final akg.n I2(n nVar, w4l.k kVar) {
        return nim.a.v(xam.a.h(new k(0, nVar, null), rd0.e.b(((rnb.i) nVar.f127780p).f(new djb.m(nVar.o.f127766a), kVar))), new elb.a(nVar, 13));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l lVar = new l(0, this, continuation);
        vii.b bVar = this.f127784t;
        yji.l.a1(this, q.Q(bVar, lVar), null, null, new k(1, this, continuation), 3);
        yji.l.a1(this, q.Q(bVar, new l(1, this, continuation)), null, null, new k(2, this, continuation), 3);
        yji.l.a1(this, q.Q(bVar, new l(2, this, continuation)), null, null, new k(3, this, continuation), 3);
    }

    public final void J2() {
        Object objA;
        Object content;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            content = ((e) ((j2) this.u.f22677a).getValue()).f127765c.getContent();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (content == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        objA = (SavingsProductData) content;
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        SavingsProductData savingsProductData = (SavingsProductData) objA;
        if (savingsProductData == null) {
            return;
        }
        C1(new SavingsAccountCreationFlow$Destination(new SavingsAccountCreationFlow$Filter.ProductId(savingsProductData.f86683a.f86617a), new SavingAccountType.Junior(this.o.f127766a), 12));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
