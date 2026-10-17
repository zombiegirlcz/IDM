package xu3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f308875c;
    public final x d;

    public a(String title, String description, a1 icon, x evidenceTypeSelection) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(evidenceTypeSelection, "evidenceTypeSelection");
        this.f308873a = title;
        this.f308874b = description;
        this.f308875c = icon;
        this.d = evidenceTypeSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f308873a, aVar.f308873a) && Intrinsics.f(this.f308874b, aVar.f308874b) && this.f308875c == aVar.f308875c && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f308875c.hashCode() + p.a.c(this.f308873a.hashCode() * 31, 31, this.f308874b)) * 31);
    }
}
