package ck2;

import cie.l1;
import cli.j;
import cli.n;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.atm.impl.R$string;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lw0.m;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final egk.e f24754a;

    public h(egk.e pricingPlanUiInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanUiInteractor, "pricingPlanUiInteractor");
        this.f24754a = pricingPlanUiInteractor;
    }

    public static ArrayList a() {
        IntRange intRange = new IntRange(0, 2, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new s7(a0.d.n("LOADING_LIST_ID", it8.nextInt()), 0, 0, 0, 0, false, null, 126));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public static Clause b(float f) {
        return f == BitmapDescriptorFactory.HUE_RED ? new TextLocalisedClause(R$string.atm_weekend_markups_free, null, null, 14) : new PercentageClause(f, (PercentageClause.Format) null, (Custom) null, 6);
    }

    @Override // cli.n
    public final o c(j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f24751a;
        Data data2 = domainState.f24752b;
        Data data3 = domainState.f24753c;
        m mVar = (m) iii.c.f(t1.u(data, data2, data3), new cjj.j(this, 1), new ccg.a(this, 23), new l1(this, 2));
        Data data4 = domainState.f24751a;
        return new cii.b((aw0.e) iii.c.f(t1.u(data4, data2, data3), new cjj.j(this, 3), new ccg.a(this, 25), new l1(3)), (List) iii.c.f(t1.u(data4, data2, data3), new cjj.j(this, 2), new ccg.a(this, 24), new cf1.h(this, 4)), mVar);
    }
}
