package k39;

import aii.u;
import ash.d;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f180650a = ta6.a.a(0);

    @Override // ash.d
    public final void a(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        b(new g39.a(destination));
    }

    public final void b(g39.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f180650a.k(event);
    }
}
