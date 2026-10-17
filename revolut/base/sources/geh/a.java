package geh;

import bfl.g;
import hdh.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements o2h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gdh.a f143298b;

    public a(gdh.a navigationExtension, int i) {
        this.f143297a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(navigationExtension, "navigationExtension");
                this.f143298b = navigationExtension;
                break;
            default:
                Intrinsics.checkNotNullParameter(navigationExtension, "navigationExtension");
                this.f143298b = navigationExtension;
                break;
        }
    }

    @Override // o2h.a
    public final void b(g tradeSide, e actions) {
        switch (this.f143297a) {
            case 0:
                Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                Intrinsics.checkNotNullParameter(actions, "actions");
                this.f143298b.b3(tradeSide, actions, false);
                break;
            default:
                Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                Intrinsics.checkNotNullParameter(actions, "actions");
                this.f143298b.b3(tradeSide, actions, false);
                break;
        }
    }
}
