package vge;

import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 implements n0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f288978c;
    public static final Object d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f288979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa7.m f288980b;

    static {
        ProductId productId = ProductId.CURRENCY;
        uy5.e.Companion.getClass();
        Pair pair = new Pair(productId, zhm.y0.b(uy5.d.f284077b));
        ProductId productId2 = ProductId.JOINT;
        i38.c.Companion.getClass();
        Pair pair2 = new Pair(productId2, zhm.y0.b(i38.b.f158111b));
        ProductId productId3 = ProductId.PRO;
        sha.b.Companion.getClass();
        Pair pair3 = new Pair(productId3, zhm.y0.b(sha.a.f263448b));
        ProductId productId4 = ProductId.ON_HOLD;
        w79.b.Companion.getClass();
        Pair pair4 = new Pair(productId4, zhm.y0.b(w79.a.f295493b));
        ProductId productId5 = ProductId.SAVINGS;
        nib.c.Companion.getClass();
        f288978c = zhm.r0.k(pair, pair2, pair3, pair4, new Pair(productId5, nib.b.d));
        gjb.b.Companion.getClass();
        Pair pair5 = new Pair(productId5, zhm.y0.b(gjb.b.f144248a));
        ProductId productId6 = ProductId.TEEN;
        bqe.b.Companion.getClass();
        Pair pair6 = new Pair(productId6, zhm.y0.b(bqe.a.f17818b));
        ProductId productId7 = ProductId.YOUTH;
        r68.b.Companion.getClass();
        d = zhm.r0.k(pair5, pair6, new Pair(productId7, zhm.y0.b(r68.a.f251650b)));
    }

    public q0(ang.f userInteractor, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f288979a = userInteractor;
        this.f288980b = hiddenAccountsInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if (r14 == r2) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(vge.q0 r10, java.util.List r11, java.util.Set r12, java.util.Set r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.q0.a(vge.q0, java.util.List, java.util.Set, java.util.Set, gim.c):java.io.Serializable");
    }

    public static boolean b(ProductAccount productAccount, Set set, Set set2) {
        ProductAccount.ValueItem.Main main = productAccount instanceof ProductAccount.ValueItem.Main ? (ProductAccount.ValueItem.Main) productAccount : null;
        if (main != null) {
            ProductAccountId productAccountId = main.f89504c;
            if (set.contains(productAccountId.f89729a)) {
                return true;
            }
            Set set3 = set2;
            if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                Iterator it8 = set3.iterator();
                while (it8.hasNext()) {
                    if (kotlin.text.a0.H(productAccountId.f89729a, (String) it8.next(), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
