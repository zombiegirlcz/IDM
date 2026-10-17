package l83;

import cli.n;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.card_screen.impl.kompot.reactivate.confirmation_bottom_sheet.ReactivateCardConfirmationBottomSheetContract$InputData;
import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import com.revolut.tracking.v3.IdContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReactivateCardConfirmationBottomSheetContract$InputData f192774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f192775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f192776c;

    public m(ReactivateCardConfirmationBottomSheetContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f192774a = inputData;
        this.f192775b = featureToggleInteractor;
        this.f192776c = w.y0(new kob.a(this, 18));
    }

    public static w0 a(TerminatedCard terminatedCard) {
        return kii.e.d(IdContext.newBuilder(), terminatedCard.f65547a, AnalyticsContext.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016a A[LOOP:0: B:40:0x0164->B:42:0x016a, LOOP_END] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r28) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l83.m.c(cli.j):cli.o");
    }
}
