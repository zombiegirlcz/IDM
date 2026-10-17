package mn;

import com.google.firebase.messaging.t;
import com.revolut.analytics.tracking.v3.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import no.j2;
import no.w2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class g extends fsi.c {

    @NotNull
    public static final f Companion = new f();
    public static final fsi.b i = new fsi.b("PERMISSIONS_SETTINGS_TRACKING_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j2 f207323h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j2 settingsTracker) {
        super(i);
        Intrinsics.checkNotNullParameter(settingsTracker, "settingsTracker");
        this.f207323h = settingsTracker;
    }

    @Override // fsi.a
    public final void o(int i2, String[] permissions, int[] grantResults) {
        Object next;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.o(i2, permissions, grantResults);
        l lVar = (l) this.f207323h;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        int length = grantResults.length;
        for (String str : permissions) {
            Iterator<E> it8 = w2.a().iterator();
            while (true) {
                if (it8.hasNext()) {
                    next = it8.next();
                    if (((w2) next).b().contains(str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            w2 permission = (w2) next;
            if (permission != null) {
                t tVar = lVar.f50343j;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(permission, "permission");
                lVar.p3(((gpk.c) tVar.d).e(permission));
            } else {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "SettingsTracker", j6.a.q("Untracked permission change: ", str), null, null, 16);
            }
        }
    }
}
