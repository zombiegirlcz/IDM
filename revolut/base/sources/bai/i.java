package bai;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f14100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f14101b;

    public i(Data terms, h basicAccount) {
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(basicAccount, "basicAccount");
        this.f14100a = terms;
        this.f14101b = basicAccount;
    }

    public static i a(i iVar, Data terms, h basicAccount, int i) {
        if ((i & 1) != 0) {
            terms = iVar.f14100a;
        }
        if ((i & 2) != 0) {
            basicAccount = iVar.f14101b;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(basicAccount, "basicAccount");
        return new i(terms, basicAccount);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f14100a, iVar.f14100a) && Intrinsics.f(this.f14101b, iVar.f14101b);
    }

    public final int hashCode() {
        return this.f14101b.hashCode() + (this.f14100a.hashCode() * 31);
    }
}
