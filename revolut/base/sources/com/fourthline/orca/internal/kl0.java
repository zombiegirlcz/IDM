package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class kl0 implements a01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fd f30308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c81 f30309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f30310c;

    public kl0(fd country, c81 name, Function0 presentation) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        this.f30308a = country;
        this.f30309b = name;
        this.f30310c = presentation;
    }

    @Override // com.fourthline.orca.internal.a01
    public Function0 a() {
        return this.f30310c;
    }

    public final fd b() {
        return this.f30308a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof kl0)) {
            return false;
        }
        kl0 kl0Var = (kl0) obj2;
        return Intrinsics.f(this.f30308a, kl0Var.f30308a) && Intrinsics.f(this.f30309b, kl0Var.f30309b) && Intrinsics.f(this.f30310c, kl0Var.f30310c);
    }

    @Override // com.fourthline.orca.internal.a01
    public c81 getName() {
        return this.f30309b;
    }

    public int hashCode() {
        return (((this.f30308a.hashCode() * 31) + this.f30309b.hashCode()) * 31) + this.f30310c.hashCode();
    }

    public String toString() {
        return "PersonNationalitySuggestion(country=" + this.f30308a + ", name=" + this.f30309b + ", presentation=" + this.f30310c + ")";
    }
}
