package a51;

import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final asi.b f1308a;

    public a(b51.a aVar, asi.b bVar) {
        this.f1308a = bVar;
    }

    public final mli.e a() {
        mli.e userLogoutInteractor = ((j51.a) this.f1308a).b();
        s.j(userLogoutInteractor);
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "userLogoutInteractor");
        return userLogoutInteractor;
    }
}
