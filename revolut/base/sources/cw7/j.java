package cw7;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit_core.displayers.image.models.ShimmerImage;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.payments.recipients.settings.impl.data.GsonHolder;
import com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig;
import com.revolut.feature.selfserve.sow.impl.ui.stories.SowRemoteStoriesKey;
import com.revolut.feature.staking.api.model.StakingAvailability;
import com.revolut.feature.staking.api.model.StakingInfo;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutTopupScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$State;
import cxe.q;
import do3.n;
import h93.f0;
import h93.o;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.y;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import tof.a3;
import yhm.r;
import zhm.a0;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109566a;

    public /* synthetic */ j(int i) {
        this.f109566a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dy9.c cVar;
        List list;
        StakingInfo stakingInfo;
        bVar = null;
        vtd.b bVar = null;
        Object next = null;
        switch (this.f109566a) {
            case 0:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new h(ShimmerImage.f60002a, null, (List) getDefaultLoadingItems.invoke());
            case 1:
                e7l.f it8 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair(Boolean.valueOf(it8.f123367d1), Boolean.valueOf(it8.f123369e1));
            case 2:
                e7l.f it9 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(it9.f123369e1);
            case 3:
                e7l.f it10 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10.f123370f1);
            case 4:
                e7l.f it11 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11.f123367d1);
            case 5:
                Intrinsics.checkNotNullParameter((UserOnboardingFlowContract$State) obj2, "$this$update");
                return com.revolut.retail.feature.impl.userauth.flow.f.L2();
            case 6:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list2 = (List) rVar.f314201a;
                List list3 = (List) rVar.f314202b;
                e7l.f fVar = (e7l.f) rVar.f314203c;
                dj0.d dVar = fVar.f123392s0;
                Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
                dj0.d dVar2 = fVar.f123395t0;
                Long lValueOf2 = dVar2 != null ? Long.valueOf(dVar2.f115082a) : null;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    f0 f0Var = (f0) obj3;
                    if (lValueOf != null && lValueOf2 != null) {
                        List list4 = list3;
                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                            Iterator it12 = list4.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    o oVar = (o) it12.next();
                                    long j2 = oVar.f150158b.f150154a.f115082a;
                                    if (Intrinsics.f(oVar.f150157a, f0Var.f150110a) && j2 > lValueOf2.longValue() && j2 <= lValueOf.longValue()) {
                                        arrayList.add(obj3);
                                    }
                                }
                            }
                        }
                    }
                }
                return arrayList;
            case 7:
                cxe.b observeDistinctDomainState = (cxe.b) obj2;
                Intrinsics.checkNotNullParameter(observeDistinctDomainState, "$this$observeDistinctDomainState");
                return new Pair(observeDistinctDomainState.k, observeDistinctDomainState.f109925j);
            case 8:
                cxe.b observeDistinctDomainState2 = (cxe.b) obj2;
                Intrinsics.checkNotNullParameter(observeDistinctDomainState2, "$this$observeDistinctDomainState");
                jxe.l lVar = observeDistinctDomainState2.i;
                return new Pair(pyd.c.M(lVar != null ? lVar.a() : null), observeDistinctDomainState2.f109925j);
            case 9:
                return cxe.e.a((cxe.e) obj2, null, true, 1);
            case 10:
                return cxe.e.a((cxe.e) obj2, null, false, 1);
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listK = v.k(new s7("LOADING_CELL_ITEM_ID_1", 0, 0, 0, 0, false, null, 126), new s7("LOADING_CELL_ITEM_ID_2", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return new q(listK, null, null, null);
            case 12:
                y it13 = (y) obj2;
                KProperty[] kPropertyArr = CheckoutTopupScreen.Y;
                Intrinsics.checkNotNullParameter(it13, "it");
                Object obj4 = it13.f167226b.f58324n;
                if (obj4 instanceof cxe.h) {
                    return (cxe.h) obj4;
                }
                return null;
            case 13:
                cxi.d update = (cxi.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return cxi.d.a(update, update.f109986a + 1);
            case 14:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM spin_contacts").step();
                    return null;
                } finally {
                }
            case 15:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM recipient_settings");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "settings");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        if (text2 != null) {
                            kg.o oVarA = GsonHolder.a();
                            Type type = new TypeToken<dy9.c>() { // from class: com.revolut.feature.payments.recipients.settings.impl.data.db.RecipientSettingTypeTypeConverter$fromJson$lambda$0$$inlined$fromJson$1
                            }.getType();
                            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                            Object objD = oVarA.d(text2, type);
                            Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                            cVar = (dy9.c) objD;
                        } else {
                            cVar = null;
                        }
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        if (text3 != null) {
                            kg.o oVarA2 = GsonHolder.a();
                            Type type2 = new TypeToken<List<? extends dy9.a>>() { // from class: com.revolut.feature.payments.recipients.settings.impl.data.db.RecipientSettingTypeConverter$fromJson$lambda$0$$inlined$fromJson$1
                            }.getType();
                            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                            Object objD2 = oVarA2.d(text3, type2);
                            Intrinsics.checkNotNullExpressionValue(objD2, "fromJson(...)");
                            list = (List) objD2;
                        } else {
                            list = null;
                        }
                        arrayList2.add(new dy9.b(text, cVar, list));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 16:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM recipient_settings").step();
                    return null;
                } finally {
                }
            case 17:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return new cyc.f((List) getDefaultLoadingItems2.invoke());
            case 18:
                cyc.e update2 = (cyc.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data data = Data.copy$default(update2.f110081a, null, null, true, 3, null);
                Intrinsics.checkNotNullParameter(data, "data");
                return new cyc.e(data);
            case 19:
                n profile = (n) obj2;
                Intrinsics.checkNotNullParameter(profile, "profile");
                Address address = profile.k;
                String country = address != null ? address.getCountry() : null;
                wi0.b.Companion.getClass();
                return Boolean.valueOf(Intrinsics.f(country, "US"));
            case 20:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return (a3) d0.d0(it14);
            case 21:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(nb0.b(pb0.Companion, a0.d.n("widgetised-analytics-pnl-contributor-", i), false, 0, false, 30));
                }
                return arrayListP;
            case 22:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                ArrayList arrayList3 = new ArrayList();
                Iterator it16 = it15.iterator();
                while (it16.hasNext()) {
                    a0.x(((k1j.b) it16.next()).f180284c, arrayList3);
                }
                return arrayList3;
            case 23:
                List pocketsWithBalance = (List) obj2;
                Intrinsics.checkNotNullParameter(pocketsWithBalance, "pocketsWithBalance");
                Iterator it17 = pocketsWithBalance.iterator();
                if (it17.hasNext()) {
                    next = it17.next();
                    if (it17.hasNext()) {
                        dj0.d dVar3 = ((io3.g) next).f163164b;
                        long j3 = dVar3 != null ? dVar3.f115082a : 0L;
                        do {
                            Object next2 = it17.next();
                            dj0.d dVar4 = ((io3.g) next2).f163164b;
                            long j5 = dVar4 != null ? dVar4.f115082a : 0L;
                            if (j3 < j5) {
                                next = next2;
                                j3 = j5;
                            }
                        } while (it17.hasNext());
                    }
                }
                return (io3.g) next;
            case 24:
                StakingAvailability it18 = (StakingAvailability) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                StakingProduct stakingProduct = it18.f88058a;
                if (stakingProduct != null && (stakingInfo = stakingProduct.f88087b) != null) {
                    bVar = stakingInfo.k;
                }
                return Boolean.valueOf(bVar == vtd.b.MANUAL);
            case 25:
                StakingAvailability it19 = (StakingAvailability) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f88059b;
            case 26:
                n it20 = (n) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                Address address2 = it20.k;
                String city = address2 != null ? address2.getCity() : null;
                return city == null ? "" : city;
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                m70.a.c(t0.f186434a);
                return "";
            case 28:
                Boolean shouldShowStories = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(shouldShowStories, "shouldShowStories");
                shouldShowStories.booleanValue();
                return shouldShowStories;
            default:
                SowRemoteStoriesKey it21 = (SowRemoteStoriesKey) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new FeatureCommand(new RemoteStoriesFeatureConfig.Key(it21, null, new FinishCommand(null, null, null, 7), sza.a.ON_FIRST_PAGE_SHOWN, new FinishCommand(null, null, null, 7), null, 10006, 7626));
        }
    }

    public /* synthetic */ j(Object obj2, int i) {
        this.f109566a = i;
    }
}
