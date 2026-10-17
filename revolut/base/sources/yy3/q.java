package yy3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f317791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f317792c;
    public final ArrayList d;

    public q(String title, String description, String buttonTitle, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f317790a = title;
        this.f317791b = description;
        this.f317792c = buttonTitle;
        this.d = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f317790a, qVar.f317790a) && Intrinsics.f(this.f317791b, qVar.f317791b) && Intrinsics.f(this.f317792c, qVar.f317792c) && this.d.equals(qVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f317790a.hashCode() * 31, 31, this.f317791b), 31, this.f317792c);
    }
}
