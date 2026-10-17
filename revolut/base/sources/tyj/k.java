package tyj;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.learn.impl.R$string;
import ip0.pb0;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import tx0.p4;
import whf.n;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f275681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f275682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f275683c;

    public k(n transactionItemsMapper) {
        Intrinsics.checkNotNullParameter(transactionItemsMapper, "transactionItemsMapper");
        this.f275681a = transactionItemsMapper;
        CounterTextDelegate.Model model = new CounterTextDelegate.Model("REWARD_TXN_TOTAL", new TextLocalisedClause(R$string.investmentlearn_home_rewards_total_earned, null, null, 14), CounterTextDelegate.c.a.f52173a, null, false, null, null, 0, 0, 0, 0, 2040);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listC = u.c(model);
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            pb0 pb0Var = new pb0(a0.d.n("REWARD_TXN_LOADING_", i));
            yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
            arrayList.add(pb0Var);
        }
        this.f275682b = d0.E0(arrayList, listC);
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("REWARD_TXN_EMPTY_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.investmentlearn_home_rewards_empty_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 57338);
        FullScreenStateDelegate.Model model3 = new FullScreenStateDelegate.Model("REWARD_TXN_EMPTY_ITEM", new TextLocalisedClause(R$string.investmentlearn_home_rewards_empty_subheader, null, null, 14), new TextLocalisedClause(R$string.investmentlearn_home_rewards_empty_message, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D006", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31712);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        this.f275683c = v.k(model2, model3);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i((List) iii.c.f(domainState.f275670a, new p4(this, 7), new tw8.g(11), new tvh.e(this, domainState, 3)));
    }
}
