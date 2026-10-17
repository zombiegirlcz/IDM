package ss5;

import aii.u;
import ash.d;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f265311a = ta6.a.a(0);

    @Override // ash.d
    public final void a(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        b(new dt5.d(destination));
    }

    public final void b(dt5.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f265311a.k(event);
    }
}
