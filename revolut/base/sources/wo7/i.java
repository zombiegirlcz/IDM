package wo7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.date.DateSelectorScreenContract$InputData;
import java.time.LocalDate;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends jki.g implements jki.h {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tl7.f f298904p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l80.e f298905q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f298906r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, DateSelectorScreenContract$InputData inputData, tl7.f bottomDialog, l80.e dateProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f298904p = bottomDialog;
        this.f298905q = dateProvider;
        LocalDate localDatePlusDays = inputData.f75570a;
        localDatePlusDays = localDatePlusDays == null ? ((l80.f) dateProvider).e().plusDays(5L) : localDatePlusDays;
        Intrinsics.h(localDatePlusDays);
        this.f298906r = new d(localDatePlusDays, ((l80.f) dateProvider).e());
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f298906r;
    }
}
