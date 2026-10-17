package akg;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleRegistry;
import androidx.media3.common.TrackGroup;
import androidx.media3.datasource.cache.CacheSpan;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.address.models.AddressSearchListResult;
import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow;
import ix0.a1;
import ix0.q0;
import ix0.y0;
import ix0.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import yp0.k0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5932a;

    public /* synthetic */ d(int i) {
        this.f5932a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        kotlin.coroutines.c cVar;
        int iCompareTo = 1;
        switch (this.f5932a) {
            case 0:
                ((Boolean) obj2).booleanValue();
                break;
            case 1:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                break;
            case 2:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 3:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 4:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 5:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 6:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 7:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 8:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 9:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 10:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 11:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 12:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 13:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 14:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 15:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 16:
                Intrinsics.checkNotNullParameter((cj1.a) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((AddressSearchListResult) data, "<unused var>");
                break;
            case 17:
                Intrinsics.checkNotNullParameter((cj1.b) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((List) data, "<unused var>");
                break;
            case 18:
                CoroutineContext acc2 = (CoroutineContext) obj2;
                CoroutineContext.Element element = (CoroutineContext.Element) data;
                Intrinsics.checkNotNullParameter(acc2, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                CoroutineContext coroutineContextMinusKey = acc2.minusKey(element.getKey());
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
                if (coroutineContextMinusKey != gVar) {
                    eim.a aVar = kotlin.coroutines.d.q1;
                    kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContextMinusKey.get(aVar);
                    if (dVar == null) {
                        cVar = new kotlin.coroutines.c(element, coroutineContextMinusKey);
                    } else {
                        CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(aVar);
                        if (coroutineContextMinusKey2 != gVar) {
                            cVar = new kotlin.coroutines.c(dVar, new kotlin.coroutines.c(element, coroutineContextMinusKey2));
                        }
                    }
                    break;
                }
                break;
            case 19:
                Throwable error = (Throwable) obj2;
                AppTheme appTheme = (AppTheme) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (appTheme == null) {
                }
                break;
            case 20:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 21:
                ((Integer) obj2).intValue();
                RowDelegate.Companion companion = RowDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 22:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                break;
            case 23:
                Integer num = (Integer) obj2;
                num.intValue();
                TrackGroup trackGroup = (TrackGroup) data;
                Intrinsics.checkNotNullParameter(trackGroup, "trackGroup");
                break;
            case 24:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) obj2;
                View view = (View) data;
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(view, "view");
                nji.j transitionProvider = new nji.j(controller);
                LifecycleRegistry lifecycleRegistry = controller.F;
                uw0.f fVarA = controller instanceof uw0.f ? (uw0.f) controller : null;
                if (fVarA == null) {
                    uw0.b bVar = uw0.f.Companion;
                    String strP2 = controller.p2();
                    bVar.getClass();
                    fVarA = uw0.b.a(strP2);
                }
                k0 viewScreenContext = new k0(lifecycleRegistry, fVarA);
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(viewScreenContext, "viewScreenContext");
                view.setTag(R$id.internal_view_screen_context_tag, viewScreenContext);
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(transitionProvider, "transitionProvider");
                view.setTag(R$id.internal_transient_state_provider_tag, transitionProvider);
                if (!((Boolean) jo0.g.e().getValue()).booleanValue() && ((controller instanceof BaseScrollerFlow) || (controller instanceof ali.g) || !(controller instanceof qji.c))) {
                    y0.a aVarA = y0.a(view instanceof ViewGroup ? (ViewGroup) view : null);
                    if ((aVarA instanceof a1) && ((a1) aVarA).a() != z0.UNKNOWN_NESTING && controller.r2() == null) {
                        KeyEvent.Callback callbackD2 = controller.D2();
                        hli.e eVar = callbackD2 instanceof hli.e ? (hli.e) callbackD2 : null;
                        if (eVar != null) {
                            eVar.setFitNavigationBar(true);
                        }
                    }
                }
                q0.a(view);
                break;
            case 25:
                CacheSpan cacheSpan = (CacheSpan) obj2;
                CacheSpan cacheSpan2 = (CacheSpan) data;
                long j2 = cacheSpan.lastTouchTimestamp;
                long j3 = cacheSpan2.lastTouchTimestamp;
                if (j2 - j3 == 0) {
                    iCompareTo = cacheSpan.compareTo(cacheSpan2);
                } else if (j2 < j3) {
                    iCompareTo = -1;
                }
                break;
            case 26:
                KClass clazz = (KClass) obj2;
                List types = (List) data;
                Intrinsics.checkNotNullParameter(clazz, "clazz");
                Intrinsics.checkNotNullParameter(types, "types");
                ArrayList arrayListX = jh.d.x(tlm.h.f272133a, types, true);
                Intrinsics.h(arrayListX);
                break;
            case 27:
                KClass clazz2 = (KClass) obj2;
                List types2 = (List) data;
                Intrinsics.checkNotNullParameter(clazz2, "clazz");
                Intrinsics.checkNotNullParameter(types2, "types");
                ArrayList arrayListX2 = jh.d.x(tlm.h.f272133a, types2, true);
                Intrinsics.h(arrayListX2);
                KSerializer kSerializerR = jh.d.r(clazz2, arrayListX2, new d4h.a(types2, 7));
                if (kSerializerR != null) {
                }
                break;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                break;
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                break;
        }
        return null;
    }
}
