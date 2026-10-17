package zm3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f323337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f323338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f323339c;

    public d() {
        this(0);
    }

    public d(List allContacts, List frequent, List recent) {
        Intrinsics.checkNotNullParameter(allContacts, "allContacts");
        Intrinsics.checkNotNullParameter(frequent, "frequent");
        Intrinsics.checkNotNullParameter(recent, "recent");
        this.f323337a = allContacts;
        this.f323338b = frequent;
        this.f323339c = recent;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(int i) {
        f0 f0Var = f0.f322471a;
        this(f0Var, f0Var, f0Var);
    }
}
