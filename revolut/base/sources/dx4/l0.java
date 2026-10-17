package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l0 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120657c;
    public final String d;
    public final String e;
    public final String f;

    public l0(String cardDesignCode, String cardBrand, String holderName, String footer, String cardLabel, String cardTypeLabel) {
        Intrinsics.checkNotNullParameter(cardDesignCode, "cardDesignCode");
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(cardLabel, "cardLabel");
        Intrinsics.checkNotNullParameter(cardTypeLabel, "cardTypeLabel");
        this.f120655a = cardDesignCode;
        this.f120656b = cardBrand;
        this.f120657c = holderName;
        this.d = footer;
        this.e = cardLabel;
        this.f = cardTypeLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f120655a, l0Var.f120655a) && Intrinsics.f(this.f120656b, l0Var.f120656b) && Intrinsics.f(this.f120657c, l0Var.f120657c) && Intrinsics.f(this.d, l0Var.d) && Intrinsics.f(this.e, l0Var.e) && Intrinsics.f(this.f, l0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f120655a.hashCode() * 31, 31, this.f120656b), 31, this.f120657c), 31, this.d), 31, this.e);
    }
}
