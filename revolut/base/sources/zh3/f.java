package zh3;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends iri.a implements rh3.d {
    public static final /* synthetic */ KProperty[] f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f322223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f322224c;
    public final te0.j d;
    public final Sequence e;

    static {
        h0 h0Var = new h0(f.class, "onSuccessCommand", "getOnSuccessCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f = new KProperty[]{p0Var.j(h0Var), p.a.y(f.class, "isCheckoutFinishing", "isCheckoutFinishing()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(f.class, "accountId", "getAccountId()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var)};
    }

    public f() {
        te0.j jVar = new te0.j();
        this.f322223b = jVar;
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        this.f322224c = new te0.j(bool);
        AccountId.Personal personal = AccountId.Personal.f51414a;
        Intrinsics.checkNotNullParameter(personal, "default");
        te0.j jVar2 = new te0.j(personal);
        this.d = jVar2;
        KProperty[] kPropertyArr = f;
        te0.e[] elements = {jVar.getValue(this, kPropertyArr[0]), jVar2.getValue(this, kPropertyArr[2])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.e = kotlin.collections.d.E(elements);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.e;
    }
}
