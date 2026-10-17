package cfd;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.simple_selector.SimpleSelectorControllerContract$SimpleSelectorItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(domainState.f23679a, null, null, null, false, 30);
        ArrayList arrayList = domainState.f23680b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            tf tfVar = null;
            if (i < 0) {
                v.s();
                throw null;
            }
            SimpleSelectorControllerContract$SimpleSelectorItem simpleSelectorControllerContract$SimpleSelectorItem = (SimpleSelectorControllerContract$SimpleSelectorItem) obj2;
            String strN = a0.d.n("LIST_ID_ITEM_", i);
            Clause clause = simpleSelectorControllerContract$SimpleSelectorItem.f86758b;
            if (simpleSelectorControllerContract$SimpleSelectorItem.f86759c) {
                tfVar = new tf(6, new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
            }
            arrayList2.add(new RowDelegate.Model(strN, null, clause, null, 0, null, null, null, 0, tfVar, false, null, false, null, null, null, null, null, null, simpleSelectorControllerContract$SimpleSelectorItem.f86757a, null, 0, 0, 0, 0, 532675578));
            i = i2;
        }
        yp0.b.k(arrayList2, R$attr.uikit_dp0, 0, 0, 0, 30);
        return new f(arrayList2, aVar);
    }
}
