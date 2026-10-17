package erf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f128661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f128662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f128663c;

    public k(f pendingMapper, d beforeBufferMapper, b afterBufferMapper, g recallMapper) {
        Intrinsics.checkNotNullParameter(pendingMapper, "pendingMapper");
        Intrinsics.checkNotNullParameter(beforeBufferMapper, "beforeBufferMapper");
        Intrinsics.checkNotNullParameter(afterBufferMapper, "afterBufferMapper");
        Intrinsics.checkNotNullParameter(recallMapper, "recallMapper");
        this.f128661a = pendingMapper;
        this.f128662b = beforeBufferMapper;
        this.f128663c = afterBufferMapper;
    }

    public static TextLocalisedClause a(com.revolut.feature.transfer.core.api.ui.throubleshooter.a mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = j.f128660a[mode.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new TextLocalisedClause(R$string.transfer_troubleshooting_header_title, null, null, 14);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.bank_transfer_troubleshooting_recall_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
