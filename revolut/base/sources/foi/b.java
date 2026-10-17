package foi;

import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f136989a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f136990b;

    public final m a(Object screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        WeakReference weakReference = this.f136990b;
        if ((weakReference != null ? weakReference.get() : null) == screen) {
            return new l(false);
        }
        this.f136990b = new WeakReference(screen);
        String name = screen.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return this.f136989a.add(new a(name, screen.hashCode())) ? k.f137000a : new l(true);
    }
}
