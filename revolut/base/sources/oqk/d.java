package oqk;

import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f227930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227931c;
    public final Integer d;

    public d(String listId, TextClause text, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f227929a = listId;
        this.f227930b = text;
        this.f227931c = z;
        this.d = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f227929a, dVar.f227929a) && this.f227930b.equals(dVar.f227930b) && this.f227931c == dVar.f227931c && this.d.equals(dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(v7.b(this.f227929a.hashCode() * 31, 31, this.f227930b), 31, this.f227931c);
    }
}
