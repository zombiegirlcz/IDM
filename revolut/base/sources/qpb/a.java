package qpb;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$RemoteStoriesModel;
import com.revolut.feature.stories.navigation.StoriesFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.ModalFragmentNavigateCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlin.text.f0;
import qz9.t;
import qza.b0;
import u80.p;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f248325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f248326c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f248324a = i;
        this.f248325b = obj2;
        this.f248326c = obj3;
    }

    private final Object a(Object obj2) {
        String strValueOf;
        String str;
        String str2 = (String) this.f248326c;
        t tVar = (t) this.f248325b;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        Map map = (Map) pair.f186385a;
        xi0.b bVar = (xi0.b) pair.f186386b;
        StringBuilder sb6 = new StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str2.charAt(i);
            if (map.containsValue(String.valueOf(cCharAt))) {
                sb6.append(cCharAt);
            }
        }
        String string = sb6.toString();
        int length2 = string.length();
        od0.i iVar = od0.i.f224256b;
        if (length2 > 1) {
            od0.i.Companion.getClass();
            return iVar;
        }
        Character chQ0 = f0.Q0(string);
        if (chQ0 == null || (strValueOf = String.valueOf(chQ0.charValue())) == null) {
            m70.a.c(t0.f186434a);
            strValueOf = "";
        }
        int iT = d0.T(str2, strValueOf, 0, false, 6);
        if (a0.D(str2, strValueOf, "", false).length() < str2.length() - 1 || !(strValueOf.length() <= 0 || iT == 0 || iT == d0.P(str2))) {
            od0.i.Companion.getClass();
            return iVar;
        }
        if (!new Regex(p.a.p("^[0-9.,", strValueOf, "]*$")).f(str2)) {
            od0.i.Companion.getClass();
            return iVar;
        }
        if (strValueOf.length() == 0) {
            str = bVar.f306286a;
        } else {
            xi0.b.Companion.getClass();
            xi0.b bVar2 = xi0.b.i;
            if (strValueOf.equals(cp5.d.J(bVar2))) {
                str = bVar2.f306286a;
            } else {
                Intrinsics.h(map);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (strValueOf.equals((String) entry.getValue())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                str = (String) zhm.d0.a0(linkedHashMap.keySet());
            }
        }
        p pVar = p.f278066a;
        long jA = p.a(str2, str, tVar.d, null);
        if (jA <= 0) {
            od0.i.Companion.getClass();
            return iVar;
        }
        od0.h hVar = od0.i.Companion;
        xi0.b.Companion.getClass();
        dj0.d dVar = new dj0.d(jA, xi0.a.a(str));
        hVar.getClass();
        return od0.h.a(dVar);
    }

    private final Object b(Object obj2) {
        com.revolut.feature.remote_stories.impl.ui.a aVar = (com.revolut.feature.remote_stories.impl.ui.a) this.f248325b;
        qza.b bVar = (qza.b) this.f248326c;
        List list = (List) obj2;
        Intrinsics.h(list);
        RemoteStoriesContract$Config remoteStoriesContract$Config = bVar.f250457a;
        b0 b0Var = (b0) aVar.f81984c;
        boolean z = b0Var.x0().get() != qza.h.INITIAL;
        b0Var.x0().set(qza.h.LOADED);
        b0Var.y0().set(list);
        AnalyticsProduct k = remoteStoriesContract$Config.getK();
        boolean z3 = remoteStoriesContract$Config instanceof RemoteStoriesContract$Config.Key;
        RemoteStoriesContract$Config.Key key = z3 ? (RemoteStoriesContract$Config.Key) remoteStoriesContract$Config : null;
        ModalFragmentNavigateCommand modalFragmentNavigateCommand = key != null ? key.d : null;
        RemoteStoriesContract$Config.Key key2 = z3 ? (RemoteStoriesContract$Config.Key) remoteStoriesContract$Config : null;
        StoriesFeatureConfig.AnalyticsData analyticsData = key2 != null ? key2.f81973l : null;
        ln.a aVar2 = aVar.d;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((RemoteStoriesContract$RemoteStoriesModel) it8.next()).f81974a);
        }
        RemoteStoriesContract$Config remoteStoriesContract$Config2 = (RemoteStoriesContract$Config) te0.w.O(b0Var.w0());
        boolean zK = pd.b.k(remoteStoriesContract$Config2 != null ? Boolean.valueOf(remoteStoriesContract$Config2.getF81971h()) : null);
        RemoteStoriesContract$Config remoteStoriesContract$Config3 = (RemoteStoriesContract$Config) te0.w.O(b0Var.w0());
        aVar2.b(new FeatureCommand(new StoriesFeatureConfig.Story(arrayList, null, modalFragmentNavigateCommand, null, new FinishCommand(null, null, null, 7), "REMOTE_STORIES_FLOW", zK, pd.b.j(remoteStoriesContract$Config3 != null ? Boolean.valueOf(remoteStoriesContract$Config3.getI()) : null), false, k, analyticsData, z)));
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 2732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qpb.a.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ a(String str, t tVar) {
        this.f248324a = 26;
        this.f248326c = str;
        this.f248325b = tVar;
    }
}
