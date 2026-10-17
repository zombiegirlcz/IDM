package e16;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f121891c;

    public d(String id10, String name, ArrayList balances) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(balances, "balances");
        this.f121889a = id10;
        this.f121890b = name;
        this.f121891c = balances;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f121889a, dVar.f121889a) && Intrinsics.f(this.f121890b, dVar.f121890b) && this.f121891c.equals(dVar.f121891c);
    }

    public final int hashCode() {
        return this.f121891c.hashCode() + p.a.c(this.f121889a.hashCode() * 31, 31, this.f121890b);
    }
}
