package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/TextOverflow;", "", "isEllipsis-MW5-ApA", "(I)Z", "isEllipsis", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class TextMeasurerKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m2946isEllipsisMW5ApA(int i) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return TextOverflow.m3259equalsimpl0(i, companion.m3263getEllipsisgIe3tQ8()) || TextOverflow.m3259equalsimpl0(i, companion.m3265getStartEllipsisgIe3tQ8()) || TextOverflow.m3259equalsimpl0(i, companion.m3264getMiddleEllipsisgIe3tQ8());
    }
}
