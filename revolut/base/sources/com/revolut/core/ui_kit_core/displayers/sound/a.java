package com.revolut.core.ui_kit_core.displayers.sound;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.revolut.core.ui_kit_core.displayers.sound.Sound;
import h80.e;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lz0.d;
import lz0.f;
import lz0.g;
import oo0.k;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import yhm.j;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements g {

    @NotNull
    public static final lz0.b Companion = new lz0.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f60078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f60079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f60080c;
    public final Lazy d;
    public final Handler e;
    public final LinkedHashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kpj.f f60081g;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f60078a = context;
        final int i = 0;
        this.f60079b = j.b(new Function0(this) { // from class: lz0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.core.ui_kit_core.displayers.sound.a f200852b;

            {
                this.f200852b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        Object systemService = this.f200852b.f60078a.getSystemService("audio");
                        Intrinsics.i(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                        return (AudioManager) systemService;
                    default:
                        e.a lifecycle = h80.e.f149935b;
                        f contextProvider = this.f200852b.f60080c;
                        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
                        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                        return new k(lifecycle, contextProvider, -1);
                }
            }
        });
        this.f60080c = new f(this);
        final int i2 = 1;
        this.d = j.b(new Function0(this) { // from class: lz0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.core.ui_kit_core.displayers.sound.a f200852b;

            {
                this.f200852b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        Object systemService = this.f200852b.f60078a.getSystemService("audio");
                        Intrinsics.i(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                        return (AudioManager) systemService;
                    default:
                        e.a lifecycle = h80.e.f149935b;
                        f contextProvider = this.f200852b.f60080c;
                        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
                        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                        return new k(lifecycle, contextProvider, -1);
                }
            }
        });
        this.e = new Handler(Looper.getMainLooper());
        this.f = new LinkedHashMap();
        this.f60081g = new kpj.f(this, 9);
    }

    public final void a(Sound sound) {
        Intrinsics.checkNotNullParameter(sound, "sound");
        if (((AudioManager) this.f60079b.getValue()).getRingerMode() == 2) {
            if (sound instanceof Sound.ResourceSound) {
                Uri uriBuild = new Uri.Builder().scheme("android.resource").authority(this.f60078a.getPackageName()).path(String.valueOf(((Sound.ResourceSound) sound).f60076a)).build();
                Intrinsics.h(uriBuild);
                b(uriBuild, -1L);
            } else {
                if (!(sound instanceof Sound.UrlSound)) {
                    throw new NoWhenBranchMatchedException();
                }
                Uri uri2 = Uri.parse(((Sound.UrlSound) sound).f60077a);
                Intrinsics.h(uri2);
                b(uri2, 300L);
            }
        }
    }

    public final void b(Uri uri2, long j2) {
        LinkedHashMap linkedHashMap = this.f;
        Object dVar = linkedHashMap.get(uri2);
        if (dVar == null) {
            dVar = new d(uri2, (oo0.d) this.d.getValue(), this.e, this.f60081g);
            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            linkedHashMap.put(uri2, dVar);
        }
        d dVar2 = (d) dVar;
        Uri uri3 = dVar2.f200854a;
        oo0.d dVar3 = dVar2.f200855b;
        dVar2.f200857g = lz0.e.IDLE;
        dVar2.e = j2;
        dVar2.f200856c.removeCallbacks(dVar2.f);
        try {
            ((k) dVar3).g(dVar2);
            ((k) dVar3).a(uri3, dVar2);
            dVar2.f200857g = lz0.e.STARTING;
            ((k) dVar3).h(uri3, 0L);
            ((k) dVar3).f(uri3);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(c.ERROR, null, null, e, h0Var);
        }
    }
}
