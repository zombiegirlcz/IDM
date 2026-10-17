package no;

import android.app.KeyguardManager;
import android.view.accessibility.AccessibilityManager;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.tracking.v3.SettingsAccessibilityContext;
import com.revolut.tracking.v3.SettingsLockContext;
import com.revolut.tracking.v3.SettingsThemingContext;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class t2 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.analytics.tracking.v3.l f217845w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(com.revolut.analytics.tracking.v3.l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f217845w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t2(this.f217845w, continuation, 0);
            default:
                return new t2(this.f217845w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.analytics.tracking.v3.l lVar = this.f217845w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    go.g gVar = new go.g(((go.h) lVar.f50343j.f49544c).f145069a.h(), 0);
                    this.v = 1;
                    obj2 = vkm.q.z(gVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                SettingsThemingContext context = (SettingsThemingContext) obj2;
                if (context != null) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    lVar.m3(AnalyticsProduct.Shared.Environment.f, true, new ite.d(context, 17));
                }
                return Unit.f186387a;
            default:
                com.google.firebase.messaging.t tVar = lVar.f50343j;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    gpk.c cVar = (gpk.c) tVar.d;
                    cVar.getClass();
                    EnumEntries enumEntriesA = w2.a();
                    ArrayList arrayList = new ArrayList(zhm.w.t(enumEntriesA, 10));
                    Iterator<E> it8 = enumEntriesA.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(cVar.e((w2) it8.next()));
                    }
                    Iterator it9 = zhm.d0.i1(arrayList).iterator();
                    while (it9.hasNext()) {
                        lVar.p3((go.a) it9.next());
                    }
                    afe.b bVar = lVar.f50339b;
                    this.v = 1;
                    obj2 = bVar.a(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                for (yee.b app : (Iterable) obj2) {
                    Intrinsics.checkNotNullParameter(app, "app");
                    lVar.m3(AnalyticsProduct.Shared.FinCrime.f, true, new nmm.h(app, 9));
                }
                n2 n2Var = com.revolut.analytics.tracking.v3.l.Companion;
                AnalyticsProduct.Shared.Environment environment = AnalyticsProduct.Shared.Environment.f;
                lVar.m3(environment, true, new ite.d(lVar, 16));
                final boolean z = ((b70.e) ((mp.r) tVar.f49543b).f207713b).f12863a.getResources().getConfiguration().fontScale > 1.0f;
                AccessibilityManager accessibilityManager = (AccessibilityManager) ((b70.e) ((mp.r) tVar.f49543b).f207713b).f12864b.getValue();
                final boolean zIsTouchExplorationEnabled = accessibilityManager != null ? accessibilityManager.isTouchExplorationEnabled() : false;
                lVar.m3(environment, true, new Function0() { // from class: no.l2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                        SettingsAccessibilityContext.a aVarNewBuilder = SettingsAccessibilityContext.newBuilder();
                        aVarNewBuilder.c();
                        ((SettingsAccessibilityContext) aVarNewBuilder.f49761b).setIncreasedFontScale(z);
                        aVarNewBuilder.c();
                        ((SettingsAccessibilityContext) aVarNewBuilder.f49761b).setVoiceoverEnabled(zIsTouchExplorationEnabled);
                        com.google.protobuf.w0 w0VarA = aVarNewBuilder.a();
                        companion.getClass();
                        return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
                    }
                });
                final boolean zIsDeviceSecure = ((KeyguardManager) lVar.f50346n.f132742c.getValue()).isDeviceSecure();
                lVar.m3(AnalyticsProduct.Shared.FinCrime.f, true, new Function0() { // from class: no.m2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                        SettingsLockContext.a aVarNewBuilder = SettingsLockContext.newBuilder();
                        aVarNewBuilder.c();
                        ((SettingsLockContext) aVarNewBuilder.f49761b).setIsDeviceLockProtected(zIsDeviceSecure);
                        com.google.protobuf.w0 w0VarA = aVarNewBuilder.a();
                        companion.getClass();
                        return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
                    }
                });
                return Unit.f186387a;
        }
    }
}
