package m20;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lm20/m;", "", "", "toString", "()Ljava/lang/String;", "Lm20/o;", "a", "Lm20/o;", "getEntityRef", "()Lm20/o;", "entityRef", "b", "Ljava/lang/String;", "getMessageKey", "messageKey", "Lm20/k;", "c", "Lm20/k;", "getAttributes", "()Lm20/k;", "attributes", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("entityRef")
    @NotNull
    private final o entityRef;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageKey")
    private final String messageKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("attributes")
    private final k attributes;

    public m(o entityRef, k kVar) {
        Intrinsics.checkNotNullParameter(entityRef, "entityRef");
        this.entityRef = entityRef;
        this.messageKey = null;
        this.attributes = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.entityRef, mVar.entityRef) && Intrinsics.f(this.messageKey, mVar.messageKey) && Intrinsics.f(this.attributes, mVar.attributes);
    }

    public final int hashCode() {
        int iHashCode = this.entityRef.hashCode() * 31;
        String str = this.messageKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        k kVar = this.attributes;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }
}
