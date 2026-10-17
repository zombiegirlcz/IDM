package androidx.compose.ui.autofill;

import android.view.autofill.AutofillValue;
import androidx.compose.ui.autofill.FillableData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/autofill/FillableData$Companion;", "", "textValue", "Landroidx/compose/ui/autofill/FillableData;", "createFromText", "(Landroidx/compose/ui/autofill/FillableData$Companion;Ljava/lang/CharSequence;)Landroidx/compose/ui/autofill/FillableData;", "", "booleanValue", "createFromBoolean", "(Landroidx/compose/ui/autofill/FillableData$Companion;Z)Landroidx/compose/ui/autofill/FillableData;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class FillableData_androidKt {
    public static final FillableData createFromBoolean(@NotNull FillableData.Companion companion, boolean z) {
        return new AndroidFillableData(AutofillValue.forToggle(z));
    }

    public static final FillableData createFromText(@NotNull FillableData.Companion companion, @NotNull CharSequence charSequence) {
        return new AndroidFillableData(AutofillValue.forText(charSequence));
    }
}
