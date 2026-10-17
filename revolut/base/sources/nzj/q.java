package nzj;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends iri.a implements d {
    public static final /* synthetic */ KProperty[] e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f221090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f221091c;
    public final Sequence d;

    static {
        h0 h0Var = new h0(q.class, "limit", "getLimit()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        e = new KProperty[]{p0Var.j(h0Var), p.a.y(q.class, "accountId", "getAccountId()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public q() {
        te0.j jVar = new te0.j();
        this.f221090b = jVar;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        Intrinsics.checkNotNullParameter(personal, "default");
        te0.j jVar2 = new te0.j(personal);
        this.f221091c = jVar2;
        KProperty[] kPropertyArr = e;
        te0.e[] elements = {jVar.getValue(this, kPropertyArr[0]), jVar2.getValue(this, kPropertyArr[1])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d = kotlin.collections.d.E(elements);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.d;
    }
}
