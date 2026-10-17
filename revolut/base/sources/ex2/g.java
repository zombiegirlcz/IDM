package ex2;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f130343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f130344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f130345c;
    public final boolean d;
    public final boolean e;

    public g(ArrayList items, TextLocalisedClause mainButtonText, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(mainButtonText, "mainButtonText");
        this.f130343a = items;
        this.f130344b = mainButtonText;
        this.f130345c = z;
        this.d = z3;
        this.e = z4;
    }

    @Override // cli.p
    public final List c() {
        return this.f130343a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f130343a.equals(gVar.f130343a) && this.f130344b.equals(gVar.f130344b) && this.f130345c == gVar.f130345c && this.d == gVar.d && this.e == gVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(t61.a.a(this.f130343a.hashCode() * 31, 31, this.f130344b), 31, this.f130345c), 31, this.d);
    }
}
