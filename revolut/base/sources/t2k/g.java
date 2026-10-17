package t2k;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3j.n f267591a;

    public g(m3j.n beneficiaryItemViewMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryItemViewMapper, "beneficiaryItemViewMapper");
        this.f267591a = beneficiaryItemViewMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.withdraw_destination_selection_title, null, null, 14), null, null, null, false, 30);
        List list = domainState.f267587a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(RowDelegate.Model.x(this.f267591a.c((f5j.a) it8.next(), true), null, null, null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, null, 0, 0, 0, 0, null, -1025, 15));
        }
        return new cii.b(null, arrayList, aVar);
    }
}
