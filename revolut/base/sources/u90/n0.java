package u90;

import com.revolut.feature.backend_flow.domain.models.BackendFlowIcon;
import com.revolut.feature.backend_flow.domain.models.HtmlStringItem;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q90.c2;
import q90.h3;
import q90.t1;

/* JADX INFO: loaded from: classes19.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f278325a;

    public n0(y htmlStringItemMapper) {
        Intrinsics.checkNotNullParameter(htmlStringItemMapper, "htmlStringItemMapper");
        this.f278325a = htmlStringItemMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.backend_flow.domain.models.SelectionItem.Option a(q90.h3 r11) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u90.n0.a(q90.h3):com.revolut.feature.backend_flow.domain.models.SelectionItem$Option");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h3 b(SelectionItem.Option option) {
        BackendFlowIcon backendFlowIcon;
        Intrinsics.checkNotNullParameter(option, "option");
        if (option instanceof SelectionItem.Option.WithTitle) {
            SelectionItem.Option.WithTitle withTitle = (SelectionItem.Option.WithTitle) option;
            String str = withTitle.f63622a;
            String str2 = withTitle.f63624c;
            HtmlStringItem htmlStringItem = withTitle.d;
            t1 t1VarC = htmlStringItem != null ? y.c(htmlStringItem) : null;
            SelectionItem.Option.Image image = withTitle.f63623b;
            SelectionItem.Option.Image.Asset asset = image instanceof SelectionItem.Option.Image.Asset ? (SelectionItem.Option.Image.Asset) image : null;
            String str3 = asset != null ? asset.f63617a : null;
            SelectionItem.Option.Image.Icon icon = image instanceof SelectionItem.Option.Image.Icon ? (SelectionItem.Option.Image.Icon) image : null;
            if (icon != null && (backendFlowIcon = icon.f63618a) != null) {
                objB = t90.e.b(backendFlowIcon);
            }
            return new h3(str, str2, t1VarC, str3, objB, null, Boolean.valueOf(withTitle.f), 64);
        }
        if (!(option instanceof SelectionItem.Option.WithLabels)) {
            throw new NoWhenBranchMatchedException();
        }
        SelectionItem.Option.WithLabels withLabels = (SelectionItem.Option.WithLabels) option;
        String str4 = withLabels.f63619a;
        SelectionItem.Option.Image.Asset asset2 = withLabels.f63620b;
        String str5 = asset2 != null ? asset2.f63617a : null;
        ArrayList<SelectionItem.Label> arrayList = withLabels.f63621c;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (SelectionItem.Label label : arrayList) {
            arrayList2.add(new c2(label.f63615a, t90.e.b(label.f63616b)));
        }
        return new h3(str4, null, null, str5, null, arrayList2, Boolean.valueOf(withLabels.e), 80);
    }
}
