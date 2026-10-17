package s1c;

import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import cd7.m;
import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;
import com.revolut.feature.credit.health.api.widget.CreditHealthWidgetContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.home_feed.api.widget.NetworthWidgetContext;
import com.revolut.feature.home_feed.api.widget.VaultWidgetContext;
import com.revolut.feature.home_feed.impl.widgets.cards.CardsWidgetContext;
import com.revolut.feature.home_feed.impl.widgets.scheduled_payments.ScheduledPaymentsEntryPoint;
import com.revolut.feature.home_feed.impl.widgets.scheduled_payments.ScheduledPaymentsWidgetContext;
import com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext;
import com.revolut.feature.separate_favourites.api.widget.FavouritesWidgetContext;
import com.revolut.feature.spending_analytics.api.widget.SpendingWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.esim.api.widgets.EsimWidgetContext;
import efm.g;
import efm.r;
import efm.w;
import efm.x;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kfm.o;
import kotlin.jvm.internal.Intrinsics;
import m1c.q;
import sa6.i0;
import tc7.p;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements o, HlsPlaylistTracker.Factory, x, g, LoudnessCodecController.LoudnessParameterUpdateListener, bsh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259130a;

    public /* synthetic */ d(int i) {
        this.f259130a = i;
    }

    @Override // efm.x
    public w apply(r upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return upstream;
    }

    @Override // bsh.a
    public WidgetContext b(WidgetContext widgetContext) {
        switch (this.f259130a) {
            case 11:
                HomeFeedWidgetContext.CreditCard context = (HomeFeedWidgetContext.CreditCard) widgetContext;
                Set set = tc7.b.f269578a;
                Intrinsics.checkNotNullParameter(context, "context");
                return new NetworthWidgetContext(context.getContextKey(), new NetworthWidgetContext.Type.CreditCard(context.getCreditCardFacilityId()));
            case 12:
                HomeFeedWidgetContext.CreditCard context2 = (HomeFeedWidgetContext.CreditCard) widgetContext;
                Set set2 = tc7.b.f269578a;
                Intrinsics.checkNotNullParameter(context2, "context");
                return new CreditCardWidgetContext(context2.getContextKey(), context2.getCreditCardFacilityId());
            case 13:
                HomeFeedWidgetContext.CreditCard context3 = (HomeFeedWidgetContext.CreditCard) widgetContext;
                Set set3 = tc7.b.f269578a;
                Intrinsics.checkNotNullParameter(context3, "context");
                HomeFeedWidgetContext.Personal.INSTANCE.getClass();
                return HomeFeedWidgetContext.Personal.Companion.a().copy(context3.getContextKey());
            case 14:
                HomeFeedWidgetContext.CreditCard context4 = (HomeFeedWidgetContext.CreditCard) widgetContext;
                Set set4 = tc7.b.f269578a;
                Intrinsics.checkNotNullParameter(context4, "context");
                return new FavouritesWidgetContext(context4.getContextKey());
            case 15:
                HomeFeedWidgetContext.CreditCard context5 = (HomeFeedWidgetContext.CreditCard) widgetContext;
                Set set5 = tc7.b.f269578a;
                Intrinsics.checkNotNullParameter(context5, "context");
                return new SpendingWidgetContext(context5.getContextKey(), new SpendingWidgetContext.AccountType.CreditCard(context5.getCreditCardFacilityId()));
            case 16:
                HomeFeedWidgetContext.CreditCard context6 = (HomeFeedWidgetContext.CreditCard) widgetContext;
                Set set6 = tc7.b.f269578a;
                Intrinsics.checkNotNullParameter(context6, "context");
                return new CardsWidgetContext(context6.getContextKey(), b93.d.CREDIT);
            case 17:
                HomeFeedWidgetContext.CreditCard context7 = (HomeFeedWidgetContext.CreditCard) widgetContext;
                Set set7 = tc7.b.f269578a;
                Intrinsics.checkNotNullParameter(context7, "context");
                return new ScheduledPaymentsWidgetContext(context7.getContextKey(), m.Personal, new ScheduledPaymentsEntryPoint.CreditCard(context7.getCreditCardFacilityId()));
            case 18:
                HomeFeedWidgetContext.CreditCard context8 = (HomeFeedWidgetContext.CreditCard) widgetContext;
                Set set8 = tc7.b.f269578a;
                Intrinsics.checkNotNullParameter(context8, "context");
                return new EsimWidgetContext(context8.getContextKey());
            case 19:
                HomeFeedWidgetContext.CreditCard context9 = (HomeFeedWidgetContext.CreditCard) widgetContext;
                Set set9 = tc7.b.f269578a;
                Intrinsics.checkNotNullParameter(context9, "context");
                return new RevPointsRimWidgetContext.CreditCardTab(context9.getContextKey());
            case 20:
                HomeFeedWidgetContext.CreditCard context10 = (HomeFeedWidgetContext.CreditCard) widgetContext;
                Set set10 = tc7.b.f269578a;
                Intrinsics.checkNotNullParameter(context10, "context");
                return new CreditHealthWidgetContext(context10.getContextKey());
            case 21:
                HomeFeedWidgetContext.GroupPocket personalPocketContext = (HomeFeedWidgetContext.GroupPocket) widgetContext;
                Intrinsics.checkNotNullParameter(personalPocketContext, "personalPocketContext");
                return new VaultWidgetContext(personalPocketContext.getContextKey(), new VaultWidgetContext.Type.Pockets(personalPocketContext.getSubaccountId()));
            case 22:
                HomeFeedWidgetContext.GroupPocket groupPocketContext = (HomeFeedWidgetContext.GroupPocket) widgetContext;
                Intrinsics.checkNotNullParameter(groupPocketContext, "groupPocketContext");
                return new NetworthWidgetContext(groupPocketContext.getContextKey(), new NetworthWidgetContext.Type.GroupPocket(groupPocketContext.getSubaccountId()));
            case 23:
                HomeFeedWidgetContext.JointPocket jointPocketContext = (HomeFeedWidgetContext.JointPocket) widgetContext;
                Intrinsics.checkNotNullParameter(jointPocketContext, "jointPocketContext");
                HomeFeedWidgetContext.PersonalPocket.Companion companion = HomeFeedWidgetContext.PersonalPocket.INSTANCE;
                String subaccountId = jointPocketContext.getSubaccountId();
                companion.getClass();
                return HomeFeedWidgetContext.PersonalPocket.Companion.a(subaccountId);
            case 24:
                HomeFeedWidgetContext.JointPocket jointPocketContext2 = (HomeFeedWidgetContext.JointPocket) widgetContext;
                Intrinsics.checkNotNullParameter(jointPocketContext2, "jointPocketContext");
                return new VaultWidgetContext(jointPocketContext2.getContextKey(), new VaultWidgetContext.Type.JointPockets(jointPocketContext2.getSubaccountId()));
            case 25:
                HomeFeedWidgetContext.JointPocket jointPocketContext3 = (HomeFeedWidgetContext.JointPocket) widgetContext;
                Intrinsics.checkNotNullParameter(jointPocketContext3, "jointPocketContext");
                return new NetworthWidgetContext(jointPocketContext3.getContextKey(), new NetworthWidgetContext.Type.JointPocket(jointPocketContext3.getSubaccountId()));
            case 26:
                HomeFeedWidgetContext.JointSavings jointSavingsContext = (HomeFeedWidgetContext.JointSavings) widgetContext;
                Set set11 = tc7.m.f269753a;
                Intrinsics.checkNotNullParameter(jointSavingsContext, "jointSavingsContext");
                HomeFeedWidgetContext.Savings.Companion companion2 = HomeFeedWidgetContext.Savings.INSTANCE;
                HomeFeedWidgetContext.Savings.Type.Joint joint = new HomeFeedWidgetContext.Savings.Type.Joint(jointSavingsContext.getAccountId());
                companion2.getClass();
                return HomeFeedWidgetContext.Savings.copy$default(HomeFeedWidgetContext.Savings.Companion.a(joint), jointSavingsContext.getContextKey(), null, 2, null);
            case 27:
                HomeFeedWidgetContext.JointSavings jointSavingsContext2 = (HomeFeedWidgetContext.JointSavings) widgetContext;
                Set set12 = tc7.m.f269753a;
                Intrinsics.checkNotNullParameter(jointSavingsContext2, "jointSavingsContext");
                return new VaultWidgetContext(jointSavingsContext2.getContextKey(), new VaultWidgetContext.Type.JointSavings(jointSavingsContext2.getAccountId()));
            case 28:
                HomeFeedWidgetContext.JointSavings jointSavingsContext3 = (HomeFeedWidgetContext.JointSavings) widgetContext;
                Set set13 = tc7.m.f269753a;
                Intrinsics.checkNotNullParameter(jointSavingsContext3, "jointSavingsContext");
                return new NetworthWidgetContext(jointSavingsContext3.getContextKey(), new NetworthWidgetContext.Type.JointSavings(jointSavingsContext3.getAccountId()));
            default:
                HomeFeedWidgetContext.JointCurrency jointContext = (HomeFeedWidgetContext.JointCurrency) widgetContext;
                Set set14 = p.f269758a;
                Intrinsics.checkNotNullParameter(jointContext, "jointContext");
                return new NetworthWidgetContext(jointContext.getContextKey(), NetworthWidgetContext.Type.Joint.f74710a);
        }
    }

    @Override // efm.g
    public efm.f d(efm.b upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return new pfm.a(upstream, mfm.f.f205044g, 1);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f259130a) {
            case 0:
                Throwable throwable = (Throwable) p0;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                return new q(null);
            case 1:
                s2i.g gVar = s2i.g.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) gVar.invoke(p0);
            case 2:
                s33.d dVar = s33.d.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (d13.a) dVar.invoke(p0);
            case 3:
            case 5:
            case 6:
            case 8:
            default:
                return new h93.m(null, false);
            case 4:
                i0 i0Var = i0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) i0Var.invoke(p0);
            case 7:
                Throwable it8 = (Throwable) p0;
                Intrinsics.checkNotNullParameter(it8, "it");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var2);
                return r0.g();
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) p0, "it");
                return Boolean.TRUE;
        }
    }
}
