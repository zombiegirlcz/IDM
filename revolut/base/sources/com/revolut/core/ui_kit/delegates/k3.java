package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k3 implements m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f54364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f54365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComplexImage f54366c;
    public final Clause d;
    public final Object e;

    public k3(TextLocalisedClause errorText, TextLocalisedClause mainActionText, ComplexImage complexImage, TextLocalisedClause textLocalisedClause, Object obj2) {
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        Intrinsics.checkNotNullParameter(mainActionText, "mainActionText");
        this.f54364a = errorText;
        this.f54365b = mainActionText;
        this.f54366c = complexImage;
        this.d = textLocalisedClause;
        this.e = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj2;
        return Intrinsics.f(this.f54364a, k3Var.f54364a) && Intrinsics.f(this.f54365b, k3Var.f54365b) && Intrinsics.f(this.f54366c, k3Var.f54366c) && Intrinsics.f(this.d, k3Var.d) && Intrinsics.f(this.e, k3Var.e);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f54364a.hashCode() * 31, 31, this.f54365b);
        ComplexImage complexImage = this.f54366c;
        int iHashCode = (iA + (complexImage == null ? 0 : complexImage.hashCode())) * 31;
        Clause clause = this.d;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Object obj2 = this.e;
        return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    public /* synthetic */ k3(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, ComplexImage.Regular regular, Object obj2, int i) {
        this(textLocalisedClause, textLocalisedClause2, (i & 4) != 0 ? new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)) : regular, (TextLocalisedClause) null, (i & 16) != 0 ? null : obj2);
    }
}
