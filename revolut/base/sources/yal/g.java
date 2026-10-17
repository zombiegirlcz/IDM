package yal;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import java.util.ArrayList;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements p {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tal.e f312076a;

    public g(tal.e uiModelsMapper) {
        Intrinsics.checkNotNullParameter(uiModelsMapper, "uiModelsMapper");
        this.f312076a = uiModelsMapper;
    }

    @Override // jki.p
    public final m a(i iVar) {
        b domainState = (b) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SuspiciousTransactionDialog.Screen.SimpleConfirmation simpleConfirmation = domainState.f312070a;
        tal.f fVar = (tal.f) this.f312076a;
        tal.a aVarA = fVar.a(simpleConfirmation);
        SuspiciousTransactionDialog.Screen.SimpleConfirmation simpleConfirmation2 = domainState.f312070a;
        List<String> list = simpleConfirmation2.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (String str : list) {
            arrayList.add(new RowDelegate.Model(a0.d.n("LIST_ID_TIPS_", str.hashCode()), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_dot, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        String str2 = simpleConfirmation2.f;
        List listL = v.l(str2 != null ? new RowDelegate.Model("LIST_ID_GUIDE", null, new HtmlClause(0, 30, (Integer) null, (Object) null, str2), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868858) : null);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new d(d0.E0(listL, arrayList), fVar.b(simpleConfirmation2, true), aVarA);
    }
}
