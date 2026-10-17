package uf3;

import com.revolut.data.model.Data;
import com.revolut.feature.notification_centre.api.navigation.RevolutFeedDestination;
import go.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rd0.e;
import ueg.p0;
import y69.d;
import zhm.f0;
import zi0.c;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends y40.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r69.a f279535l;

    public b(r69.a inboxInteractor) {
        Intrinsics.checkNotNullParameter(inboxInteractor, "inboxInteractor");
        this.f279535l = inboxInteractor;
    }

    @Override // y40.a
    public final boolean Z2(Object obj2, String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (!Intrinsics.f(itemId, "NEWSFEED_ITEM_ID")) {
            return false;
        }
        A2(RevolutFeedDestination.f78135a);
        return true;
    }

    @Override // y40.a
    public final Flow b3() {
        return c.i(f0.f322471a);
    }

    @Override // y40.a
    public final Flow c3() {
        d dVar = (d) this.f279535l;
        int i = a.f279534a[dVar.b().ordinal()];
        if (i == 1) {
            return new g(new Data(v30.f0.f285773a, null, false, 6, null), 2);
        }
        if (i == 2) {
            return nim.a.v(e.b(dVar.c()), new p0(6));
        }
        throw new NoWhenBranchMatchedException();
    }
}
