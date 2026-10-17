package androidx.compose.runtime.tooling;

import com.google.android.gms.nearby.uwb.RangingPosition;
import com.youTransactor.uCube.rpc.Constants;
import iim.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import yhm.f;
import zhm.a0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u000b*\u00060\tj\u0002`\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u000b*\u00060\tj\u0002`\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\u000b*\u00060\tj\u0002`\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"", "Lkotlin/Function0;", "Landroidx/compose/runtime/tooling/ComposeStackTrace;", "trace", "", "tryAttachComposeStackTrace", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Z", "attachComposeStackTrace", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Ljava/lang/Throwable;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "appendStackTrace", "(Ljava/lang/StringBuilder;Landroidx/compose/runtime/tooling/ComposeStackTrace;)V", "appendSourceInformationStackTrace", "", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "filterInternalFramesByGroupKey", "(Landroidx/compose/runtime/tooling/ComposeStackTrace;)Ljava/util/List;", "appendGroupKeyStackTrace", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ComposeStackTraceKt {
    public static final void appendGroupKeyStackTrace(@NotNull StringBuilder sb6, @NotNull ComposeStackTrace composeStackTrace) {
        List<ComposeStackTraceFrame> listFilterInternalFramesByGroupKey = filterInternalFramesByGroupKey(composeStackTrace);
        int size = listFilterInternalFramesByGroupKey.size();
        for (int i = 0; i < size; i++) {
            ComposeStackTraceFrame composeStackTraceFrame = listFilterInternalFramesByGroupKey.get(i);
            sb6.append("\tat $$compose.m$");
            sb6.append(composeStackTraceFrame.getGroupKey());
            sb6.append("(SourceFile:1)");
            sb6.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb6, "append(...)");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[PHI: r9
      0x003a: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v14 java.lang.String) binds: [B:7:0x0027, B:12:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void appendSourceInformationStackTrace(@org.jetbrains.annotations.NotNull java.lang.StringBuilder r12, @org.jetbrains.annotations.NotNull androidx.compose.runtime.tooling.ComposeStackTrace r13) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.tooling.ComposeStackTraceKt.appendSourceInformationStackTrace(java.lang.StringBuilder, androidx.compose.runtime.tooling.ComposeStackTrace):void");
    }

    public static final void appendStackTrace(@NotNull StringBuilder sb6, @NotNull ComposeStackTrace composeStackTrace) {
        if (composeStackTrace.getHasSourceInformation()) {
            appendSourceInformationStackTrace(sb6, composeStackTrace);
        } else {
            appendGroupKeyStackTrace(sb6, composeStackTrace);
        }
    }

    @NotNull
    public static final Throwable attachComposeStackTrace(@NotNull Throwable th10, @NotNull Function0<ComposeStackTrace> function0) {
        tryAttachComposeStackTrace(th10, function0);
        return th10;
    }

    @NotNull
    public static final List<ComposeStackTraceFrame> filterInternalFramesByGroupKey(@NotNull ComposeStackTrace composeStackTrace) {
        int[] iArr = {201, 202, Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2, 206, Constants.TAG_CF_ENHANCED_SRED_CONFIGURATION, ISO781611.SMT_TAG, RangingPosition.RSSI_MIN, 126665345, 200};
        int size = composeStackTrace.getFrames().size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ComposeStackTraceFrame composeStackTraceFrame = composeStackTrace.getFrames().get(i);
            if (!d.G(iArr, composeStackTraceFrame.getGroupKey())) {
                if (composeStackTraceFrame.getGroupKey() == 100) {
                    int i3 = i + 2;
                    if (i3 < size && composeStackTrace.getFrames().get(i3).getGroupKey() == 1000) {
                        break;
                    }
                    a0.I(arrayList);
                } else {
                    arrayList.add(composeStackTraceFrame);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    public static final boolean tryAttachComposeStackTrace(@NotNull Throwable th10, @NotNull Function0<ComposeStackTrace> function0) {
        DiagnosticComposeException diagnosticComposeException;
        Intrinsics.checkNotNullParameter(th10, "<this>");
        List listB = b.f161642a.b(th10);
        int size = listB.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listB.get(i)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            ComposeStackTrace composeStackTrace = (ComposeStackTrace) function0.invoke();
            if (composeStackTrace != null && !composeStackTrace.getFrames().isEmpty()) {
                z = true;
            }
            if (z) {
                Intrinsics.h(composeStackTrace);
                diagnosticComposeException = new DiagnosticComposeException(composeStackTrace);
            } else {
                diagnosticComposeException = null;
            }
        } catch (Throwable th11) {
            diagnosticComposeException = th11;
        }
        if (diagnosticComposeException != null) {
            f.a(th10, diagnosticComposeException);
        }
        return z;
    }
}
