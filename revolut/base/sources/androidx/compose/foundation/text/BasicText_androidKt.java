package androidx.compose.foundation.text;

import android.os.Trace;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\nH\u0001¢\u0006\u0004\b\u0007\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u00020\u00118@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "BackgroundTextMeasurement", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "", "textLength", "", "shouldPrefetch", "(I)Z", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Ljava/util/concurrent/Executor;", "LocalBackgroundTextMeasurementExecutor", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalBackgroundTextMeasurementExecutor", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "backingCoreCountSatisfactory", "Ljava/lang/Boolean;", "getCoreCountSatisfactory", "()Z", "getCoreCountSatisfactory$annotations", "()V", "coreCountSatisfactory", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class BasicText_androidKt {

    @NotNull
    private static final ProvidableCompositionLocal<Executor> LocalBackgroundTextMeasurementExecutor = CompositionLocalKt.staticCompositionLocalOf(new n08.b(8));
    private static Boolean backingCoreCountSatisfactory;

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[Catch: RejectedExecutionException -> 0x009d, TryCatch #0 {RejectedExecutionException -> 0x009d, blocks: (B:11:0x0049, B:17:0x0056, B:19:0x0066, B:24:0x0071, B:26:0x0083, B:29:0x0098, B:28:0x008b, B:21:0x006c, B:13:0x004f), top: B:37:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BackgroundTextMeasurement(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.TextStyle r10, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.font.FontFamily.Resolver r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:68)"
            r2 = 1589371739(0x5ebbe35b, float:6.7693825E18)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r13, r0, r1)
        Lf:
            androidx.compose.runtime.ProvidableCompositionLocal<java.util.concurrent.Executor> r0 = androidx.compose.foundation.text.BasicText_androidKt.LocalBackgroundTextMeasurementExecutor
            java.lang.Object r0 = r12.consume(r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            if (r0 == 0) goto La1
            int r1 = r9.length()
            boolean r1 = shouldPrefetch(r1)
            if (r1 == 0) goto La1
            r1 = 1254274527(0x4ac2b5df, float:6380271.5)
            r12.startReplaceGroup(r1)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r1 = r12.consume(r1)
            r4 = r1
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.ui.unit.LayoutDirection) r4
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r1 = r12.consume(r1)
            r6 = r1
            androidx.compose.ui.unit.Density r6 = (androidx.compose.ui.unit.Density) r6
            r1 = r13 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r2 = 0
            r3 = 1
            r5 = 32
            if (r1 <= r5) goto L4f
            boolean r1 = r12.changed(r10)     // Catch: java.util.concurrent.RejectedExecutionException -> L9d
            if (r1 != 0) goto L53
        L4f:
            r1 = r13 & 48
            if (r1 != r5) goto L55
        L53:
            r1 = r3
            goto L56
        L55:
            r1 = r2
        L56:
            int r5 = r4.ordinal()     // Catch: java.util.concurrent.RejectedExecutionException -> L9d
            boolean r5 = r12.changed(r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L9d
            r1 = r1 | r5
            r5 = r13 & 14
            r5 = r5 ^ 6
            r7 = 4
            if (r5 <= r7) goto L6c
            boolean r5 = r12.changed(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L9d
            if (r5 != 0) goto L70
        L6c:
            r13 = r13 & 6
            if (r13 != r7) goto L71
        L70:
            r2 = r3
        L71:
            r13 = r1 | r2
            boolean r1 = r12.changed(r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L9d
            r13 = r13 | r1
            boolean r1 = r12.changedInstance(r11)     // Catch: java.util.concurrent.RejectedExecutionException -> L9d
            r13 = r13 | r1
            java.lang.Object r1 = r12.rememberedValue()     // Catch: java.util.concurrent.RejectedExecutionException -> L9d
            if (r13 != 0) goto L8b
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.INSTANCE     // Catch: java.util.concurrent.RejectedExecutionException -> L9d
            java.lang.Object r13 = r13.getEmpty()     // Catch: java.util.concurrent.RejectedExecutionException -> L9d
            if (r1 != r13) goto L98
        L8b:
            az0.m1 r2 = new az0.m1     // Catch: java.util.concurrent.RejectedExecutionException -> L9d
            r8 = 2
            r5 = r9
            r3 = r10
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.util.concurrent.RejectedExecutionException -> L9d
            r12.updateRememberedValue(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L9d
            r1 = r2
        L98:
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.util.concurrent.RejectedExecutionException -> L9d
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L9d
        L9d:
            r12.endReplaceGroup()
            goto La8
        La1:
            r9 = 1250991751(0x4a909e87, float:4738883.5)
            r12.startReplaceGroup(r9)
            goto L9d
        La8:
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto Lb1
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicText_androidKt.BackgroundTextMeasurement(java.lang.String, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.font.FontFamily$Resolver, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackgroundTextMeasurement$lambda$0$0(TextStyle textStyle, LayoutDirection layoutDirection, String str, Density density, FontFamily.Resolver resolver) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            MutableSnapshot mutableSnapshotTakeMutableSnapshot$default = Snapshot.Companion.takeMutableSnapshot$default(Snapshot.INSTANCE, null, null, 3, null);
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot$default.makeCurrent();
                try {
                    ParagraphIntrinsicsKt.ParagraphIntrinsics$default(str, TextStyleKt.resolveDefaults(textStyle, layoutDirection), f0.f322471a, density, resolver, null, 32, null).getMaxIntrinsicWidth();
                    Unit unit = Unit.f186387a;
                    mutableSnapshotTakeMutableSnapshot$default.restoreCurrent(snapshotMakeCurrent);
                    mutableSnapshotTakeMutableSnapshot$default.apply().check();
                    mutableSnapshotTakeMutableSnapshot$default.dispose();
                } catch (Throwable th10) {
                    mutableSnapshotTakeMutableSnapshot$default.restoreCurrent(snapshotMakeCurrent);
                    throw th10;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackgroundTextMeasurement$lambda$1$0(TextStyle textStyle, LayoutDirection layoutDirection, List list, AnnotatedString annotatedString, Density density, FontFamily.Resolver resolver) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            MutableSnapshot mutableSnapshotTakeMutableSnapshot$default = Snapshot.Companion.takeMutableSnapshot$default(Snapshot.INSTANCE, null, null, 3, null);
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot$default.makeCurrent();
                try {
                    TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
                    if (list == null) {
                        list = f0.f322471a;
                    }
                    new MultiParagraphIntrinsics(annotatedString, textStyleResolveDefaults, list, density, resolver).getMaxIntrinsicWidth();
                    Unit unit = Unit.f186387a;
                    mutableSnapshotTakeMutableSnapshot$default.restoreCurrent(snapshotMakeCurrent);
                    mutableSnapshotTakeMutableSnapshot$default.apply().check();
                    mutableSnapshotTakeMutableSnapshot$default.dispose();
                } catch (Throwable th10) {
                    mutableSnapshotTakeMutableSnapshot$default.restoreCurrent(snapshotMakeCurrent);
                    throw th10;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor LocalBackgroundTextMeasurementExecutor$lambda$0() {
        return null;
    }

    public static final boolean getCoreCountSatisfactory() {
        if (backingCoreCountSatisfactory == null) {
            backingCoreCountSatisfactory = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
        }
        Boolean bool = backingCoreCountSatisfactory;
        Intrinsics.h(bool);
        return bool.booleanValue();
    }

    public static final boolean shouldPrefetch(int i) {
        return i >= 8 && i < 1000 && getCoreCountSatisfactory();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[Catch: RejectedExecutionException -> 0x00a3, TryCatch #0 {RejectedExecutionException -> 0x00a3, blocks: (B:11:0x0049, B:17:0x0056, B:19:0x006b, B:24:0x0076, B:26:0x0088, B:29:0x009e, B:28:0x0090, B:21:0x0071, B:13:0x004f), top: B:37:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BackgroundTextMeasurement(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.AnnotatedString r10, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.TextStyle r11, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.font.FontFamily.Resolver r12, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> r13, androidx.compose.runtime.Composer r14, int r15) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:102)"
            r2 = -650368117(0xffffffffd93c2b8b, float:-3.3103232E15)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r15, r0, r1)
        Lf:
            androidx.compose.runtime.ProvidableCompositionLocal<java.util.concurrent.Executor> r0 = androidx.compose.foundation.text.BasicText_androidKt.LocalBackgroundTextMeasurementExecutor
            java.lang.Object r0 = r14.consume(r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            if (r0 == 0) goto La7
            int r1 = r10.length()
            boolean r1 = shouldPrefetch(r1)
            if (r1 == 0) goto La7
            r1 = -518761746(0xffffffffe11452ee, float:-1.7100586E20)
            r14.startReplaceGroup(r1)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r1 = r14.consume(r1)
            r4 = r1
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.ui.unit.LayoutDirection) r4
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r1 = r14.consume(r1)
            r7 = r1
            androidx.compose.ui.unit.Density r7 = (androidx.compose.ui.unit.Density) r7
            r1 = r15 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r2 = 0
            r3 = 1
            r5 = 32
            if (r1 <= r5) goto L4f
            boolean r1 = r14.changed(r11)     // Catch: java.util.concurrent.RejectedExecutionException -> La3
            if (r1 != 0) goto L53
        L4f:
            r1 = r15 & 48
            if (r1 != r5) goto L55
        L53:
            r1 = r3
            goto L56
        L55:
            r1 = r2
        L56:
            int r5 = r4.ordinal()     // Catch: java.util.concurrent.RejectedExecutionException -> La3
            boolean r5 = r14.changed(r5)     // Catch: java.util.concurrent.RejectedExecutionException -> La3
            r1 = r1 | r5
            boolean r5 = r14.changedInstance(r13)     // Catch: java.util.concurrent.RejectedExecutionException -> La3
            r1 = r1 | r5
            r5 = r15 & 14
            r5 = r5 ^ 6
            r6 = 4
            if (r5 <= r6) goto L71
            boolean r5 = r14.changed(r10)     // Catch: java.util.concurrent.RejectedExecutionException -> La3
            if (r5 != 0) goto L75
        L71:
            r15 = r15 & 6
            if (r15 != r6) goto L76
        L75:
            r2 = r3
        L76:
            r15 = r1 | r2
            boolean r1 = r14.changed(r7)     // Catch: java.util.concurrent.RejectedExecutionException -> La3
            r15 = r15 | r1
            boolean r1 = r14.changedInstance(r12)     // Catch: java.util.concurrent.RejectedExecutionException -> La3
            r15 = r15 | r1
            java.lang.Object r1 = r14.rememberedValue()     // Catch: java.util.concurrent.RejectedExecutionException -> La3
            if (r15 != 0) goto L90
            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.INSTANCE     // Catch: java.util.concurrent.RejectedExecutionException -> La3
            java.lang.Object r15 = r15.getEmpty()     // Catch: java.util.concurrent.RejectedExecutionException -> La3
            if (r1 != r15) goto L9e
        L90:
            ip0.nt r2 = new ip0.nt     // Catch: java.util.concurrent.RejectedExecutionException -> La3
            r9 = 2
            r6 = r10
            r3 = r11
            r8 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.RejectedExecutionException -> La3
            r14.updateRememberedValue(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> La3
            r1 = r2
        L9e:
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.util.concurrent.RejectedExecutionException -> La3
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> La3
        La3:
            r14.endReplaceGroup()
            goto Lae
        La7:
            r10 = -523310345(0xffffffffe0ceeaf7, float:-1.1928001E20)
            r14.startReplaceGroup(r10)
            goto La3
        Lae:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto Lb7
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicText_androidKt.BackgroundTextMeasurement(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.font.FontFamily$Resolver, java.util.List, androidx.compose.runtime.Composer, int):void");
    }
}
