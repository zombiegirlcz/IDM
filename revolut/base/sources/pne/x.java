package pne;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f237742b;

    public /* synthetic */ x(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(v.f237740a.getDescriptor(), i, 3);
            throw null;
        }
        this.f237741a = str;
        this.f237742b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f237741a, xVar.f237741a) && Intrinsics.f(this.f237742b, xVar.f237742b);
    }

    public final int hashCode() {
        return this.f237742b.hashCode() + (this.f237741a.hashCode() * 31);
    }

    public x(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f237741a = firstName;
        this.f237742b = lastName;
    }
}
