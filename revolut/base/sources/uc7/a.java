package uc7;

import aii.u;
import ash.d;
import fc7.g;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f279000a = ta6.a.a(0);

    @Override // ash.d
    public final void a(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        b(new fc7.d(destination));
    }

    public final void b(g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f279000a.k(event);
    }
}
