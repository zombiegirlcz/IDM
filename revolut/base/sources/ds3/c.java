package ds3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f117194c;
    public final b d;

    public c(String title, String description, b primaryButton, b secondaryButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.f117192a = title;
        this.f117193b = description;
        this.f117194c = primaryButton;
        this.d = secondaryButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f117192a, cVar.f117192a) && Intrinsics.f(this.f117193b, cVar.f117193b) && Intrinsics.f(this.f117194c, cVar.f117194c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f117194c.hashCode() + p.a.c(this.f117192a.hashCode() * 31, 31, this.f117193b)) * 31);
    }
}
