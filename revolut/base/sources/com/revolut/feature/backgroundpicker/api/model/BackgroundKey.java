package com.revolut.feature.backgroundpicker.api.model;

import android.os.Parcelable;
import em2.k;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0006*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/backgroundpicker/api/model/BackgroundKey;", "", "P", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "a", "Lcom/revolut/feature/backgroundpicker/api/model/ThemeAgnosticBackgroundKey;", "Lcom/revolut/feature/backgroundpicker/api/model/ThemedBackgroundKey;", "feature_background_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BackgroundKey<P> implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.backgroundpicker.api.model.BackgroundKey$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    private BackgroundKey() {
    }

    public abstract String a();

    public abstract String b();

    public abstract k c();
}
