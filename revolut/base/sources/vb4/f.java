package vb4;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.p f287402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f287403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f287404c;

    public f(whf.p transactionsContent, Set selectedTransactionIds, String searchQuery) {
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(selectedTransactionIds, "selectedTransactionIds");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f287402a = transactionsContent;
        this.f287403b = selectedTransactionIds;
        this.f287404c = searchQuery;
    }

    public static f a(f fVar, LinkedHashSet selectedTransactionIds) {
        whf.p transactionsContent = fVar.f287402a;
        String searchQuery = fVar.f287404c;
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(selectedTransactionIds, "selectedTransactionIds");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new f(transactionsContent, selectedTransactionIds, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f287402a, fVar.f287402a) && Intrinsics.f(this.f287403b, fVar.f287403b) && Intrinsics.f(this.f287404c, fVar.f287404c);
    }

    public final int hashCode() {
        return this.f287404c.hashCode() + p.a.f(this.f287402a.hashCode() * 31, 31, this.f287403b);
    }
}
