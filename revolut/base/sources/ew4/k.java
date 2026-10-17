package ew4;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f130078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f130079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f130080c;
    public final gs4.a d;
    public final List e;

    public k(MoneyClause title, TextLocalisedClause description, TimeClause secondDescription, gs4.a endImage, aim.e actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f130078a = title;
        this.f130079b = description;
        this.f130080c = secondDescription;
        this.d = endImage;
        this.e = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f130078a.equals(kVar.f130078a) && this.f130079b.equals(kVar.f130079b) && this.f130080c.equals(kVar.f130080c) && this.d.equals(kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + h30.l.d(this.f130080c, t61.a.a(this.f130078a.hashCode() * 31, 31, this.f130079b), 31)) * 31);
    }
}
