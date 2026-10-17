package wyd;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f301240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f301241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f301242c;

    public b0(boolean z, a0 titleUiState, ArrayList items) {
        Intrinsics.checkNotNullParameter(titleUiState, "titleUiState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f301240a = z;
        this.f301241b = titleUiState;
        this.f301242c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f301242c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f301240a == b0Var.f301240a && this.f301241b.equals(b0Var.f301241b) && this.f301242c.equals(b0Var.f301242c);
    }

    public final int hashCode() {
        return this.f301242c.hashCode() + ((this.f301241b.hashCode() + (Boolean.hashCode(this.f301240a) * 31)) * 31);
    }
}
