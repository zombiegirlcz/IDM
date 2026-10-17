package feh;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f134627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2h.b f134628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f134629c;

    public k(j jVar, x2h.b actionsPanelState, aim.e items) {
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f134627a = jVar;
        this.f134628b = actionsPanelState;
        this.f134629c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f134629c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f134627a, kVar.f134627a) && Intrinsics.f(this.f134628b, kVar.f134628b) && Intrinsics.f(this.f134629c, kVar.f134629c);
    }

    public final int hashCode() {
        j jVar = this.f134627a;
        return this.f134629c.hashCode() + ((this.f134628b.hashCode() + ((jVar == null ? 0 : jVar.hashCode()) * 31)) * 31);
    }
}
