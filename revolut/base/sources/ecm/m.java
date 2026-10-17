package ecm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f124839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f124840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f124841c;

    public m(d dVar, int i, boolean z) {
        this.f124839a = (d) Preconditions.checkNotNull(dVar, "callOptions");
        this.f124840b = i;
        this.f124841c = z;
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("callOptions", this.f124839a).add("previousAttempts", this.f124840b).add("isTransparentRetry", this.f124841c).toString();
    }
}
