package bog;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends av1.c {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17441c;
    public final Clause d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f17443h;
    public final Integer i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, Clause label, Clause helperText, boolean z, boolean z3, Integer num, Integer num2) {
        super("MIDDLE_NAME_INPUT_TEXT_ID", 1);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        this.f17441c = str;
        this.d = label;
        this.e = helperText;
        this.f = z;
        this.f17442g = z3;
        this.f17443h = num;
        this.i = num2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f17441c, jVar.f17441c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && this.f == jVar.f && this.f17442g == jVar.f17442g && Intrinsics.f(this.f17443h, jVar.f17443h) && Intrinsics.f(this.i, jVar.i);
    }

    public final int hashCode() {
        String str = this.f17441c;
        int iC = j6.a.c(j6.a.c(p.a.a(p.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f17442g);
        Integer num = this.f17443h;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
