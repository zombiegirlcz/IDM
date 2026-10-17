package aw0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f10468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f10469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f10470c;
    public final List d;

    public p7(TextLocalisedClause highClause, TextLocalisedClause averageClause, TextLocalisedClause lowClause, List items) {
        Intrinsics.checkNotNullParameter(highClause, "highClause");
        Intrinsics.checkNotNullParameter(averageClause, "averageClause");
        Intrinsics.checkNotNullParameter(lowClause, "lowClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f10468a = highClause;
        this.f10469b = averageClause;
        this.f10470c = lowClause;
        this.d = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj2;
        return this.f10468a.equals(p7Var.f10468a) && this.f10469b.equals(p7Var.f10469b) && this.f10470c.equals(p7Var.f10470c) && Intrinsics.f(this.d, p7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f10468a.hashCode() * 31, 31, this.f10469b), 31, this.f10470c);
    }
}
