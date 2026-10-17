package foa;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingsDetails;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.text.d0;
import skm.e0;
import skm.p0;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function1 {
    public NotificationSettingsDetails u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a f136868w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f136869x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a aVar, RowDelegate.Model model, Continuation continuation) {
        super(1, continuation);
        this.f136868w = aVar;
        this.f136869x = model;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f136868w, this.f136869x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        soa.c cVar;
        Object objA;
        NotificationSettingsDetails notificationSettingsDetails;
        com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a aVar = this.f136868w;
        cli.y yVar = aVar.f81473w;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            NotificationSettingsDetails notificationSettingsDetails2 = ((a) ((j2) yVar.f22677a).getValue()).f136860a;
            String str = this.f136869x.f53228a;
            NotificationSettingsDetails notificationSettingsDetailsA = d0.J(str, "_push", false) ? NotificationSettingsDetails.a(notificationSettingsDetails2, !notificationSettingsDetails2.f81463b, false, null, null, null, null, null, null, 1021) : d0.J(str, "_email", false) ? NotificationSettingsDetails.a(notificationSettingsDetails2, false, !notificationSettingsDetails2.f81464c, null, null, null, null, null, null, 1019) : d0.J(str, "_phone", false) ? NotificationSettingsDetails.a(notificationSettingsDetails2, false, false, null, null, null, Boolean.valueOf(!pd.b.j(notificationSettingsDetails2.f81466h)), null, null, 895) : d0.J(str, "_inApp", false) ? NotificationSettingsDetails.a(notificationSettingsDetails2, false, false, null, null, null, null, Boolean.valueOf(!pd.b.j(notificationSettingsDetails2.i)), null, 767) : d0.J(str, "_sms", false) ? NotificationSettingsDetails.a(notificationSettingsDetails2, false, false, Boolean.valueOf(!pd.b.j(notificationSettingsDetails2.d)), null, null, null, null, null, 1015) : d0.J(str, "_whatsapp", false) ? NotificationSettingsDetails.a(notificationSettingsDetails2, false, false, null, Boolean.valueOf(!pd.b.j(notificationSettingsDetails2.e)), null, null, null, null, 1007) : d0.J(str, "_ivr", false) ? NotificationSettingsDetails.a(notificationSettingsDetails2, false, false, null, null, Boolean.valueOf(!pd.b.j(notificationSettingsDetails2.f)), null, null, null, 991) : d0.J(str, "_aiProactiveInsights", false) ? NotificationSettingsDetails.a(notificationSettingsDetails2, false, false, null, null, null, null, null, Boolean.valueOf(!pd.b.j(notificationSettingsDetails2.f81467j)), 511) : notificationSettingsDetails2;
            r10.w wVar = aVar.f81470r;
            this.u = notificationSettingsDetailsA;
            this.v = 1;
            wVar.getClass();
            z zVar = notificationSettingsDetailsA.f81462a;
            Boolean bool = notificationSettingsDetailsA.f;
            Boolean bool2 = notificationSettingsDetailsA.e;
            Boolean bool3 = notificationSettingsDetailsA.f81466h;
            Boolean bool4 = notificationSettingsDetailsA.i;
            Boolean bool5 = notificationSettingsDetailsA.d;
            int[] iArr = v.f136882a;
            if (iArr[zVar.ordinal()] == 1) {
                pp3.b bVar = (pp3.b) wVar.f250866b;
                Boolean bool6 = notificationSettingsDetailsA.f81467j;
                Boolean bool7 = notificationSettingsDetailsA.f81465g;
                if (bool4 != null || bool7 != null || bool6 != null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Unexpected state: inApp=" + bool4 + ", aiCalls=" + bool7 + ", aiProactiveInsights=" + bool6 + " for CREDIT_COLLECTION");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                cn0.d dVar = new cn0.d(((a25.a) bVar).f665a, new pp3.a(notificationSettingsDetailsA.f81463b, notificationSettingsDetailsA.f81464c, r10.w.u("sms", bool5), r10.w.u("phone", bool3), r10.w.u("whatsapp", bool2), r10.w.u("ivr", bool)), (Continuation) null, 6);
                p0 p0Var = p0.f264001a;
                objA = e0.J(elm.f.f127540b, dVar, this);
                if (objA != obj3) {
                    objA = Unit.f186387a;
                }
                if (objA != obj3) {
                    objA = Unit.f186387a;
                }
                if (objA != obj3) {
                    objA = Unit.f186387a;
                }
            } else {
                toa.a aVar2 = (toa.a) wVar.f250865a;
                z zVar2 = notificationSettingsDetailsA.f81462a;
                if (bool5 != null || bool3 != null || bool2 != null || bool != null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected state: sms=" + bool5 + ", phone:" + bool3 + ", whatsapp:" + bool2 + ", ivr:" + bool + " for " + zVar2);
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                }
                switch (iArr[zVar2.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("CREDIT_COLLECTION uses separate API");
                    case 2:
                        cVar = soa.c.MARKETING;
                        break;
                    case 3:
                        cVar = soa.c.REVOLUT_X_MARKETING;
                        break;
                    case 4:
                        cVar = soa.c.PERSONALIZED_THIRD_PARTY;
                        break;
                    case 5:
                        cVar = soa.c.TRADING_STOCKS_VOLATILITY;
                        break;
                    case 6:
                        cVar = soa.c.COMMODITY_VOLATILITY;
                        break;
                    case 7:
                        cVar = soa.c.CRYPTOCURRENCY_VOLATILITY;
                        break;
                    case 8:
                        cVar = soa.c.REVOLUT_PAY_DELIVERY_TRACKING;
                        break;
                    case 9:
                        cVar = soa.c.REVOLUT_PAY_FLIGHT_TRACKING;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                objA = nim.a.a(aVar2.a(new soa.b(cVar, notificationSettingsDetailsA.f81464c, notificationSettingsDetailsA.f81463b, notificationSettingsDetailsA.f81465g, notificationSettingsDetailsA.i, notificationSettingsDetailsA.f81467j)), this);
                if (objA != obj3) {
                    objA = Unit.f186387a;
                }
            }
            if (objA == obj3) {
                return obj3;
            }
            notificationSettingsDetails = notificationSettingsDetailsA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            notificationSettingsDetails = this.u;
            yhm.o.b(obj2);
        }
        aVar.H2(yVar, new fjd.w(notificationSettingsDetails, 21));
        return Unit.f186387a;
    }
}
