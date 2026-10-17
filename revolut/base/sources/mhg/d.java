package mhg;

import aw0.x4;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import ip0.tc0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jhg.b f205570a;

    public d(jhg.b flightCardMapper) {
        Intrinsics.checkNotNullParameter(flightCardMapper, "flightCardMapper");
        this.f205570a = flightCardMapper;
    }

    public static hg a(String str, String str2, List list) {
        return new hg(str, list, 1, x4.c.f10604a, str2 != null ? new tc0(str2, false, 6) : null, new gg.b(false, 3), true, false, null, null, 0, 0, 0, 0, 32640);
    }
}
