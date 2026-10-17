package tad;

import com.revolut.data.model.Data;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pd.b;
import vad.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f269305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f269306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f269307c;

    public a() {
        this(0);
    }

    public static boolean a(Data data) {
        Boolean boolValueOf;
        List list = (List) data.getContent();
        if (list != null) {
            List list2 = list;
            boolean z = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    if (((c) it8.next()).a()) {
                        z = true;
                        break;
                    }
                }
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        return b.j(boolValueOf);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f269305a == aVar.f269305a && this.f269306b == aVar.f269306b && Intrinsics.f(this.f269307c, aVar.f269307c);
    }

    public final int hashCode() {
        return this.f269307c.hashCode() + j6.a.c(Boolean.hashCode(this.f269305a) * 31, 31, this.f269306b);
    }

    public a(Data data, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f269305a = z;
        this.f269306b = z3;
        this.f269307c = data;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, true, 3, null), false, false);
    }
}
