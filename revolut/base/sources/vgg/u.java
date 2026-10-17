package vgg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f289175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f289176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f289177c;
    public final TextLocalisedClause d;

    public u(List items, n header, boolean z, TextLocalisedClause buttonText) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f289175a = items;
        this.f289176b = header;
        this.f289177c = z;
        this.d = buttonText;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof u) {
            return new s(!((u) oldState).f289176b.equals(this.f289176b));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f289175a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f289175a, uVar.f289175a) && this.f289176b.equals(uVar.f289176b) && this.f289177c == uVar.f289177c && this.d.equals(uVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c((this.f289176b.hashCode() + (this.f289175a.hashCode() * 31)) * 31, 31, this.f289177c);
    }
}
