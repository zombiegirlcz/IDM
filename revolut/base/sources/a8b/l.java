package a8b;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmation;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmationItem;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmationSection;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.confirmation.CobrandedCardsDowngradeConfirmationScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import r5b.p;
import r5b.q;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsDowngradeConfirmationScreenContract$InputData f2155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c7b.a f2156b;

    public l(CobrandedCardsDowngradeConfirmationScreenContract$InputData inputData, c7b.a iconsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(iconsMapper, "iconsMapper");
        this.f2155a = inputData;
        this.f2156b = iconsMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        Iterator it8;
        Custom custom;
        boolean z;
        RowDelegate.Model.MainImage.Image24 image24;
        RowDelegate.Model model;
        ResourceImage resourceImage;
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CobrandedCardsValueReminderActionConfirmation cobrandedCardsValueReminderActionConfirmation = this.f2155a.f82633a;
        Iterable iterableC = cobrandedCardsValueReminderActionConfirmation.d;
        if (iterableC == null) {
            List list = cobrandedCardsValueReminderActionConfirmation.f82451c;
            iterableC = list != null ? u.c(new CobrandedCardsValueReminderActionConfirmationSection(list)) : f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it9 = iterableC.iterator();
        int i = 0;
        while (it9.hasNext()) {
            Object next = it9.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            List list2 = ((CobrandedCardsValueReminderActionConfirmationSection) next).f82458a;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            int i3 = 0;
            for (Object obj2 : list2) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    v.s();
                    throw null;
                }
                CobrandedCardsValueReminderActionConfirmationItem cobrandedCardsValueReminderActionConfirmationItem = (CobrandedCardsValueReminderActionConfirmationItem) obj2;
                String strG = a0.d.g(i, i3, "item_", "_");
                String str = cobrandedCardsValueReminderActionConfirmationItem.d;
                p pVar = cobrandedCardsValueReminderActionConfirmationItem.f;
                String str2 = (pVar == null || pVar == p.NONE) ? str : null;
                if (str2 != null) {
                    model = new RowDelegate.Model(strG, null, new TextClause(cobrandedCardsValueReminderActionConfirmationItem.f82454a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(null, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, ISO781611.SMT_TAG), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867834);
                    it8 = it9;
                } else {
                    q qVar = cobrandedCardsValueReminderActionConfirmationItem.f82457g;
                    if (pVar == null || pVar == p.NONE) {
                        pVar = null;
                    }
                    String str3 = cobrandedCardsValueReminderActionConfirmationItem.f82454a;
                    int[] iArr = k.f2154a;
                    int i6 = iArr[qVar.ordinal()];
                    it8 = it9;
                    if (i6 == 1) {
                        custom = new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254);
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        custom = null;
                    }
                    TextClause textClause = new TextClause(str3, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
                    String str4 = cobrandedCardsValueReminderActionConfirmationItem.f82455b;
                    TextClause textClause2 = str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                    String str5 = cobrandedCardsValueReminderActionConfirmationItem.f82456c;
                    if (str5 != null) {
                        int i21 = iArr[qVar.ordinal()];
                        c7b.a aVar = this.f2156b;
                        if (i21 == 1) {
                            resourceImage = new ResourceImage(aVar.b(str5), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusDanger), (List) null, (ImageTransformations) null, (Clause) null, 246);
                        } else {
                            if (i21 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            resourceImage = aVar.c(str5);
                        }
                        z = false;
                        image24 = new RowDelegate.Model.MainImage.Image24(resourceImage, false, false, 6);
                    } else {
                        z = false;
                        image24 = null;
                    }
                    model = new RowDelegate.Model(strG, image24, textClause, null, 0, textClause2, null, null, 0, null, pVar != null ? true : z, null, false, null, null, null, null, null, null, pVar != null ? new e(pVar, cobrandedCardsValueReminderActionConfirmationItem.e) : null, null, 0, 0, 0, 0, 532674520);
                }
                arrayList2.add(model);
                i3 = i5;
                it9 = it8;
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            a0.x(arrayList2, arrayList);
            i = i2;
        }
        return new i(arrayList);
    }
}
