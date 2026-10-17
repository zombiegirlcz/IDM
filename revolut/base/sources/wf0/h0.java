package wf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296892b;

    public h0(String locale, String lastTimeUpdated) {
        Intrinsics.checkNotNullParameter("faq", "faqPath");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(lastTimeUpdated, "lastTimeUpdated");
        this.f296891a = locale;
        this.f296892b = lastTimeUpdated;
    }

    public final String a() {
        return this.f296891a;
    }

    public final n b() {
        return new n(this.f296891a, this.f296892b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f296891a, h0Var.f296891a) && this.f296892b.equals(h0Var.f296892b);
    }

    public final int hashCode() {
        return this.f296892b.hashCode() + p.a.c(3135402, 31, this.f296891a);
    }
}
