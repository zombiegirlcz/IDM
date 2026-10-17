package l7f;

import com.revolut.data.model.Data;
import java.util.List;
import k8d.t;
import kotlin.jvm.internal.Intrinsics;
import l2c.v;
import l5a.u;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f192577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f192579c;

    public c(Data data, String str) {
        List list;
        this.f192577a = data;
        this.f192578b = str;
        this.f192579c = (data == null || (list = (List) iii.c.f(data, new u(4), new v(19), new t(24))) == null) ? f0.f322471a : list;
    }

    public static c a(c cVar, Data data, String str, int i) {
        if ((i & 1) != 0) {
            data = cVar.f192577a;
        }
        if ((i & 2) != 0) {
            str = cVar.f192578b;
        }
        cVar.getClass();
        return new c(data, str);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: W */
    public final List getF85711b() {
        return this.f192579c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f192577a, cVar.f192577a) && Intrinsics.f(this.f192578b, cVar.f192578b);
    }

    public final int hashCode() {
        Data data = this.f192577a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        String str = this.f192578b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: z */
    public final String getF85710a() {
        return this.f192578b;
    }
}
