package ew6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f130099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f130100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f130101c;
    public final List d;

    public f(TextLocalisedClause title, TextLocalisedClause nextButtonText, List items, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(nextButtonText, "nextButtonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f130099a = title;
        this.f130100b = z;
        this.f130101c = nextButtonText;
        this.d = items;
    }

    @Override // jki.n
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f130099a.equals(fVar.f130099a) && this.f130100b == fVar.f130100b && this.f130101c.equals(fVar.f130101c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(j6.a.c(this.f130099a.hashCode() * 31, 31, this.f130100b), 31, this.f130101c);
    }
}
