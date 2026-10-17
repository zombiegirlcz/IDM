package u90;

import com.revolut.feature.backend_flow.domain.models.BackendFlowIcon;
import com.revolut.feature.backend_flow.domain.models.HtmlStringItem;
import com.revolut.feature.backend_flow.domain.models.InfoListItemSubitem;
import kotlin.jvm.internal.Intrinsics;
import q90.t1;
import q90.x1;
import q90.y1;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f278297a;

    public c0(y htmlStringItemMapper) {
        Intrinsics.checkNotNullParameter(htmlStringItemMapper, "htmlStringItemMapper");
        this.f278297a = htmlStringItemMapper;
    }

    public final InfoListItemSubitem a(x1 item, xl2.m mVar) {
        Intrinsics.checkNotNullParameter(item, "item");
        String id10 = item.getId();
        String title = item.getTitle();
        t1 description = item.getDescription();
        HtmlStringItem htmlStringItem = description != null ? (HtmlStringItem) this.f278297a.a(description, zhm.f0.f322471a) : null;
        q90.o icon = item.getIcon();
        BackendFlowIcon backendFlowIconA = icon != null ? t90.e.a(icon, mVar) : null;
        y1 link = item.getLink();
        return new InfoListItemSubitem(id10, title, htmlStringItem, backendFlowIconA, link != null ? new InfoListItemSubitem.Link(link.getTitle(), link.getHyperlink(), link.getDeeplink()) : null, item.getVisible(), item.getIsCopiable(), item.getCopyValue(), item.getImageBannerAssetUrl());
    }

    public final x1 b(InfoListItemSubitem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63501a;
        String str2 = item.f63502b;
        HtmlStringItem htmlStringItem = item.f63503c;
        t1 t1VarC = htmlStringItem != null ? y.c(htmlStringItem) : null;
        BackendFlowIcon backendFlowIcon = item.d;
        q90.o oVarB = backendFlowIcon != null ? t90.e.b(backendFlowIcon) : null;
        InfoListItemSubitem.Link link = item.e;
        return new x1(str, str2, t1VarC, oVarB, link != null ? new y1(link.f63506a, link.f63507b, link.f63508c) : null, item.f, item.f63504g, item.f63505h, item.i);
    }
}
