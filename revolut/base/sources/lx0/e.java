package lx0;

import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheEvictor;
import androidx.media3.datasource.cache.CacheSpan;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e implements CacheEvictor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f200507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f200508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f200509c;
    public long d;

    public e(long j2, long j3) {
        this.f200507a = j2;
        this.f200508b = j3;
        final akg.d dVar = new akg.d(25);
        this.f200509c = new TreeSet(new Comparator() { // from class: lx0.d
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((Number) dVar.invoke(obj2, obj3)).intValue();
            }
        });
    }

    public final void a(Cache cache, long j2) {
        ArrayList arrayList = new ArrayList();
        TreeSet treeSet = this.f200509c;
        for (Object obj2 : treeSet) {
            if (jli.b.d() - ((CacheSpan) obj2).lastTouchTimestamp <= this.f200508b) {
                break;
            } else {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            cache.removeSpan((CacheSpan) it8.next());
        }
        while (this.d + j2 > this.f200507a && !treeSet.isEmpty()) {
            cache.removeSpan((CacheSpan) treeSet.first());
        }
    }

    public final void b(Cache cache, CacheSpan span) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(span, "span");
        this.f200509c.add(span);
        this.d += span.length;
        a(cache, 0L);
    }

    public final void c(Cache cache, CacheSpan span) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(span, "span");
        this.f200509c.remove(span);
        this.d -= span.length;
    }

    public final void d(Cache cache, CacheSpan oldSpan, CacheSpan newSpan) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(oldSpan, "oldSpan");
        Intrinsics.checkNotNullParameter(newSpan, "newSpan");
        c(cache, oldSpan);
        b(cache, newSpan);
    }
}
