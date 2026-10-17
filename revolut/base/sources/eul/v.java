package eul;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.Set;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class v {

    @NotNull
    public static final s Companion = new s();
    public static final Set d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dsl.a f129657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xul.n f129658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wul.g f129659c;

    static {
        r0[] elements = {r0.MARKET, r0.RECURRING, r0.LIMIT, r0.STOP};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d = kotlin.collections.d.y0(elements);
    }

    public v(dsl.a analyticsProvider, xul.n defaultSelectorResourceMapper, wul.g mutualFundResourceSelectorMapper) {
        Intrinsics.checkNotNullParameter(analyticsProvider, "analyticsProvider");
        Intrinsics.checkNotNullParameter(defaultSelectorResourceMapper, "defaultSelectorResourceMapper");
        Intrinsics.checkNotNullParameter(mutualFundResourceSelectorMapper, "mutualFundResourceSelectorMapper");
        this.f129657a = analyticsProvider;
        this.f129658b = defaultSelectorResourceMapper;
        this.f129659c = mutualFundResourceSelectorMapper;
    }

    public static AccountCellItemDelegate.Model a(String str, Clause clause, Clause clause2, Image image, boolean z, boolean z3, r0 r0Var) {
        return new AccountCellItemDelegate.Model(str, z, image, clause, z3 ? com.revolut.core.ui_kit.delegates.b.f53699a : new com.revolut.core.ui_kit.delegates.a(), z3, clause2, (RowDelegate.Model.c.b) null, (ProgressStyle) null, r0Var, (Parcelable) null, 128896);
    }

    public final xul.n b(z zVar) {
        return t.f129656a[zVar.ordinal()] == 1 ? this.f129659c : this.f129658b;
    }
}
