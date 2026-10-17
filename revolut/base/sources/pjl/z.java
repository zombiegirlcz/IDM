package pjl;

import android.accounts.Account;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class z {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f236870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f236871b;

    public z(Account account, ArrayList userDataKeysWithValues) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(userDataKeysWithValues, "userDataKeysWithValues");
        this.f236870a = account;
        this.f236871b = userDataKeysWithValues;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f236870a, zVar.f236870a) && this.f236871b.equals(zVar.f236871b);
    }

    public final int hashCode() {
        return this.f236871b.hashCode() + (this.f236870a.hashCode() * 31);
    }
}
