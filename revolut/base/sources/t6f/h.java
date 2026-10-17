package t6f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f268332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268333b;

    public h() {
        this((Data) null, 3);
    }

    public static h a(h hVar, Data template, String str, int i) {
        if ((i & 1) != 0) {
            template = hVar.f268332a;
        }
        if ((i & 2) != 0) {
            str = hVar.f268333b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(template, "template");
        return new h(template, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f268332a, hVar.f268332a) && Intrinsics.f(this.f268333b, hVar.f268333b);
    }

    public final int hashCode() {
        int iHashCode = this.f268332a.hashCode() * 31;
        String str = this.f268333b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public h(Data template, String str) {
        Intrinsics.checkNotNullParameter(template, "template");
        this.f268332a = template;
        this.f268333b = str;
    }

    public /* synthetic */ h(Data data, int i) {
        this((i & 1) != 0 ? new Data(null, null, false, 7, null) : data, (String) null);
    }
}
