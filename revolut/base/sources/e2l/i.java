package e2l;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.travel_status.impl.domain.model.TravelStatusLinkAccountInfo;
import ip0.lr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jmrtd.cbeff.ISO781611;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements n {
    public static n6 a(TravelStatusLinkAccountInfo.LinkAccountButton linkAccountButton, LargeActionButton.ButtonStyle buttonStyle, boolean z) {
        ResourceImage resourceImage;
        TextClause textClause = new TextClause(linkAccountButton.f104300a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TravelStatusLinkAccountInfo.LinkAccountAction linkAccountAction = linkAccountButton.f104301b;
        if (linkAccountAction instanceof TravelStatusLinkAccountInfo.LinkAccountAction.Url) {
            resourceImage = new ResourceImage(R$drawable.uikit_icn_24_link_external, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        } else {
            if (!Intrinsics.f(linkAccountAction, TravelStatusLinkAccountInfo.LinkAccountAction.Api.f104298a)) {
                throw new NoWhenBranchMatchedException();
            }
            resourceImage = null;
        }
        return new n6(textClause, buttonStyle, resourceImage, null, z, null, linkAccountButton, 472);
    }

    @Override // cli.n
    public final o c(j jVar) {
        boolean z;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TravelStatusLinkAccountInfo travelStatusLinkAccountInfo = domainState.f122141b;
        Map map = domainState.f122142c;
        List list = travelStatusLinkAccountInfo.d;
        if (list == null) {
            list = f0.f322471a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            TravelStatusLinkAccountInfo.InputField inputField = (TravelStatusLinkAccountInfo.InputField) obj2;
            boolean z3 = i == 0;
            boolean z4 = i == v.j(list);
            String str = (String) map.get(inputField.f104295a);
            String str2 = inputField.f104295a;
            TextClause textClause = new TextClause(inputField.f104296b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            int i3 = h.f122149a[inputField.f104297c.ordinal()];
            int i5 = 2;
            if (i3 != 1) {
                if (i3 == 2) {
                    i5 = 33;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = 16385;
                }
            }
            InputTextDelegate.Model model = new InputTextDelegate.Model(str2, textClause2, textClause, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, new lr(i5), z4 ? 6 : 5, null, null, false, z3, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -610271240, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
            i = i2;
        }
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = true;
        } else {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((String) map.get(((TravelStatusLinkAccountInfo.InputField) it8.next()).f104295a)) == null || !(!d0.W(r3))) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        TextClause textClause3 = new TextClause(travelStatusLinkAccountInfo.f104292a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str3 = travelStatusLinkAccountInfo.f104293b;
        TextClause textClause4 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        UrlImage urlImage = new UrlImage(travelStatusLinkAccountInfo.f104294c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
        n6 n6VarA = a(travelStatusLinkAccountInfo.e, LargeActionButton.ButtonStyle.f58725a, z);
        TravelStatusLinkAccountInfo.LinkAccountButton linkAccountButton = travelStatusLinkAccountInfo.f;
        return new f(arrayList, textClause3, textClause4, urlImage, linkAccountButton != null ? new aw0.h(false, n6VarA, a(linkAccountButton, LargeActionButton.ButtonStyle.o, true), null, null, null, 121) : new aw0.e(false, null, null, n6VarA, null, null, 55));
    }
}
