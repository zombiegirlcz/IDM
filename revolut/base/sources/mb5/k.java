package mb5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f204143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f204144c;
    public final String d;
    public final String e;
    public final String f;

    public k(String id10, boolean z, j state, String str, String accountNumber, String debtorName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(debtorName, "debtorName");
        this.f204142a = id10;
        this.f204143b = z;
        this.f204144c = state;
        this.d = str;
        this.e = accountNumber;
        this.f = debtorName;
    }
}
