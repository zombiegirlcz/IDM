package il7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new igb.j(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f162124c;

    public /* synthetic */ r(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(p.f162121a.getDescriptor(), i, 7);
            throw null;
        }
        this.f162122a = str;
        this.f162123b = str2;
        this.f162124c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f162122a, rVar.f162122a) && Intrinsics.f(this.f162123b, rVar.f162123b) && Intrinsics.f(this.f162124c, rVar.f162124c);
    }

    public final int hashCode() {
        int iHashCode = this.f162122a.hashCode() * 31;
        String str = this.f162123b;
        return this.f162124c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public r(String title, String str, ArrayList contacts) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        this.f162122a = title;
        this.f162123b = str;
        this.f162124c = contacts;
    }
}
