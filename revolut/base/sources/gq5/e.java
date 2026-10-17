package gq5;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f145568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f145569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b6k.e f145570c;

    public e(Data cryptoAddress, Data transactionsContent, b6k.e recipientAnalytics) {
        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(recipientAnalytics, "recipientAnalytics");
        this.f145568a = cryptoAddress;
        this.f145569b = transactionsContent;
        this.f145570c = recipientAnalytics;
    }

    public static e a(e eVar, Data cryptoAddress, Data transactionsContent, b6k.e recipientAnalytics, int i) {
        if ((i & 1) != 0) {
            cryptoAddress = eVar.f145568a;
        }
        if ((i & 2) != 0) {
            transactionsContent = eVar.f145569b;
        }
        if ((i & 4) != 0) {
            recipientAnalytics = eVar.f145570c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(recipientAnalytics, "recipientAnalytics");
        return new e(cryptoAddress, transactionsContent, recipientAnalytics);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f145568a, eVar.f145568a) && Intrinsics.f(this.f145569b, eVar.f145569b) && Intrinsics.f(this.f145570c, eVar.f145570c);
    }

    public final int hashCode() {
        return this.f145570c.hashCode() + kii.e.c(this.f145569b, this.f145568a.hashCode() * 31, 31);
    }
}
