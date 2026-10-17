package d58;

import hx7.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zm3.i;
import zm3.j;
import zm3.n;
import zm3.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f111395a = new a();

    private a() {
    }

    public static c a(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        if ((contact instanceof zm3.e) || (contact instanceof n) || (contact instanceof o)) {
            throw new IllegalArgumentException(a0.d.q("Contact type ", contact.getClass(), " is not supported for the Joint Account invitation"));
        }
        if (contact instanceof i) {
            i iVar = (i) contact;
            String str = iVar.f323351b;
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            return new e(str, iVar.e.f323345a, q.v(contact));
        }
        if (contact instanceof zm3.f) {
            String str2 = ((zm3.f) contact).f323345a;
            return new e(str2, str2, q.v(contact));
        }
        if (contact instanceof j) {
            return new d(((j) contact).f, q.v(contact));
        }
        throw new NoWhenBranchMatchedException();
    }
}
