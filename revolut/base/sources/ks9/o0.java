package ks9;

import com.revolut.feature.payments.groups.models.GroupCurrencySpend;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o0 extends yji.n implements j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gte.a f189363l;

    public o0(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f189363l = featureToggleInteractor;
    }

    public static ArrayList Z2(List list) {
        List<GroupCurrencySpend> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (GroupCurrencySpend groupCurrencySpend : list2) {
            xi0.b bVar = groupCurrencySpend.f79500a;
            dj0.d dVar = groupCurrencySpend.f79501b;
            dj0.d dVar2 = groupCurrencySpend.f79502c;
            if (Intrinsics.f(dVar2.f115083b, bVar)) {
                dVar2 = null;
            }
            arrayList.add(new us9.a(dVar, dVar2, bVar));
        }
        return arrayList;
    }
}
