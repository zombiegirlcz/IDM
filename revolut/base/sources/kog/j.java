package kog;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f186358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f186359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f186360c;
    public final List d;

    public j(aim.e items, TextLocalisedClause title, TextLocalisedClause subtitle, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f186358a = title;
        this.f186359b = subtitle;
        this.f186360c = z;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f186358a.equals(jVar.f186358a) && this.f186359b.equals(jVar.f186359b) && this.f186360c == jVar.f186360c && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(t61.a.a(this.f186358a.hashCode() * 31, 31, this.f186359b), 31, this.f186360c);
    }
}
