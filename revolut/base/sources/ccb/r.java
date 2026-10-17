package ccb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f23015c;
    public final Image d;

    public r(List items, boolean z, TextLocalisedClause textLocalisedClause, Image image) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f23013a = items;
        this.f23014b = z;
        this.f23015c = textLocalisedClause;
        this.d = image;
    }

    @Override // jki.m
    public final jki.o b(jki.m oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        return new q(((r) oldState).f23014b != this.f23014b, !Intrinsics.f(r6.f23015c, this.f23015c), !Intrinsics.f(r6.d, this.d));
    }

    @Override // jki.n
    public final List c() {
        return this.f23013a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f23013a, rVar.f23013a) && this.f23014b == rVar.f23014b && Intrinsics.f(this.f23015c, rVar.f23015c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f23013a.hashCode() * 31, 31, this.f23014b);
        Clause clause = this.f23015c;
        int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.d;
        return iHashCode + (image != null ? image.hashCode() : 0);
    }
}
