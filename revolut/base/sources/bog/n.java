package bog;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends av1.c {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17445c;
    public final Clause d;
    public final Clause e;
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Clause label, Clause helperText, String str, boolean z) {
        super("NATIVE_LAST_NAME_INPUT_TEXT_ID", 1);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        this.f17445c = str;
        this.d = label;
        this.e = helperText;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f17445c, nVar.f17445c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && this.f == nVar.f;
    }

    public final int hashCode() {
        String str = this.f17445c;
        return Boolean.hashCode(this.f) + p.a.a(p.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.d), 31, this.e);
    }
}
