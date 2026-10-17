package nnd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f217518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f217519b;

    public a(List allAccounts, k selection) {
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.f217518a = allAccounts;
        this.f217519b = selection;
    }

    public static a a(a aVar, k selection) {
        List allAccounts = aVar.f217518a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(selection, "selection");
        return new a(allAccounts, selection);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f217518a, aVar.f217518a) && Intrinsics.f(this.f217519b, aVar.f217519b);
    }

    public final int hashCode() {
        return this.f217519b.hashCode() + (this.f217518a.hashCode() * 31);
    }
}
