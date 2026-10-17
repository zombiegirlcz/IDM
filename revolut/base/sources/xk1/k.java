package xk1;

import aw0.e0;
import aw0.h0;
import aw0.i0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.alipay.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements n {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f306600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f306601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f306602c;

    public static final class a {
        private a() {
        }
    }

    static {
        List listK = v.k(new l("Alipay", "https://assets.revolut.com/apm/alipay.png"), new l("DANA", "https://assets.revolut.com/apm/dana.png"), new l("DaviPlata", "https://assets.revolut.com/apm/daviplata.png"));
        f306600a = listK;
        List list = listK;
        f306601b = d0.k0(list, ", ", null, null, 0, new xif.c(12), 30);
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new UrlImage(((l) it8.next()).f306604b, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902));
        }
        f306602c = new i0(arrayList, e0.DP_40, (h0) null, 12);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = m.f306605a[domainState.f306594a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.alipay_plus_scan_qr_description, u.c(f306601b), null, 12);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.alipay_plus_scan_qr_scanning, null, null, 14);
        }
        return new h(textLocalisedClause, f306602c);
    }
}
