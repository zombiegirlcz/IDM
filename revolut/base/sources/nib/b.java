package nib;

import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f215666a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f215667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f215668c;
    public static final Set d;

    static {
        ProductId productId = ProductId.SAVINGS;
        String strQ = j6.a.q("Total-", productId.getId());
        f215667b = strQ;
        String strP = p.a.p("Total-", ProductId.JOINT.getId(), productId.getId());
        f215668c = strP;
        String[] elements = {strQ, strP};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d = kotlin.collections.d.y0(elements);
    }

    private b() {
    }
}
