package sqf;

import com.revolut.core.ui_kit.models.Clause;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f265084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f265085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f265086c;
    public final String d;

    public d(int i, Clause title, Clause label, String reference) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.f265084a = title;
        this.f265085b = label;
        this.f265086c = i;
        this.d = reference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f265084a, dVar.f265084a) && Intrinsics.f(this.f265085b, dVar.f265085b) && this.f265086c == dVar.f265086c && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f265086c, p.a.a(this.f265084a.hashCode() * 31, 31, this.f265085b), 31);
    }
}
