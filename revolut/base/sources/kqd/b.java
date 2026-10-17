package kqd;

import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f188370a = new b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List listC;
        Subaccount subaccount = (Subaccount) obj2;
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        String pocketId = subaccount.getPocketId();
        return (pocketId == null || (listC = zhm.u.c(new IncomeSorterDestinationId.Pocket(pocketId))) == null) ? f0.f322471a : listC;
    }
}
