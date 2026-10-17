package plc;

import com.revolut.feature.robo.impl.data.network.TemplateService;
import com.revolut.feature.wealth.models.robo.Template;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import te0.w;
import wim.z;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements phm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemplateService f237344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlc.g f237345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wlc.i f237346c;
    public final nlc.a d;
    public final w4l.f e;

    public l(b80.c connectivityRepository, TemplateService service, vlc.g networkMapper, wlc.i storage, nlc.a cache) {
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkMapper, "networkMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f237344a = service;
        this.f237345b = networkMapper;
        this.f237346c = storage;
        this.d = cache;
        uj0.b bVarK0 = w.k0(connectivityRepository, new i(1, this, l.class, "getTemplatesFromNetwork", "getTemplatesFromNetwork(Lcom/revolut/feature/robo/impl/data/dods/TemplatesParams;)Lio/reactivex/Single;", 0, 4));
        i iVar = new i(1, this, l.class, "getTemplatesFromStorage", "getTemplatesFromStorage(Lcom/revolut/feature/robo/impl/data/dods/TemplatesParams;)Ljava/util/List;", 0, 5);
        i iVar2 = new i(1, this, l.class, "getTemplatesFromMemory", "getTemplatesFromMemory(Lcom/revolut/feature/robo/impl/data/dods/TemplatesParams;)Ljava/util/List;", 0, 6);
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: plc.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f237343b;

            {
                this.f237343b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                p params = (p) obj2;
                List templates = (List) obj3;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(templates, "templates");
                        l lVar = this.f237343b;
                        lVar.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(templates, "templates");
                        lVar.d.A(params, templates);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "portfolioId");
                        Intrinsics.checkNotNullParameter(templates, "templates");
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(templates, "templates");
                        List list = templates;
                        ArrayList templates2 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            templates2.add(vlc.g.e((Template) it8.next()));
                        }
                        wlc.i iVar3 = this.f237343b.f237346c;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(templates2, "templates");
                        iVar3.f298476a.G(new wlc.h(templates2), j6.a.q("TEMPLATES_", params.a()), z.d(o0.b(wlc.h.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        this.e = new w4l.f(bVarK0, iVar2, function2, iVar, new Function2(this) { // from class: plc.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f237343b;

            {
                this.f237343b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                p params = (p) obj2;
                List templates = (List) obj3;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(templates, "templates");
                        l lVar = this.f237343b;
                        lVar.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(templates, "templates");
                        lVar.d.A(params, templates);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "portfolioId");
                        Intrinsics.checkNotNullParameter(templates, "templates");
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(templates, "templates");
                        List list = templates;
                        ArrayList templates2 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            templates2.add(vlc.g.e((Template) it8.next()));
                        }
                        wlc.i iVar3 = this.f237343b.f237346c;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(templates2, "templates");
                        iVar3.f298476a.G(new wlc.h(templates2), j6.a.q("TEMPLATES_", params.a()), z.d(o0.b(wlc.h.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    @Override // phm.a
    public final Object get() {
        return this.e;
    }
}
