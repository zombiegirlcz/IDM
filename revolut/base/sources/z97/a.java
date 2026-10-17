package z97;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.feature.globalsearch.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o97.e0;
import o97.r;
import o97.y;
import te0.w;
import w4l.h;
import zf8.k;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zsc.l;
import zsc.m;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f320313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f320314c;

    public /* synthetic */ a(f fVar, String str, int i) {
        this.f320312a = i;
        this.f320313b = fVar;
        this.f320314c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object objK;
        int i = this.f320312a;
        String str = this.f320314c;
        f fVar = this.f320313b;
        switch (i) {
            case 0:
                int i2 = 1;
                Boolean featureEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(featureEnabled, "featureEnabled");
                if (Intrinsics.f(featureEnabled, Boolean.TRUE)) {
                    return m70.a.g(k.a(fVar.f320316a, h.f294642c), null, new z8d.h(i2), 1).map(new z3e.a(new a(fVar, str, i2), 27));
                }
                if (Intrinsics.f(featureEnabled, Boolean.FALSE)) {
                    return w.h(new Data(f0.f322471a, null, false, 6, null));
                }
                throw new NoWhenBranchMatchedException();
            default:
                List juniorDetails = (List) obj2;
                Intrinsics.checkNotNullParameter(juniorDetails, "juniorDetails");
                if (juniorDetails.isEmpty()) {
                    objK = f0.f322471a;
                } else {
                    zsc.h hVar = fVar.e;
                    m.Companion.getClass();
                    zsc.f fVar2 = new zsc.f(hVar, l.a(str));
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : juniorDetails) {
                        if (fVar2.a((sf8.m) obj3)) {
                            arrayList.add(obj3);
                        }
                    }
                    List listP0 = d0.P0(arrayList, new d());
                    if (listP0.isEmpty()) {
                        objK = f0.f322471a;
                    } else {
                        o97.f0 f0Var = new o97.f0(new TextLocalisedClause(R$string.junior_search_product_accounts_section_title, null, null, 14), "JUNIOR_SECTION_LIST_ID");
                        List<sf8.m> list = listP0;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                        for (sf8.m mVar : list) {
                            arrayList2.add(new RowDelegate.Model(j6.a.q("JUNIOR_ACCOUNT_LIST_ID_", mVar.f262360a), new RowDelegate.Model.MainImage.Image40(new ContactImage(mVar.f262361b, (String) null, (String) null, (String) null, (String) null, mVar.b(), (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550), null, null, false, null, false, 60), new TextLocalisedClause(R$string.junior_global_search_item_first_name, u.c(mVar.f262362c), null, 12), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new TextLocalisedClause(R$string.junior_global_search_item_amount, u.c(new MoneyClause(mVar.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, new y(r.JUNIOR_ACCOUNTS, mVar, null, 60), null, 0, 0, 0, 0, 532675576));
                        }
                        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                        objK = v.k(f0Var, new e0(arrayList2));
                    }
                }
                return zi0.c.P(objK, false, null, 3);
        }
    }
}
