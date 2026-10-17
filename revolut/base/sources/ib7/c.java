package ib7;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.hidden_accounts.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2j.l f160109a;

    public c(o2j.l pickerBalanceItemsMapper) {
        Intrinsics.checkNotNullParameter(pickerBalanceItemsMapper, "pickerBalanceItemsMapper");
        this.f160109a = pickerBalanceItemsMapper;
    }

    @Override // ib7.i
    public final h a(fb7.j domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        fb7.n nVar = domain.f133482a;
        if (!(nVar instanceof fb7.l)) {
            if (Intrinsics.f(nVar, fb7.m.f133490a)) {
                return new g(iii.c.c(5));
            }
            if (nVar instanceof fb7.k) {
                throw new IllegalArgumentException(p.a.p("Wrapper of type ", nVar.getClass().getSimpleName(), " is not expected here"));
            }
            throw new NoWhenBranchMatchedException();
        }
        fb7.l lVar = (fb7.l) nVar;
        ArrayList arrayList = lVar.f133488a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            a0.x(((k1j.b) it8.next()).f180284c, arrayList2);
        }
        if (arrayList2.isEmpty()) {
            List listC = u.c(new FullScreenStateDelegate.Model("HIDDEN_ACCOUNTS_EMPTY_LIST_ID", new TextLocalisedClause(R$string.hidden_accounts_screen_list_empty_state_title, null, null, 14), new TextLocalisedClause(R$string.hidden_accounts_screen_list_empty_state_description, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_wallet, null, null, 6)), null, null, false, null, null, false, 0, 0, 32752));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return new f(listC);
        }
        return new e(this.f160109a.e(lVar.f133489b, arrayList2, null, new j1j.b(false, null, false, 384)));
    }
}
