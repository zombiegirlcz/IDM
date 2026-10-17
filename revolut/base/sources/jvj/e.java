package jvj;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f178893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f178894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f178895c;

    public e(Clause description, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f178893a = items;
        this.f178894b = description;
        this.f178895c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f178893a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f178893a, eVar.f178893a) && this.f178894b.equals(eVar.f178894b) && this.f178895c == eVar.f178895c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178895c) + p.a.b(this.f178893a.hashCode() * 31, 31, this.f178894b);
    }
}
