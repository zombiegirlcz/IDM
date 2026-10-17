package androidx.glance.appwidget;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/glance/appwidget/ContainerInfo;", "", "", "layoutId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLayoutId", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ContainerInfo {
    private final int layoutId;

    public ContainerInfo(int i) {
        this.layoutId = i;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ContainerInfo) && this.layoutId == ((ContainerInfo) other).layoutId;
    }

    public final int getLayoutId() {
        return this.layoutId;
    }

    public int hashCode() {
        return Integer.hashCode(this.layoutId);
    }

    @NotNull
    public String toString() {
        return a.t(new StringBuilder("ContainerInfo(layoutId="), this.layoutId, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
