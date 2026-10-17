package com.revolut.feature.widgets.api.dependencies;

import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;", "Landroid/os/Parcelable;", "<init>", "()V", "contextKey", "", "Lcom/revolut/feature/widgets/api/model/WidgetContextKey;", "getContextKey", "()Ljava/lang/String;", "_originalWidgetContext", "get_originalWidgetContext", "()Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;", "set_originalWidgetContext", "(Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;)V", "feature_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WidgetContext implements Parcelable {
    private WidgetContext _originalWidgetContext;

    @NotNull
    public abstract String getContextKey();

    public final WidgetContext get_originalWidgetContext() {
        return this._originalWidgetContext;
    }

    public final void set_originalWidgetContext(WidgetContext widgetContext) {
        this._originalWidgetContext = widgetContext;
    }
}
