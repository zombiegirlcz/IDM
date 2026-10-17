package nm6;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.external_accounts.impl.domain.india.netbanking.model.IndiaNetBankingProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (d0.J(((IndiaNetBankingProvider) obj2).f72370b, str, true)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static RowDelegate.Model b(IndiaNetBankingProvider indiaNetBankingProvider) {
        CircleBadgeModel circleBadgeModel = null;
        return new RowDelegate.Model(indiaNetBankingProvider.f72369a, new RowDelegate.Model.MainImage.Image40(new UrlImage(indiaNetBankingProvider.f72371c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation(Float.valueOf(0.5f), Integer.valueOf(R$attr.uikit_colorGreyTone10), false, 12), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), circleBadgeModel, null, false, null, false, 60), new TextClause(indiaNetBankingProvider.f72370b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, indiaNetBankingProvider, null, 0, 0, 0, 0, 532676600);
    }

    public static aim.e d(int i, String str, ArrayList arrayList) {
        aim.e eVarB = u.b();
        eVarB.add(new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(b((IndiaNetBankingProvider) it8.next()));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList2);
        return u.a(eVarB);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i((List) iii.c.f(domainState.f217183a, new nl0.c(26), new nij.d(29), new mgh.i(22, domainState, this)));
    }
}
