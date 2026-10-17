package mii;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;
import rp0.a1;
import rp0.f1;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f205856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f205857c;
    public final Image d;
    public final f1 e;
    public final a1 f;

    public f(String id10, Clause message, Clause clause, Image image, f1 position, a1 duration) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f205855a = id10;
        this.f205856b = message;
        this.f205857c = clause;
        this.d = image;
        this.e = position;
        this.f = duration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f205855a, fVar.f205855a) && Intrinsics.f(this.f205856b, fVar.f205856b) && Intrinsics.f(this.f205857c, fVar.f205857c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e && this.f == fVar.f;
    }

    public final int hashCode() {
        int iA = p.a.a(this.f205855a.hashCode() * 31, 31, this.f205856b);
        Clause clause = this.f205857c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 961;
        Image image = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (image != null ? image.hashCode() : 0)) * 31)) * 31);
    }

    public /* synthetic */ f(String str, Clause clause, TextLocalisedClause textLocalisedClause, Image image, f1 f1Var, a1 a1Var, int i) {
        this(str, clause, (i & 4) != 0 ? null : textLocalisedClause, (i & 16) != 0 ? null : image, (i & 32) != 0 ? f1.BOTTOM : f1Var, (i & 64) != 0 ? a1.SHORT : a1Var);
    }
}
