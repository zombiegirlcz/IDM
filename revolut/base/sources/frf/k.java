package frf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f137480a;

    public k(g pendingMapper, c bufferMapper, e completedMapper, h recallMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(pendingMapper, "pendingMapper");
        Intrinsics.checkNotNullParameter(bufferMapper, "bufferMapper");
        Intrinsics.checkNotNullParameter(completedMapper, "completedMapper");
        Intrinsics.checkNotNullParameter(recallMapper, "recallMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f137480a = dateProvider;
    }

    public static TextLocalisedClause a(com.revolut.feature.transfer.core.api.ui.throubleshooter.b mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = j.f137479a[mode.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.card_transfer_troubleshooting_header_title, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.card_transfer_troubleshooting_recall_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
