package i16;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f157577c;

    public b(String id10, String name, List balances) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(balances, "balances");
        this.f157575a = id10;
        this.f157576b = name;
        this.f157577c = balances;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f157575a, bVar.f157575a) && Intrinsics.f(this.f157576b, bVar.f157576b) && Intrinsics.f(this.f157577c, bVar.f157577c);
    }

    public final int hashCode() {
        return this.f157577c.hashCode() + p.a.c(this.f157575a.hashCode() * 31, 31, this.f157576b);
    }
}
