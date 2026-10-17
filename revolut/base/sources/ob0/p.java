package ob0;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.backend_flow.domain.models.DropDownItem;
import com.revolut.feature.backend_flow.domain.models.HtmlStringItem;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s7a.c0;
import vkm.v1;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yc0.e f223835a;

    public p(yc0.e backendFlowIconMapper) {
        Intrinsics.checkNotNullParameter(backendFlowIconMapper, "backendFlowIconMapper");
        this.f223835a = backendFlowIconMapper;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.interactors.DropDownOptionPickerParams");
        DropDownItem dropDownItem = ((f) obj2).f223820a;
        String str = dropDownItem.f63397a;
        for (SelectionItem.Option option : dropDownItem.e) {
            if (Intrinsics.f(option.getF63622a(), d0.a0(ids))) {
                return new lb0.t(str, option);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new v1(new o(obj2, null));
    }

    @Override // ob0.b
    public final ArrayList i(String query, List list) {
        HtmlStringItem htmlStringItem;
        String str;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(query, "query");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            SelectionItem.Option.WithTitle withTitle = (SelectionItem.Option.WithTitle) obj2;
            if (kotlin.text.d0.J(withTitle.f63624c, query, true) || ((htmlStringItem = withTitle.d) != null && (str = htmlStringItem.f63481a) != null && kotlin.text.d0.J(str, query, true))) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // ob0.b
    public final Image j(Object obj2) {
        SelectionItem.Option.WithTitle withTitle = (SelectionItem.Option.WithTitle) obj2;
        Intrinsics.checkNotNullParameter(withTitle, "<this>");
        SelectionItem.Option.Image image = withTitle.f63623b;
        if (image instanceof SelectionItem.Option.Image.Asset) {
            return new UrlImage(((SelectionItem.Option.Image.Asset) image).f63617a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        }
        if (image instanceof SelectionItem.Option.Image.Icon) {
            return yc0.e.a(this.f223835a, ((SelectionItem.Option.Image.Icon) image).f63618a, null, null, 6);
        }
        if (image == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ob0.b
    public final String k(Object obj2) {
        SelectionItem.Option.WithTitle withTitle = (SelectionItem.Option.WithTitle) obj2;
        Intrinsics.checkNotNullParameter(withTitle, "<this>");
        return withTitle.f63622a;
    }

    @Override // ob0.b
    public final Clause m(Object obj2) {
        String str;
        SelectionItem.Option.WithTitle withTitle = (SelectionItem.Option.WithTitle) obj2;
        Intrinsics.checkNotNullParameter(withTitle, "<this>");
        HtmlStringItem htmlStringItem = withTitle.d;
        if (htmlStringItem == null || (str = htmlStringItem.f63481a) == null) {
            return null;
        }
        return new HtmlClause(0, 30, (Integer) null, (Object) null, str);
    }

    @Override // ob0.b
    public final Clause n(Object obj2) {
        SelectionItem.Option.WithTitle withTitle = (SelectionItem.Option.WithTitle) obj2;
        Intrinsics.checkNotNullParameter(withTitle, "<this>");
        return new TextClause(withTitle.f63624c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
