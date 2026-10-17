package e1a;

import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f121938a = TimeUnit.MINUTES.toMillis(1);

    public static final class a {
        private a() {
        }
    }

    public static List a(List newLinks, List cachedLinks) {
        Intrinsics.checkNotNullParameter(newLinks, "newLinks");
        Intrinsics.checkNotNullParameter(cachedLinks, "cachedLinks");
        ArrayList arrayListE0 = d0.E0(cachedLinks, newLinks);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : arrayListE0) {
            if (hashSet.add(((SplitBillLink) obj2).f79939a)) {
                arrayList.add(obj2);
            }
        }
        return d0.V0(d0.P0(arrayList, new h()), 500);
    }
}
