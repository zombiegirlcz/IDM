package bog;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends av1.c {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17435c;
    public final Clause d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f17437h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, Clause label, Clause clause, boolean z, boolean z3, Integer num) {
        super("FIRST_SURNAME_INPUT_TEXT_ID", 1);
        Intrinsics.checkNotNullParameter(label, "label");
        this.f17435c = str;
        this.d = label;
        this.e = clause;
        this.f = z;
        this.f17436g = z3;
        this.f17437h = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f17435c, fVar.f17435c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && this.f == fVar.f && this.f17436g == fVar.f17436g && Intrinsics.f(this.f17437h, fVar.f17437h);
    }

    public final int hashCode() {
        String str = this.f17435c;
        int iA = p.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.d);
        Clause clause = this.e;
        int iC = j6.a.c(j6.a.c((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f), 31, this.f17436g);
        Integer num = this.f17437h;
        return iC + (num != null ? num.hashCode() : 0);
    }
}
