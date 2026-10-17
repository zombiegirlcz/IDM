package hj2;

import android.content.Intent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f152648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f152649c;
    public final int d;
    public final Intent e;

    public a(String id10, TextLocalisedClause shortLabel, TextLocalisedClause longLabel, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(shortLabel, "shortLabel");
        Intrinsics.checkNotNullParameter(longLabel, "longLabel");
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f152647a = id10;
        this.f152648b = shortLabel;
        this.f152649c = longLabel;
        this.d = i;
        this.e = intent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f152647a.equals(aVar.f152647a) && this.f152648b.equals(aVar.f152648b) && this.f152649c.equals(aVar.f152649c) && this.d == aVar.d && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.b(this.d, t61.a.a(t61.a.a(this.f152647a.hashCode() * 31, 31, this.f152648b), 31, this.f152649c), 31);
    }
}
