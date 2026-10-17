package bu7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new br4.e(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f18720c;

    public /* synthetic */ j(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(h.f18716a.getDescriptor(), i, 7);
            throw null;
        }
        this.f18718a = str;
        this.f18719b = str2;
        this.f18720c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f18718a, jVar.f18718a) && Intrinsics.f(this.f18719b, jVar.f18719b) && Intrinsics.f(this.f18720c, jVar.f18720c);
    }

    public final int hashCode() {
        int iHashCode = this.f18718a.hashCode() * 31;
        String str = this.f18719b;
        return this.f18720c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public j(String title, String str, aim.e contacts) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        this.f18718a = title;
        this.f18719b = str;
        this.f18720c = contacts;
    }
}
