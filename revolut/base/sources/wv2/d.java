package wv2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f300270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f300271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f300272c;
    public final boolean d;
    public final o5l.g e;

    public d(int i, Data card, Data pin, boolean z, o5l.g screenDensity) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        this.f300270a = i;
        this.f300271b = card;
        this.f300272c = pin;
        this.d = z;
        this.e = screenDensity;
    }

    public static d a(d dVar, int i, Data data, Data data2, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = dVar.f300270a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            data = dVar.f300271b;
        }
        Data card = data;
        if ((i2 & 4) != 0) {
            data2 = dVar.f300272c;
        }
        Data pin = data2;
        if ((i2 & 8) != 0) {
            z = dVar.d;
        }
        o5l.g screenDensity = dVar.e;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        return new d(i3, card, pin, z, screenDensity);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f300270a == dVar.f300270a && Intrinsics.f(this.f300271b, dVar.f300271b) && Intrinsics.f(this.f300272c, dVar.f300272c) && this.d == dVar.d && this.e == dVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(kii.e.c(this.f300272c, kii.e.c(this.f300271b, Integer.hashCode(this.f300270a) * 31, 31), 31), 31, this.d);
    }
}
