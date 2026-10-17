package khj;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.badge.RetailBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.AvatarByUserIdImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.R$plurals;
import com.revolut.retail.feature.esim.impl.R$string;
import do3.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f184158a;

    public l(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f184158a = featureToggleInteractor;
    }

    public final RowDelegate.Model a(i iVar, String str) {
        TextClause textClause;
        Clause textLocalisedClause;
        Clause textLocalisedQuantityClause;
        String str2;
        String str3;
        String strQ;
        RowDelegate.Model.MainImage.Image40 image40;
        boolean z = iVar instanceof f;
        gte.a aVar = this.f184158a;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(((jte.d) aVar).c(EsimApi$Toggles.EsimGifting.f100175c) ? R$string.esim_device_selector_all_title : R$string.esim_device_selector_devices_all_devices, null, null, 14);
        } else {
            if (iVar instanceof g) {
                textClause = new TextClause(((g) iVar).f184150a.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                if (!(iVar instanceof h)) {
                    throw new NoWhenBranchMatchedException();
                }
                textClause = new TextClause(((h) iVar).f184153a.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            textLocalisedClause = textClause;
        }
        if (z) {
            textLocalisedQuantityClause = ((jte.d) aVar).c(EsimApi$Toggles.EsimGifting.f100175c) ? new TextLocalisedClause(R$string.esim_device_selector_all_description, null, null, 14) : new TextLocalisedQuantityClause(R$plurals.esim_device_selector_devices_devices, Integer.valueOf(((f) iVar).f184149a), (List) null, (Style) null, 28);
        } else if (iVar instanceof g) {
            textLocalisedQuantityClause = ((g) iVar).f184151b ? new TextLocalisedClause(R$string.esim_device_selector_devices_this_device, null, null, 14) : null;
        } else {
            if (!(iVar instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.esim_device_selector_plans_value, Integer.valueOf(((h) iVar).f184154b), (List) null, (Style) null, 28);
        }
        if (z) {
            strQ = "ID_ALL_PLANS_OPTION";
        } else {
            if (iVar instanceof g) {
                str2 = ((g) iVar).f184152c;
                str3 = "ID_DEVICE_";
            } else {
                if (!(iVar instanceof h)) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = ((h) iVar).f184155c;
                str3 = "ID_GIFT_RECIPIENT_";
            }
            strQ = j6.a.q(str3, str2);
        }
        if (z || (iVar instanceof g)) {
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i = R$drawable.uikit_icn_24_smartphone;
            int i2 = R$attr.uikit_colorAccentNeutral;
            image40 = new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2)), null, null, false, null, false, 62);
        } else {
            if (!(iVar instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            EsimGiftRecipient esimGiftRecipient = ((h) iVar).f184153a;
            image40 = new RowDelegate.Model.MainImage.Image40(new AvatarByUserIdImage(esimGiftRecipient.f100268a, q.n(esimGiftRecipient), 40.0f, null, 56), RetailBadge.f58066a, null, false, null, false, 60);
        }
        return new RowDelegate.Model(strQ, image40, textLocalisedClause, null, 0, textLocalisedQuantityClause, null, null, 0, null, false, null, Intrinsics.f(iVar.getId(), str), null, null, null, null, null, null, iVar, null, 0, 0, 0, 0, 532668376);
    }

    public final List b(int i, String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return f0.f322471a;
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(a((i) it8.next(), str));
        }
        return yp0.b.g(arrayList2, new ListSubheaderDelegate.Model(a0.d.n("ID_SUBHEADER_", i), (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List listA;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EsimApi$Toggles.EsimGifting esimGifting = EsimApi$Toggles.EsimGifting.f100175c;
        gte.a aVar = this.f184158a;
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(((jte.d) aVar).c(esimGifting) ? R$string.esim_device_selector_select_title : R$string.esim_device_selector_title, null, null, 14), null, null, null, false, 30);
        List list = domainState.f184146a;
        String str = domainState.f184147b;
        if (list.isEmpty()) {
            listA = f0.f322471a;
        } else if (((jte.d) aVar).c(esimGifting)) {
            List list2 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof f) {
                    arrayList.add(obj2);
                }
            }
            f fVar = (f) d0.d0(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                if (obj3 instanceof g) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list2) {
                if (obj4 instanceof h) {
                    arrayList3.add(obj4);
                }
            }
            aim.e eVarB = u.b();
            if (fVar != null) {
                RowDelegate.Model modelA = a(fVar, str);
                yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
                eVarB.add(modelA);
            }
            eVarB.addAll(b(R$string.esim_device_selector_devices_title, str, arrayList2));
            eVarB.addAll(b(R$string.esim_device_selector_family_title, str, arrayList3));
            listA = u.a(eVarB);
        } else {
            aim.e eVarB2 = u.b();
            RowDelegate.Model modelA2 = a((i) list.get(0), str);
            yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
            eVarB2.add(modelA2);
            List listV = d0.V(list, 1);
            ArrayList arrayList4 = new ArrayList(w.t(listV, 10));
            Iterator it8 = listV.iterator();
            while (it8.hasNext()) {
                arrayList4.add(a((i) it8.next(), str));
            }
            yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
            eVarB2.addAll(arrayList4);
            listA = u.a(eVarB2);
        }
        return new cii.b(null, listA, aVar2);
    }
}
