package bog;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends av1.c {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17438c;
    public final Clause d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f17440h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, Clause label, Clause clause, boolean z, boolean z3, Integer num) {
        super("LAST_NAME_INPUT_TEXT_ID", 1);
        Intrinsics.checkNotNullParameter(label, "label");
        this.f17438c = str;
        this.d = label;
        this.e = clause;
        this.f = z;
        this.f17439g = z3;
        this.f17440h = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f17438c, hVar.f17438c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && this.f == hVar.f && this.f17439g == hVar.f17439g && Intrinsics.f(this.f17440h, hVar.f17440h);
    }

    public final int hashCode() {
        String str = this.f17438c;
        int iA = p.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.d);
        Clause clause = this.e;
        int iC = j6.a.c(j6.a.c((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f), 31, this.f17439g);
        Integer num = this.f17440h;
        return iC + (num != null ? num.hashCode() : 0);
    }
}
