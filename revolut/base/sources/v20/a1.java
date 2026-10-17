package v20;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lv20/a1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "inAppText", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("inAppText")
    private final String inAppText;

    public a1() {
        this(null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getInAppText() {
        return this.inAppText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a1) && Intrinsics.f(this.inAppText, ((a1) obj2).inAppText);
    }

    public final int hashCode() {
        String str = this.inAppText;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public a1(String str) {
        this.inAppText = str;
    }
}
