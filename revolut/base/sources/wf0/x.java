package wf0;

import com.revolut.core.faq.data.network.FaqService;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xf0.a f296937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo6.b f296938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f296939c;
    public final FaqService d;
    public final j0 e;
    public final ne0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f296940g;

    public x(xf0.a faqDao, vo6.b faqDataProvider, m faqLanguageRepository, FaqService faqService, j0 faqSettingsRepository, ne0.j faqCache) {
        Intrinsics.checkNotNullParameter(faqDao, "faqDao");
        Intrinsics.checkNotNullParameter(faqDataProvider, "faqDataProvider");
        Intrinsics.checkNotNullParameter(faqLanguageRepository, "faqLanguageRepository");
        Intrinsics.checkNotNullParameter(faqService, "faqService");
        Intrinsics.checkNotNullParameter(faqSettingsRepository, "faqSettingsRepository");
        Intrinsics.checkNotNullParameter(faqCache, "faqCache");
        this.f296937a = faqDao;
        this.f296938b = faqDataProvider;
        this.f296939c = faqLanguageRepository;
        this.d = faqService;
        this.e = faqSettingsRepository;
        this.f = faqCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: wf0.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f296923b;

            {
                this.f296923b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        zf0.c langKey = (zf0.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(langKey, "langKey");
                        x xVar = this.f296923b;
                        ufm.i iVar = new ufm.i(new ufm.i(new ufm.i(xVar.f296938b.a(), new r(0, new o(xVar, langKey, 0)), 0), new r(5, new o(xVar, langKey, 2)), 1), new r(6, new wd3.a(20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        zf0.c param = (zf0.c) obj2;
                        List feedResponses = (List) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(feedResponses, "feedResponses");
                        this.f296923b.f.f(String.valueOf(param.hashCode()), feedResponses);
                        break;
                    default:
                        zf0.c param2 = (zf0.c) obj2;
                        List faqs = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(faqs, "faqs");
                        List list = faqs;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(bg0.a.e((aj0.c) it8.next()));
                        }
                        this.f296923b.f296937a.g(param2.a(), arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: wf0.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f296925b;

            {
                this.f296925b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                zf0.c param = (zf0.c) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(param, "param");
                        return (List) this.f296925b.f.get(String.valueOf(param.hashCode()));
                    default:
                        Intrinsics.checkNotNullParameter(param, "param");
                        efm.d0 d0VarD = this.f296925b.f296937a.d(param.a());
                        r rVar = new r(7, new wd3.a(21));
                        d0VarD.getClass();
                        ufm.i iVar = new ufm.i(d0VarD, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: wf0.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f296923b;

            {
                this.f296923b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        zf0.c langKey = (zf0.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(langKey, "langKey");
                        x xVar = this.f296923b;
                        ufm.i iVar = new ufm.i(new ufm.i(new ufm.i(xVar.f296938b.a(), new r(0, new o(xVar, langKey, 0)), 0), new r(5, new o(xVar, langKey, 2)), 1), new r(6, new wd3.a(20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        zf0.c param = (zf0.c) obj2;
                        List feedResponses = (List) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(feedResponses, "feedResponses");
                        this.f296923b.f.f(String.valueOf(param.hashCode()), feedResponses);
                        break;
                    default:
                        zf0.c param2 = (zf0.c) obj2;
                        List faqs = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(faqs, "faqs");
                        List list = faqs;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(bg0.a.e((aj0.c) it8.next()));
                        }
                        this.f296923b.f296937a.g(param2.a(), arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 2;
        Function2 function23 = new Function2(this) { // from class: wf0.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f296923b;

            {
                this.f296923b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        zf0.c langKey = (zf0.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(langKey, "langKey");
                        x xVar = this.f296923b;
                        ufm.i iVar = new ufm.i(new ufm.i(new ufm.i(xVar.f296938b.a(), new r(0, new o(xVar, langKey, 0)), 0), new r(5, new o(xVar, langKey, 2)), 1), new r(6, new wd3.a(20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        zf0.c param = (zf0.c) obj2;
                        List feedResponses = (List) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(feedResponses, "feedResponses");
                        this.f296923b.f.f(String.valueOf(param.hashCode()), feedResponses);
                        break;
                    default:
                        zf0.c param2 = (zf0.c) obj2;
                        List faqs = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(faqs, "faqs");
                        List list = faqs;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(bg0.a.e((aj0.c) it8.next()));
                        }
                        this.f296923b.f296937a.g(param2.a(), arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 1;
        this.f296940g = new w4l.f(function2, function1, function22, null, function23, null, new Function1(this) { // from class: wf0.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f296925b;

            {
                this.f296925b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                zf0.c param = (zf0.c) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(param, "param");
                        return (List) this.f296925b.f.get(String.valueOf(param.hashCode()));
                    default:
                        Intrinsics.checkNotNullParameter(param, "param");
                        efm.d0 d0VarD = this.f296925b.f296937a.d(param.a());
                        r rVar = new r(7, new wd3.a(21));
                        d0VarD.getClass();
                        ufm.i iVar = new ufm.i(d0VarD, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, null, 168);
        new w4l.f(new pq0.d(13), new qza.q(this), new pq0.d(this), null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r5.d.postFaqCount(r7, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof wf0.w
            if (r0 == 0) goto L13
            r0 = r7
            wf0.w r0 = (wf0.w) r0
            int r1 = r0.f296934x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f296934x = r1
            goto L18
        L13:
            wf0.w r0 = new wf0.w
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f296934x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L4c
        L38:
            yhm.o.b(r7)
            vo6.b r7 = r5.f296938b
            ufm.b r7 = r7.a()
            r0.u = r6
            r0.f296934x = r4
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4c
            goto L63
        L4c:
            java.lang.String r7 = (java.lang.String) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            cg0.e r2 = new cg0.e
            r2.<init>(r6)
            r6 = 0
            r0.u = r6
            r0.f296934x = r3
            com.revolut.core.faq.data.network.FaqService r6 = r5.d
            java.lang.Object r6 = r6.postFaqCount(r7, r2, r0)
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wf0.x.a(java.lang.String, gim.c):java.lang.Object");
    }
}
