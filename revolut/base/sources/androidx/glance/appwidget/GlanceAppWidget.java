package androidx.glance.appwidget;

import android.content.Context;
import android.os.Bundle;
import androidx.glance.GlanceId;
import androidx.glance.appwidget.SizeMode;
import androidx.glance.session.SessionManager;
import androidx.glance.session.SessionManagerKt;
import androidx.glance.state.GlanceStateDefinition;
import androidx.glance.state.PreferencesGlanceStateDefinition;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import fim.a;
import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J#\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001aH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ+\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H\u0080@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J7\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0080@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001aH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ/\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0080@ø\u0001\u0000¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidget;", "", "errorUiLayout", "", "(I)V", "getErrorUiLayout$glance_appwidget_release", "()I", "sessionManager", "Landroidx/glance/session/SessionManager;", "sizeMode", "Landroidx/glance/appwidget/SizeMode;", "getSizeMode", "()Landroidx/glance/appwidget/SizeMode;", "stateDefinition", "Landroidx/glance/state/GlanceStateDefinition;", "getStateDefinition", "()Landroidx/glance/state/GlanceStateDefinition;", "deleted", "", "context", "Landroid/content/Context;", "appWidgetId", "deleted$glance_appwidget_release", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDelete", "glanceId", "Landroidx/glance/GlanceId;", "(Landroid/content/Context;Landroidx/glance/GlanceId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "provideGlance", "id", "resize", "options", "Landroid/os/Bundle;", "resize$glance_appwidget_release", "(Landroid/content/Context;ILandroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "triggerAction", "actionKey", "", "triggerAction$glance_appwidget_release", "(Landroid/content/Context;ILjava/lang/String;Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "update$glance_appwidget_release", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class GlanceAppWidget {
    private final int errorUiLayout;

    @NotNull
    private final SessionManager sessionManager;

    @NotNull
    private final SizeMode sizeMode;
    private final GlanceStateDefinition<?> stateDefinition;

    /* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidget$update$3, reason: invalid class name */
    /* JADX INFO: loaded from: classes15.dex */
    @d(c = "androidx.glance.appwidget.GlanceAppWidget", f = "GlanceAppWidget.kt", l = {ModuleDescriptor.MODULE_VERSION, 142, 145}, m = "update$glance_appwidget_release")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return GlanceAppWidget.this.update$glance_appwidget_release(null, 0, null, this);
        }
    }

    public GlanceAppWidget(int i) {
        this.errorUiLayout = i;
        this.sessionManager = SessionManagerKt.getGlanceSessionManager();
        this.sizeMode = SizeMode.Single.INSTANCE;
        this.stateDefinition = PreferencesGlanceStateDefinition.INSTANCE;
    }

    public static /* synthetic */ Object onDelete$suspendImpl(GlanceAppWidget glanceAppWidget, Context context, GlanceId glanceId, Continuation<? super Unit> continuation) {
        return Unit.f186387a;
    }

    public static /* synthetic */ Object triggerAction$glance_appwidget_release$default(GlanceAppWidget glanceAppWidget, Context context, int i, String str, Bundle bundle, Continuation continuation, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: triggerAction");
        }
        if ((i2 & 8) != 0) {
            bundle = null;
        }
        return glanceAppWidget.triggerAction$glance_appwidget_release(context, i, str, bundle, continuation);
    }

    public static /* synthetic */ Object update$glance_appwidget_release$default(GlanceAppWidget glanceAppWidget, Context context, int i, Bundle bundle, Continuation continuation, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        return glanceAppWidget.update$glance_appwidget_release(context, i, bundle, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r2.deleteStore(r9, r10, r8, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d8, code lost:
    
        if (r2.deleteStore(r9, r10, r8, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0114, code lost:
    
        if (r2.deleteStore(r9, r10, r8, r0) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unreachable blocks removed: 6, instructions: 13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleted$glance_appwidget_release(@org.jetbrains.annotations.NotNull android.content.Context r8, int r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidget.deleted$glance_appwidget_release(android.content.Context, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: getErrorUiLayout$glance_appwidget_release, reason: from getter */
    public final int getErrorUiLayout() {
        return this.errorUiLayout;
    }

    @NotNull
    public SizeMode getSizeMode() {
        return this.sizeMode;
    }

    public GlanceStateDefinition<?> getStateDefinition() {
        return this.stateDefinition;
    }

    public Object onDelete(@NotNull Context context, @NotNull GlanceId glanceId, @NotNull Continuation<? super Unit> continuation) {
        return onDelete$suspendImpl(this, context, glanceId, continuation);
    }

    public abstract Object provideGlance(@NotNull Context context, @NotNull GlanceId glanceId, @NotNull Continuation<? super Unit> continuation);

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        if (r0.startSession(r14, r6, r1) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d2, code lost:
    
        if (((androidx.glance.appwidget.AppWidgetSession) r14).updateAppWidgetOptions(r9, r1) == r2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resize$glance_appwidget_release(@org.jetbrains.annotations.NotNull android.content.Context r14, int r15, @org.jetbrains.annotations.NotNull android.os.Bundle r16, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidget.resize$glance_appwidget_release(android.content.Context, int, android.os.Bundle, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e0, code lost:
    
        if (r1.runLambda(r11, r3) == r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object triggerAction$glance_appwidget_release(@org.jetbrains.annotations.NotNull android.content.Context r20, int r21, @org.jetbrains.annotations.NotNull java.lang.String r22, android.os.Bundle r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidget.triggerAction$glance_appwidget_release(android.content.Context, int, java.lang.String, android.os.Bundle, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object update(@NotNull Context context, @NotNull GlanceId glanceId, @NotNull Continuation<? super Unit> continuation) {
        if (!(glanceId instanceof AppWidgetId)) {
            throw new IllegalArgumentException("Invalid Glance ID");
        }
        Object objUpdate$glance_appwidget_release$default = update$glance_appwidget_release$default(this, context, ((AppWidgetId) glanceId).getAppWidgetId(), null, continuation, 4, null);
        return objUpdate$glance_appwidget_release$default == a.COROUTINE_SUSPENDED ? objUpdate$glance_appwidget_release$default : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r0.startSession(r14, r6, r1) == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        if (((androidx.glance.appwidget.AppWidgetSession) r14).updateGlance(r1) == r2) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object update$glance_appwidget_release(@org.jetbrains.annotations.NotNull android.content.Context r14, int r15, android.os.Bundle r16, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidget.update$glance_appwidget_release(android.content.Context, int, android.os.Bundle, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ GlanceAppWidget(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? R$layout.glance_error_layout : i);
    }
}
