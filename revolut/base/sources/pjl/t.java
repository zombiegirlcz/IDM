package pjl;

import android.accounts.Account;
import android.content.ContentValues;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f236848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f236850c;

    public t(Account account, String tokenType, String token) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f236848a = account;
        this.f236849b = tokenType;
        this.f236850c = token;
    }

    public final ContentValues a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", h0.f236817b.c(h0.f236816a, this.f236848a));
        contentValues.put("tokenType", this.f236849b);
        contentValues.put("token", this.f236850c);
        return contentValues;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f236848a, tVar.f236848a) && Intrinsics.f(this.f236849b, tVar.f236849b) && Intrinsics.f(this.f236850c, tVar.f236850c);
    }

    public final int hashCode() {
        return this.f236850c.hashCode() + p.a.c(this.f236848a.hashCode() * 31, 31, this.f236849b);
    }
}
