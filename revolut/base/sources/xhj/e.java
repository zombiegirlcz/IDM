package xhj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f306258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f306259b;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data content, Data esimProfiles, int i) {
        if ((i & 1) != 0) {
            content = eVar.f306258a;
        }
        if ((i & 2) != 0) {
            esimProfiles = eVar.f306259b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
        return new e(content, esimProfiles);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f306258a, eVar.f306258a) && Intrinsics.f(this.f306259b, eVar.f306259b);
    }

    public final int hashCode() {
        return this.f306259b.hashCode() + (this.f306258a.hashCode() * 31);
    }

    public e(Data content, Data esimProfiles) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
        this.f306258a = content;
        this.f306259b = esimProfiles;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
