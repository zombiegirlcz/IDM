package pt0;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f239588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f239589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f239590c;

    public u(int i, int i2, TextClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f239588a = title;
        this.f239589b = i;
        this.f239590c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f239588a.equals(uVar.f239588a) && this.f239589b == uVar.f239589b && this.f239590c == uVar.f239590c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f239590c) + j6.a.b(this.f239589b, this.f239588a.hashCode() * 31, 31);
    }
}
