package bog;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends av1.c {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17444c;
    public final Clause d;
    public final Clause e;
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Clause label, Clause helperText, String str, boolean z) {
        super("NATIVE_FIRST_NAME_INPUT_TEXT_ID", 1);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        this.f17444c = str;
        this.d = label;
        this.e = helperText;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f17444c, lVar.f17444c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && this.f == lVar.f;
    }

    public final int hashCode() {
        String str = this.f17444c;
        return Boolean.hashCode(this.f) + p.a.a(p.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.d), 31, this.e);
    }
}
