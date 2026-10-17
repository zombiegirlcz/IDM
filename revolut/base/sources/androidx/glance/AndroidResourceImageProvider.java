package androidx.glance;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/glance/AndroidResourceImageProvider;", "Landroidx/glance/ImageProvider;", "resId", "", "(I)V", "getResId", "()I", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidResourceImageProvider implements ImageProvider {
    private final int resId;

    public AndroidResourceImageProvider(int i) {
        this.resId = i;
    }

    public final int getResId() {
        return this.resId;
    }

    @NotNull
    public String toString() {
        return a.t(new StringBuilder("AndroidResourceImageProvider(resId="), this.resId, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
