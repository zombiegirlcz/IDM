package c64;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreen;
import com.revolut.feature_news_impl.R$id;
import com.revolut.feature_news_impl.presentation.ui.NewsInfoActivity;
import com.revolut.retail.common.ui.model.NewsUiItem;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialogAnswer;
import efm.h0;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements kfm.g, kfm.o, Toolbar.OnMenuItemClickListener, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21605b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f21604a = i;
        this.f21605b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f21604a;
        Object obj3 = this.f21605b;
        switch (i) {
            case 0:
                ((c1g.o) obj3).invoke(obj2);
                break;
            case 2:
                ((bd2.b) obj3).invoke(obj2);
                break;
            case 3:
                ((c86.c) obj3).invoke(obj2);
                break;
            case 5:
                ((c42.j) obj3).invoke(obj2);
                break;
            case 19:
                KProperty[] kPropertyArr = MoneyBoxAmountInputScreen.i0;
                ((ccb.b) obj3).invoke(obj2);
                break;
            default:
                ((cd0.a) obj3).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f21604a) {
            case 4:
                c69.v vVar = (c69.v) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) vVar.invoke(p0);
            case 5:
            case 13:
            case 16:
            case 17:
            case 19:
            case 25:
            default:
                ccg.c cVar = (ccg.c) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) cVar.invoke(p0);
            case 6:
                c8i.o oVar = (c8i.o) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) oVar.invoke(p0);
            case 7:
                c69.v vVar2 = (c69.v) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) vVar2.invoke(p0);
            case 8:
                c69.v vVar3 = (c69.v) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) vVar3.invoke(p0);
            case 9:
                a09.z zVar = (a09.z) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) zVar.invoke(p0);
            case 10:
                c8i.o oVar2 = (c8i.o) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) oVar2.invoke(p0);
            case 11:
                c8i.c cVar2 = (c8i.c) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar2.invoke(p0);
            case 12:
                byi.i iVar = (byi.i) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) iVar.invoke(p0);
            case 14:
                c8i.c cVar3 = (c8i.c) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar3.invoke(p0);
            case 15:
                c8i.c cVar4 = (c8i.c) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (SuspiciousTransactionDialogAnswer) cVar4.invoke(p0);
            case 18:
                bwc.i iVar2 = (bwc.i) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) iVar2.invoke(p0);
            case 20:
                ccf.r rVar = (ccf.r) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) rVar.invoke(p0);
            case 21:
                ccf.r rVar2 = (ccf.r) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) rVar2.invoke(p0);
            case 22:
                ccf.r rVar3 = (ccf.r) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) rVar3.invoke(p0);
            case 23:
                ccf.r rVar4 = (ccf.r) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) rVar4.invoke(p0);
            case 24:
                ccg.c cVar5 = (ccg.c) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return cVar5.invoke(p0);
            case 26:
                c69.v vVar4 = (c69.v) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) vVar4.invoke(p0);
            case 27:
                cd0.b bVar = (cd0.b) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (cd0.e) bVar.invoke(p0);
            case 28:
                c69.v vVar5 = (c69.v) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) vVar5.invoke(p0);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        b9i.b bVar;
        b9i.l lVar;
        NewsUiItem newsUiItem;
        String str;
        String str2;
        NewsInfoActivity newsInfoActivity = (NewsInfoActivity) this.f21605b;
        KProperty[] kPropertyArr = NewsInfoActivity.f97429x0;
        if (menuItem.getItemId() != R$id.menu_action_share || (bVar = (b9i.b) newsInfoActivity.f218652a0) == null || (newsUiItem = (lVar = (b9i.l) bVar).f13802p) == null || (str = newsUiItem.f) == null || (str2 = newsUiItem.d) == null) {
            return false;
        }
        lVar.f13798j.c(lVar.i.f(0, str, str2));
        return true;
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f21604a) {
            case 16:
                c8i.c cVar = (c8i.c) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) cVar.invoke(p0)).booleanValue();
            default:
                c8i.c cVar2 = (c8i.c) this.f21605b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) cVar2.invoke(p0)).booleanValue();
        }
    }
}
