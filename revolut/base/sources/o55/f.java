package o55;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222333b;

    public f(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f222332a = loanId;
        this.f222333b = j6.a.q("loan_forbearance_agreements", loanId);
    }

    public final String a() {
        return this.f222332a;
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
        return (obj2 instanceof f) && Intrinsics.f(this.f222332a, ((f) obj2).f222332a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f222333b;
    }

    public final int hashCode() {
        return this.f222332a.hashCode();
    }
}
