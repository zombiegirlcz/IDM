package i20;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u0013\u0010\u001cR\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Li20/v0;", "Li20/d0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "message", "Li20/v0$a;", "Li20/v0$a;", "f", "()Li20/v0$a;", "translation", "", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "expandable", "d", "e", "preventEscalation", "Li20/e0;", "Li20/e0;", "()Li20/e0;", "meta", "Li20/c0;", "Li20/c0;", "()Li20/c0;", "notification", "Ljava/util/UUID;", "g", "Ljava/util/UUID;", "getReplyToMessageServerId", "()Ljava/util/UUID;", "replyToMessageServerId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("text")
    @NotNull
    private final String message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("translation")
    private final a translation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("expandable")
    private final Boolean expandable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("preventEscalation")
    private final Boolean preventEscalation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("meta")
    private final e0 meta;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("notification")
    private final c0 notification;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("replyToMessageId")
    private final UUID replyToMessageServerId;

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Li20/v0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "content", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("content")
        @NotNull
        private final String content;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.content, ((a) obj2).content);
        }

        public final int hashCode() {
            return this.content.hashCode();
        }
    }

    public v0(String message, Boolean bool, e0 e0Var, c0 c0Var, UUID uuid) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.translation = null;
        this.expandable = null;
        this.preventEscalation = bool;
        this.meta = e0Var;
        this.notification = c0Var;
        this.replyToMessageServerId = uuid;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getExpandable() {
        return this.expandable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e0 getMeta() {
        return this.meta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c0 getNotification() {
        return this.notification;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getPreventEscalation() {
        return this.preventEscalation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.message, v0Var.message) && Intrinsics.f(this.translation, v0Var.translation) && Intrinsics.f(this.expandable, v0Var.expandable) && Intrinsics.f(this.preventEscalation, v0Var.preventEscalation) && Intrinsics.f(this.meta, v0Var.meta) && Intrinsics.f(this.notification, v0Var.notification) && Intrinsics.f(this.replyToMessageServerId, v0Var.replyToMessageServerId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getTranslation() {
        return this.translation;
    }

    public final int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        a aVar = this.translation;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool = this.expandable;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.preventEscalation;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        e0 e0Var = this.meta;
        int iHashCode5 = (iHashCode4 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        c0 c0Var = this.notification;
        int iHashCode6 = (iHashCode5 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        UUID uuid = this.replyToMessageServerId;
        return iHashCode6 + (uuid != null ? uuid.hashCode() : 0);
    }
}
