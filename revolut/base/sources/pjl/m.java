package pjl;

import android.accounts.Account;
import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.v1;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f236825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f236826b;

    public m(Account account, List userDataKeysWithValues) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(userDataKeysWithValues, "userDataKeysWithValues");
        this.f236825a = account;
        this.f236826b = userDataKeysWithValues;
    }

    public final ContentValues a() {
        ContentValues contentValues = new ContentValues();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : this.f236826b) {
            String str = (String) pair.f186385a;
            String str2 = (String) pair.f186386b;
            arrayList.add(str);
            arrayList2.add(str2);
        }
        rlm.o oVar = h0.f236817b;
        contentValues.put("account", oVar.c(h0.f236816a, this.f236825a));
        v1 v1Var = v1.f247718a;
        contentValues.put("keys", oVar.c(new qlm.e(v1Var), arrayList));
        contentValues.put("values", oVar.c(new qlm.e(nlm.a.c(v1Var)), arrayList2));
        return contentValues;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f236825a, mVar.f236825a) && Intrinsics.f(this.f236826b, mVar.f236826b);
    }

    public final int hashCode() {
        return this.f236826b.hashCode() + (this.f236825a.hashCode() * 31);
    }
}
