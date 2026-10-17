package oee;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f224585a;

    public g(l80.e dateProvider, ha3.o cardActivationInteractor) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(cardActivationInteractor, "cardActivationInteractor");
        this.f224585a = dateProvider;
    }

    public static RowDelegate.Model a(int i, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3) {
        return new RowDelegate.Model(a0.d.n("DELIVERY_ISSUE_ITEM_", i), com.revolut.core.ui_kit_core.displayers.image.models.a.b(i, Integer.valueOf(R$attr.uikit_colorWidgetBackground), Integer.valueOf(R$attr.uikit_colorForeground), null, 24), ff.DP_24, null, textLocalisedClause, textLocalisedClause2, textLocalisedClause3, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737320);
    }
}
