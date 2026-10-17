package v0k;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.DrawerKt;
import androidx.compose.material.DrawerValue;
import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.room.EmptyResultSetException;
import com.revolut.data.database.models.beneficiary.BeneficiaryEntity;
import com.revolut.data.database.models.beneficiary.mapper.BeneficiaryEntityMapperKt;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.compliance_popup.InsightsComplianceBottomSheetScreen;
import com.revolut.retail.feature.marketnews.api.delegate.WealthTopStoriesContract$TopStoriesParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m20.n;
import qv0.p;
import v17.k;
import v20.l;
import v20.p2;
import v30.j;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284922a;

    public /* synthetic */ g(int i) {
        this.f284922a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f284922a) {
            case 0:
                p it8 = (p) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object f51698j = it8.getE();
                if (f51698j instanceof WealthTopStoriesContract$TopStoriesParcel) {
                    return (WealthTopStoriesContract$TopStoriesParcel) f51698j;
                }
                return null;
            case 1:
                return ButtonKt.Button$lambda$2$0((SemanticsPropertyReceiver) obj2);
            case 2:
                return Boolean.valueOf(DrawerKt.rememberDrawerState$lambda$0$0((DrawerValue) obj2));
            case 3:
                return FloatingActionButtonKt.FloatingActionButton_bogVsAg$lambda$1$0((SemanticsPropertyReceiver) obj2);
            case 4:
                return ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$3$0((KeyframesSpec.KeyframesSpecConfig) obj2);
            case 5:
                return ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$5$0((KeyframesSpec.KeyframesSpecConfig) obj2);
            case 6:
                return SurfaceKt.Surface_F_jzlyU$lambda$0$0$0((SemanticsPropertyReceiver) obj2);
            case 7:
                return TextKt.Text_IbK3jfQ$lambda$0$0((TextLayoutResult) obj2);
            case 8:
                return TextKt.Text_fLXpl1I$lambda$0$0((TextLayoutResult) obj2);
            case 9:
                List beneficiaryEntities = (List) obj2;
                Intrinsics.checkNotNullParameter(beneficiaryEntities, "beneficiaryEntities");
                List list = beneficiaryEntities;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList.add(BeneficiaryEntityMapperKt.toDomain((BeneficiaryEntity) it9.next()));
                }
                return arrayList;
            case 10:
                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
                Intrinsics.checkNotNullParameter(updateFilter, "$this$updateFilter");
                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter, null, null, null, null, null, null, null, 239);
            case 11:
                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter2 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
                Intrinsics.checkNotNullParameter(updateFilter2, "$this$updateFilter");
                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter2, null, null, null, null, null, null, null, 159);
            case 12:
                k updateState = (k) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return k.a(updateState, null, null, 31);
            case 13:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 14:
                ty0.a it10 = (ty0.a) obj2;
                int i = InsightsComplianceBottomSheetScreen.U;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.d;
            case 15:
                v1g.e update = (v1g.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return v1g.e.a(update, h0.f322473a, null, 2);
            case 16:
                myf.k it11 = (myf.k) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f210476a;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 18:
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                return null;
            case 19:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return zi0.c.P(d0.d0(it12), false, null, 3);
            case 20:
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new Data(null, it13, false, 5, null);
            case 21:
                m20.d it14 = (m20.d) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new p2(it14.getSupportLanguage(), it14.getActive());
            case 22:
                Throwable it15 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new Data(null, it15, false, 5, null);
            case 23:
                r20.h it16 = (r20.h) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16 instanceof r20.f);
            case 24:
                g20.b it17 = (g20.b) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Integer.valueOf(it17.getUnread());
            case 25:
                g20.a client = (g20.a) obj2;
                Intrinsics.checkNotNullParameter(client, "it");
                Intrinsics.checkNotNullParameter(client, "client");
                return new l(client.getVoiceBotEnabled());
            case 26:
                List it18 = (List) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return zi0.c.P(it18, false, null, 3);
            case 27:
                n it19 = (n) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return u.c(it19);
            case 28:
                List it20 = (List) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                j jVar = (j) d0.d0(it20);
                if (jVar != null) {
                    return jVar;
                }
                throw new IllegalStateException("Chat enrichment failed to return a result for a single ticket.");
            default:
                Throwable th10 = (Throwable) obj2;
                if (!(th10 instanceof EmptyResultSetException)) {
                    Intrinsics.h(th10);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ g(v20.f0 f0Var) {
        this.f284922a = 25;
    }
}
