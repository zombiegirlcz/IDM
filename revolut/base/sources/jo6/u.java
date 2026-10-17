package jo6;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.R$string;
import ieg.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import tx0.v0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je6.h f176886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f176887b;

    public u(je6.h externalInstitutionLogoMapper, fl6.b institutionPrioritizer, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        Intrinsics.checkNotNullParameter(institutionPrioritizer, "institutionPrioritizer");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f176886a = externalInstitutionLogoMapper;
        this.f176887b = featureToggleInteractor;
    }

    public static ArrayList a(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (d0.J(((se6.d) obj2).f262126b, str, true)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static boolean e(se6.d dVar, wi0.b bVar) {
        if (Intrinsics.f(dVar.e, bVar.f297794a)) {
            return true;
        }
        se6.i iVar = dVar.f262130j;
        return Intrinsics.f(iVar != null ? iVar.f262137b : null, bVar.f297794a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.revolut.core.ui_kit.models.badge.CircleBadgeModel] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.revolut.core.ui_kit.delegates.RowDelegate$Model$MainImage] */
    public final RowDelegate.Model b(se6.d dVar) {
        TextClause textClause;
        String str = dVar.f262125a;
        TextClause textClause2 = new TextClause(dVar.f262126b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        se6.a aVar = dVar.k;
        if (aVar != null) {
            Intrinsics.h(aVar);
            textClause = new TextClause(aVar.f262121c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = null;
        }
        Image imageB = ((di6.a) this.f176886a).b(dVar.f262127c);
        if (imageB != null) {
            image40 = new RowDelegate.Model.MainImage.Image40(imageB, aVar != null ? new DangerCircleBadge(dw0.a.Suspicious) : null, null, false, null, false, 60);
        }
        return new RowDelegate.Model(str, image40, textClause2, null, 0, textClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, dVar, null, 0, 0, 0, 0, 532676568);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f176875a;
        wi0.b bVar = domainState.e;
        List list = (List) iii.c.f(data, new jn2.a(18), new jme.f(7), new z(this, domainState, 29));
        aim.e eVarB = zhm.u.b();
        boolean z = domainState.d;
        if (z && bVar != null) {
            String str = bVar.f297794a;
            eVarB.add(new LabelNavBarMenuItem("ITEM_ID_COUNTRY_DROPDOWN", new CountryImage(str, Integer.valueOf(R$drawable.uikit_icn_24_globe), ez0.e.FitCenter, 2), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.external_institutions_cross_border_bank_selection_country_dropdown_placeholder, zhm.u.c(str), null, 12), new ImageClause(R$drawable.uikit_icn_16_chevron_down_small, ImageClauseTint.TextColor.f57790a, (Float) null, (Float) null, 28))), null, v0.AVATAR, 440));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        if (!z) {
            bVar = null;
        }
        return new p(list, eVarA, bVar);
    }

    public final aim.e d(int i, String str, List list) {
        aim.e eVarB = zhm.u.b();
        eVarB.add(new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(b((se6.d) it8.next()));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        return zhm.u.a(eVarB);
    }
}
