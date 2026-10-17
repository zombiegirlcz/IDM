package tf1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f270148a = new ArrayList();

    public final void a(qf1.f id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f270148a.add(new e(id10));
    }

    public final void b(qf1.f id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f270148a.add(new g(id10));
    }
}
