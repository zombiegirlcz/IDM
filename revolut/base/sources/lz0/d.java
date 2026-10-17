package lz0;

import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oo0.k;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements oo0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f200854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oo0.d f200855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f200856c;
    public final kpj.f d;
    public long e;
    public final kt0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f200857g;

    public d(Uri uri2, oo0.d audioPlayer, Handler handler, kpj.f listener) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(audioPlayer, "audioPlayer");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f200854a = uri2;
        this.f200855b = audioPlayer;
        this.f200856c = handler;
        this.d = listener;
        this.e = 300L;
        this.f = new kt0.d(this, 8);
        this.f200857g = e.IDLE;
    }

    @Override // oo0.c
    public final void A(Uri uri2, oo0.a status, long j2, long j3) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(status, "status");
        Uri uri3 = this.f200854a;
        if (!uri3.equals(uri2) || this.f200857g == e.IDLE) {
            return;
        }
        int i = c.f200853a[status.ordinal()];
        kpj.f fVar = this.d;
        oo0.d dVar = this.f200855b;
        kt0.d dVar2 = this.f;
        Handler handler = this.f200856c;
        if (i == 1) {
            if (j2 > 0 || j3 > 0) {
                e eVar = this.f200857g;
                e eVar2 = e.COMPLETED;
                if (eVar != eVar2) {
                    this.f200857g = eVar2;
                    handler.removeCallbacks(dVar2);
                    try {
                        ((k) dVar).i(uri3);
                    } catch (Exception e) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    }
                    ((k) dVar).g(this);
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(uri3, "uri");
                    ((com.revolut.core.ui_kit_core.displayers.sound.a) fVar.f188258b).f.remove(uri3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            e eVar3 = this.f200857g;
            e eVar4 = e.COMPLETED;
            if (eVar3 != eVar4) {
                this.f200857g = eVar4;
                handler.removeCallbacks(dVar2);
                ((k) dVar).g(this);
                fVar.getClass();
                Intrinsics.checkNotNullParameter(uri3, "uri");
                ((com.revolut.core.ui_kit_core.displayers.sound.a) fVar.f188258b).f.remove(uri3);
                return;
            }
            return;
        }
        if (i == 3) {
            e eVar5 = this.f200857g;
            e eVar6 = e.PLAYING;
            if (eVar5 != eVar6) {
                this.f200857g = eVar6;
                handler.removeCallbacks(dVar2);
                return;
            }
            return;
        }
        if (i != 4) {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        e eVar7 = this.f200857g;
        e eVar8 = e.LOADING;
        if (eVar7 != eVar8) {
            long j5 = this.e;
            if (j5 > 0) {
                this.f200857g = eVar8;
                handler.postDelayed(dVar2, j5);
            }
        }
    }
}
