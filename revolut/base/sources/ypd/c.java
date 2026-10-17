package ypd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import tx0.l0;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f315832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f315833b;

    public c(TextLocalisedClause toolbarTitle, l0 headerModel) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f315832a = toolbarTitle;
        this.f315833b = headerModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f315832a.equals(cVar.f315832a) && this.f315833b.equals(cVar.f315833b);
    }

    public final int hashCode() {
        return this.f315833b.hashCode() + (this.f315832a.hashCode() * 31);
    }
}
