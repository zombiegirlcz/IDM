package by9;

import androidx.room.util.DBUtil;
import bs9.i0;
import bxg.t;
import com.revolut.feature.payments.recipients.settings.impl.data.network.RecipientPaymentsSettingsService;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import efm.d0;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements ay9.b {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecipientPaymentsSettingsService f19789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cy9.b f19790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f19791c;
    public final w4l.f d;

    public j(RecipientPaymentsSettingsService recipientPaymentsSettingsService, cy9.b recipientPaymentsSettingsDao, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(recipientPaymentsSettingsService, "recipientPaymentsSettingsService");
        Intrinsics.checkNotNullParameter(recipientPaymentsSettingsDao, "recipientPaymentsSettingsDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f19789a = recipientPaymentsSettingsService;
        this.f19790b = recipientPaymentsSettingsDao;
        this.f19791c = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: by9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f19782b;

            {
                this.f19782b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                dy9.c cVar;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ey9.a>> recipientSettings = this.f19782b.f19789a.getRecipientSettings();
                        i0 i0Var = new i0(17, new t(6));
                        recipientSettings.getClass();
                        ufm.i iVar = new ufm.i(recipientSettings, i0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f19782b.f19791c.f("CACHE_KEY_RECIPIENTS_SETTINGS", settings);
                        return Unit.f186387a;
                    default:
                        List settings2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        List<RecipientPaymentsSettings> list = settings2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (RecipientPaymentsSettings recipientPaymentsSettings : list) {
                            Intrinsics.checkNotNullParameter(recipientPaymentsSettings, "<this>");
                            String str = recipientPaymentsSettings.f79672a;
                            iy9.d dVar = recipientPaymentsSettings.f79673b;
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            int i2 = a.f19780b[dVar.ordinal()];
                            if (i2 == 1) {
                                cVar = dy9.c.USER;
                            } else if (i2 == 2) {
                                cVar = dy9.c.BENEFICIARY;
                            } else if (i2 == 3) {
                                cVar = dy9.c.CARD_OWNER;
                            } else {
                                if (i2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar = dy9.c.COMPANY;
                            }
                            List<RecipientPaymentsSettings.Setting> list2 = recipientPaymentsSettings.f79674c;
                            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                            for (RecipientPaymentsSettings.Setting setting : list2) {
                                arrayList2.add(new dy9.a(setting.f79675a.a(), setting.f79676b.getValue()));
                            }
                            arrayList.add(new dy9.b(str, cVar, arrayList2));
                        }
                        cy9.b bVar = this.f19782b.f19790b;
                        DBUtil.performBlocking(bVar.f110064a, false, true, new cy9.a(bVar, arrayList, 0));
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: by9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f19784b;

            {
                this.f19784b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f19784b.f19791c.get("CACHE_KEY_RECIPIENTS_SETTINGS");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        cy9.b bVar = this.f19784b.f19790b;
                        List list = (List) DBUtil.performBlocking(bVar.f110064a, true, false, new cw7.j(bVar, 15));
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(b.a((dy9.b) it9.next()));
                        }
                        return arrayList;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: by9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f19782b;

            {
                this.f19782b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                dy9.c cVar;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ey9.a>> recipientSettings = this.f19782b.f19789a.getRecipientSettings();
                        i0 i0Var = new i0(17, new t(6));
                        recipientSettings.getClass();
                        ufm.i iVar = new ufm.i(recipientSettings, i0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f19782b.f19791c.f("CACHE_KEY_RECIPIENTS_SETTINGS", settings);
                        return Unit.f186387a;
                    default:
                        List settings2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        List<RecipientPaymentsSettings> list = settings2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (RecipientPaymentsSettings recipientPaymentsSettings : list) {
                            Intrinsics.checkNotNullParameter(recipientPaymentsSettings, "<this>");
                            String str = recipientPaymentsSettings.f79672a;
                            iy9.d dVar = recipientPaymentsSettings.f79673b;
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            int i22 = a.f19780b[dVar.ordinal()];
                            if (i22 == 1) {
                                cVar = dy9.c.USER;
                            } else if (i22 == 2) {
                                cVar = dy9.c.BENEFICIARY;
                            } else if (i22 == 3) {
                                cVar = dy9.c.CARD_OWNER;
                            } else {
                                if (i22 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar = dy9.c.COMPANY;
                            }
                            List<RecipientPaymentsSettings.Setting> list2 = recipientPaymentsSettings.f79674c;
                            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                            for (RecipientPaymentsSettings.Setting setting : list2) {
                                arrayList2.add(new dy9.a(setting.f79675a.a(), setting.f79676b.getValue()));
                            }
                            arrayList.add(new dy9.b(str, cVar, arrayList2));
                        }
                        cy9.b bVar = this.f19782b.f19790b;
                        DBUtil.performBlocking(bVar.f110064a, false, true, new cy9.a(bVar, arrayList, 0));
                        return Unit.f186387a;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: by9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f19784b;

            {
                this.f19784b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f19784b.f19791c.get("CACHE_KEY_RECIPIENTS_SETTINGS");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        cy9.b bVar = this.f19784b.f19790b;
                        List list = (List) DBUtil.performBlocking(bVar.f110064a, true, false, new cw7.j(bVar, 15));
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(b.a((dy9.b) it9.next()));
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: by9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f19782b;

            {
                this.f19782b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                dy9.c cVar;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ey9.a>> recipientSettings = this.f19782b.f19789a.getRecipientSettings();
                        i0 i0Var = new i0(17, new t(6));
                        recipientSettings.getClass();
                        ufm.i iVar = new ufm.i(recipientSettings, i0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f19782b.f19791c.f("CACHE_KEY_RECIPIENTS_SETTINGS", settings);
                        return Unit.f186387a;
                    default:
                        List settings2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        List<RecipientPaymentsSettings> list = settings2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (RecipientPaymentsSettings recipientPaymentsSettings : list) {
                            Intrinsics.checkNotNullParameter(recipientPaymentsSettings, "<this>");
                            String str = recipientPaymentsSettings.f79672a;
                            iy9.d dVar = recipientPaymentsSettings.f79673b;
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            int i22 = a.f19780b[dVar.ordinal()];
                            if (i22 == 1) {
                                cVar = dy9.c.USER;
                            } else if (i22 == 2) {
                                cVar = dy9.c.BENEFICIARY;
                            } else if (i22 == 3) {
                                cVar = dy9.c.CARD_OWNER;
                            } else {
                                if (i22 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar = dy9.c.COMPANY;
                            }
                            List<RecipientPaymentsSettings.Setting> list2 = recipientPaymentsSettings.f79674c;
                            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                            for (RecipientPaymentsSettings.Setting setting : list2) {
                                arrayList2.add(new dy9.a(setting.f79675a.a(), setting.f79676b.getValue()));
                            }
                            arrayList.add(new dy9.b(str, cVar, arrayList2));
                        }
                        cy9.b bVar = this.f19782b.f19790b;
                        DBUtil.performBlocking(bVar.f110064a, false, true, new cy9.a(bVar, arrayList, 0));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final r a() {
        return this.d.f(Unit.f186387a, false);
    }

    public final pfm.r b(com.revolut.feature.payments.recipients.settings.models.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(request, "<this>");
        pfm.a aVarE = this.f19789a.patchRecipientSettings(new ey9.b(request.f79683c.a(), request.d.getValue(), c.a(request.f79682b, request.f79681a))).e(pd.b.n(kotlin.coroutines.g.f186406a, new g(this, request, null)));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return te0.w.g0(aVarE);
    }

    public final Object c(com.revolut.feature.payments.recipients.settings.models.b bVar, gim.c cVar) throws Throwable {
        h hVar = new h(this, bVar, null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, hVar, cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
