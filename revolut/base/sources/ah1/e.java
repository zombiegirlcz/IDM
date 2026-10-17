package ah1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f4851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f4852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o5l.g f4853c;
    public final boolean d;
    public final Data e;

    public e(Data cardWrapper, Data designConfig, o5l.g screenDensity, boolean z, Data walletType) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(designConfig, "designConfig");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        Intrinsics.checkNotNullParameter(walletType, "walletType");
        this.f4851a = cardWrapper;
        this.f4852b = designConfig;
        this.f4853c = screenDensity;
        this.d = z;
        this.e = walletType;
    }

    public static e a(e eVar, Data data, Data data2, Data data3, int i) {
        if ((i & 1) != 0) {
            data = eVar.f4851a;
        }
        Data cardWrapper = data;
        if ((i & 2) != 0) {
            data2 = eVar.f4852b;
        }
        Data designConfig = data2;
        o5l.g screenDensity = eVar.f4853c;
        boolean z = eVar.d;
        if ((i & 16) != 0) {
            data3 = eVar.e;
        }
        Data walletType = data3;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(designConfig, "designConfig");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        Intrinsics.checkNotNullParameter(walletType, "walletType");
        return new e(cardWrapper, designConfig, screenDensity, z, walletType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f4851a, eVar.f4851a) && Intrinsics.f(this.f4852b, eVar.f4852b) && this.f4853c == eVar.f4853c && this.d == eVar.d && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c((this.f4853c.hashCode() + kii.e.c(this.f4852b, this.f4851a.hashCode() * 31, 31)) * 31, 31, this.d);
    }
}
