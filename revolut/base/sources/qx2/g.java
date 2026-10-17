package qx2;

import android.content.Context;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import ip0.ue0;
import ip0.we0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements n {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f250013a;

    public g(c90.c uiResources) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f250013a = uiResources;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        UrlVideo urlVideo = new UrlVideo(domainState.f250011a, (String) null, true, oz0.b.FIT, false, (oz0.c) null, 114);
        Context context = this.f250013a.f22265a;
        return new e(u.c(new we0("VIDEO_PREVIEW_LIST_ID", new ue0(urlVideo, ((int) kli.a.z(context.getResources().getDisplayMetrics().heightPixels, context)) + 52))));
    }
}
