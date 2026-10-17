package u65;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u4i.u;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(TextLocalisedClause textLocalisedClause, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return f0.f322471a;
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ux4.d dVar = (ux4.d) it8.next();
            arrayList2.add(new RowDelegate.Model(dVar.f283865a, d(), new TextClause(dVar.f283867c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, dVar.f == ux4.h.FORBEARANCE ? yoj.b.w(yoj.b.w(new TextLocalisedClause(R$string.credit_common_document_type_forbearance, null, null, 14), new DotDividerClause((Integer) null)), sx4.a.b(dVar.f283869h)) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, dVar, null, 0, 0, 0, 0, 532676568));
        }
        return yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("AGREEMENTS_HEADER_ID", (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    public static List b(TextLocalisedClause textLocalisedClause, List list) {
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        List<LoanDocument> listP0 = d0.P0(list, new k());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        for (LoanDocument loanDocument : listP0) {
            String str = loanDocument.f70153a;
            TextClause textClause = new TextClause(loanDocument.f70154b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str2 = loanDocument.f70155c;
            arrayList.add(new RowDelegate.Model(str, d(), textClause, null, 0, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, loanDocument, null, 0, 0, 0, 0, 532676568));
        }
        return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("DOCUMENTS_HEADER_ID", (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    public static RowDelegate.Model.MainImage.Image24 d() {
        return new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h((List) iii.c.f(t1.t(domainState.f277484a, domainState.f277485b), new u4e.i(11), new u(3), new tch.c(this, domainState, 22)));
    }
}
