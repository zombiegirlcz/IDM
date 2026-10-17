package vu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f292221c;

    public h(String id10, String label, b card) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(card, "card");
        this.f292219a = id10;
        this.f292220b = label;
        this.f292221c = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f292219a, hVar.f292219a) && Intrinsics.f(this.f292220b, hVar.f292220b) && Intrinsics.f(this.f292221c, hVar.f292221c);
    }

    public final int hashCode() {
        return this.f292221c.hashCode() + p.a.c(this.f292219a.hashCode() * 31, 31, this.f292220b);
    }
}
