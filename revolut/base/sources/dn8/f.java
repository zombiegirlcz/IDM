package dn8;

import cli.y;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Filter;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.vaults.common.SavingAccountType;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.q;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends c {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f116239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xcd.a f116240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f116241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final an8.b f116242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f116243t;
    public final vii.b u;

    public f(l stateMapper, b input, hj8.a juniorProfileInteractor, xcd.a savingsRequestInteractor, ang.f userInteractor, an8.b juniorSavingProductInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(savingsRequestInteractor, "savingsRequestInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(juniorSavingProductInteractor, "juniorSavingProductInteractor");
        this.o = input;
        this.f116239p = juniorProfileInteractor;
        this.f116240q = savingsRequestInteractor;
        this.f116241r = userInteractor;
        this.f116242s = juniorSavingProductInteractor;
        this.f116243t = mra.d.b(this, new a(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), input.f116235a), stateMapper, null, false, 12);
        this.u = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.u, new cvi.i(continuation, this, 22)), null, null, new d8j.c(this, continuation, 27), 3);
    }

    @Override // dn8.c
    public final void I2(FullScreenStateDelegate.Model item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.f(item.f52373a, "ERROR_STATE_ID")) {
            this.u.a();
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Can't handle click on delegate with id = ", item.f52373a));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
    }

    @Override // dn8.c
    public final void J2() throws Throwable {
        Object objA;
        Object content;
        try {
            m.Companion companion = m.INSTANCE;
            content = ((a) ((j2) this.f116243t.f22677a).getValue()).e.getContent();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (content == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        objA = (SavingsProductData) content;
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof n) {
            objA = null;
        }
        SavingsProductData savingsProductData = (SavingsProductData) objA;
        if (savingsProductData == null) {
            return;
        }
        C1(new SavingsAccountCreationFlow$Destination(new SavingsAccountCreationFlow$Filter.ProductId(savingsProductData.f86683a.f86617a), new SavingAccountType.Junior(this.o.f116236b), 12));
    }

    @Override // dn8.c
    public final void K2() {
        l2(new cq6.k(this, null, 24), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f116243t;
    }
}
