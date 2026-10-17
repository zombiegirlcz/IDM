package o9a;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f223162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f223163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f223164c;
    public final List d;

    public q(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f223162a = textLocalisedClause;
        this.f223163b = z;
        this.f223164c = textLocalisedClause2;
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
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f223162a, qVar.f223162a) && this.f223163b == qVar.f223163b && Intrinsics.f(this.f223164c, qVar.f223164c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f223162a;
        int iC = j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f223163b);
        Clause clause2 = this.f223164c;
        return this.d.hashCode() + ((iC + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
