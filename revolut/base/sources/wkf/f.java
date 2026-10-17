package wkf;

import elf.s0;
import klf.h0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vi9.e0;
import yh9.i;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends n implements s0 {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f298278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f298279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j60.a f298280n;

    public f(h0 commonDataSource, i payLaterStateDialogMapper, j60.a bottomDialogExtension) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(payLaterStateDialogMapper, "payLaterStateDialogMapper");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        this.f298278l = commonDataSource;
        this.f298279m = payLaterStateDialogMapper;
        this.f298280n = bottomDialogExtension;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (!(obj2 instanceof bi9.c)) {
            return Boolean.FALSE;
        }
        this.f298280n.x(((e0) this.f298279m).d("LATE_INTEREST_DIALOG_PAY_LATER_TRANSFER_DETAILS", ((bi9.c) obj2).f15448a));
        return Boolean.TRUE;
    }
}
