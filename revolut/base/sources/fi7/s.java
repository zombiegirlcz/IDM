package fi7;

import com.revolut.feature.backend_flow.domain.models.BackendEntityItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.EntityType;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import le.u1;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.q implements Function2 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f) {
            case 0:
                Function1 p0 = (Function1) obj2;
                Function2 p17 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return ((com.revolut.feature.instruments.trend.collections.impl.ui.collection.a) this.receiver).n2(p17, p0);
            case 1:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Throwable th10 = (Throwable) obj3;
                fsk.d dVar = ((fsk.g) this.receiver).k;
                if (!zBooleanValue) {
                    return th10 != null ? dVar.b() : dVar.a();
                }
                dVar.getClass();
                return i2b.a.o(i2b.a.o(fsk.d.e(0, 3), fsk.d.e(1, 1)), fsk.d.e(2, 3));
            case 2:
                Function1 p03 = (Function1) obj2;
                Function2 p110 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p110, "p1");
                return ((com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) this.receiver).n2(p110, p03);
            case 3:
                fb0.a p010 = (fb0.a) obj2;
                w4l.k loadingStrategy = (w4l.k) obj3;
                Intrinsics.checkNotNullParameter(p010, "p0");
                Intrinsics.checkNotNullParameter(loadingStrategy, "p1");
                gb0.f fVar = (gb0.f) this.receiver;
                db0.a aVar = fVar.f142208l;
                long j2 = p010.f133424a;
                String str = p010.f133425b;
                fc0.a mode = p010.f133426c;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                fc0.f fVar2 = aVar.f112639c;
                BackendFlow backendFlow = aVar.f112637a;
                String formId = backendFlow.f63264b;
                BackendEntityItem backendEntityItem = aVar.f112638b;
                String itemId = backendEntityItem.getId();
                Map queries = backendFlow.f63267h;
                EntityType entityType = backendEntityItem.getF63424b();
                Intrinsics.checkNotNullParameter(formId, "formId");
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                Intrinsics.checkNotNullParameter(queries, "queries");
                Intrinsics.checkNotNullParameter(entityType, "entityType");
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return new g0c.e(fVar2.d(fVar2.a(formId, itemId, queries, j2, str, mode, loadingStrategy), entityType, loadingStrategy), fVar, p010, 17);
            case 4:
                Function1 p011 = (Function1) obj2;
                Function2 p111 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p011, "p0");
                Intrinsics.checkNotNullParameter(p111, "p1");
                return ((gmh.h) this.receiver).n2(p111, p011);
            case 5:
                ((Function1) this.receiver).invoke((zz1.e) obj2);
                return Unit.f186387a;
            case 6:
                ((Function1) this.receiver).invoke((zz1.e) obj2);
                return Unit.f186387a;
            case 7:
                Function1 p012 = (Function1) obj2;
                Function2 p112 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p012, "p0");
                Intrinsics.checkNotNullParameter(p112, "p1");
                return ((com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.receiver).l2(p112, p012);
            case 8:
                Function1 p013 = (Function1) obj2;
                Function2 p113 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p013, "p0");
                Intrinsics.checkNotNullParameter(p113, "p1");
                return ((com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.receiver).l2(p113, p013);
            case 9:
                Function1 p014 = (Function1) obj2;
                Function2 p114 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p014, "p0");
                Intrinsics.checkNotNullParameter(p114, "p1");
                return ((com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.receiver).l2(p114, p014);
            case 10:
                Function1 p015 = (Function1) obj2;
                Function2 p115 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p015, "p0");
                Intrinsics.checkNotNullParameter(p115, "p1");
                return ((com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.receiver).l2(p115, p015);
            case 11:
                Function1 p016 = (Function1) obj2;
                Function2 p116 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p016, "p0");
                Intrinsics.checkNotNullParameter(p116, "p1");
                return ((com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.receiver).l2(p116, p016);
            case 12:
                Function1 p017 = (Function1) obj2;
                Function2 p117 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p017, "p0");
                Intrinsics.checkNotNullParameter(p117, "p1");
                return ((com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.receiver).l2(p117, p017);
            case 13:
                KotlinType p018 = (KotlinType) obj2;
                KotlinType p118 = (KotlinType) obj3;
                Intrinsics.checkNotNullParameter(p018, "p0");
                Intrinsics.checkNotNullParameter(p118, "p1");
                return Boolean.valueOf(TypeIntersector.access$isStrictSupertype((TypeIntersector) this.receiver, p018, p118));
            case 14:
                KotlinType p019 = (KotlinType) obj2;
                KotlinType p119 = (KotlinType) obj3;
                Intrinsics.checkNotNullParameter(p019, "p0");
                Intrinsics.checkNotNullParameter(p119, "p1");
                return Boolean.valueOf(((NewKotlinTypeCheckerImpl) this.receiver).equalTypes(p019, p119));
            case 15:
                return ((MutableSharedFlow) this.receiver).emit((zth.a) obj2, (Continuation) obj3);
            case 16:
                rzj.c scope = (rzj.c) obj2;
                List scopedSymbols = (List) obj3;
                Intrinsics.checkNotNullParameter(scope, "p0");
                Intrinsics.checkNotNullParameter(scopedSymbols, "p1");
                wzj.b bVar = (wzj.b) ((vzj.a) this.receiver);
                bVar.getClass();
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(scopedSymbols, "scopedSymbols");
                ne0.d dVar2 = bVar.f301427a;
                wzj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(scope, "<this>");
                dVar2.f(u1.g(scope, wzj.b.f301426b), scopedSymbols);
                return Unit.f186387a;
            case 17:
                ((Function1) this.receiver).invoke(obj2);
                return Unit.f186387a;
            case 18:
                Function1 p020 = (Function1) obj2;
                Function2 p120 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p020, "p0");
                Intrinsics.checkNotNullParameter(p120, "p1");
                return ((com.revolut.feature.credit.application.plugins.impl.ui.spinner.a) this.receiver).n2(p120, p020);
            case 19:
                Function1 p021 = (Function1) obj2;
                Function2 p121 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p021, "p0");
                Intrinsics.checkNotNullParameter(p121, "p1");
                return ((com.revolut.feature.credit.application.plugins.impl.ui.spinner.b) this.receiver).l2(p121, p021);
            case 20:
                Function1 p022 = (Function1) obj2;
                Function2 p122 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p022, "p0");
                Intrinsics.checkNotNullParameter(p122, "p1");
                return ((com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a) this.receiver).n2(p122, p022);
            case 21:
                Function1 p023 = (Function1) obj2;
                Function2 p123 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p023, "p0");
                Intrinsics.checkNotNullParameter(p123, "p1");
                return ((com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a) this.receiver).n2(p123, p023);
            case 22:
                Function1 p024 = (Function1) obj2;
                Function2 p124 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p024, "p0");
                Intrinsics.checkNotNullParameter(p124, "p1");
                return ((com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a) this.receiver).n2(p124, p024);
            case 23:
                Function1 p025 = (Function1) obj2;
                Function2 p125 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p025, "p0");
                Intrinsics.checkNotNullParameter(p125, "p1");
                return ((com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a) this.receiver).n2(p125, p025);
            case 24:
                Function1 p026 = (Function1) obj2;
                Function2 p126 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p026, "p0");
                Intrinsics.checkNotNullParameter(p126, "p1");
                return ((com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a) this.receiver).n2(p126, p026);
            case 25:
                Function1 p027 = (Function1) obj2;
                Function2 p127 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p027, "p0");
                Intrinsics.checkNotNullParameter(p127, "p1");
                return ((com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a) this.receiver).n2(p127, p027);
            case 26:
                Function1 p028 = (Function1) obj2;
                Function2 p128 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p028, "p0");
                Intrinsics.checkNotNullParameter(p128, "p1");
                return ((com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c) this.receiver).T2(p128, p028);
            case 27:
                Function1 p029 = (Function1) obj2;
                Function2 p129 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p029, "p0");
                Intrinsics.checkNotNullParameter(p129, "p1");
                return ((com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c) this.receiver).T2(p129, p029);
            case 28:
                Function1 p030 = (Function1) obj2;
                Function2 p130 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p030, "p0");
                Intrinsics.checkNotNullParameter(p130, "p1");
                return ((com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a) this.receiver).n2(p130, p030);
            default:
                Function1 p031 = (Function1) obj2;
                Function2 p131 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(p031, "p0");
                Intrinsics.checkNotNullParameter(p131, "p1");
                return ((com.revolut.feature.wealth_discovery.impl.screener.screens.all_assets_list.a) this.receiver).n2(p131, p031);
        }
    }
}
