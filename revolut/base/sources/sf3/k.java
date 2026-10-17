package sf3;

import aii.p;
import aii.u;
import com.revolut.chat.navigation.InboxDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements xii.b, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j30.c f262342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f262343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f262344c;

    public k(j30.c chatFeatureToggles) {
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        this.f262342a = chatFeatureToggles;
        this.f262343b = y0.b(this);
        this.f262344c = y0.b("inbox");
    }

    @Override // xii.b
    public final Set a() {
        return this.f262344c;
    }

    @Override // aii.p
    public final void b() {
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (((rf3.d) this.f262342a).b() == j30.b.FULLY_ENABLED) {
            return InboxDestination.f51112b;
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f262343b;
    }
}
