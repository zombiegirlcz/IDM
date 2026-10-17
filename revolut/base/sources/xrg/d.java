package xrg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.voice_messages.impl.R$string;
import d90.f;
import dp4.y0;
import java.io.File;
import kl.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l80.h;
import oo0.g;
import oo0.l;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.q;
import vkm.z1;
import xo8.i0;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends urg.a implements d90.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y80.a f308341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zk0.b f308342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a61.a f308343n;
    public final h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b0 f308344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2 f308345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f308346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f308347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f308348t;
    public File u;
    public f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z1 f308349w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f308350x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d70.c f308351y;

    public d(y80.a permissionProvider, zk0.b fileSystemRepository, a61.a audioRecorder, h systemTimeProvider) {
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(audioRecorder, "audioRecorder");
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        this.f308341l = permissionProvider;
        this.f308342m = fileSystemRepository;
        this.f308343n = audioRecorder;
        this.o = systemTimeProvider;
        this.f308348t = q.b(0, 2, ukm.f.DROP_LATEST);
        this.f308349w = q.b(0, 7, null);
        int iCeil = (int) Math.ceil(202.7027f);
        this.f308350x = iCeil;
        this.f308351y = new d70.c(iCeil);
    }

    @Override // yji.n
    public final void D2() {
        T2(new b(this, null, 0), new yi5.b(27));
    }

    @Override // yji.n
    public final void F2() {
        k3(l.StoppedByLifecycle, 1);
    }

    @Override // urg.a
    public final void Z2() {
        k3(l.CancelledByUser, 1);
    }

    @Override // urg.a
    public final boolean b3() {
        return this.f308341l.c("android.permission.RECORD_AUDIO");
    }

    @Override // urg.a
    public final void c3(g recording) {
        Intrinsics.checkNotNullParameter(recording, "recording");
        T2(new xnl.f(this, recording.f226977a, null, 8), new yi5.b(27));
    }

    @Override // urg.a
    public final z1 d3() {
        return this.f308349w;
    }

    @Override // urg.a
    public final void e3() {
        n.P2(this, new PermissionsController(new PermissionsControllerContract$InputData(u.c(new PermissionsControllerContract$Permission("android.permission.RECORD_AUDIO", new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.system_permissions_microphone_denied_title, null, null, 14), new TextLocalisedClause(R$string.system_permissions_microphone_denied_subtitle, null, null, 14), new TextLocalisedClause(R$string.system_permissions_continue, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_no_microphone, null, null, 6), null), new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.system_permissions_microphone_denied_title, null, null, 14), new TextLocalisedClause(R$string.system_permissions_microphone_denied_subtitle, null, null, 14), new TextLocalisedClause(R$string.system_permissions_microphone_denied_open_settings, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_no_microphone, null, null, 6), null), true)))), null, new i0(25), 1);
    }

    @Override // urg.a
    public final void f3(g recording) {
        Intrinsics.checkNotNullParameter(recording, "recording");
        T2(new xnl.f(this, recording, null, 9), new yi5.b(27));
    }

    @Override // urg.a
    public final void g3(b0 onProgressListener) {
        Intrinsics.checkNotNullParameter(onProgressListener, "onProgressListener");
        this.f308344p = onProgressListener;
    }

    @Override // urg.a
    public final void h3() {
        this.f308348t.k(new xb4.g(this, null, 12));
    }

    @Override // urg.a
    public final void i3() {
        k3(l.StoppedByUser, 1);
    }

    @Override // urg.a
    public final void j3() {
        k3(l.StoppedByUser, 0);
    }

    public final void k3(l lVar, int i) {
        T2(new y0(this, lVar, i, (Continuation) null, 19), new yi5.b(27));
    }
}
