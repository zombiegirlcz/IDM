package dnc;

import cie.l1;
import com.revolut.data.model.Data;
import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreenContract$InputData;
import dmj.e0;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioAllocationsDetailsScreenContract$InputData f116284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f116285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f116286c;
    public final f0 d;

    public x(PortfolioAllocationsDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f116284a = inputData;
        this.f116285b = yhm.j.b(new d8e.a(this, 10));
        this.f116286c = yhm.j.b(new dmj.b(2));
        this.d = f0.f322471a;
    }

    public final List a(Data data, i iVar) {
        List list;
        return (data == null || (list = (List) iii.c.f(data, new e0(this, 2), new dgj.h(this, iVar), new l1(27))) == null) ? this.d : list;
    }
}
