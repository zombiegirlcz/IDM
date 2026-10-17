package c2m;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20835b;

    public a(Object obj2) {
        this.f20834a = obj2;
    }

    public final Object a() {
        if (this.f20835b) {
            return null;
        }
        this.f20835b = true;
        return this.f20834a;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Event(content=");
        sb6.append(this.f20834a);
        sb6.append(", hasBeenHandled=");
        return j6.a.x(sb6, this.f20835b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
