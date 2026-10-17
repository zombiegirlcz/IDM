package id5;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.j3;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import gw0.l;
import gw0.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m93.d f160427a;

    public i(m93.d cardThumbnailImageProvider) {
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        this.f160427a = cardThumbnailImageProvider;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        y50.b bVar = domainState.f160426a;
        String str = bVar.f310974a;
        f fVar = (f) bVar.f310975b;
        List list = fVar.f160425b;
        boolean z = list.size() == 1;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            d dVar = (d) list.get(i);
            arrayList.add(new RowDelegate.Model(dVar.f160420a, new RowDelegate.Model.MainImage.Image56(((ia3.h) this.f160427a).b(new b93.j(new b93.b(dVar.f160422c), dVar.d), false), (CircleBadgeModel) null, false, 14), new TextClause(dVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(dVar.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800));
        }
        return new y50.c(new ChatItemsDelegate.Model(new j3(arrayList, null), str, new gw0.i(t.SINGLE_TAIL), z ? null : new TextClause(fVar.f160424a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), l.LARGE, new ChatBubbleDelegate.c.b(null), null, 130912));
    }
}
