package rwc;

import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static ProgressStyle a(long j2, long j3) {
        return ProgressStyle.Companion.c(ProgressStyle.INSTANCE, Math.max(0, Math.min((int) ((j2 / j3) * 100), 100)), R$attr.uikit_colorAccent);
    }
}
