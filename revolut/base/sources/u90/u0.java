package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.TextItem;
import com.revolut.feature.backend_flow.domain.models.TextItemStyle;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q90.x3;

/* JADX INFO: loaded from: classes19.dex */
public final class u0 extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        x3 item = (x3) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String text = item.getText();
        String style = item.getStyle();
        Intrinsics.checkNotNullParameter(style, "style");
        return new TextItem(text, Intrinsics.f(style, "PRIMARY_TEXT") ? TextItemStyle.PrimaryText.f63692a : Intrinsics.f(style, "GROUP_HEADER") ? TextItemStyle.GroupHeader.f63691a : new TextItemStyle.Undefined(style));
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        String str;
        TextItem item = (TextItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str2 = item.f63689a;
        TextItemStyle textItemStyle = item.f63690b;
        Intrinsics.checkNotNullParameter(textItemStyle, "textItemStyle");
        if (textItemStyle instanceof TextItemStyle.PrimaryText) {
            str = "PRIMARY_TEXT";
        } else if (textItemStyle instanceof TextItemStyle.GroupHeader) {
            str = "GROUP_HEADER";
        } else {
            if (!(textItemStyle instanceof TextItemStyle.Undefined)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((TextItemStyle.Undefined) textItemStyle).f63693a;
        }
        return new x3(str2, str);
    }
}
