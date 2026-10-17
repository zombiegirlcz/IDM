package androidx.compose.ui.text;

import a0.d;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import vz1.h;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0014\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "", "index", "findParagraphByIndex", "(Ljava/util/List;I)I", "", "y", "findParagraphByY", "(Ljava/util/List;F)I", "Landroidx/compose/ui/text/TextRange;", "range", "Lkotlin/Function1;", "", "action", "findParagraphsByRange-Sb-Bc2M", "(Ljava/util/List;JLkotlin/jvm/functions/Function1;)V", "findParagraphsByRange", "lineIndex", "findParagraphByLineIndex", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class MultiParagraphKt {
    public static final int findParagraphByIndex(@NotNull List<ParagraphInfo> list, int i) {
        int i2;
        int endIndex = ((ParagraphInfo) d0.m0(list)).getEndIndex();
        boolean z = false;
        if (!(i <= ((ParagraphInfo) d0.m0(list)).getEndIndex())) {
            InlineClassHelperKt.throwIllegalArgumentException("Index " + i + " should be less or equal than last line's end " + endIndex);
        }
        int size = list.size() - 1;
        int i3 = 0;
        while (true) {
            if (i3 > size) {
                i2 = -(i3 + 1);
                break;
            }
            i2 = (i3 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i2);
            byte b4 = paragraphInfo.getStartIndex() > i ? (byte) 1 : paragraphInfo.getEndIndex() <= i ? (byte) -1 : (byte) 0;
            if (b4 >= 0) {
                if (b4 <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i3 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            z = true;
        }
        if (!z) {
            StringBuilder sbW = d.w(i2, "Found paragraph index ", " should be in range [0, ");
            sbW.append(list.size());
            sbW.append(").\nDebug info: index=");
            sbW.append(i);
            sbW.append(", paragraphs=[");
            sbW.append(ListUtilsKt.fastJoinToString$default(list, null, null, null, 0, null, new h(16), 31, null));
            sbW.append(']');
            InlineClassHelperKt.throwIllegalArgumentException(sbW.toString());
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findParagraphByIndex$lambda$2$0(ParagraphInfo paragraphInfo) {
        return "[" + paragraphInfo.getStartIndex() + ", " + paragraphInfo.getEndIndex() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public static final int findParagraphByLineIndex(@NotNull List<ParagraphInfo> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i3);
            byte b4 = paragraphInfo.getStartLineIndex() > i ? (byte) 1 : paragraphInfo.getEndLineIndex() <= i ? (byte) -1 : (byte) 0;
            if (b4 < 0) {
                i2 = i3 + 1;
            } else {
                if (b4 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int findParagraphByY(@NotNull List<ParagraphInfo> list, float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (f >= ((ParagraphInfo) d0.m0(list)).getBottom()) {
            return v.j(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i2);
            byte b4 = paragraphInfo.getTop() > f ? (byte) 1 : paragraphInfo.getBottom() <= f ? (byte) -1 : (byte) 0;
            if (b4 < 0) {
                i = i2 + 1;
            } else {
                if (b4 <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m2893findParagraphsByRangeSbBc2M(@NotNull List<ParagraphInfo> list, long j2, @NotNull Function1<? super ParagraphInfo, Unit> function1) {
        int size = list.size();
        for (int iFindParagraphByIndex = findParagraphByIndex(list, TextRange.m2957getMinimpl(j2)); iFindParagraphByIndex < size; iFindParagraphByIndex++) {
            ParagraphInfo paragraphInfo = list.get(iFindParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= TextRange.m2956getMaximpl(j2)) {
                return;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                function1.invoke(paragraphInfo);
            }
        }
    }
}
