package gna;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f144941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f144942b;

    public e(Clause clause, Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f144941a = content;
        this.f144942b = clause;
    }

    public static e a(e eVar, Data content, Clause clause, int i) {
        if ((i & 1) != 0) {
            content = eVar.f144941a;
        }
        if ((i & 2) != 0) {
            clause = eVar.f144942b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return new e(clause, content);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f144941a, eVar.f144941a) && Intrinsics.f(this.f144942b, eVar.f144942b);
    }

    public final int hashCode() {
        int iHashCode = this.f144941a.hashCode() * 31;
        Clause clause = this.f144942b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
