package am8;

import akg.n;
import cl3.c;
import cl3.d;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import wl3.h;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl3.a f6292a;

    public a(cl3.a contactsInteractor) {
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        this.f6292a = contactsInteractor;
    }

    public final n a(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return nim.a.v(e.b(((h) this.f6292a).l(new c[]{c.NOT_REVOLUT}, new d(query))), new aik.d(28));
    }
}
