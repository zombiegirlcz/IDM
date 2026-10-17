package androidx.compose.ui.autofill;

import androidx.collection.MutableScatterMap;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "", "isAutofillable", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "isRelatedToAutoCommit", "isRelatedToAutofill", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class AndroidAutofillManager_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAutofillable(SemanticsConfiguration semanticsConfiguration) {
        MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui = semanticsConfiguration.getProps$ui();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        return props$ui.contains(semanticsActions.getOnAutofillText()) || semanticsConfiguration.getProps$ui().contains(semanticsActions.getOnFillData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutoCommit(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui().contains(SemanticsProperties.INSTANCE.getContentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutofill(SemanticsConfiguration semanticsConfiguration) {
        MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui = semanticsConfiguration.getProps$ui();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (props$ui.contains(semanticsActions.getOnAutofillText()) || semanticsConfiguration.getProps$ui().contains(semanticsActions.getOnFillData())) {
            return true;
        }
        MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui2 = semanticsConfiguration.getProps$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return props$ui2.contains(semanticsProperties.getContentType()) || semanticsConfiguration.getProps$ui().contains(semanticsProperties.getContentDataType());
    }
}
