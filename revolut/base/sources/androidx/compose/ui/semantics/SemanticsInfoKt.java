package androidx.compose.ui.semantics;

import androidx.collection.MutableObjectList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsInfo;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "mergedSemanticsConfiguration", "(Landroidx/compose/ui/semantics/SemanticsInfo;)Landroidx/compose/ui/semantics/SemanticsConfiguration;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class SemanticsInfoKt {
    public static final SemanticsConfiguration mergedSemanticsConfiguration(@NotNull SemanticsInfo semanticsInfo) {
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration != null && semanticsConfiguration.getIsMergingSemanticsOfDescendants() && !semanticsConfiguration.getIsClearingSemantics()) {
            semanticsConfiguration = semanticsConfiguration.copy();
            MutableObjectList mutableObjectList = new MutableObjectList(semanticsInfo.getChildrenInfo().size());
            mutableObjectList.addAll((List) semanticsInfo.getChildrenInfo());
            while (mutableObjectList.isNotEmpty()) {
                SemanticsInfo semanticsInfo2 = (SemanticsInfo) mutableObjectList.removeAt(mutableObjectList._size - 1);
                SemanticsConfiguration semanticsConfiguration2 = semanticsInfo2.getSemanticsConfiguration();
                if (semanticsConfiguration2 != null && !semanticsConfiguration2.getIsMergingSemanticsOfDescendants()) {
                    semanticsConfiguration.mergeChild$ui(semanticsConfiguration2);
                    if (!semanticsConfiguration2.getIsClearingSemantics()) {
                        mutableObjectList.addAll((List) semanticsInfo2.getChildrenInfo());
                    }
                }
            }
        }
        return semanticsConfiguration;
    }
}
