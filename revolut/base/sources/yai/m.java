package yai;

import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f312035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f312036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f312037c;
    public final ArrayList d;

    public m(Clause title, ArrayList keyboardSuggestions, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(keyboardSuggestions, "keyboardSuggestions");
        this.f312035a = items;
        this.f312036b = z;
        this.f312037c = title;
        this.d = keyboardSuggestions;
    }

    @Override // cli.p
    public final List c() {
        return this.f312035a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f312035a.equals(mVar.f312035a) && this.f312036b == mVar.f312036b && Intrinsics.f(this.f312037c, mVar.f312037c) && this.d.equals(mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.a(j6.a.c(this.f312035a.hashCode() * 31, 31, this.f312036b), 31, this.f312037c);
    }
}
