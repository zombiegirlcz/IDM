package ow2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f230277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f230278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o5l.g f230279c;
    public final boolean d;
    public final cw2.a e;

    public e(Data card, Data designConfig, o5l.g screenDensity, boolean z, cw2.a walletType) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(designConfig, "designConfig");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        Intrinsics.checkNotNullParameter(walletType, "walletType");
        this.f230277a = card;
        this.f230278b = designConfig;
        this.f230279c = screenDensity;
        this.d = z;
        this.e = walletType;
    }

    public static e a(e eVar, Data data, Data data2, int i) {
        if ((i & 1) != 0) {
            data = eVar.f230277a;
        }
        Data card = data;
        if ((i & 2) != 0) {
            data2 = eVar.f230278b;
        }
        Data designConfig = data2;
        o5l.g screenDensity = eVar.f230279c;
        boolean z = eVar.d;
        cw2.a walletType = eVar.e;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(designConfig, "designConfig");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        Intrinsics.checkNotNullParameter(walletType, "walletType");
        return new e(card, designConfig, screenDensity, z, walletType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f230277a, eVar.f230277a) && Intrinsics.f(this.f230278b, eVar.f230278b) && this.f230279c == eVar.f230279c && this.d == eVar.d && this.e == eVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c((this.f230279c.hashCode() + kii.e.c(this.f230278b, this.f230277a.hashCode() * 31, 31)) * 31, 31, this.d);
    }
}
