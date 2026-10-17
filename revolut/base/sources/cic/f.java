package cic;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.rewards.api.model.concierge.AdditionalInfoBottomSheet;
import com.revolut.feature.rewards.api.model.concierge.Cell;
import com.revolut.feature.rewards.impl.ui.concierge.screen.additionalinfo.AdditionalInfoBottomSheetContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements n {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bic.f f24442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdditionalInfoBottomSheetContract$InputData f24443b;

    public f(bic.f cellMapper, AdditionalInfoBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(cellMapper, "cellMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f24442a = cellMapper;
        this.f24443b = inputData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    @Override // cli.n
    public final o c(j jVar) {
        ?? arrayList;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        AdditionalInfoBottomSheet additionalInfoBottomSheet = this.f24443b.f84912a;
        List list = additionalInfoBottomSheet.f84771c;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            int i = 0;
            for (Object obj2 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                arrayList.add(this.f24442a.invoke("ID_CELL_ITEM_" + i, (Cell) obj2));
                i = i2;
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        ?? r62 = arrayList;
        yp0.b.k(r62, 0, 0, 0, 0, 31);
        TextClause textClause = new TextClause(additionalInfoBottomSheet.f84769a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = additionalInfoBottomSheet.f84770b;
        lw0.a aVar = new lw0.a(textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 28);
        String str2 = additionalInfoBottomSheet.d;
        return new cii.b(str2 != null ? new aw0.e(false, null, null, new n6(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, a.f24438a, 508), null, null, 55) : null, r62, aVar);
    }
}
