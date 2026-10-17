package o55;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222314b;

    public a(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f222313a = loanId;
        this.f222314b = j6.a.q("docs", loanId);
    }

    public final String a() {
        return this.f222313a;
    }

    @Override // xx4.c
    public final TypeToken e() {
        TypeToken typeToken = TypeToken.get(rx4.b.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        return typeToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f222313a, ((a) obj2).f222313a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f222314b;
    }

    public final int hashCode() {
        return this.f222313a.hashCode();
    }
}
