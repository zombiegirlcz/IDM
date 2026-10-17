package tok;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f273239c;
    public final List d;

    public g(String title, String subtitle, aw0.i iVar, aim.e items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f273237a = title;
        this.f273238b = subtitle;
        this.f273239c = iVar;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f273237a, gVar.f273237a) && Intrinsics.f(this.f273238b, gVar.f273238b) && Intrinsics.f(this.f273239c, gVar.f273239c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f273237a.hashCode() * 31, 31, this.f273238b);
        aw0.i iVar = this.f273239c;
        return this.d.hashCode() + ((iC + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }
}
