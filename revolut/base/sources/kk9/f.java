package kk9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f184529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f184530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f184531c;

    public /* synthetic */ f(TextLocalisedClause textLocalisedClause) {
        this(textLocalisedClause, false, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f184529a, fVar.f184529a) && this.f184530b == fVar.f184530b && Intrinsics.f(this.f184531c, fVar.f184531c);
    }

    public final int hashCode() {
        TextLocalisedClause textLocalisedClause = this.f184529a;
        int iC = j6.a.c((textLocalisedClause == null ? 0 : textLocalisedClause.hashCode()) * 31, 31, this.f184530b);
        d dVar = this.f184531c;
        return iC + (dVar != null ? dVar.hashCode() : 0);
    }

    public f(TextLocalisedClause textLocalisedClause, boolean z, d dVar) {
        this.f184529a = textLocalisedClause;
        this.f184530b = z;
        this.f184531c = dVar;
    }
}
