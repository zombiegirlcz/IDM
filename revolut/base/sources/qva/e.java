package qva;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.recurringbuys.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import whf.n;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f249553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f249554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f249555c;
    public final n d;
    public final List e;

    public e(c itemsMapper, a actionsMapper, f navBarMapper, l80.e dateProvider, n transactionsListMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        this.f249553a = itemsMapper;
        this.f249554b = actionsMapper;
        this.f249555c = dateProvider;
        this.d = transactionsListMapper;
        this.e = u.c(new RowDelegate.Model("PAYMENT_HISTORY_EMPTY_ITEM_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(R$string.wealthcore_recurringbuys_details_transactions_empty_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254), 10), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737708));
    }
}
