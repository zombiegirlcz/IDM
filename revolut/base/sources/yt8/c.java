package yt8;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ngm.n;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f316662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f316663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f316664c;

    static {
        new c(i.NONE, h0.f322473a, f0.f322471a);
    }

    public c(i kycStatus, Set elements, List eligibilitySteps) {
        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(eligibilitySteps, "eligibilitySteps");
        this.f316662a = kycStatus;
        this.f316663b = elements;
        this.f316664c = eligibilitySteps;
    }

    public static c a(c cVar, i kycStatus, List eligibilitySteps, int i) {
        if ((i & 1) != 0) {
            kycStatus = cVar.f316662a;
        }
        Set elements = cVar.f316663b;
        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(eligibilitySteps, "eligibilitySteps");
        return new c(kycStatus, elements, eligibilitySteps);
    }

    public final List b() {
        return this.f316664c;
    }

    public final boolean c() {
        Object next;
        if (n.r(l9.l.o(this).f316667a) || n.r(l9.l.r(this).f316667a)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(this, "<this>");
        Iterator it8 = this.f316663b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((f) next).f316668b == j.JP_MY_NUMBER) {
                break;
            }
        }
        f fVar = (f) next;
        return n.r(fVar != null ? fVar.f316667a : null);
    }

    public final boolean d() {
        return this.f316662a == i.FAILED;
    }

    public final boolean e() {
        return this.f316662a == i.NONE;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f316662a == cVar.f316662a && Intrinsics.f(this.f316663b, cVar.f316663b) && Intrinsics.f(this.f316664c, cVar.f316664c);
    }

    public final boolean f() {
        return n.p(this.f316662a);
    }

    public final boolean g() {
        return n.q(this.f316662a);
    }

    public final int hashCode() {
        return this.f316664c.hashCode() + p.a.f(this.f316662a.hashCode() * 31, 31, this.f316663b);
    }
}
