package hha;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f152302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f152303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f152304c;
    public final o d;
    public final String e;
    public final p f;

    public f(Integer num, Long l2, dj0.d fee2, o oVar, String str, p postDiscountOption) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(postDiscountOption, "postDiscountOption");
        this.f152302a = num;
        this.f152303b = l2;
        this.f152304c = fee2;
        this.d = oVar;
        this.e = str;
        this.f = postDiscountOption;
    }

    @Override // hha.q
    public final dj0.d A0() {
        return this.f152304c;
    }

    @Override // hha.q
    public final p c6() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f152302a, fVar.f152302a) && Intrinsics.f(this.f152303b, fVar.f152303b) && Intrinsics.f(this.f152304c, fVar.f152304c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && this.f == fVar.f;
    }

    public final int hashCode() {
        Integer num = this.f152302a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l2 = this.f152303b;
        int iC = v7.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f152304c);
        o oVar = this.d;
        int iHashCode2 = (iC + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str = this.e;
        return this.f.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
