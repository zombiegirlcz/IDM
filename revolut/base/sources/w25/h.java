package w25;

import c55.r;
import kotlin.jvm.internal.Intrinsics;
import m35.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m35.h f293948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f293949b;

    public h(m35.h instalmentItemMapper, j repaymentItemMapper, r loanLateDisbursalItemFactory) {
        Intrinsics.checkNotNullParameter(instalmentItemMapper, "instalmentItemMapper");
        Intrinsics.checkNotNullParameter(repaymentItemMapper, "repaymentItemMapper");
        Intrinsics.checkNotNullParameter(loanLateDisbursalItemFactory, "loanLateDisbursalItemFactory");
        this.f293948a = instalmentItemMapper;
        this.f293949b = repaymentItemMapper;
    }
}
