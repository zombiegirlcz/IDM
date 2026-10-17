package au0;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatTextView f9242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f9243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f9244c;

    public j5(AppCompatTextView firstTextView, AppCompatTextView iconView, AppCompatTextView secondTextView) {
        Intrinsics.checkNotNullParameter(firstTextView, "firstTextView");
        Intrinsics.checkNotNullParameter(iconView, "iconView");
        Intrinsics.checkNotNullParameter(secondTextView, "secondTextView");
        this.f9242a = firstTextView;
        this.f9243b = iconView;
        this.f9244c = secondTextView;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj2;
        return this.f9242a.equals(j5Var.f9242a) && this.f9243b.equals(j5Var.f9243b) && this.f9244c.equals(j5Var.f9244c);
    }

    public final int hashCode() {
        return this.f9244c.hashCode() + ((this.f9243b.hashCode() + (this.f9242a.hashCode() * 31)) * 31);
    }
}
