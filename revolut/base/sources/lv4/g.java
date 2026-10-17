package lv4;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f200297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f200298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f200299c;

    public g(Data content, Data transactions, List upcomingPayments) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(upcomingPayments, "upcomingPayments");
        this.f200297a = content;
        this.f200298b = transactions;
        this.f200299c = upcomingPayments;
    }

    public static g a(g gVar, Data content, Data transactions, List upcomingPayments, int i) {
        if ((i & 1) != 0) {
            content = gVar.f200297a;
        }
        if ((i & 2) != 0) {
            transactions = gVar.f200298b;
        }
        if ((i & 4) != 0) {
            upcomingPayments = gVar.f200299c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(upcomingPayments, "upcomingPayments");
        return new g(content, transactions, upcomingPayments);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f200297a, gVar.f200297a) && Intrinsics.f(this.f200298b, gVar.f200298b) && Intrinsics.f(this.f200299c, gVar.f200299c);
    }

    public final int hashCode() {
        return this.f200299c.hashCode() + kii.e.c(this.f200298b, this.f200297a.hashCode() * 31, 31);
    }
}
