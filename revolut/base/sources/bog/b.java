package bog;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends av1.c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17431c;

    public b(String str) {
        super("ALIAS_NAME_INPUT_TEXT_ID", 1);
        this.f17431c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f17431c, ((b) obj2).f17431c);
    }

    public final int hashCode() {
        String str = this.f17431c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
