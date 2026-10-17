package ptb;

import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainScreenTab f239650a;

    public i(MainScreenTab tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        this.f239650a = tab2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f239650a, ((i) obj2).f239650a);
    }

    public final int hashCode() {
        return this.f239650a.f83420a.hashCode();
    }
}
