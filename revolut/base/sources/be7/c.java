package be7;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import oo0.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements oo0.c {

    @NotNull
    public static final b Companion = new b();
    public static final Uri d = Uri.parse("https://assets.revolut.com/mobile/call_support/sound/incoming.mp3");
    public static final Uri e = Uri.parse("https://assets.revolut.com/mobile/call_support/sound/disconnect.mp3");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f14694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14696c;

    public c(d4m.a audioPlayerLazy) {
        Intrinsics.checkNotNullParameter(audioPlayerLazy, "audioPlayerLazy");
        this.f14694a = audioPlayerLazy;
        this.f14696c = te0.w.y0(new bc1.b(this, 2));
    }

    @Override // oo0.c
    public final void A(Uri uri2, oo0.a status, long j2, long j3) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(status, "status");
        if (Intrinsics.f(uri2, d) && this.f14695b && status == oo0.a.PAUSED) {
            if (j2 > 0 || j3 > 0) {
                ((oo0.k) a()).h(uri2, 0L);
                ((oo0.k) a()).f(uri2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final d a() {
        return (d) this.f14696c.getValue();
    }

    public final void b() {
        if (this.f14695b) {
            return;
        }
        this.f14695b = true;
        d dVarA = a();
        Uri INCOMING_URI = d;
        Intrinsics.checkNotNullExpressionValue(INCOMING_URI, "INCOMING_URI");
        ((oo0.k) dVarA).h(INCOMING_URI, 0L);
        d dVarA2 = a();
        Intrinsics.checkNotNullExpressionValue(INCOMING_URI, "INCOMING_URI");
        ((oo0.k) dVarA2).f(INCOMING_URI);
        d dVarA3 = a();
        Intrinsics.checkNotNullExpressionValue(INCOMING_URI, "INCOMING_URI");
        ((oo0.k) dVarA3).a(INCOMING_URI, this);
    }

    public final void c() {
        if (this.f14695b) {
            this.f14695b = false;
            ((oo0.k) a()).g(this);
            d dVarA = a();
            Uri INCOMING_URI = d;
            Intrinsics.checkNotNullExpressionValue(INCOMING_URI, "INCOMING_URI");
            ((oo0.k) dVarA).i(INCOMING_URI);
        }
    }
}
