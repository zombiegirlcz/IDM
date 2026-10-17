package wl3;

import kotlin.jvm.internal.Intrinsics;
import s7a.l0;
import vx9.v;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fl3.a f298374a;

    public c(fl3.a contactsRepository) {
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        this.f298374a = contactsRepository;
    }

    public final ufm.i a(String name, String email) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        ufm.c cVar = new ufm.c(new a(this, name, email, 1), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        ufm.i iVar = new ufm.i(cVar, new wf6.o(27, new l0(email, name, 3)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final ufm.i b(String name, String phone) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phone, "phone");
        ufm.c cVar = new ufm.c(new a(this, name, phone, 0), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        ufm.i iVar = new ufm.i(cVar, new wf6.o(28, new v(this, 17, phone, name)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
