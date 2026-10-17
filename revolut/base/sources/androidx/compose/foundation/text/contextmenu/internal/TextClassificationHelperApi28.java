package androidx.compose.foundation.text.contextmenu.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/TextClassificationHelperApi28;", "", "<init>", "()V", "sendPendingIntent", "", "pendingIntent", "Landroid/app/PendingIntent;", "sendLegacyIntent", "context", "Landroid/content/Context;", "textClassification", "Landroid/view/textclassifier/TextClassification;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextClassificationHelperApi28 {

    @NotNull
    public static final TextClassificationHelperApi28 INSTANCE = new TextClassificationHelperApi28();

    private TextClassificationHelperApi28() {
    }

    public final void sendLegacyIntent(@NotNull Context context, @NotNull TextClassification textClassification) throws PendingIntent.CanceledException {
        String text = textClassification.getText();
        sendPendingIntent(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
    }

    public final void sendPendingIntent(@NotNull PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        if (Build.VERSION.SDK_INT >= 34) {
            TextClassificationHelper34.INSTANCE.sendIntentAllowBackgroundActivityStart(pendingIntent);
        } else {
            pendingIntent.send();
        }
    }
}
