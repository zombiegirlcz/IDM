package kw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jw.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vw.h;
import vw.i;
import vw.j;
import vw.k;
import vw.l;
import vw.m;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    @NotNull
    private static final C1078a Companion = new C1078a();

    /* JADX INFO: renamed from: kw.a$a, reason: collision with other inner class name */
    public static final class C1078a {
        private C1078a() {
        }
    }

    public static m a(String sessionId, long j2, l frameTimestampSource, List frames, List samples, double d) {
        long j3;
        long j5;
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(frameTimestampSource, "frameTimestampSource");
        Intrinsics.checkNotNullParameter(frames, "frames");
        Intrinsics.checkNotNullParameter(samples, "samples");
        List listP0 = d0.P0(frames, new c());
        HashSet hashSet = new HashSet();
        ArrayList<lw.a> arrayList = new ArrayList();
        for (Object obj2 : listP0) {
            if (hashSet.add(Long.valueOf(((lw.a) obj2).f200382a))) {
                arrayList.add(obj2);
            }
        }
        lw.a aVar = (lw.a) d0.d0(arrayList);
        long j16 = aVar != null ? aVar.f200383b : 0L;
        long j22 = aVar != null ? aVar.f200384c : 0L;
        int i = b.f190178a[frameTimestampSource.ordinal()];
        boolean z = true;
        if (i == 1) {
            if (aVar != null) {
                j3 = aVar.f200383b;
            } else {
                f fVar = (f) d0.d0(samples);
                if (fVar != null) {
                    j3 = fVar.f178908a;
                }
                j5 = j16;
                j3 = 0;
            }
            j5 = j16;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (aVar != null) {
                j3 = aVar.f200384c;
            } else {
                f fVar2 = (f) d0.d0(samples);
                if (fVar2 != null) {
                    j3 = fVar2.f178908a;
                }
                j5 = j16;
                j3 = 0;
            }
            j5 = j16;
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (lw.a aVar2 : arrayList) {
            arrayList2.add(new k(aVar2.f200382a, aVar2.f200384c - j22, Long.valueOf(aVar2.f200383b - j5)));
            z = z;
            j3 = j3;
        }
        long j42 = j3;
        j jVar = samples.isEmpty() ? j.UNAVAILABLE : arrayList.isEmpty() ? j.PARTIAL : j.COMPLETED;
        Double dValueOf = null;
        if (samples.size() >= 2) {
            long j46 = ((f) d0.m0(samples)).f178908a - ((f) d0.b0(samples)).f178908a;
            if (j46 > 0) {
                dValueOf = Double.valueOf((((double) (samples.size() - 1)) * 1.0E9d) / j46);
            }
        }
        List list = samples;
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        for (Iterator it8 = list.iterator(); it8.hasNext(); it8 = it8) {
            f fVar3 = (f) it8.next();
            arrayList3.add(new i(fVar3.f178908a - j42, fVar3.f178909b, fVar3.f178910c, fVar3.d, fVar3.e, fVar3.f, fVar3.f178911g, fVar3.f178912h, fVar3.i, fVar3.f178913j, fVar3.k, fVar3.f178914l, fVar3.f178915m, fVar3.f178916n));
        }
        return new m(sessionId, jVar, j2, frameTimestampSource, arrayList2, new h(d, dValueOf, arrayList3));
    }
}
