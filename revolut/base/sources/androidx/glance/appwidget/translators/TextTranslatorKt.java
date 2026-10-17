package androidx.glance.appwidget.translators;

import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.appwidget.ApplyModifiersKt;
import androidx.glance.appwidget.InsertedViewInfo;
import androidx.glance.appwidget.LayoutSelectionKt;
import androidx.glance.appwidget.LayoutType;
import androidx.glance.appwidget.TranslationContext;
import androidx.glance.text.EmittableText;
import androidx.glance.text.TextStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aG\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroid/widget/RemoteViews;", "Landroidx/glance/appwidget/TranslationContext;", "translationContext", "Landroidx/glance/text/EmittableText;", "element", "", "translateEmittableText", "(Landroid/widget/RemoteViews;Landroidx/glance/appwidget/TranslationContext;Landroidx/glance/text/EmittableText;)V", "", "resId", "", "text", "Landroidx/glance/text/TextStyle;", "style", "maxLines", "verticalTextGravity", "setText", "(Landroid/widget/RemoteViews;Landroidx/glance/appwidget/TranslationContext;ILjava/lang/String;Landroidx/glance/text/TextStyle;II)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class TextTranslatorKt {
    public static final void setText(@NotNull RemoteViews remoteViews, @NotNull TranslationContext translationContext, int i, @NotNull String str, TextStyle textStyle, int i2, int i3) {
        if (i2 != Integer.MAX_VALUE) {
            RemoteViewsCompat.setTextViewMaxLines(remoteViews, i, i2);
        }
        remoteViews.setTextViewText(i, str);
    }

    public static /* synthetic */ void setText$default(RemoteViews remoteViews, TranslationContext translationContext, int i, String str, TextStyle textStyle, int i2, int i3, int i5, Object obj2) {
        if ((i5 & 32) != 0) {
            i3 = 48;
        }
        setText(remoteViews, translationContext, i, str, textStyle, i2, i3);
    }

    public static final void translateEmittableText(@NotNull RemoteViews remoteViews, @NotNull TranslationContext translationContext, @NotNull EmittableText emittableText) {
        InsertedViewInfo insertedViewInfoInsertView = LayoutSelectionKt.insertView(remoteViews, translationContext, LayoutType.Text, emittableText.getModifier());
        int mainViewId = insertedViewInfoInsertView.getMainViewId();
        String text = emittableText.getText();
        emittableText.getStyle();
        setText$default(remoteViews, translationContext, mainViewId, text, null, emittableText.getMaxLines(), 0, 32, null);
        ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableText.getModifier(), insertedViewInfoInsertView);
    }
}
