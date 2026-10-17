package jlh;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f175835a;

    public v(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f175835a = featureToggleInteractor;
    }

    public static ArrayList a(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            arrayList.add(pkh.m.a("DISCLOSURES_" + i, (Pair) obj2));
            i = i2;
        }
        return arrayList;
    }
}
