package vqi;

import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f291403a;

    public final NavBarMenuItem a() {
        List list = this.f291403a;
        if (list != null) {
            return (NavBarMenuItem) d0.o0(list);
        }
        return null;
    }

    public final void b(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f291403a = items;
    }
}
