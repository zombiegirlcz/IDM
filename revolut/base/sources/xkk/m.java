package xkk;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f306855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f306856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatedBackgroundType f306857c;
    public final List d;

    public m(l lVar, k buttons, AnimatedBackgroundType background, List items) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f306855a = lVar;
        this.f306856b = buttons;
        this.f306857c = background;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f306855a, mVar.f306855a) && Intrinsics.f(this.f306856b, mVar.f306856b) && Intrinsics.f(this.f306857c, mVar.f306857c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        l lVar = this.f306855a;
        return this.d.hashCode() + ((this.f306857c.hashCode() + ((this.f306856b.hashCode() + ((lVar == null ? 0 : lVar.hashCode()) * 31)) * 31)) * 31);
    }
}
