package j27;

import android.os.Parcelable;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSale;
import com.revolut.feature.freelancer.impl.R$string;
import ieg.z;
import ip0.pb0;
import j27.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jr6.t;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import zhm.a0;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu6.b f170720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f170721b;

    public n(qu6.b acquiringOrderMapper, t salesListItemMapper) {
        Intrinsics.checkNotNullParameter(acquiringOrderMapper, "acquiringOrderMapper");
        Intrinsics.checkNotNullParameter(salesListItemMapper, "salesListItemMapper");
        this.f170720a = acquiringOrderMapper;
        this.f170721b = salesListItemMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (!(domainState instanceof f.a)) {
            List listK = v.k(new pb0("LOADING_ITEM_ID_1"), new pb0("LOADING_ITEM_ID_2"), new pb0("LOADING_ITEM_ID_3"));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            return new h(listK);
        }
        aim.e eVarB = u.b();
        f.a aVar = (f.a) domainState;
        String str = aVar.f170713c;
        InputTextDelegate.Model model = new InputTextDelegate.Model("SEARCH_ORDERS_ITEM_ID", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.freelancer_common_word_search, null, null, 14), null, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -4104, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        Data data = aVar.f170711a;
        if (data != null) {
            eVarB.addAll((List) iii.c.f(data, new j1.e(6), new j0g.b(6), new z(str, this, 16)));
        }
        List list = aVar.f170712b;
        if (list != null) {
            nkm.c cVarF = y.F(y.n(d0.Q(list), new ik3.a(str, 17)), new m());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : cVarF) {
                LocalDate localDate = ((FreelancerOrder) obj2).v.toLocalDate();
                Object arrayList = linkedHashMap.get(localDate);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(localDate, arrayList);
                }
                ((List) arrayList).add(obj2);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                LocalDate localDate2 = (LocalDate) entry.getKey();
                List list2 = (List) entry.getValue();
                ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(((k17.c) this.f170721b).d(new FreelancerSale.OrderSale((FreelancerOrder) it8.next()), q0.DATETIME));
                }
                Intrinsics.h(localDate2);
                a0.x(yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("GROUP_HEADER_ITEM_ID_" + localDate2, (Image) null, (Clause) new TimeClause(jli.b.b(localDate2), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList2);
            }
            eVarB.addAll(arrayList2);
        }
        return new h(u.a(eVarB));
    }
}
