package e23;

import com.revolut.feature.address.models.CountryState;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import qv0.p;
import te0.r;
import y7a.w;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends a8a.d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rh1.b f122019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f122020b;

    public g(rh1.b addressFlowInteractor) {
        Intrinsics.checkNotNullParameter(addressFlowInteractor, "addressFlowInteractor");
        this.f122019a = addressFlowInteractor;
        this.f122020b = new r(f0.f322471a);
    }

    @Override // a8a.d
    public final boolean b(String query, i model) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(model, "model");
        Object f55862c = ((p) model).getF();
        Intrinsics.i(f55862c, "null cannot be cast to non-null type com.revolut.feature.address.models.CountryState");
        CountryState countryState = (CountryState) f55862c;
        return d0.J(countryState.getName(), query, true) || d0.J(countryState.getCode(), query, true);
    }

    @Override // a8a.d
    public final w d(Set ids, Object obj2) {
        Object next;
        Intrinsics.checkNotNullParameter(ids, "ids");
        Iterator it8 = ((Iterable) this.f122020b.get()).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((CountryState) next).getCode(), zhm.d0.a0(ids))) {
                break;
            }
        }
        return new f((CountryState) next);
    }

    @Override // a8a.d
    public final efm.r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
        return rd0.e.c(nim.a.v(((lj1.a) this.f122019a).c((String) obj2), new dug.a(this, 29)), kotlin.coroutines.g.f186406a);
    }
}
