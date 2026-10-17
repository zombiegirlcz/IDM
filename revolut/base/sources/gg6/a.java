package gg6;

import kotlin.jvm.internal.Intrinsics;
import th6.h;
import zh6.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f143599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f143600b;

    public a(c indiaNetBankingRepository, h upiRepository) {
        Intrinsics.checkNotNullParameter(indiaNetBankingRepository, "indiaNetBankingRepository");
        Intrinsics.checkNotNullParameter(upiRepository, "upiRepository");
        this.f143599a = indiaNetBankingRepository;
        this.f143600b = upiRepository;
    }
}
