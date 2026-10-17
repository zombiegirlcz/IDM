package e16;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f121888c;
    public final List d;

    public b(String id10, String name, ArrayList balances, List wallets) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(balances, "balances");
        Intrinsics.checkNotNullParameter(wallets, "wallets");
        this.f121886a = id10;
        this.f121887b = name;
        this.f121888c = balances;
        this.d = wallets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f121886a, bVar.f121886a) && Intrinsics.f(this.f121887b, bVar.f121887b) && this.f121888c.equals(bVar.f121888c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f121888c, p.a.c(this.f121886a.hashCode() * 31, 31, this.f121887b), 31);
    }
}
