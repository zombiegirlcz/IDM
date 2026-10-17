package com.revolut.core.ui_kit.views;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.DialogHeaderView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends DialogHeaderView.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f59067b;

    public h(TextLocalisedClause title, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f59066a = id10;
        this.f59067b = title;
    }

    @Override // com.revolut.core.ui_kit.views.DialogHeaderView.b
    public final String a() {
        return this.f59066a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f59066a.equals(hVar.f59066a) && this.f59067b.equals(hVar.f59067b);
    }

    public final int hashCode() {
        return this.f59067b.hashCode() + (this.f59066a.hashCode() * 31);
    }
}
