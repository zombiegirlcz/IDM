package kv9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lkv9/u;", "", "", "toString", "()Ljava/lang/String;", "Lkv9/i;", "a", "Lkv9/i;", "getRecipient", "()Lkv9/i;", "recipient", "b", "Ljava/lang/String;", "getMedia", "media", "c", "getType", "type", "feature_payments_messaging_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipient")
    @NotNull
    private final i recipient;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("media")
    @NotNull
    private final String media;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    public u(i recipient, String media, String type) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(type, "type");
        this.recipient = recipient;
        this.media = media;
        this.type = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.recipient, uVar.recipient) && Intrinsics.f(this.media, uVar.media) && Intrinsics.f(this.type, uVar.type);
    }

    public final int hashCode() {
        return this.type.hashCode() + p.a.c(this.recipient.hashCode() * 31, 31, this.media);
    }
}
