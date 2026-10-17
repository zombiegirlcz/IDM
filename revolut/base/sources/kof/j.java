package kof;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import ne0.p;
import org.jetbrains.annotations.NotNull;
import wsg.n;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements f {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wzi.a f186348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f186349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f186350c;
    public final l d;
    public final rqd.h e;
    public final j9l.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f186351g;

    public j(wzi.a incomeSorterInteractor, n walletInteractor, ang.f userInteractor, l incomeSorterInfoProvider, rqd.h incomeSorterRatesInteractor, j9l.a moneyCalculator) {
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(incomeSorterInfoProvider, "incomeSorterInfoProvider");
        Intrinsics.checkNotNullParameter(incomeSorterRatesInteractor, "incomeSorterRatesInteractor");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        this.f186348a = incomeSorterInteractor;
        this.f186349b = walletInteractor;
        this.f186350c = userInteractor;
        this.d = incomeSorterInfoProvider;
        this.e = incomeSorterRatesInteractor;
        this.f = moneyCalculator;
        b.Companion companion = kotlin.time.b.INSTANCE;
        this.f186351g = new p(kotlin.time.c.g(3, pkm.e.SECONDS), hhm.f.f152431c, new k65.d(1, this, j.class, "observeDataInternal", "observeDataInternal(Lcom/revolut/feature/transactions/models/Transaction;)Lio/reactivex/Observable;", 0, 23));
    }

    public static LayeredImage a() {
        return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_split, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10);
    }
}
