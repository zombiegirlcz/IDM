package zul;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f325553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f325554b;

    public u(TextLocalisedClause textClause, boolean z) {
        Intrinsics.checkNotNullParameter(textClause, "textClause");
        this.f325553a = textClause;
        this.f325554b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f325553a.equals(uVar.f325553a) && this.f325554b == uVar.f325554b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f325554b) + (this.f325553a.hashCode() * 31);
    }
}
