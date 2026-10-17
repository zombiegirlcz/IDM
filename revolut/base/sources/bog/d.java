package bog;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends av1.c {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17432c;
    public final TextLocalisedClause d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f17434h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String value, TextLocalisedClause label, Clause clause, boolean z, boolean z3, Integer num) {
        super("FIRST_NAME_INPUT_TEXT_ID", 1);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f17432c = value;
        this.d = label;
        this.e = clause;
        this.f = z;
        this.f17433g = z3;
        this.f17434h = num;
    }

    public static d e(d dVar, String value, Clause clause, boolean z, boolean z3, Integer num) {
        TextLocalisedClause label = dVar.d;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        return new d(value, label, clause, z, z3, num);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f17432c, dVar.f17432c) && this.d.equals(dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f && this.f17433g == dVar.f17433g && Intrinsics.f(this.f17434h, dVar.f17434h);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f17432c.hashCode() * 31, 31, this.d);
        Clause clause = this.e;
        int iC = j6.a.c(j6.a.c((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f), 31, this.f17433g);
        Integer num = this.f17434h;
        return iC + (num != null ? num.hashCode() : 0);
    }
}
