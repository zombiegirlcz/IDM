package fyh;

import cli.o;
import cli.p;
import cli.q;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f139006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zxh.a f139007b;

    public i(aim.e items, zxh.a navBarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f139006a = items;
        this.f139007b = navBarState;
    }

    @Override // cli.o
    public final q a(o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        i iVar = oldState instanceof i ? (i) oldState : null;
        if (iVar == null) {
            return null;
        }
        Image image = iVar.f139007b.d;
        zxh.a aVar = this.f139007b;
        return new h(!Intrinsics.f(image, aVar.d), !Intrinsics.f(r5.e, aVar.e));
    }

    @Override // cli.p
    public final List c() {
        return this.f139006a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f139006a, iVar.f139006a) && Intrinsics.f(this.f139007b, iVar.f139007b);
    }

    public final int hashCode() {
        return this.f139007b.hashCode() + (this.f139006a.hashCode() * 31);
    }
}
