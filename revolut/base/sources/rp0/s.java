package rp0;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.DialogHeaderView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogHeaderView.a f256161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f256162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f256163c;
    public final r d;

    public s(com.revolut.core.ui_kit.views.f fVar, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, int i) {
        textLocalisedClause = (i & 4) != 0 ? null : textLocalisedClause;
        r backButton = r.CROSS;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        this.f256161a = fVar;
        this.f256162b = title;
        this.f256163c = textLocalisedClause;
        this.d = backButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f256161a, sVar.f256161a) && Intrinsics.f(this.f256162b, sVar.f256162b) && Intrinsics.f(this.f256163c, sVar.f256163c) && this.d == sVar.d;
    }

    @Override // rp0.u
    public final Parcelable getAnalyticsContext() {
        return null;
    }

    @Override // rp0.u
    public final Clause getDescription() {
        return this.f256163c;
    }

    @Override // rp0.u
    public final Clause getTitle() {
        return this.f256162b;
    }

    public final int hashCode() {
        DialogHeaderView.a aVar = this.f256161a;
        int iA = t61.a.a((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f256162b);
        Clause clause = this.f256163c;
        return (this.d.hashCode() + ((iA + (clause != null ? clause.hashCode() : 0)) * 31)) * 31;
    }
}
