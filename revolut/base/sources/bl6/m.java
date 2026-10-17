package bl6;

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
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.domain.pse.model.PseProvider;
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
public final class m implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            PseProvider pseProvider = (PseProvider) obj2;
            if (d0.J(pseProvider.f72419b, str, true) || d0.J(pseProvider.d, str, true)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static RowDelegate.Model b(PseProvider pseProvider) {
        String str = pseProvider.f72418a;
        TextClause textClause = new TextClause(pseProvider.f72419b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(pseProvider.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = pseProvider.f72420c;
        return new RowDelegate.Model(str, str2.length() == 0 ? new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_bank, R$attr.uikit_colorForeground, R$attr.uikit_colorForeground_10), null, null, false, null, false, 60) : new RowDelegate.Model.MainImage.Image40(new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null, null, false, null, false, 60), textClause, null, 0, textClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, pseProvider, null, 0, 0, 0, 0, 532676568);
    }

    public static aim.e d(int i, String str, ArrayList arrayList) {
        aim.e eVarB = u.b();
        eVarB.add(new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(b((PseProvider) it8.next()));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList2);
        return u.a(eVarB);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new k((List) iii.c.f(domainState.f16479a, new bjg.c(24), new bk6.n(6), new b88.o(9, domainState, this)));
    }
}
