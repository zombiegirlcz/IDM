package kkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class q4 {

    @NotNull
    public static final o4 Companion = new o4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.m1 f184907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xua.a f184908c;
    public final elf.w0 d;

    public q4(klf.h0 commonDataSource, klf.m1 juniorDataSource, xua.a recurringPaymentInteractor, elf.w0 manageSubscriptionClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(manageSubscriptionClickHandler, "manageSubscriptionClickHandler");
        this.f184906a = commonDataSource;
        this.f184907b = juniorDataSource;
        this.f184908c = recurringPaymentInteractor;
        this.d = manageSubscriptionClickHandler;
    }
}
