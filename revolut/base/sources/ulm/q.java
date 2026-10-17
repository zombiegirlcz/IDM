package ulm;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f281123a = new ArrayList();

    public final void a(String pattern, String... pins) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(pins, "pins");
        for (String str : pins) {
            this.f281123a.add(new s(pattern, str));
        }
    }
}
