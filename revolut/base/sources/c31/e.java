package c31;

import bzg.t;
import ch.qos.logback.core.spi.ComponentTracker;
import com.revolut.data.database.models.statement.StatementTemplateInfoEntity;
import com.revolut.data.database.models.statement.StatementTemplatesInfoDao;
import com.revolut.data.network.models.statements.StatementTemplateInfoDto;
import com.revolut.data.network.services.StatementTemplateService;
import com.revolut.domain.models.statement.StatementTemplateId;
import efm.d0;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import qe0.q;
import ufm.i;
import w4l.f;
import z9h.n;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatementTemplateService f20860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementTemplatesInfoDao f20861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f20862c;
    public final ne0.d d;
    public final q e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f20863g;

    public e(StatementTemplateService service, StatementTemplatesInfoDao statementTemplatesInfoDao, ue0.c storage, ne0.d memoryCache, l80.e dateTimeProvider) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(statementTemplatesInfoDao, "statementTemplatesInfoDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(dateTimeProvider, "dateTimeProvider");
        this.f20860a = service;
        this.f20861b = statementTemplatesInfoDao;
        this.f20862c = storage;
        this.d = memoryCache;
        final int i = 6;
        Function2 function2 = new Function2(this) { // from class: c31.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f20854b;

            {
                this.f20854b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                e eVar = this.f20854b;
                switch (i2) {
                    case 0:
                        c71.b info = (c71.b) obj2;
                        c71.a template = (c71.a) obj3;
                        Intrinsics.checkNotNullParameter(info, "info");
                        Intrinsics.checkNotNullParameter(template, "template");
                        n.l(String.class, eVar.f20862c, "statement_template_".concat(p11.a.a(info.f21827a)), template.f21826b);
                        break;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<StatementTemplateInfoDto> templateInfo = eVar.f20860a.getTemplateInfo(id10);
                        c2i.c cVar = new c2i.c(new bd2.b(id10, 25), 8);
                        templateInfo.getClass();
                        ufm.f fVar = new ufm.f(new i(templateInfo, cVar, 1), new c2i.c(new byc.a(eVar, id10, 16), 9), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        break;
                    case 2:
                        String id11 = (String) obj2;
                        c71.b value = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(value, "value");
                        eVar.d.f("statement_template_info_" + id11, value);
                        break;
                    case 3:
                        c71.b value2 = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        StatementTemplatesInfoDao statementTemplatesInfoDao2 = eVar.f20861b;
                        Object obj4 = p11.a.f231605a;
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        statementTemplatesInfoDao2.insert(new StatementTemplateInfoEntity(p11.a.a(value2.f21827a), value2.f21829c, value2.f21828b, null));
                        break;
                    case 4:
                        f DataObservableDelegate2 = (f) obj2;
                        c71.b info2 = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(info2, "info");
                        d0<ResponseBody> template2 = eVar.f20860a.getTemplate(info2.f21828b);
                        c2i.c cVar2 = new c2i.c(new t(info2, 13), 10);
                        template2.getClass();
                        i iVar = new i(template2, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 5:
                        c71.b info3 = (c71.b) obj2;
                        c71.a template3 = (c71.a) obj3;
                        Intrinsics.checkNotNullParameter(info3, "info");
                        Intrinsics.checkNotNullParameter(template3, "template");
                        eVar.d.f("statement_template_".concat(p11.a.a(info3.f21827a)), template3);
                        break;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        eVar.d.f(key, l2);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 0;
        this.e = new q(function2, new Function1(this) { // from class: c31.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f20856b;

            {
                this.f20856b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        String key = (String) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Long l2 = (Long) this.f20856b.d.get(key);
                        return Long.valueOf(l2 != null ? l2.longValue() : 0L);
                    case 1:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (c71.b) v1.c.s("statement_template_info_", id10, this.f20856b.d);
                    case 2:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        StatementTemplateInfoEntity byId = this.f20856b.f20861b.getById(id11, null);
                        if (byId != null) {
                            return p11.a.b(byId);
                        }
                        return null;
                    case 3:
                        c71.b info = (c71.b) obj2;
                        Intrinsics.checkNotNullParameter(info, "info");
                        return (c71.a) this.f20856b.d.get("statement_template_".concat(p11.a.a(info.f21827a)));
                    default:
                        c71.b info2 = (c71.b) obj2;
                        Intrinsics.checkNotNullParameter(info2, "info");
                        String str = (String) this.f20856b.f20862c.T2("statement_template_".concat(p11.a.a(info2.f21827a)), l21.d.d);
                        if (str != null) {
                            return new c71.a(info2.f21827a, str);
                        }
                        return null;
                }
            }
        }, ComponentTracker.DEFAULT_TIMEOUT, dateTimeProvider);
        final int i3 = 1;
        Function2 function22 = new Function2(this) { // from class: c31.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f20854b;

            {
                this.f20854b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                e eVar = this.f20854b;
                switch (i22) {
                    case 0:
                        c71.b info = (c71.b) obj2;
                        c71.a template = (c71.a) obj3;
                        Intrinsics.checkNotNullParameter(info, "info");
                        Intrinsics.checkNotNullParameter(template, "template");
                        n.l(String.class, eVar.f20862c, "statement_template_".concat(p11.a.a(info.f21827a)), template.f21826b);
                        break;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<StatementTemplateInfoDto> templateInfo = eVar.f20860a.getTemplateInfo(id10);
                        c2i.c cVar = new c2i.c(new bd2.b(id10, 25), 8);
                        templateInfo.getClass();
                        ufm.f fVar = new ufm.f(new i(templateInfo, cVar, 1), new c2i.c(new byc.a(eVar, id10, 16), 9), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        break;
                    case 2:
                        String id11 = (String) obj2;
                        c71.b value = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(value, "value");
                        eVar.d.f("statement_template_info_" + id11, value);
                        break;
                    case 3:
                        c71.b value2 = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        StatementTemplatesInfoDao statementTemplatesInfoDao2 = eVar.f20861b;
                        Object obj4 = p11.a.f231605a;
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        statementTemplatesInfoDao2.insert(new StatementTemplateInfoEntity(p11.a.a(value2.f21827a), value2.f21829c, value2.f21828b, null));
                        break;
                    case 4:
                        f DataObservableDelegate2 = (f) obj2;
                        c71.b info2 = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(info2, "info");
                        d0<ResponseBody> template2 = eVar.f20860a.getTemplate(info2.f21828b);
                        c2i.c cVar2 = new c2i.c(new t(info2, 13), 10);
                        template2.getClass();
                        i iVar = new i(template2, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 5:
                        c71.b info3 = (c71.b) obj2;
                        c71.a template3 = (c71.a) obj3;
                        Intrinsics.checkNotNullParameter(info3, "info");
                        Intrinsics.checkNotNullParameter(template3, "template");
                        eVar.d.f("statement_template_".concat(p11.a.a(info3.f21827a)), template3);
                        break;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        eVar.d.f(key, l2);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: c31.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f20856b;

            {
                this.f20856b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        String key = (String) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Long l2 = (Long) this.f20856b.d.get(key);
                        return Long.valueOf(l2 != null ? l2.longValue() : 0L);
                    case 1:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (c71.b) v1.c.s("statement_template_info_", id10, this.f20856b.d);
                    case 2:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        StatementTemplateInfoEntity byId = this.f20856b.f20861b.getById(id11, null);
                        if (byId != null) {
                            return p11.a.b(byId);
                        }
                        return null;
                    case 3:
                        c71.b info = (c71.b) obj2;
                        Intrinsics.checkNotNullParameter(info, "info");
                        return (c71.a) this.f20856b.d.get("statement_template_".concat(p11.a.a(info.f21827a)));
                    default:
                        c71.b info2 = (c71.b) obj2;
                        Intrinsics.checkNotNullParameter(info2, "info");
                        String str = (String) this.f20856b.f20862c.T2("statement_template_".concat(p11.a.a(info2.f21827a)), l21.d.d);
                        if (str != null) {
                            return new c71.a(info2.f21827a, str);
                        }
                        return null;
                }
            }
        };
        final int i5 = 2;
        Function2 function23 = new Function2(this) { // from class: c31.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f20854b;

            {
                this.f20854b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i5;
                e eVar = this.f20854b;
                switch (i22) {
                    case 0:
                        c71.b info = (c71.b) obj2;
                        c71.a template = (c71.a) obj3;
                        Intrinsics.checkNotNullParameter(info, "info");
                        Intrinsics.checkNotNullParameter(template, "template");
                        n.l(String.class, eVar.f20862c, "statement_template_".concat(p11.a.a(info.f21827a)), template.f21826b);
                        break;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<StatementTemplateInfoDto> templateInfo = eVar.f20860a.getTemplateInfo(id10);
                        c2i.c cVar = new c2i.c(new bd2.b(id10, 25), 8);
                        templateInfo.getClass();
                        ufm.f fVar = new ufm.f(new i(templateInfo, cVar, 1), new c2i.c(new byc.a(eVar, id10, 16), 9), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        break;
                    case 2:
                        String id11 = (String) obj2;
                        c71.b value = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(value, "value");
                        eVar.d.f("statement_template_info_" + id11, value);
                        break;
                    case 3:
                        c71.b value2 = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        StatementTemplatesInfoDao statementTemplatesInfoDao2 = eVar.f20861b;
                        Object obj4 = p11.a.f231605a;
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        statementTemplatesInfoDao2.insert(new StatementTemplateInfoEntity(p11.a.a(value2.f21827a), value2.f21829c, value2.f21828b, null));
                        break;
                    case 4:
                        f DataObservableDelegate2 = (f) obj2;
                        c71.b info2 = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(info2, "info");
                        d0<ResponseBody> template2 = eVar.f20860a.getTemplate(info2.f21828b);
                        c2i.c cVar2 = new c2i.c(new t(info2, 13), 10);
                        template2.getClass();
                        i iVar = new i(template2, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 5:
                        c71.b info3 = (c71.b) obj2;
                        c71.a template3 = (c71.a) obj3;
                        Intrinsics.checkNotNullParameter(info3, "info");
                        Intrinsics.checkNotNullParameter(template3, "template");
                        eVar.d.f("statement_template_".concat(p11.a.a(info3.f21827a)), template3);
                        break;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        eVar.d.f(key, l2);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: c31.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f20856b;

            {
                this.f20856b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        String key = (String) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Long l2 = (Long) this.f20856b.d.get(key);
                        return Long.valueOf(l2 != null ? l2.longValue() : 0L);
                    case 1:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (c71.b) v1.c.s("statement_template_info_", id10, this.f20856b.d);
                    case 2:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        StatementTemplateInfoEntity byId = this.f20856b.f20861b.getById(id11, null);
                        if (byId != null) {
                            return p11.a.b(byId);
                        }
                        return null;
                    case 3:
                        c71.b info = (c71.b) obj2;
                        Intrinsics.checkNotNullParameter(info, "info");
                        return (c71.a) this.f20856b.d.get("statement_template_".concat(p11.a.a(info.f21827a)));
                    default:
                        c71.b info2 = (c71.b) obj2;
                        Intrinsics.checkNotNullParameter(info2, "info");
                        String str = (String) this.f20856b.f20862c.T2("statement_template_".concat(p11.a.a(info2.f21827a)), l21.d.d);
                        if (str != null) {
                            return new c71.a(info2.f21827a, str);
                        }
                        return null;
                }
            }
        };
        final int i6 = 3;
        this.f = new f(function22, function1, function23, function12, new Function2(this) { // from class: c31.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f20854b;

            {
                this.f20854b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i6;
                e eVar = this.f20854b;
                switch (i22) {
                    case 0:
                        c71.b info = (c71.b) obj2;
                        c71.a template = (c71.a) obj3;
                        Intrinsics.checkNotNullParameter(info, "info");
                        Intrinsics.checkNotNullParameter(template, "template");
                        n.l(String.class, eVar.f20862c, "statement_template_".concat(p11.a.a(info.f21827a)), template.f21826b);
                        break;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<StatementTemplateInfoDto> templateInfo = eVar.f20860a.getTemplateInfo(id10);
                        c2i.c cVar = new c2i.c(new bd2.b(id10, 25), 8);
                        templateInfo.getClass();
                        ufm.f fVar = new ufm.f(new i(templateInfo, cVar, 1), new c2i.c(new byc.a(eVar, id10, 16), 9), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        break;
                    case 2:
                        String id11 = (String) obj2;
                        c71.b value = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(value, "value");
                        eVar.d.f("statement_template_info_" + id11, value);
                        break;
                    case 3:
                        c71.b value2 = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        StatementTemplatesInfoDao statementTemplatesInfoDao2 = eVar.f20861b;
                        Object obj4 = p11.a.f231605a;
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        statementTemplatesInfoDao2.insert(new StatementTemplateInfoEntity(p11.a.a(value2.f21827a), value2.f21829c, value2.f21828b, null));
                        break;
                    case 4:
                        f DataObservableDelegate2 = (f) obj2;
                        c71.b info2 = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(info2, "info");
                        d0<ResponseBody> template2 = eVar.f20860a.getTemplate(info2.f21828b);
                        c2i.c cVar2 = new c2i.c(new t(info2, 13), 10);
                        template2.getClass();
                        i iVar = new i(template2, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 5:
                        c71.b info3 = (c71.b) obj2;
                        c71.a template3 = (c71.a) obj3;
                        Intrinsics.checkNotNullParameter(info3, "info");
                        Intrinsics.checkNotNullParameter(template3, "template");
                        eVar.d.f("statement_template_".concat(p11.a.a(info3.f21827a)), template3);
                        break;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        eVar.d.f(key, l2);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 4;
        Function2 function24 = new Function2(this) { // from class: c31.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f20854b;

            {
                this.f20854b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i21;
                e eVar = this.f20854b;
                switch (i22) {
                    case 0:
                        c71.b info = (c71.b) obj2;
                        c71.a template = (c71.a) obj3;
                        Intrinsics.checkNotNullParameter(info, "info");
                        Intrinsics.checkNotNullParameter(template, "template");
                        n.l(String.class, eVar.f20862c, "statement_template_".concat(p11.a.a(info.f21827a)), template.f21826b);
                        break;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<StatementTemplateInfoDto> templateInfo = eVar.f20860a.getTemplateInfo(id10);
                        c2i.c cVar = new c2i.c(new bd2.b(id10, 25), 8);
                        templateInfo.getClass();
                        ufm.f fVar = new ufm.f(new i(templateInfo, cVar, 1), new c2i.c(new byc.a(eVar, id10, 16), 9), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        break;
                    case 2:
                        String id11 = (String) obj2;
                        c71.b value = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(value, "value");
                        eVar.d.f("statement_template_info_" + id11, value);
                        break;
                    case 3:
                        c71.b value2 = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        StatementTemplatesInfoDao statementTemplatesInfoDao2 = eVar.f20861b;
                        Object obj4 = p11.a.f231605a;
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        statementTemplatesInfoDao2.insert(new StatementTemplateInfoEntity(p11.a.a(value2.f21827a), value2.f21829c, value2.f21828b, null));
                        break;
                    case 4:
                        f DataObservableDelegate2 = (f) obj2;
                        c71.b info2 = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(info2, "info");
                        d0<ResponseBody> template2 = eVar.f20860a.getTemplate(info2.f21828b);
                        c2i.c cVar2 = new c2i.c(new t(info2, 13), 10);
                        template2.getClass();
                        i iVar = new i(template2, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 5:
                        c71.b info3 = (c71.b) obj2;
                        c71.a template3 = (c71.a) obj3;
                        Intrinsics.checkNotNullParameter(info3, "info");
                        Intrinsics.checkNotNullParameter(template3, "template");
                        eVar.d.f("statement_template_".concat(p11.a.a(info3.f21827a)), template3);
                        break;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        eVar.d.f(key, l2);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i22 = 3;
        Function1 function13 = new Function1(this) { // from class: c31.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f20856b;

            {
                this.f20856b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        String key = (String) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Long l2 = (Long) this.f20856b.d.get(key);
                        return Long.valueOf(l2 != null ? l2.longValue() : 0L);
                    case 1:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (c71.b) v1.c.s("statement_template_info_", id10, this.f20856b.d);
                    case 2:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        StatementTemplateInfoEntity byId = this.f20856b.f20861b.getById(id11, null);
                        if (byId != null) {
                            return p11.a.b(byId);
                        }
                        return null;
                    case 3:
                        c71.b info = (c71.b) obj2;
                        Intrinsics.checkNotNullParameter(info, "info");
                        return (c71.a) this.f20856b.d.get("statement_template_".concat(p11.a.a(info.f21827a)));
                    default:
                        c71.b info2 = (c71.b) obj2;
                        Intrinsics.checkNotNullParameter(info2, "info");
                        String str = (String) this.f20856b.f20862c.T2("statement_template_".concat(p11.a.a(info2.f21827a)), l21.d.d);
                        if (str != null) {
                            return new c71.a(info2.f21827a, str);
                        }
                        return null;
                }
            }
        };
        final int i32 = 5;
        Function2 function25 = new Function2(this) { // from class: c31.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f20854b;

            {
                this.f20854b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i32;
                e eVar = this.f20854b;
                switch (i222) {
                    case 0:
                        c71.b info = (c71.b) obj2;
                        c71.a template = (c71.a) obj3;
                        Intrinsics.checkNotNullParameter(info, "info");
                        Intrinsics.checkNotNullParameter(template, "template");
                        n.l(String.class, eVar.f20862c, "statement_template_".concat(p11.a.a(info.f21827a)), template.f21826b);
                        break;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<StatementTemplateInfoDto> templateInfo = eVar.f20860a.getTemplateInfo(id10);
                        c2i.c cVar = new c2i.c(new bd2.b(id10, 25), 8);
                        templateInfo.getClass();
                        ufm.f fVar = new ufm.f(new i(templateInfo, cVar, 1), new c2i.c(new byc.a(eVar, id10, 16), 9), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        break;
                    case 2:
                        String id11 = (String) obj2;
                        c71.b value = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(value, "value");
                        eVar.d.f("statement_template_info_" + id11, value);
                        break;
                    case 3:
                        c71.b value2 = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        StatementTemplatesInfoDao statementTemplatesInfoDao2 = eVar.f20861b;
                        Object obj4 = p11.a.f231605a;
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        statementTemplatesInfoDao2.insert(new StatementTemplateInfoEntity(p11.a.a(value2.f21827a), value2.f21829c, value2.f21828b, null));
                        break;
                    case 4:
                        f DataObservableDelegate2 = (f) obj2;
                        c71.b info2 = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(info2, "info");
                        d0<ResponseBody> template2 = eVar.f20860a.getTemplate(info2.f21828b);
                        c2i.c cVar2 = new c2i.c(new t(info2, 13), 10);
                        template2.getClass();
                        i iVar = new i(template2, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 5:
                        c71.b info3 = (c71.b) obj2;
                        c71.a template3 = (c71.a) obj3;
                        Intrinsics.checkNotNullParameter(info3, "info");
                        Intrinsics.checkNotNullParameter(template3, "template");
                        eVar.d.f("statement_template_".concat(p11.a.a(info3.f21827a)), template3);
                        break;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        eVar.d.f(key, l2);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i33 = 4;
        Function1 function14 = new Function1(this) { // from class: c31.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f20856b;

            {
                this.f20856b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i33) {
                    case 0:
                        String key = (String) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Long l2 = (Long) this.f20856b.d.get(key);
                        return Long.valueOf(l2 != null ? l2.longValue() : 0L);
                    case 1:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (c71.b) v1.c.s("statement_template_info_", id10, this.f20856b.d);
                    case 2:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        StatementTemplateInfoEntity byId = this.f20856b.f20861b.getById(id11, null);
                        if (byId != null) {
                            return p11.a.b(byId);
                        }
                        return null;
                    case 3:
                        c71.b info = (c71.b) obj2;
                        Intrinsics.checkNotNullParameter(info, "info");
                        return (c71.a) this.f20856b.d.get("statement_template_".concat(p11.a.a(info.f21827a)));
                    default:
                        c71.b info2 = (c71.b) obj2;
                        Intrinsics.checkNotNullParameter(info2, "info");
                        String str = (String) this.f20856b.f20862c.T2("statement_template_".concat(p11.a.a(info2.f21827a)), l21.d.d);
                        if (str != null) {
                            return new c71.a(info2.f21827a, str);
                        }
                        return null;
                }
            }
        };
        final int i43 = 0;
        this.f20863g = new f(function24, function13, function25, function14, new Function2(this) { // from class: c31.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f20854b;

            {
                this.f20854b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i43;
                e eVar = this.f20854b;
                switch (i222) {
                    case 0:
                        c71.b info = (c71.b) obj2;
                        c71.a template = (c71.a) obj3;
                        Intrinsics.checkNotNullParameter(info, "info");
                        Intrinsics.checkNotNullParameter(template, "template");
                        n.l(String.class, eVar.f20862c, "statement_template_".concat(p11.a.a(info.f21827a)), template.f21826b);
                        break;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<StatementTemplateInfoDto> templateInfo = eVar.f20860a.getTemplateInfo(id10);
                        c2i.c cVar = new c2i.c(new bd2.b(id10, 25), 8);
                        templateInfo.getClass();
                        ufm.f fVar = new ufm.f(new i(templateInfo, cVar, 1), new c2i.c(new byc.a(eVar, id10, 16), 9), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        break;
                    case 2:
                        String id11 = (String) obj2;
                        c71.b value = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(value, "value");
                        eVar.d.f("statement_template_info_" + id11, value);
                        break;
                    case 3:
                        c71.b value2 = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        StatementTemplatesInfoDao statementTemplatesInfoDao2 = eVar.f20861b;
                        Object obj4 = p11.a.f231605a;
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        statementTemplatesInfoDao2.insert(new StatementTemplateInfoEntity(p11.a.a(value2.f21827a), value2.f21829c, value2.f21828b, null));
                        break;
                    case 4:
                        f DataObservableDelegate2 = (f) obj2;
                        c71.b info2 = (c71.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(info2, "info");
                        d0<ResponseBody> template2 = eVar.f20860a.getTemplate(info2.f21828b);
                        c2i.c cVar2 = new c2i.c(new t(info2, 13), 10);
                        template2.getClass();
                        i iVar = new i(template2, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 5:
                        c71.b info3 = (c71.b) obj2;
                        c71.a template3 = (c71.a) obj3;
                        Intrinsics.checkNotNullParameter(info3, "info");
                        Intrinsics.checkNotNullParameter(template3, "template");
                        eVar.d.f("statement_template_".concat(p11.a.a(info3.f21827a)), template3);
                        break;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        eVar.d.f(key, l2);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final r a(StatementTemplateId id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        String strA = p11.a.a(id10);
        boolean zA = false;
        if (z) {
            zA = this.e.a("template_info_timestamp_".concat(p11.a.a(id10)), false);
        }
        return this.f.f(strA, zA);
    }
}
