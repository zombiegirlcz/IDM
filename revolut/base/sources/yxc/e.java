package yxc;

import aw0.n6;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenActionButton;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements z9l.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z9l.a f317643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z9l.k f317644b;

    public e(z9l.a buttonMapper, z9l.k transactionCellSectionMapper, g entityConfigStatusDialogUiMapper) {
        Intrinsics.checkNotNullParameter(buttonMapper, "buttonMapper");
        Intrinsics.checkNotNullParameter(transactionCellSectionMapper, "transactionCellSectionMapper");
        Intrinsics.checkNotNullParameter(entityConfigStatusDialogUiMapper, "entityConfigStatusDialogUiMapper");
        this.f317643a = buttonMapper;
        this.f317644b = transactionCellSectionMapper;
    }

    public final n6 a(FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton) {
        return new n6(new TextClause(fincrimeHomeScreenActionButton.f64147a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ((b) this.f317643a).a(fincrimeHomeScreenActionButton.f64149c), null, null, false, null, fincrimeHomeScreenActionButton, 508);
    }
}
