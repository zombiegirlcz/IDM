package androidx.glance.semantics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\"(\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/glance/semantics/SemanticsPropertyReceiver;", "", "value", "getContentDescription", "(Landroidx/glance/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "setContentDescription", "(Landroidx/glance/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "contentDescription", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class SemanticsPropertiesKt {
    public static final void setContentDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getContentDescription(), u.c(str));
    }
}
