package ms0;

import android.R;
import android.content.Context;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[][] f208469a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    public static final h3 a(o2 o2Var, u2 u2Var) {
        boolean zContains;
        r2 r2Var = (r2) zhm.d0.d0(o2Var.f208351a);
        if (r2Var == null) {
            return new d3(o2Var, new IllegalStateException("At least one story is expected for the product intro"));
        }
        Video video = r2Var.f208395c;
        b3 b3Var = (b3) u2Var;
        b3Var.getClass();
        Intrinsics.checkNotNullParameter(video, "video");
        if (video instanceof UrlVideo) {
            ArrayDeque arrayDeque = b3Var.d;
            UrlVideo urlVideo = (UrlVideo) video;
            Context context = b3Var.f208189a;
            Intrinsics.checkNotNullParameter(context, "context");
            zContains = arrayDeque.contains(kli.a.q(context) ? urlVideo.f60090b : urlVideo.f60089a);
        } else {
            zContains = true;
        }
        return zContains ? new g3(o2Var, r2Var, false) : new f3(o2Var);
    }

    public static final boolean b(e4 e4Var) {
        Intrinsics.checkNotNullParameter(e4Var, "<this>");
        int i = g4.f208263a[e4Var.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3) {
            return false;
        }
        if (i == 4) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean c(e4 e4Var) {
        Intrinsics.checkNotNullParameter(e4Var, "<this>");
        int i = g4.f208263a[e4Var.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
