package oo0;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Player;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements d, Player.Listener, Choreographer.FrameCallback, DefaultLifecycleObserver {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.a f226984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f226985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Choreographer f226986c;
    public final LinkedHashMap d;
    public long e;
    public Uri f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f226987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f226988h;
    public final o6.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ExoPlayer f226989j;

    public k(Lifecycle lifecycle, z70.a contextProvider, int i) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f226984a = contextProvider;
        this.f226985b = i;
        Choreographer choreographer = Choreographer.getInstance();
        Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance(...)");
        this.f226986c = choreographer;
        this.d = new LinkedHashMap();
        this.f226987g = yhm.j.b(new o10.c(this, 23));
        this.f226988h = new Handler(Looper.getMainLooper());
        this.i = new o6.a(this, 1);
        lifecycle.addObserver(this);
    }

    public static i e(Uri uri2, Map map) {
        Object iVar = map.get(uri2);
        if (iVar == null) {
            iVar = new i(0);
            map.put(uri2, iVar);
        }
        return (i) iVar;
    }

    public final void a(Uri uri2, c listener) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(listener, "listener");
        i iVarE = e(uri2, this.d);
        ArrayList arrayList = iVarE.d;
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(listener);
        if (zIsEmpty && Intrinsics.f(uri2, this.f)) {
            b bVarD = d(uri2);
            a aVar = bVarD.f226971a;
            long j2 = bVarD.f226972b;
            long j3 = bVarD.f226973c;
            iVarE.a(aVar);
            iVarE.f226980a = j2;
            iVarE.f226982c = j3;
            int i = j.f226983a[aVar.ordinal()];
            if (i == 1) {
                this.f226986c.postFrameCallback(this);
            } else if (i != 2 && i != 3 && i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        listener.A(uri2, iVarE.f226981b, iVarE.f226980a, iVarE.f226982c);
    }

    public final void b(Uri uri2, i iVar) {
        ArrayList arrayList;
        i iVar2 = (i) this.d.get(uri2);
        if (iVar2 == null || (arrayList = iVar2.d) == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                ((c) arrayList.get(size)).A(uri2, iVar.f226981b, iVar.f226980a, iVar.f226982c);
            }
        }
    }

    public final ExoPlayer c() {
        ExoPlayer exoPlayerA = this.f226989j;
        if (exoPlayerA == null) {
            ArrayList arrayList = jv0.d.f178736a;
            Context applicationContext = this.f226984a.getContext().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            exoPlayerA = jv0.d.a(applicationContext, new DefaultTrackSelector(applicationContext));
            this.f226989j = exoPlayerA;
            exoPlayerA.addListener(this);
            exoPlayerA.setPlayWhenReady(false);
            int i = this.f226985b;
            if (i != -1) {
                AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(i).build();
                Intrinsics.checkNotNullExpressionValue(audioAttributesBuild, "build(...)");
                exoPlayerA.setAudioAttributes(audioAttributesBuild, false);
            }
        }
        return exoPlayerA;
    }

    public final b d(Uri uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        if (!Intrinsics.f(uri2, this.f)) {
            i iVar = (i) this.d.get(uri2);
            return new b(iVar != null ? iVar.f226980a : 0L, iVar != null ? iVar.f226982c : 0L, iVar == null ? a.ABSENT : a.PAUSED);
        }
        long contentPosition = c().getContentPosition();
        long duration = c().getDuration();
        if (duration == -9223372036854775807L) {
            duration = 0;
        }
        if (c().getPlayerError() != null) {
            return new b(contentPosition, duration, a.ERROR);
        }
        boolean z = c().getPlaybackState() == 4 || !c().getPlayWhenReady();
        boolean z3 = (c().isLoading() || c().getPlaybackState() == 2) && !z;
        return new b(contentPosition, duration, ((!c().isPlaying() || c().getPlaybackState() != 3 || z || z3) && (!z3 || System.currentTimeMillis() >= this.e)) ? z3 ? a.LOADING : a.PAUSED : a.PLAYING);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        i iVar;
        Uri uri2 = this.f;
        if (uri2 == null || (iVar = (i) this.d.get(uri2)) == null || iVar.f226981b != a.PLAYING) {
            return;
        }
        long contentPosition = c().getContentPosition();
        if (iVar.f226980a != contentPosition) {
            iVar.f226980a = contentPosition;
            b(uri2, iVar);
        }
        this.f226986c.postFrameCallback(this);
    }

    public final void f(Uri uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        LinkedHashMap linkedHashMap = this.d;
        i iVarE = e(uri2, linkedHashMap);
        if (!Intrinsics.f(uri2, this.f)) {
            c().pause();
            j();
            this.f = uri2;
            c().setMediaSource(jv0.c.c(uri2, this.f226984a.getContext(), (Cache) this.f226987g.getValue()));
            c().prepare();
        } else if (c().getPlayerError() != null) {
            c().prepare();
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Uri uri3 = (Uri) entry.getKey();
            i iVar = (i) entry.getValue();
            if (!Intrinsics.f(uri2, uri3)) {
                iVar.f226980a = 0L;
                iVar.a(a.ABSENT);
                b(uri3, iVar);
            }
        }
        h(uri2, iVarE.f226980a);
        c().play();
    }

    public final void g(c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        for (Map.Entry entry : this.d.entrySet()) {
            Uri uri2 = (Uri) entry.getKey();
            ArrayList arrayList = ((i) entry.getValue()).d;
            if (arrayList.remove(listener) && arrayList.isEmpty() && Intrinsics.f(uri2, this.f)) {
                this.f226986c.removeFrameCallback(this);
            }
        }
    }

    public final void h(Uri uri2, long j2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        if (Intrinsics.f(uri2, this.f)) {
            this.e = System.currentTimeMillis() + ((long) 500);
            c().seekTo(j2);
            j();
        } else {
            i iVarE = e(uri2, this.d);
            iVarE.f226980a = j2;
            iVarE.a(a.PAUSED);
            b(uri2, iVarE);
        }
    }

    public final void i(Uri uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        if (Intrinsics.f(uri2, this.f)) {
            c().stop();
            c().clearMediaItems();
            this.f = null;
            this.f226986c.removeFrameCallback(this);
        }
        i iVar = (i) this.d.remove(uri2);
        if (iVar != null) {
            iVar.a(a.ABSENT);
            iVar.f226980a = 0L;
            iVar.f226982c = 0L;
            b(uri2, iVar);
        }
    }

    public final void j() {
        Uri uri2 = this.f;
        if (uri2 == null) {
            return;
        }
        i iVarE = e(uri2, this.d);
        b bVarD = d(uri2);
        long j2 = bVarD.f226973c;
        long j3 = bVarD.f226972b;
        a aVar = bVarD.f226971a;
        if (iVarE.f226981b == aVar && iVarE.f226980a == j3 && iVarE.f226982c == j2) {
            return;
        }
        iVarE.a(aVar);
        iVarE.f226980a = j3;
        iVarE.f226982c = j2;
        b(uri2, iVarE);
        int i = j.f226983a[aVar.ordinal()];
        Choreographer choreographer = this.f226986c;
        if (i == 1) {
            if (iVarE.d.isEmpty()) {
                return;
            }
            choreographer.postFrameCallback(this);
        } else {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            choreographer.removeFrameCallback(this);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        ExoPlayer exoPlayer = this.f226989j;
        if (exoPlayer != null) {
            jv0.d.b(exoPlayer);
            this.f226989j = null;
            this.f = null;
            this.d.clear();
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onEvents(Player player, Player.Events events) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.containsAny(10, 11, 4, 5, 7, 3, 0)) {
            j();
            if (player.getPlaybackState() == 4) {
                player.setPlayWhenReady(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    @Override // androidx.media3.common.Player.Listener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onIsLoadingChanged(boolean r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto Lb
            long r2 = r7.e
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto Lb
            goto L17
        Lb:
            if (r8 == 0) goto L16
            long r2 = java.lang.System.currentTimeMillis()
            r8 = 500(0x1f4, float:7.0E-43)
            long r4 = (long) r8
            long r2 = r2 + r4
            goto L17
        L16:
            r2 = r0
        L17:
            r7.e = r2
            android.os.Handler r8 = r7.f226988h
            o6.a r2 = r7.i
            r8.removeCallbacks(r2)
            long r3 = r7.e
            long r5 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r5
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2e
            r8.postDelayed(r2, r3)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oo0.k.onIsLoadingChanged(boolean):void");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        if (this.f226989j != null) {
            c().pause();
            j();
        }
    }
}
