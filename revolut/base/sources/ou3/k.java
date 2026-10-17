package ou3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f229800c;

    public k(String title, String subtitle, ArrayList actionButtons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(actionButtons, "actionButtons");
        this.f229798a = title;
        this.f229799b = subtitle;
        this.f229800c = actionButtons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f229798a, kVar.f229798a) && Intrinsics.f(this.f229799b, kVar.f229799b) && this.f229800c.equals(kVar.f229800c);
    }

    public final int hashCode() {
        return this.f229800c.hashCode() + p.a.c(this.f229798a.hashCode() * 31, 31, this.f229799b);
    }
}
