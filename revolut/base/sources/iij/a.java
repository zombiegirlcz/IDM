package iij;

import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import igh.k;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f161623a = new a();

    private a() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        EsimDataPlan first = (EsimDataPlan) obj2;
        EsimDataPlan second = (EsimDataPlan) obj3;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return cim.b.c(first, second, new k(19), new k(20), new k(21), new k(22));
    }
}
