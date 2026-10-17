package wf0;

import com.revolut.core.faq.data.network.TroubleshooterService;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class z0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TroubleshooterService f296947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f296948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bg0.e f296949c;
    public final ne0.j d;
    public final w4l.f e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f296950g;

    public z0(TroubleshooterService troubleshooterService, m faqLanguageRepository, bg0.e mapper, ne0.j troubleshooterCache) {
        Intrinsics.checkNotNullParameter(troubleshooterService, "troubleshooterService");
        Intrinsics.checkNotNullParameter(faqLanguageRepository, "faqLanguageRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(troubleshooterCache, "troubleshooterCache");
        this.f296947a = troubleshooterService;
        this.f296948b = faqLanguageRepository;
        this.f296949c = mapper;
        this.d = troubleshooterCache;
        final int i = 0;
        final int i2 = 14;
        new w4l.f(new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3 = i;
                int i5 = 14;
                Boolean bool = null;
                int i6 = 1;
                int i21 = 0;
                z0 z0Var = this.f296936b;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i5)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i6));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i5, new v0(z0Var, i21));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, new v0(this, 10), new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3 = i2;
                int i5 = 14;
                Boolean bool = null;
                int i6 = 1;
                int i21 = 0;
                z0 z0Var = this.f296936b;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i5)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i6));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i5, new v0(z0Var, i21));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i3 = 15;
        final int i5 = 16;
        new w4l.f(new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i32 = i3;
                int i59 = 14;
                Boolean bool = null;
                int i6 = 1;
                int i21 = 0;
                z0 z0Var = this.f296936b;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i59)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i6));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i59, new v0(z0Var, i21));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, new v0(this, 15), new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i32 = i5;
                int i59 = 14;
                Boolean bool = null;
                int i6 = 1;
                int i21 = 0;
                z0 z0Var = this.f296936b;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i59)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i6));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i59, new v0(z0Var, i21));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i6 = 17;
        final int i21 = 18;
        new w4l.f(new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i32 = i6;
                int i59 = 14;
                Boolean bool = null;
                int i66 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i59)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i66));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i59, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, new v0(this, 16), new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i32 = i21;
                int i59 = 14;
                Boolean bool = null;
                int i66 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i59)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i66));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i59, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i22 = 19;
        final int i32 = 1;
        new w4l.f(new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i322 = i22;
                int i59 = 14;
                Boolean bool = null;
                int i66 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i322) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i59)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i66));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i59, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, new v0(this, 5), new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i322 = i32;
                int i59 = 14;
                Boolean bool = null;
                int i66 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i322) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i59)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i66));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i59, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i33 = 2;
        final int i43 = 3;
        new w4l.f(new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i322 = i33;
                int i59 = 14;
                Boolean bool = null;
                int i66 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i322) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i59)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i66));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i59, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, new v0(this, 7), new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i322 = i43;
                int i59 = 14;
                Boolean bool = null;
                int i66 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i322) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i59)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i66));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i59, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i59 = 4;
        final int i66 = 5;
        this.e = new w4l.f(new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i322 = i59;
                int i592 = 14;
                Boolean bool = null;
                int i662 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i322) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i592)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i662));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i592, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, new v0(this, 8), new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i322 = i66;
                int i592 = 14;
                Boolean bool = null;
                int i662 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i322) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i592)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i662));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i592, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i74 = 6;
        final int i92 = 7;
        new w4l.f(new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i322 = i74;
                int i592 = 14;
                Boolean bool = null;
                int i662 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i322) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i592)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i662));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i592, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, new v0(this, 9), new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i322 = i92;
                int i592 = 14;
                Boolean bool = null;
                int i662 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i322) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i592)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i662));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i592, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i96 = 8;
        final int i99 = 9;
        this.f = new w4l.f(new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i322 = i96;
                int i592 = 14;
                Boolean bool = null;
                int i662 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i322) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i592)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i662));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i592, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, new v0(this, 11), new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i322 = i99;
                int i592 = 14;
                Boolean bool = null;
                int i662 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i322) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i592)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i662));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i592, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i100 = 10;
        final int i101 = 11;
        new w4l.f(new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i322 = i100;
                int i592 = 14;
                Boolean bool = null;
                int i662 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i322) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i592)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i662));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i592, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, new v0(this, 12), new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i322 = i101;
                int i592 = 14;
                Boolean bool = null;
                int i662 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i322) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i592)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i662));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i592, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i102 = 12;
        Function2 function2 = new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i322 = i102;
                int i592 = 14;
                Boolean bool = null;
                int i662 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i322) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i592)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i662));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i592, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        };
        final int i103 = 13;
        this.f296950g = new w4l.f(function2, new v0(this, i103), new Function2(this) { // from class: wf0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f296936b;

            {
                this.f296936b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i322 = i103;
                int i592 = 14;
                Boolean bool = null;
                int i662 = 1;
                int i212 = 0;
                z0 z0Var = this.f296936b;
                switch (i322) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.i iVar = new ufm.i(z0Var.f296948b.b(), new r(11, new v0(z0Var, 3)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        List response = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response, "response");
                        z0Var.d.f("REFERRALS_TROUBLESHOOTER_KEY", response);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ufm.i iVar2 = new ufm.i(z0Var.f296948b.b(), new r(23, new v0(z0Var, i592)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    case 3:
                        List response2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        z0Var.d.f("REFERRALS_MAIN_TROUBLESHOOTER_KEY", response2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String faqKey = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        ufm.i iVar3 = new ufm.i(z0Var.f296948b.b(), new r(13, new w38.v(z0Var, faqKey, 26)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                        return iVar3;
                    case 5:
                        String faqKey2 = (String) obj2;
                        List response3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        ehe.n.z("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey2, z0Var.d, response3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar4 = new ufm.i(z0Var.f296948b.b(), new r(10, new v0(z0Var, 2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                        return iVar4;
                    case 7:
                        List response4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        z0Var.d.f("TRANSFERS_TROUBLESHOOTER_KEY", response4);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        y0 params = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot = z0Var.f296947a.troubleshoot(new cg0.h0(params.f296942a, "CARD", null, params.f296943b));
                        r rVar = new r(9, new v0(z0Var, i662));
                        d0VarTroubleshoot.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarTroubleshoot, rVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 9:
                        y0 params2 = (y0) obj2;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(items, "items");
                        ehe.n.z("CARD_TROUBLESHOOT_KEY-", params2.f296942a, z0Var.d, items);
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        y0 params3 = (y0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot2 = z0Var.f296947a.troubleshoot(new cg0.h0(params3.f296942a, "TRANSACTION", null, params3.f296943b));
                        r rVar2 = new r(i592, new v0(z0Var, i212));
                        d0VarTroubleshoot2.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarTroubleshoot2, rVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 11:
                        y0 params4 = (y0) obj2;
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        ehe.n.z("TRANSACTION_TROUBLESHOOT_KEY-", params4.f296942a, z0Var.d, items2);
                        return Unit.f186387a;
                    case 12:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        ig0.a params5 = (ig0.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        TroubleshooterService troubleshooterService2 = z0Var.f296947a;
                        String str = params5.f161066a;
                        String str2 = params5.f161067b;
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && params5.f161068c) {
                            bool = Boolean.TRUE;
                        }
                        efm.d0<List<cg0.l0>> d0VarTroubleshoot3 = troubleshooterService2.troubleshoot(new cg0.h0(str, "UPCOMING_PAYMENT", str2, bool));
                        r rVar3 = new r(12, new v0(z0Var, 4));
                        d0VarTroubleshoot3.getClass();
                        ufm.i iVar7 = new ufm.i(d0VarTroubleshoot3, rVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 13:
                        ig0.a params6 = (ig0.a) obj2;
                        List items3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(items3, "items");
                        ehe.n.z("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f161067b, "-", params6.f161066a), z0Var.d, items3);
                        return Unit.f186387a;
                    case 14:
                        List response5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        z0Var.d.f("CARDS_TROUBLESHOOTER_KEY", response5);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        ufm.i iVar8 = new ufm.i(z0Var.f296948b.b(), new r(25, new v0(z0Var, 18)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "flatMap(...)");
                        return iVar8;
                    case 16:
                        List response6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response6, "response");
                        z0Var.d.f("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY", response6);
                        return Unit.f186387a;
                    case 17:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ufm.i iVar9 = new ufm.i(z0Var.f296948b.b(), new r(24, new v0(z0Var, 17)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "flatMap(...)");
                        return iVar9;
                    case 18:
                        List response7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(response7, "response");
                        z0Var.d.f("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY", response7);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        ufm.i iVar10 = new ufm.i(z0Var.f296948b.b(), new r(22, new v0(z0Var, 6)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "flatMap(...)");
                        return iVar10;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public static final List a(z0 z0Var, cg0.j0 j0Var) {
        ArrayList arrayList;
        z0Var.getClass();
        List actions = j0Var.getActions();
        if (actions != null) {
            List list = actions;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(bg0.a.d((cg0.i0) it8.next()));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? zhm.f0.f322471a : arrayList;
    }

    public static LinkedHashMap b(zf0.c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("X-User-Country", cVar.f321832a.f297794a);
        String str = cVar.f321834c;
        if (str.length() > 0) {
            linkedHashMap.put("If-Modified-Since", str);
        }
        return linkedHashMap;
    }
}
