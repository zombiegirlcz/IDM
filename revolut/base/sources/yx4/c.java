package yx4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f317547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f317548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f317549c;

    public c(TextLocalisedClause title, TextLocalisedClause buttonTitle, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f317547a = title;
        this.f317548b = buttonTitle;
        this.f317549c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f317547a.equals(cVar.f317547a) && this.f317548b.equals(cVar.f317548b) && this.f317549c.equals(cVar.f317549c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f317549c, t61.a.a(this.f317547a.hashCode() * 31, 31, this.f317548b), 961);
    }
}
