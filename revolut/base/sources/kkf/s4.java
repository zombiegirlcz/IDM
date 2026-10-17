package kkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class s4 {

    @NotNull
    public static final r4 Companion = new r4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.m1 f184932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final elf.n1 f184933c;

    public s4(klf.h0 commonDataSource, klf.m1 juniorDataSource, elf.n1 paymentVerificationClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(paymentVerificationClickHandler, "paymentVerificationClickHandler");
        this.f184931a = commonDataSource;
        this.f184932b = juniorDataSource;
        this.f184933c = paymentVerificationClickHandler;
    }
}
