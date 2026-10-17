package oc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f224019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f224020c;

    public a(String formId, String cardId, String cardType) {
        Intrinsics.checkNotNullParameter(formId, "formId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        this.f224018a = formId;
        this.f224019b = cardId;
        this.f224020c = cardType;
    }

    public final String a() {
        return v0.a.i(v0.a.m("CardParams(formId=", this.f224018a, ", cardId=", this.f224019b, ", cardType="), this.f224020c, ")");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f224018a, aVar.f224018a) && Intrinsics.f(this.f224019b, aVar.f224019b) && Intrinsics.f(this.f224020c, aVar.f224020c);
    }

    public final int hashCode() {
        return this.f224020c.hashCode() + p.a.c(this.f224018a.hashCode() * 31, 31, this.f224019b);
    }
}
