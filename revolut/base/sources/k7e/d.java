package k7e;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import do3.n;
import h93.f0;
import ia3.q;
import ia3.r;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import pcd.m;
import yhm.o;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function3 {
    public final /* synthetic */ io3.d A;
    public final /* synthetic */ String B;
    public /* synthetic */ h6e.d u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f182042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f182043x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ yt8.c f182044y;
    public final /* synthetic */ Subaccount z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, n nVar, yt8.c cVar, Subaccount subaccount, io3.d dVar, String str, Continuation continuation) {
        super(3, continuation);
        this.f182042w = fVar;
        this.f182043x = nVar;
        this.f182044y = cVar;
        this.z = subaccount;
        this.A = dVar;
        this.B = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        io3.d dVar = this.A;
        String str = this.B;
        d dVar2 = new d(this.f182042w, this.f182043x, this.f182044y, this.z, dVar, str, (Continuation) obj4);
        dVar2.u = (h6e.d) obj2;
        dVar2.v = zBooleanValue;
        return dVar2.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? arrayList;
        RowDelegate.Model model;
        RowDelegate.Model model2;
        h6e.b bVar;
        TextClause textClause;
        TextClause textClause2;
        h6e.c cVar;
        f0 f0Var;
        h6e.d dVar = this.u;
        boolean z = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = this.f182042w.e;
        r rVar = jVar.f182053a;
        n user = this.f182043x;
        Intrinsics.h(user);
        yt8.c kyc2 = this.f182044y;
        Intrinsics.h(kyc2);
        yt8.i iVar = kyc2.f316662a;
        Subaccount subaccount = this.z;
        pcd.b accountType = subaccount.getF88959a().f234889n;
        String name = subaccount.getName();
        xi0.b currency = subaccount.getCurrency();
        List listA = x8e.a.a(subaccount);
        if (listA != null) {
            List list = listA;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(((m) it8.next()).f234873b);
            }
        } else {
            arrayList = zhm.f0.f322471a;
        }
        PocketWithSubaccount pocketWithSubaccout = new PocketWithSubaccount(this.A, name, currency, (List) arrayList, subaccount.c().equals(SubaccountType.Pro.f88964a), 4);
        m93.d dVar2 = jVar.f182054b;
        String id10 = this.B;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(pocketWithSubaccout, "pocketWithSubaccout");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        Intrinsics.checkNotNullParameter(user, "user");
        if (dVar == null || (cVar = dVar.f149629a) == null || (f0Var = cVar.f149628a) == null) {
            model = null;
        } else if (accountType == pcd.b.PERSONAL_JOINT) {
            Image imageC = ((ia3.h) dVar2).c(f0Var);
            UserAvatarImage userAvatarImage = new UserAvatarImage(new UserNamePlaceholder.Default(te0.w.I(user), 0), null, null, 6);
            CompositeClause compositeClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.card_name_prefix_joint, null, null, 14), new TextClause(f0Var.I, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12);
            m93.e eVar = m93.f.Companion;
            model = new RowDelegate.Model("LINKED_CARD_ITEM_ID", new RowDelegate.Model.MainImage.Image40(imageC, userAvatarImage, null, false, 28), compositeClause, null, 0, rVar.m(f0Var, iVar, null), null, null, 0, null, false, null, false, null, null, null, null, null, null, new hpg.e(f0Var, accountType), null, 0, 0, 0, 0, 532676568);
        } else {
            model = new RowDelegate.Model("LINKED_CARD_ITEM_ID", new RowDelegate.Model.MainImage.Image40(((ia3.h) dVar2).c(f0Var), rVar.j(f0Var, iVar, null), null, false, 28), m93.f.b(rVar, f0Var, null, Boolean.valueOf(z), 10), null, 0, rVar.m(f0Var, iVar, null), null, null, 0, null, false, null, false, null, null, null, null, null, null, new hpg.e(f0Var, accountType), null, 0, 0, 0, 0, 532676568);
        }
        if (dVar == null || (bVar = dVar.f149630b) == null) {
            model2 = null;
        } else {
            Image imageB = ((ia3.h) dVar2).b(new b93.j(new b93.b(bVar.d), bVar.e), false);
            ContactImage contactImage = new ContactImage((String) null, (String) null, bVar.f149626h, (String) null, (String) null, bVar.f149627j, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4059);
            CompositeClause compositeClause2 = new CompositeClause(v.k(new TextLocalisedClause(R$string.card_name_prefix_joint, null, null, 14), new TextClause(bVar.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12);
            TextClause ownerName = new TextClause(bVar.i, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = bVar.f149623b;
            LocalDate localDate = bVar.f149624c;
            Intrinsics.checkNotNullParameter(ownerName, "ownerName");
            q qVar = r.Companion;
            if (str != null) {
                String strConcat = "··".concat(str);
                Intrinsics.checkNotNullExpressionValue(strConcat, "toString(...)");
                textClause = new TextClause(strConcat, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                textClause = null;
            }
            if (localDate != null) {
                String str2 = localDate.format(r.f159945b);
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                textClause2 = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                textClause2 = null;
            }
            TextClause[] elements = {textClause, textClause2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            CompositeClause compositeClause3 = new CompositeClause(listL, com.revolut.core.ui_kit.models.b.a(), null, null, 12);
            if (listL.isEmpty()) {
                compositeClause3 = null;
            }
            Clause[] elements2 = {compositeClause3, ownerName};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            model2 = new RowDelegate.Model("LINKED_CARD_ITEM_ID", new RowDelegate.Model.MainImage.Image40(imageB, contactImage, null, false, 28), compositeClause2, null, 0, new CompositeClause(kotlin.collections.d.L(elements2), new DotDividerClause((Integer) null), null, null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, new hpg.f(bVar.f149627j, bVar.f149626h, accountType), null, 0, 0, 0, 0, 532676568);
        }
        RowDelegate.Model[] elements3 = {model, model2, (dVar != null ? dVar.f149629a : null) == null ? new RowDelegate.Model("LINKED_CARD_ITEM_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_card, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_home_widgets_payments_link_a_card_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_home_widgets_payments_link_a_card_subtitle, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, new hpg.d(pocketWithSubaccout), null, 0, 0, 0, 0, 532675544) : null};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        return RowsWidgetDelegate.Model.Companion.a(RowsWidgetDelegate.Model.INSTANCE, id10, accountType == pcd.b.PERSONAL_JOINT ? new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_home_widgets_payments_linked_cards_title, null, null, 14) : new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_home_widgets_payments_linked_card_title, null, null, 14), kotlin.collections.d.L(elements3), false, null, 112);
    }
}
