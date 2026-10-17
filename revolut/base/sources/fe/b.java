package fe;

import android.util.Log;
import ce.j;
import dg.d;
import dg.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ke.n;
import ke.o;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oe.c f134427a;

    public b(oe.c userMetadata) {
        Intrinsics.checkNotNullParameter(userMetadata, "userMetadata");
        this.f134427a = userMetadata;
    }

    public final void a(d rolloutsState) {
        Intrinsics.checkNotNullParameter(rolloutsState, "rolloutsState");
        oe.c cVar = this.f134427a;
        HashSet hashSet = rolloutsState.f114559a;
        Intrinsics.checkNotNullExpressionValue(hashSet, "rolloutsState.rolloutAssignments");
        ArrayList arrayList = new ArrayList(w.t(hashSet, 10));
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            dg.c cVar2 = (dg.c) ((e) it8.next());
            String str = cVar2.f114557b;
            String str2 = cVar2.d;
            String strSubstring = cVar2.e;
            String str3 = cVar2.f114558c;
            long j2 = cVar2.f;
            wif.a aVar = n.f182950a;
            if (strSubstring.length() > 256) {
                strSubstring = strSubstring.substring(0, 256);
            }
            arrayList.add(new ke.b(j2, str, str2, strSubstring, str3));
        }
        synchronized (((o) cVar.f)) {
            try {
                if (((o) cVar.f).b(arrayList)) {
                    ((je.d) cVar.f224499c).f173168b.b(new j(cVar, ((o) cVar.f).a(), 9));
                }
            } finally {
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
    }
}
