package c66;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.p;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements AutoCloseable {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21683a;

    public e(aim.e values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f21683a = values;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Iterator it8 = this.f21683a.iterator();
        while (it8.hasNext()) {
            p.r((byte[]) it8.next());
        }
    }
}
