package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bd extends PromptContentDelegate.Model.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgressStyle f53724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f53725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f53726c;

    public bd(ProgressStyle progressStyle, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(progressStyle, "progressStyle");
        this.f53724a = progressStyle;
        this.f53725b = clause;
        this.f53726c = clause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj2;
        return Intrinsics.f(this.f53724a, bdVar.f53724a) && Intrinsics.f(this.f53725b, bdVar.f53725b) && Intrinsics.f(this.f53726c, bdVar.f53726c);
    }

    public final int hashCode() {
        int iHashCode = this.f53724a.hashCode() * 31;
        Clause clause = this.f53725b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f53726c;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
