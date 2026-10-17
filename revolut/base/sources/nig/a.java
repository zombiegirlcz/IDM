package nig;

import cli.j;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk0.g f216094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f216096c;

    public a() {
        this(0);
    }

    public static a a(a aVar, lk0.g transactions, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            transactions = aVar.f216094a;
        }
        if ((i & 2) != 0) {
            str = aVar.f216095b;
        }
        if ((i & 4) != 0) {
            z = aVar.f216096c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return new a(transactions, str, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f216094a, aVar.f216094a) && Intrinsics.f(this.f216095b, aVar.f216095b) && this.f216096c == aVar.f216096c;
    }

    public final int hashCode() {
        int iHashCode = this.f216094a.f196174a.hashCode() * 31;
        String str = this.f216095b;
        return Boolean.hashCode(this.f216096c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public a(lk0.g transactions, String str, boolean z) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f216094a = transactions;
        this.f216095b = str;
        this.f216096c = z;
    }

    public a(int i) {
        this(new lk0.g(f0.f322471a), null, false);
    }
}
