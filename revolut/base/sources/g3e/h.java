package g3e;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.joint.impl.domain.InitialArticleNavigationDecoratorImpl$Companion;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.v4;
import ip0.w4;
import ip0.yl;
import java.util.ArrayList;
import java.util.List;
import jel.w2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n38.e0;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140273a;

    public /* synthetic */ h(int i) {
        this.f140273a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = 0;
        switch (this.f140273a) {
            case 0:
                lk0.e previousPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(previousPage, "previousPage");
                int size = previousPage.f196171a.size();
                d dVar = (d) previousPage.f196172b;
                if (size < dVar.f140266a) {
                    return null;
                }
                return new d(10, dVar.f140267b + 10, dVar.f140268c);
            case 1:
                Intrinsics.checkNotNullParameter((lk0.g) obj2, "it");
                return Boolean.valueOf(!r1.f196174a.isEmpty());
            case 2:
                Intrinsics.checkNotNullParameter((lk0.e) obj2, "it");
                return null;
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return zhm.u.c(nb0.b(pb0.Companion, "EXCLUSIVES_LOADING_LIST_ID", false, 0, false, 30));
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                v4 v4Var = new v4("EXCLUSIVES_LOADING_HERO_LIST_ID", w4.SQUARE, 60);
                yp0.b.l(v4Var, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(u.a(zhm.u.c(v4Var)));
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(3);
            case 6:
                l71.d company = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(company, "company");
                return new ProductArticleParams.ArticleReference.Key(l71.f.g(company) ? InitialArticleNavigationDecoratorImpl$Companion.JointProductArticleKey.PORTUGAL_BIG_TILE : l71.f.b(company) ? InitialArticleNavigationDecoratorImpl$Companion.JointProductArticleKey.COLOMBIA_BIG_TILE : InitialArticleNavigationDecoratorImpl$Companion.JointProductArticleKey.BIG_TILE);
            case 7:
                return new g48.m(new TextLocalisedClause(R$string.joint_home_invitation_cancelled_prompt_title, null, null, 14), new TextLocalisedClause(((Boolean) obj2).booleanValue() ? R$string.joint_home_invitation_cancelled_prompt_subtitle : R$string.joint_home_invitation_cancelled_prompt_no_joint_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d051", null, null, null, 30));
            case 8:
                ((Boolean) obj2).getClass();
                return new g48.m(new TextLocalisedClause(R$string.joint_prompt_first_purchase_title, null, null, 14), new TextLocalisedClause(R$string.joint_prompt_first_purchase_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d223", null, null, null, 30));
            case 9:
                zm3.a otherUserContact = (zm3.a) obj2;
                Intrinsics.checkNotNullParameter(otherUserContact, "otherUserContact");
                return hx7.q.v(otherUserContact);
            case 10:
                e0 it8 = (e0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.b() + "-" + it8.d();
            case 11:
                od0.i it9 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (n38.a) it9.f224257a;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                eVarB.add(new yl("cfd-positions-pnl-header-loading", 0, 30));
                while (i < 5) {
                    eVarB.add(new s7(a0.d.n("cfd-positions-header-info-item-loading-", i), 0, 0, 0, 0, false, null, 126));
                    i++;
                }
                aim.e eVarA = zhm.u.a(eVarB);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                return eVarA;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return g4b.r.f140460a;
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 16:
                y49.b it10 = (y49.b) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new g4b.j(it10);
            case 17:
                y49.h positionsPerformance = (y49.h) obj2;
                Intrinsics.checkNotNullParameter(positionsPerformance, "positionsPerformance");
                return positionsPerformance.f310853l.size() == 1 ? new g4b.j(new y49.b(positionsPerformance.f310847a, (y49.e) d0.b0(positionsPerformance.f310853l))) : new g4b.i(positionsPerformance);
            case 18:
                g4b.l it11 = (g4b.l) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Data data = it11.f140448c;
                if (data != null) {
                    return (g4b.k) data.getContent();
                }
                return null;
            case 19:
                y49.e eVar = (y49.e) obj2;
                if (eVar != null) {
                    return eVar.f310837a;
                }
                return null;
            case 20:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 5);
                while (i < 5) {
                    pb0 pb0VarB = nb0.b(pb0.Companion, a0.d.v(new Object[]{Integer.valueOf(i)}, 1, "ORDER_HISTORY_LOADING_LIST_ID_%s", "format(...)"), false, 0, false, 30);
                    yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                    arrayListP.add(pb0VarB);
                    i++;
                }
                return arrayListP;
            case 21:
                g57.h update = (g57.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                g57.g gVar = update.f140674b;
                return g57.h.a(update, null, gVar != null ? g57.g.a(gVar, !gVar.f140670a, null, null, 6) : null, 1);
            case 22:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new g57.o(g57.r.b(), (List) getDefaultLoadingItems.invoke(), g57.r.a(false));
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 24:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 25:
                jel.c it12 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                if (it12 instanceof w2) {
                    return (w2) it12;
                }
                return null;
            case 26:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                return f0.f322471a;
            case 27:
                g62.d update2 = (g62.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return g62.d.a(update2, Data.copy$default(update2.f140815a, null, null, true, 3, null), false, 2);
            case 28:
                return g62.d.a((g62.d) obj2, null, false, 1);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("ID_LOADING_HEADER", 0, 0, 30);
                pb0 pb0VarB2 = nb0.b(pb0.Companion, "ID_LOADING_ITEM", false, 0, false, 30);
                yp0.b.l(pb0VarB2, 0, 0, 0, 0, null, false, 63);
                return v.k(guVar, pb0VarB2);
        }
    }

    public /* synthetic */ h(cli.n nVar, int i) {
        this.f140273a = i;
    }
}
