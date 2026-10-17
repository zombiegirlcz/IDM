package vmj;

import cli.o;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileCardModel f290607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f290608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatedBackgroundType f290609c;

    public i(ProfileCardModel cardModel, List actions, AnimatedBackgroundType.Esim esim) {
        Intrinsics.checkNotNullParameter(cardModel, "cardModel");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f290607a = cardModel;
        this.f290608b = actions;
        this.f290609c = esim;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f290607a, iVar.f290607a) && Intrinsics.f(this.f290608b, iVar.f290608b) && Intrinsics.f(this.f290609c, iVar.f290609c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f290607a.hashCode() * 31, 31, this.f290608b);
        AnimatedBackgroundType animatedBackgroundType = this.f290609c;
        return iD + (animatedBackgroundType == null ? 0 : animatedBackgroundType.hashCode());
    }
}
