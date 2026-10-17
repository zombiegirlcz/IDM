package i25;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f157845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f157846c;

    public /* synthetic */ e(Object obj2, Object obj3, int i) {
        this.f157844a = i;
        this.f157845b = obj2;
        this.f157846c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f157845b
            r2 = r0
            com.revolut.data.model.Data r2 = (com.revolut.data.model.Data) r2
            java.lang.Object r0 = r7.f157846c
            ihd.v r0 = (ihd.v) r0
            r1 = r8
            ihd.o r1 = (ihd.o) r1
            boolean r8 = r2.getLoading()
            if (r8 == 0) goto L26
            java.lang.Object r8 = r2.getContent()
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L1c
            zhm.f0 r8 = zhm.f0.f322471a
        L1c:
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L26
            r8 = 1
            goto L27
        L26:
            r8 = 0
        L27:
            java.util.List r3 = r1.f161385b
            if (r3 == 0) goto L2d
            goto L9d
        L2d:
            if (r8 != 0) goto L38
            boolean r8 = r2.getLoading()
            if (r8 != 0) goto L36
            goto L38
        L36:
            r3 = 0
            goto L9d
        L38:
            java.lang.Object r8 = r2.getContent()
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L42
            zhm.f0 r8 = zhm.f0.f322471a
        L42:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = zhm.w.t(r8, r4)
            r3.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L53:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r8.next()
            com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem r4 = (com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem) r4
            java.lang.String r4 = r4.getId()
            r3.add(r4)
            goto L53
        L67:
            com.revolut.feature.shared_separate_favourites.api.watchlist.home_widget_customisation.WatchlistWidgetCustomisationScreen$InputData r8 = r0.f161395q
            java.util.List r8 = r8.f86796c
            if (r8 != 0) goto L6e
            goto L91
        L6e:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r8 = r8.iterator()
        L79:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L90
            java.lang.Object r5 = r8.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto L79
            r4.add(r5)
            goto L79
        L90:
            r3 = r4
        L91:
            jki.i r8 = r0.t2()
            ihd.o r8 = (ihd.o) r8
            int r8 = r8.f161386c
            java.util.List r3 = zhm.d0.V0(r3, r8)
        L9d:
            r5 = 0
            r6 = 28
            r4 = 0
            ihd.o r8 = ihd.o.a(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i25.e.a(java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2) {
        com.revolut.feature.shops.impl.flow.session.c cVar = (com.revolut.feature.shops.impl.flow.session.c) this.f157845b;
        String str = (String) this.f157846c;
        hub.b it8 = (hub.b) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        if (it8.f155599b) {
            cVar.l2(new iid.e(cVar, str, null, 0), new yi5.b(26));
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:289:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x099f  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r32) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 3256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i25.e.invoke(java.lang.Object):java.lang.Object");
    }
}
