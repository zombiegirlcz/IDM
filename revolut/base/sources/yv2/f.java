package yv2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f317103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f317104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f317105c;
    public final boolean d;
    public final o5l.g e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f317106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f317107h;

    public f(int i, Data card, Data pin, boolean z, o5l.g screenDensity, boolean z3, boolean z4, g screenMode) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        Intrinsics.checkNotNullParameter(screenMode, "screenMode");
        this.f317103a = i;
        this.f317104b = card;
        this.f317105c = pin;
        this.d = z;
        this.e = screenDensity;
        this.f = z3;
        this.f317106g = z4;
        this.f317107h = screenMode;
    }

    public static f a(f fVar, int i, Data data, Data data2, boolean z, o5l.g gVar, boolean z3, boolean z4, g gVar2, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.f317103a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            data = fVar.f317104b;
        }
        Data card = data;
        if ((i2 & 4) != 0) {
            data2 = fVar.f317105c;
        }
        Data pin = data2;
        if ((i2 & 8) != 0) {
            z = fVar.d;
        }
        boolean z6 = z;
        if ((i2 & 16) != 0) {
            gVar = fVar.e;
        }
        o5l.g screenDensity = gVar;
        if ((i2 & 32) != 0) {
            z3 = fVar.f;
        }
        boolean z11 = z3;
        boolean z12 = (i2 & 64) != 0 ? fVar.f317106g : z4;
        g screenMode = (i2 & 128) != 0 ? fVar.f317107h : gVar2;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        Intrinsics.checkNotNullParameter(screenMode, "screenMode");
        return new f(i3, card, pin, z6, screenDensity, z11, z12, screenMode);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f317103a == fVar.f317103a && Intrinsics.f(this.f317104b, fVar.f317104b) && Intrinsics.f(this.f317105c, fVar.f317105c) && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f && this.f317106g == fVar.f317106g && this.f317107h == fVar.f317107h;
    }

    public final int hashCode() {
        return this.f317107h.hashCode() + j6.a.c(j6.a.c((this.e.hashCode() + j6.a.c(kii.e.c(this.f317105c, kii.e.c(this.f317104b, Integer.hashCode(this.f317103a) * 31, 31), 31), 31, this.d)) * 31, 31, this.f), 31, this.f317106g);
    }
}
