package e06;

import cli.j;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f121425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f121426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f121427c;
    public final dj0.d d;

    public d(dj0.d cartAmount, xi0.b currency, String formattedTipAmount, dj0.d tipAmount) {
        Intrinsics.checkNotNullParameter(cartAmount, "cartAmount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(formattedTipAmount, "formattedTipAmount");
        Intrinsics.checkNotNullParameter(tipAmount, "tipAmount");
        this.f121425a = cartAmount;
        this.f121426b = currency;
        this.f121427c = formattedTipAmount;
        this.d = tipAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f121425a, dVar.f121425a) && Intrinsics.f(this.f121426b, dVar.f121426b) && Intrinsics.f(this.f121427c, dVar.f121427c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(l.j(this.f121426b, this.f121425a.hashCode() * 31, 31), 31, this.f121427c);
    }
}
