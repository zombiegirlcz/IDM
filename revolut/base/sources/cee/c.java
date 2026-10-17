package cee;

import com.revolut.core.ui_kit.models.TextClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f23474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23475b;

    public c(TextClause title, ArrayList steps) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f23474a = title;
        this.f23475b = steps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f23474a.equals(cVar.f23474a) && this.f23475b.equals(cVar.f23475b);
    }

    public final int hashCode() {
        return this.f23475b.hashCode() + (this.f23474a.hashCode() * 31);
    }
}
