package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.SizeF;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.glance.GlanceId;
import com.youTransactor.uCube.rpc.Constants;
import fim.a;
import gim.d;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import vkm.q;
import yhm.o;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a*\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0006*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0006*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0018\u001a\u00020\u0015*\u00020\u0006H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010\"\u001a\u00020\u001e*\u00020!H\u0000¢\u0006\u0004\b\"\u0010#\u001a1\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\n0)*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b*\u0010+\"\u0018\u0010\u0003\u001a\u00020\u0002*\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroid/util/DisplayMetrics;", "displayMetrics", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetId", "Landroidx/compose/ui/unit/DpSize;", "appWidgetMinSize", "(Landroid/util/DisplayMetrics;Landroid/appwidget/AppWidgetManager;I)J", "Landroid/os/Bundle;", "Lkotlin/Function0;", "minSize", "", "extractAllSizes", "(Landroid/os/Bundle;Lkotlin/jvm/functions/Function0;)Ljava/util/List;", "estimateSizes", "extractLandscapeSize", "(Landroid/os/Bundle;)Landroidx/compose/ui/unit/DpSize;", "extractPortraitSize", "extractOrientationSizes", "(Landroid/os/Bundle;)Ljava/util/List;", "Landroid/util/SizeF;", "toSizeF-EaSLcWc", "(J)Landroid/util/SizeF;", "toSizeF", "", "throwable", "", "logException", "(Ljava/lang/Throwable;)V", "", "createUniqueRemoteUiName", "(I)Ljava/lang/String;", "Landroidx/glance/appwidget/AppWidgetId;", "toSessionKey", "(Landroidx/glance/appwidget/AppWidgetId;)Ljava/lang/String;", "Landroidx/glance/appwidget/GlanceAppWidget;", "Landroid/content/Context;", "context", "Landroidx/glance/GlanceId;", "id", "Lkotlinx/coroutines/flow/Flow;", "runGlance", "(Landroidx/glance/appwidget/GlanceAppWidget;Landroid/content/Context;Landroidx/glance/GlanceId;)Lkotlinx/coroutines/flow/Flow;", "getAppWidgetManager", "(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class AppWidgetUtilsKt {

    /* JADX INFO: renamed from: androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1, reason: invalid class name */
    @d(c = "androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1", f = "AppWidgetUtils.kt", l = {Constants.TAG_FC_SPEED_MODE}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/Function0;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends i implements Function2<ProducerScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ GlanceId $id;
        final /* synthetic */ GlanceAppWidget $this_runGlance;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$1, reason: invalid class name and collision with other inner class name */
        @d(c = "androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$1", f = "AppWidgetUtils.kt", l = {Constants.TAG_FC_SPEED_MODE}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class C00581 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ GlanceId $id;
            final /* synthetic */ GlanceAppWidget $this_runGlance;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00581(GlanceAppWidget glanceAppWidget, Context context, GlanceId glanceId, Continuation<? super C00581> continuation) {
                super(2, continuation);
                this.$this_runGlance = glanceAppWidget;
                this.$context = context;
                this.$id = glanceId;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new C00581(this.$this_runGlance, this.$context, this.$id, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    GlanceAppWidget glanceAppWidget = this.$this_runGlance;
                    Context context = this.$context;
                    GlanceId glanceId = this.$id;
                    this.label = 1;
                    if (glanceAppWidget.provideGlance(context, glanceId, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00581) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GlanceAppWidget glanceAppWidget, Context context, GlanceId glanceId, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_runGlance = glanceAppWidget;
            this.$context = context;
            this.$id = glanceId;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_runGlance, this.$context, this.$id, continuation);
            anonymousClass1.L$0 = obj2;
            return anonymousClass1;
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                AppWidgetUtilsKt$runGlance$1$receiver$1 appWidgetUtilsKt$runGlance$1$receiver$1 = new AppWidgetUtilsKt$runGlance$1$receiver$1(new AtomicReference(null), (ProducerScope) this.L$0);
                C00581 c00581 = new C00581(this.$this_runGlance, this.$context, this.$id, null);
                this.label = 1;
                if (e0.J(appWidgetUtilsKt$runGlance$1$receiver$1, c00581, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull ProducerScope producerScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(producerScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final long appWidgetMinSize(@NotNull DisplayMetrics displayMetrics, @NotNull AppWidgetManager appWidgetManager, int i) {
        AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(i);
        if (appWidgetInfo == null) {
            return DpSize.INSTANCE.m3327getZeroMYxV2XQ();
        }
        return DpKt.m3307DpSizeYgX7TsA(UtilsKt.pixelsToDp(Math.min(appWidgetInfo.minWidth, (appWidgetInfo.resizeMode & 1) != 0 ? appWidgetInfo.minResizeWidth : Integer.MAX_VALUE), displayMetrics), UtilsKt.pixelsToDp(Math.min(appWidgetInfo.minHeight, (appWidgetInfo.resizeMode & 2) != 0 ? appWidgetInfo.minResizeHeight : Integer.MAX_VALUE), displayMetrics));
    }

    @NotNull
    public static final String createUniqueRemoteUiName(int i) {
        return a0.d.n("appWidget-", i);
    }

    private static final List<DpSize> estimateSizes(Bundle bundle, Function0<DpSize> function0) {
        int i = bundle.getInt("appWidgetMinHeight", 0);
        int i2 = bundle.getInt("appWidgetMaxHeight", 0);
        int i3 = bundle.getInt("appWidgetMinWidth", 0);
        int i5 = bundle.getInt("appWidgetMaxWidth", 0);
        return (i == 0 || i2 == 0 || i3 == 0 || i5 == 0) ? u.c(function0.invoke()) : v.k(DpSize.m3317boximpl(DpKt.m3307DpSizeYgX7TsA(Dp.m3297constructorimpl(i3), Dp.m3297constructorimpl(i2))), DpSize.m3317boximpl(DpKt.m3307DpSizeYgX7TsA(Dp.m3297constructorimpl(i5), Dp.m3297constructorimpl(i))));
    }

    @NotNull
    public static final List<DpSize> extractAllSizes(@NotNull Bundle bundle, @NotNull Function0<DpSize> function0) {
        ArrayList<SizeF> parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            return estimateSizes(bundle, function0);
        }
        ArrayList arrayList = new ArrayList(w.t(parcelableArrayList, 10));
        for (SizeF sizeF : parcelableArrayList) {
            arrayList.add(DpSize.m3317boximpl(DpKt.m3307DpSizeYgX7TsA(Dp.m3297constructorimpl(sizeF.getWidth()), Dp.m3297constructorimpl(sizeF.getHeight()))));
        }
        return arrayList;
    }

    private static final DpSize extractLandscapeSize(Bundle bundle) {
        int i = bundle.getInt("appWidgetMinHeight", 0);
        int i2 = bundle.getInt("appWidgetMaxWidth", 0);
        if (i == 0 || i2 == 0) {
            return null;
        }
        return DpSize.m3317boximpl(DpKt.m3307DpSizeYgX7TsA(Dp.m3297constructorimpl(i2), Dp.m3297constructorimpl(i)));
    }

    @NotNull
    public static final List<DpSize> extractOrientationSizes(@NotNull Bundle bundle) {
        DpSize[] elements = {extractLandscapeSize(bundle), extractPortraitSize(bundle)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    private static final DpSize extractPortraitSize(Bundle bundle) {
        int i = bundle.getInt("appWidgetMaxHeight", 0);
        int i2 = bundle.getInt("appWidgetMinWidth", 0);
        if (i == 0 || i2 == 0) {
            return null;
        }
        return DpSize.m3317boximpl(DpKt.m3307DpSizeYgX7TsA(Dp.m3297constructorimpl(i2), Dp.m3297constructorimpl(i)));
    }

    @NotNull
    public static final AppWidgetManager getAppWidgetManager(@NotNull Context context) {
        Object systemService = context.getSystemService("appwidget");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.appwidget.AppWidgetManager");
        return (AppWidgetManager) systemService;
    }

    public static final void logException(@NotNull Throwable th10) {
    }

    @NotNull
    public static final Flow runGlance(@NotNull GlanceAppWidget glanceAppWidget, @NotNull Context context, @NotNull GlanceId glanceId) {
        return q.m(new AnonymousClass1(glanceAppWidget, context, glanceId, null));
    }

    @NotNull
    public static final String toSessionKey(@NotNull AppWidgetId appWidgetId) {
        return createUniqueRemoteUiName(appWidgetId.getAppWidgetId());
    }

    @NotNull
    /* JADX INFO: renamed from: toSizeF-EaSLcWc, reason: not valid java name */
    public static final SizeF m3488toSizeFEaSLcWc(long j2) {
        return new SizeF(DpSize.m3322getWidthD9Ej5fM(j2), DpSize.m3321getHeightD9Ej5fM(j2));
    }
}
