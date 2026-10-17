package i01;

import androidx.collection.LruCache;
import elm.f;
import h30.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import skm.z;
import tkm.e;
import zkm.d;
import zkm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f157275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f157276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f157277c;
    public final LruCache d;
    public final LinkedHashMap e;

    public b(q typefaceDownloader) {
        p0 p0Var = p0.f264001a;
        f ioDispatcher = f.f127540b;
        e mainDispatcher = o.f323119a.e;
        Intrinsics.checkNotNullParameter(typefaceDownloader, "typefaceDownloader");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        this.f157275a = typefaceDownloader;
        this.f157276b = ioDispatcher;
        this.f157277c = e0.c(kotlin.coroutines.e.d(e0.e(), mainDispatcher).plus(new aod.a(z.f264021a, 3)));
        this.d = new LruCache(6);
        this.e = new LinkedHashMap();
    }
}
