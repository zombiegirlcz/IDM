package en6;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.impl.R$string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je6.h f127749a;

    public l(je6.h externalInstitutionLogoMapper, fl6.b institutionPrioritizer) {
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        Intrinsics.checkNotNullParameter(institutionPrioritizer, "institutionPrioritizer");
        this.f127749a = externalInstitutionLogoMapper;
    }

    public static ListSubheaderDelegate.Model a(int i, String str) {
        return new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static boolean b(ExternalInstitution externalInstitution) {
        List list = externalInstitution.f66113l;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (a0.z((String) it8.next(), "popular", true)) {
                return true;
            }
        }
        return false;
    }

    public final List c(String str, String str2, ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new e((ExternalInstitution) it8.next()));
        }
        List list2 = list;
        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList3.add(new d((ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.ExternalAccountItem) it9.next()));
        }
        ArrayList arrayListE0 = d0.E0(arrayList3, arrayList2);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayListE0) {
            if (kotlin.text.d0.J(((f) obj2).b(), str, true)) {
                arrayList4.add(obj2);
            }
        }
        List listB = fl6.b.b(str2, d0.P0(arrayList4, new j()), new h0() { // from class: en6.k
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj3) {
                return ((f) obj3).a();
            }
        });
        ArrayList arrayList5 = new ArrayList(w.t(listB, 10));
        Iterator it10 = listB.iterator();
        while (it10.hasNext()) {
            arrayList5.add(d((f) it10.next()));
        }
        return c6d.b.N(arrayList5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.revolut.core.ui_kit.models.badge.CircleBadgeModel] */
    /* JADX WARN: Type inference failed for: r22v1, types: [com.revolut.core.ui_kit.delegates.RowDelegate$Model$MainImage] */
    public final RowDelegate.Model d(f fVar) {
        Clause textClause;
        if (!(fVar instanceof e)) {
            if (!(fVar instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            d dVar = (d) fVar;
            ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.ExternalAccountItem externalAccountItem = dVar.f127747a;
            return new RowDelegate.Model(externalAccountItem.f72294b, new RowDelegate.Model.MainImage.Image40(externalAccountItem.d, null, null, false, null, false, 60), externalAccountItem.f72295c, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, dVar.f127747a, null, 0, 0, 0, 0, 532676600);
        }
        e eVar = (e) fVar;
        ExternalInstitution externalInstitution = eVar.f127748a;
        String str = externalInstitution.f66107a;
        boolean z = externalInstitution.k;
        TextClause textClause2 = new TextClause(externalInstitution.f66108b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (z) {
            String str2 = externalInstitution.f66114m;
            textClause = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        } else {
            textClause = new TextLocalisedClause(R$string.topup_external_institutions_status_unhealthy, null, null, 14);
        }
        Image imageB = ((di6.a) this.f127749a).b(externalInstitution.f66109c);
        if (imageB != null) {
            image40 = new RowDelegate.Model.MainImage.Image40(imageB, z ? null : new DangerCircleBadge(dw0.a.Suspicious), null, false, null, false, 60);
        }
        return new RowDelegate.Model(str, image40, textClause2, null, 0, textClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, eVar.f127748a, null, 0, 0, 0, 0, 532676568);
    }
}
