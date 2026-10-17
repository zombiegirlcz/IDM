package okf;

import android.os.Parcelable;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import elf.s0;
import kkf.l8;
import klf.h0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends yji.n implements s0 {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f226036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.s0 f226037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vlf.b f226038n;
    public final l8 o;

    public w(h0 commonDataSource, klf.s0 creditRepaymentRevPointsDataSource, vlf.b commonUiMapper, l8 toAccountBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(creditRepaymentRevPointsDataSource, "creditRepaymentRevPointsDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        this.f226036l = commonDataSource;
        this.f226037m = creditRepaymentRevPointsDataSource;
        this.f226038n = commonUiMapper;
        this.o = toAccountBlockProvider;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (Intrinsics.f(str, "ID_CREDIT_REPAYMENT_FROM_REVPOINTS")) {
            A2(new MainContainerScreenDestination.JustShow(ibb.c.e.f83420a, (SliderLayout.SlidingSpec) null, (Parcelable) null, 14));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
