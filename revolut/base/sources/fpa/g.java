package fpa;

import cli.o;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileCardModel f137076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f137077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f137078c;

    public g(ProfileCardModel profileCardModel, List circleActionButtons, f fVar, int i) {
        circleActionButtons = (i & 2) != 0 ? f0.f322471a : circleActionButtons;
        fVar = (i & 4) != 0 ? null : fVar;
        Intrinsics.checkNotNullParameter(profileCardModel, "profileCardModel");
        Intrinsics.checkNotNullParameter(circleActionButtons, "circleActionButtons");
        this.f137076a = profileCardModel;
        this.f137077b = circleActionButtons;
        this.f137078c = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f137076a, gVar.f137076a) && Intrinsics.f(this.f137077b, gVar.f137077b) && Intrinsics.f(this.f137078c, gVar.f137078c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f137076a.hashCode() * 31, 31, this.f137077b);
        f fVar = this.f137078c;
        return iD + (fVar == null ? 0 : fVar.hashCode());
    }
}
