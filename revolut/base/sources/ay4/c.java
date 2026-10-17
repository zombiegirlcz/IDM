package ay4;

import aw0.h;
import aw0.i;
import aw0.t0;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet$InputData$Action;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheet$InputData$Action f11060a;

    public c(BottomSheet$InputData$Action inputData, by4.a actionFooterMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(actionFooterMapper, "actionFooterMapper");
        this.f11060a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        i iVar;
        i hVar;
        qv0.o model;
        j2 j2Var;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        BottomSheet$InputData$Action bottomSheet$InputData$Action = this.f11060a;
        BottomSheet.ActionBlock actionBlock = bottomSheet$InputData$Action.f69829g;
        if (actionBlock == null) {
            BottomSheet.ActionItem actionItem = bottomSheet$InputData$Action.f;
            actionBlock = actionItem != null ? new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(actionItem.f69822a, BottomSheet.ActionStyle.Accent.f69824a), actionItem.f69823b) : null;
        }
        Clause clause = bottomSheet$InputData$Action.f69826a;
        Clause clause2 = bottomSheet$InputData$Action.f69827b;
        GlyphImage glyphImage = bottomSheet$InputData$Action.f69828c;
        lw0.a aVar = new lw0.a(clause, clause2, glyphImage != null ? new lw0.c(glyphImage) : null, null, false, 24);
        boolean z = actionBlock != null;
        List listC = (List) ue0.e.M(bottomSheet$InputData$Action.d);
        if (listC == null) {
            List list = (List) ue0.e.M(bottomSheet$InputData$Action.e);
            listC = list != null ? u.c(new BottomSheet.ItemSection(list)) : null;
            if (listC == null) {
                listC = f0.f322471a;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : listC) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            BottomSheet.ItemSection itemSection = (BottomSheet.ItemSection) obj2;
            boolean z3 = i == v.j(listC);
            int i3 = i == 0 ? R$attr.uikit_dp16 : R$attr.uikit_dp8;
            int i5 = (!z3 || z) ? z3 ? R$attr.uikit_dp0 : R$attr.uikit_dp8 : R$attr.uikit_dp16;
            List<BottomSheet.Item> list2 = itemSection.f69837a;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (BottomSheet.Item item : list2) {
                if (item instanceof BottomSheet.Item.CellItem) {
                    BottomSheet.Item.CellItem cellItem = (BottomSheet.Item.CellItem) item;
                    String str = cellItem.f69831a;
                    t0 t0Var = new t0(cellItem.f69832b, (Image) null, 0, false, 30);
                    Clause clause3 = cellItem.f69833c;
                    Clause clause4 = cellItem.d;
                    boolean z4 = cellItem.e;
                    int i6 = cellItem.f69834g;
                    int i21 = b.f11059a[cellItem.f.ordinal()];
                    if (i21 == 1) {
                        j2Var = j2.CAPTION;
                    } else {
                        if (i21 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j2Var = j2.H3;
                    }
                    model = new CellDetailsDelegate.Model(str, t0Var, clause3, clause4, null, null, j2Var, null, 0, null, false, z4, null, null, null, null, 0, 0, i6, 0, 50327408);
                } else {
                    if (!(item instanceof BottomSheet.Item.PlainText)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BottomSheet.Item.PlainText plainText = (BottomSheet.Item.PlainText) item;
                    model = new PlainTextDelegate.Model(plainText.f69835a, (Clause) null, plainText.f69836b, (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
                }
                arrayList2.add(model);
            }
            yp0.b.k(arrayList2, i3, i5, 0, 0, 28);
            a0.x(arrayList2, arrayList);
            i = i2;
        }
        if (actionBlock != null) {
            Intrinsics.checkNotNullParameter(actionBlock, "actionBlock");
            if (actionBlock instanceof BottomSheet.ActionBlock.SingleAction) {
                BottomSheet.ActionBlock.SingleAction singleAction = (BottomSheet.ActionBlock.SingleAction) actionBlock;
                hVar = new aw0.e(false, singleAction.f69819b, null, by4.a.a(singleAction.f69818a), null, null, 53);
            } else {
                if (!(actionBlock instanceof BottomSheet.ActionBlock.DualAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                BottomSheet.ActionBlock.DualAction dualAction = (BottomSheet.ActionBlock.DualAction) actionBlock;
                hVar = new h(false, by4.a.a(dualAction.f69815a), by4.a.a(dualAction.f69816b), dualAction.f69817c, null, null, 113);
            }
            iVar = hVar;
        } else {
            iVar = null;
        }
        return new cii.b(iVar, arrayList, aVar);
    }
}
