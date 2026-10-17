package wpc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f299216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f299217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f299218c;
    public final TextLocalisedClause d;
    public final TextLocalisedClause e;

    public c(e mode, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause primaryButton, TextLocalisedClause textLocalisedClause2) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.f299216a = mode;
        this.f299217b = title;
        this.f299218c = textLocalisedClause;
        this.d = primaryButton;
        this.e = textLocalisedClause2;
    }

    @Override // wpc.f
    public final e M() {
        return this.f299216a;
    }

    @Override // wpc.f
    public final String a() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f299216a == cVar.f299216a && this.f299217b.equals(cVar.f299217b) && this.f299218c.equals(cVar.f299218c) && this.d.equals(cVar.d) && this.e.equals(cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + t61.a.a(j6.a.c(t61.a.a(t61.a.a(this.f299216a.hashCode() * 31, 31, this.f299217b), 31, this.f299218c), 31, false), 31, this.d);
    }
}
