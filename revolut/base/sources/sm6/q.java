package sm6;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.external_accounts.impl.domain.india.upi.model.IndiaUpiProvider;
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
public final class q implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (d0.J(((IndiaUpiProvider) obj2).f72375b, str, true)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static RowDelegate.Model b(IndiaUpiProvider indiaUpiProvider) {
        return new RowDelegate.Model(indiaUpiProvider.f72374a, new RowDelegate.Model.MainImage.Image40(new UrlImage(indiaUpiProvider.f72376c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation(Float.valueOf(0.5f), Integer.valueOf(R$attr.uikit_colorGreyTone10), false, 12), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null, null, false, null, false, 60), new TextClause(indiaUpiProvider.f72375b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, indiaUpiProvider, null, 0, 0, 0, 0, 532676600);
    }

    public static aim.e d(int i, String str, List list) {
        aim.e eVarB = u.b();
        eVarB.add(new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(b((IndiaUpiProvider) it8.next()));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        return u.a(eVarB);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new n((List) iii.c.f(domainState.f264368a, new sl3.i(13), new sl5.g(2), new sa5.b(this, domainState, 8)));
    }
}
