package de9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements jki.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f113333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f113334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PinCodeView.Header f113335c;

    public q(p pVar, Clause clause, PinCodeView.Header header, int i) {
        pVar = (i & 1) != 0 ? null : pVar;
        clause = (i & 2) != 0 ? null : clause;
        Intrinsics.checkNotNullParameter(header, "header");
        this.f113333a = pVar;
        this.f113334b = clause;
        this.f113335c = header;
    }

    @Override // jki.m
    public final jki.o b(jki.m oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        q qVar = (q) oldState;
        return new o(!Intrinsics.f(this.f113333a, qVar.f113333a), !Intrinsics.f(this.f113335c, qVar.f113335c));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f113333a, qVar.f113333a) && Intrinsics.f(this.f113334b, qVar.f113334b) && Intrinsics.f(this.f113335c, qVar.f113335c);
    }

    public final int hashCode() {
        p pVar = this.f113333a;
        int iHashCode = (pVar == null ? 0 : pVar.f113332a.hashCode()) * 31;
        Clause clause = this.f113334b;
        return this.f113335c.hashCode() + ((iHashCode + (clause != null ? clause.hashCode() : 0)) * 31);
    }
}
