package fmb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f136282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f136283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f136284c;

    public m0(List items, v headerState, q ctaButtonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(ctaButtonState, "ctaButtonState");
        this.f136282a = items;
        this.f136283b = headerState;
        this.f136284c = ctaButtonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f136282a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f136282a, m0Var.f136282a) && Intrinsics.f(this.f136283b, m0Var.f136283b) && Intrinsics.f(this.f136284c, m0Var.f136284c);
    }

    public final int hashCode() {
        return this.f136284c.hashCode() + ((this.f136283b.hashCode() + (this.f136282a.hashCode() * 31)) * 31);
    }
}
