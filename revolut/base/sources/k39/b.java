package k39;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import phc.d;
import sri.m;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ln.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f180652b;

    public b(m navigator, int i) {
        this.f180651a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.f180652b = navigator;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.f180652b = navigator;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.f180652b = navigator;
                break;
            default:
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.f180652b = navigator;
                break;
        }
    }

    @Override // ln.a
    public final h a(NaviCommand command) {
        switch (this.f180651a) {
            case 0:
                Intrinsics.checkNotNullParameter(command, "command");
                h hVar = new h(new hc7.a(this, command, 15), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 1:
                Intrinsics.checkNotNullParameter(command, "command");
                h hVar2 = new h(new d(this, command, 8), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
            case 2:
                Intrinsics.checkNotNullParameter(command, "command");
                h hVar3 = new h(new rzc.b(this, command, 14), 2);
                Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                return hVar3;
            default:
                Intrinsics.checkNotNullParameter(command, "command");
                h hVar4 = new h(new rzc.b(this, command, 23), 2);
                Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                return hVar4;
        }
    }

    @Override // ln.a
    public final void b(NaviCommand command) {
        switch (this.f180651a) {
            case 0:
                Intrinsics.checkNotNullParameter(command, "command");
                this.f180652b.c(command);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(command, "command");
                this.f180652b.c(command);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(command, "command");
                this.f180652b.c(command);
                break;
            default:
                Intrinsics.checkNotNullParameter(command, "command");
                this.f180652b.c(command);
                break;
        }
    }
}
