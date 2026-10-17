package nla;

import aw0.l6;
import do3.n;
import efm.k;
import gim.i;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.concurrent.CancellationException;
import kii.e;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import ofm.f;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.o;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements eq0.a {

    @NotNull
    public static final a Companion = new a();
    public static final LocalDate d = LocalDate.of(2024, Month.SEPTEMBER, 25);
    public static final String e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f217105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bng.b f217106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f217107c;

    static {
        Intrinsics.checkNotNullParameter("VIEWED_PRODUCT_INTROS", "id");
        e = "VIEWED_PRODUCT_INTROS";
    }

    public b(mk0.a personalisationStorage, kla.a productIntroToggleResolver, bng.b userInfoProvider, j errorsStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(productIntroToggleResolver, "productIntroToggleResolver");
        Intrinsics.checkNotNullParameter(userInfoProvider, "userInfoProvider");
        Intrinsics.checkNotNullParameter(errorsStorage, "errorsStorage");
        this.f217105a = personalisationStorage;
        this.f217106b = userInfoProvider;
        this.f217107c = errorsStorage;
    }

    @Override // eq0.a
    public final Object e(l6 l6Var, i iVar) {
        String str = e;
        mk0.a aVar = this.f217105a;
        List list = (List) e.n(str, aVar);
        if (list == null) {
            list = f0.f322471a;
        }
        if (list.contains(l6Var.b())) {
            return Unit.f186387a;
        }
        Object objE = aVar.e(new tk0.e(str), d0.F0(l6Var.b(), list), iVar);
        return objE == fim.a.COROUTINE_SUSPENDED ? objE : Unit.f186387a;
    }

    @Override // eq0.a
    public final void f(l6 product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f217107c.f(product.b(), Boolean.TRUE);
    }

    @Override // eq0.b
    public final boolean h(l6 product) throws Throwable {
        Object objA;
        boolean z;
        Intrinsics.checkNotNullParameter(product, "product");
        if (Intrinsics.f(this.f217107c.get(product.b()), Boolean.TRUE)) {
            return false;
        }
        List list = (List) e.n(e, this.f217105a);
        if (list == null) {
            list = f0.f322471a;
        }
        od0.a aVar = od0.a.f224253a;
        if ((od0.a.g() ? false : list.contains("SKIP_ALL_PRODUCT_INTROS")) || list.contains(product.b())) {
            return false;
        }
        if (product.a()) {
            bng.b bVar = this.f217106b;
            try {
                m.Companion companion = m.INSTANCE;
                k kVarC = bVar.f17168a.d.c();
                f fVar = new f(1);
                kVarC.i(fVar);
                n nVar = (n) fVar.a();
                objA = nVar != null ? nVar.f116418q : null;
            } catch (CancellationException e2) {
                throw e2;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            Throwable thA = m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
            z = ((Long) (objA instanceof yhm.n ? null : objA)) != null ? !oc.c.H(r0.longValue(), g0m.a.a()).isBefore(d) : false;
        } else {
            z = true;
        }
        return z;
    }
}
