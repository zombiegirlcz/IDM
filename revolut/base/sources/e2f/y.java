package e2f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f122089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f122090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f122091c;

    public y(List items, r header, m ctaButton) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(ctaButton, "ctaButton");
        this.f122089a = items;
        this.f122090b = header;
        this.f122091c = ctaButton;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof y)) {
            return null;
        }
        y yVar = (y) oldState;
        return new w(!yVar.f122090b.equals(this.f122090b), !yVar.f122091c.equals(this.f122091c));
    }

    @Override // cli.p
    public final List c() {
        return this.f122089a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f122089a, yVar.f122089a) && Intrinsics.f(this.f122090b, yVar.f122090b) && Intrinsics.f(this.f122091c, yVar.f122091c);
    }

    public final int hashCode() {
        return this.f122091c.hashCode() + ((this.f122090b.hashCode() + (this.f122089a.hashCode() * 31)) * 31);
    }
}
