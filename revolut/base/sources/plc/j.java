package plc;

import com.revolut.feature.robo.impl.data.network.TemplateService;
import com.revolut.feature.wealth.models.robo.Template;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import te0.w;
import wim.z;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements phm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemplateService f237339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlc.g f237340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wlc.f f237341c;
    public final nlc.a d;
    public final w4l.f e;

    public j(b80.c connectivityRepository, TemplateService service, vlc.g networkMapper, wlc.f storage, nlc.a cache) {
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkMapper, "networkMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f237339a = service;
        this.f237340b = networkMapper;
        this.f237341c = storage;
        this.d = cache;
        uj0.b bVarK0 = w.k0(connectivityRepository, new i(1, this, j.class, "getFromNetwork", "getFromNetwork(Ljava/lang/String;)Lio/reactivex/Single;", 0, 0));
        i iVar = new i(1, this, j.class, "getFromStorage", "getFromStorage(Ljava/lang/String;)Lcom/revolut/feature/wealth/models/robo/Template;", 0, 1);
        i iVar2 = new i(1, this, j.class, "getFromMemory", "getFromMemory(Ljava/lang/String;)Lcom/revolut/feature/wealth/models/robo/Template;", 0, 2);
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: plc.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f237338b;

            {
                this.f237338b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String templateId = (String) obj2;
                Template template = (Template) obj3;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(templateId, "params");
                        Intrinsics.checkNotNullParameter(template, "template");
                        j jVar = this.f237338b;
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(templateId, "templateId");
                        Intrinsics.checkNotNullParameter(template, "template");
                        jVar.d.A(templateId, template);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(templateId, "portfolioId");
                        Intrinsics.checkNotNullParameter(template, "template");
                        Intrinsics.checkNotNullParameter(templateId, "templateId");
                        Intrinsics.checkNotNullParameter(template, "template");
                        wlc.f fVar = this.f237338b.f237341c;
                        vlc.d template2 = vlc.g.e(template);
                        Intrinsics.checkNotNullParameter(templateId, "templateId");
                        Intrinsics.checkNotNullParameter(template2, "template");
                        fVar.f298473a.G(template2, j6.a.q("TEMPLATE_", templateId), z.d(o0.b(vlc.d.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        this.e = new w4l.f(bVarK0, iVar2, function2, iVar, new Function2(this) { // from class: plc.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f237338b;

            {
                this.f237338b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String templateId = (String) obj2;
                Template template = (Template) obj3;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(templateId, "params");
                        Intrinsics.checkNotNullParameter(template, "template");
                        j jVar = this.f237338b;
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(templateId, "templateId");
                        Intrinsics.checkNotNullParameter(template, "template");
                        jVar.d.A(templateId, template);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(templateId, "portfolioId");
                        Intrinsics.checkNotNullParameter(template, "template");
                        Intrinsics.checkNotNullParameter(templateId, "templateId");
                        Intrinsics.checkNotNullParameter(template, "template");
                        wlc.f fVar = this.f237338b.f237341c;
                        vlc.d template2 = vlc.g.e(template);
                        Intrinsics.checkNotNullParameter(templateId, "templateId");
                        Intrinsics.checkNotNullParameter(template2, "template");
                        fVar.f298473a.G(template2, j6.a.q("TEMPLATE_", templateId), z.d(o0.b(vlc.d.class)));
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
