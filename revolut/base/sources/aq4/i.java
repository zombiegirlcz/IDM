package aq4;

import android.os.Parcelable;
import b4c.o;
import b4c.x;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.bo0;
import ip0.ls;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextLocalisedClause f8254b;

    public /* synthetic */ i(int i, TextLocalisedClause textLocalisedClause) {
        this.f8253a = i;
        this.f8254b = textLocalisedClause;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f8253a;
        TextLocalisedClause textLocalisedClause = this.f8254b;
        switch (i) {
            case 0:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return k.a(textLocalisedClause, (List) getDefaultLoadingItems.invoke(), false, false);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ListSubheaderDelegate.Model modelB = x.b();
                ls lsVar = new ls("loading_1");
                yp0.b.l(lsVar, R$attr.uikit_dp0, R$attr.uikit_dp4, 0, 0, null, false, 60);
                ls lsVar2 = new ls("loading_2");
                yp0.b.l(lsVar2, R$attr.uikit_dp4, R$attr.uikit_dp0, 0, 0, null, false, 60);
                return new o(textLocalisedClause, v.k(modelB, lsVar, lsVar2));
            case 2:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new o(textLocalisedClause, it8);
            case 3:
                return dx5.e.a((dx5.e) obj2, null, null, textLocalisedClause, 31);
            case 4:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                itb.a aVar = (itb.a) pair.f186385a;
                Boolean bool = (Boolean) pair.f186386b;
                bool.getClass();
                return new i5a.a(textLocalisedClause, aVar.f168357a, bool);
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("TOP_DESTINATIONS_SUBHEADER", (Image) null, (Clause) this.f8254b, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp16, R$attr.uikit_dp12, 0, 0, 53242);
                IntRange intRangeO = kotlin.ranges.f.o(0, 2);
                ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
                vim.f it9 = intRangeO.iterator();
                while (it9.f289625c) {
                    bo0 bo0Var = new bo0(a0.d.n("TOP_DESTINATIONS_VOUCHER_LOADING_PREFIX", it9.nextInt()));
                    yp0.b.l(bo0Var, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(bo0Var);
                }
                return v.k(model, ihg.d.a(arrayList));
            case 6:
                Function0 defaultFactory = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return new vne.g(textLocalisedClause, (List) defaultFactory.invoke());
            default:
                return vq5.g.a((vq5.g) obj2, null, null, null, null, null, this.f8254b, 6143);
        }
    }

    public /* synthetic */ i(TextLocalisedClause textLocalisedClause, x xVar) {
        this.f8253a = 1;
        this.f8254b = textLocalisedClause;
    }

    public /* synthetic */ i(Object obj2, TextLocalisedClause textLocalisedClause, int i) {
        this.f8253a = i;
        this.f8254b = textLocalisedClause;
    }
}
