package bzc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f19957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f19958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19959c;

    public j(Data submissionsState, Data transactionsWithState, boolean z) {
        Intrinsics.checkNotNullParameter(submissionsState, "submissionsState");
        Intrinsics.checkNotNullParameter(transactionsWithState, "transactionsWithState");
        this.f19957a = submissionsState;
        this.f19958b = transactionsWithState;
        this.f19959c = z;
    }

    public static j a(j jVar, Data submissionsState, Data transactionsWithState, int i) {
        if ((i & 1) != 0) {
            submissionsState = jVar.f19957a;
        }
        if ((i & 2) != 0) {
            transactionsWithState = jVar.f19958b;
        }
        boolean z = jVar.f19959c;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(submissionsState, "submissionsState");
        Intrinsics.checkNotNullParameter(transactionsWithState, "transactionsWithState");
        return new j(submissionsState, transactionsWithState, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f19957a, jVar.f19957a) && Intrinsics.f(this.f19958b, jVar.f19958b) && this.f19959c == jVar.f19959c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19959c) + kii.e.c(this.f19958b, this.f19957a.hashCode() * 31, 31);
    }
}
