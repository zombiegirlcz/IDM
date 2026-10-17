package o20;

import i20.m0;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v20.t0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u000f\u0006\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lo20/b;", "", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "getCorrelationId", "()Ljava/util/UUID;", "correlationId", "b", "getReplyTo", "replyTo", "Lo20/b$a;", "c", "Lo20/b$a;", "getTextPayload", "()Lo20/b$a;", "textPayload", "Lo20/b$c;", "d", "Lo20/b$c;", "getMeta", "()Lo20/b$c;", "meta", "", "Lo20/b$b;", "e", "Ljava/util/List;", "getUploads", "()Ljava/util/List;", "uploads", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("correlationId")
    @NotNull
    private final UUID correlationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("replyToMessageId")
    private final UUID replyTo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("textMessage")
    private final a textPayload;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("meta")
    private final c meta;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("uploads")
    @NotNull
    private final List<C1231b> uploads;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Lo20/b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getText", "text", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        @NotNull
        private final String text;

        public a(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.text, ((a) obj2).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }
    }

    /* JADX INFO: renamed from: o20.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004¨\u0006$"}, d2 = {"Lo20/b$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getContentType", "contentType", "b", "getFileName", "fileName", "", "c", "J", "getFileSize", "()J", "fileSize", "Lv20/t0;", "d", "Lv20/t0;", "getMeta", "()Lv20/t0;", "meta", "Ljava/util/UUID;", "e", "Ljava/util/UUID;", "getCorrelationId", "()Ljava/util/UUID;", "correlationId", "f", "getReplyTo", "replyTo", "g", "getCaption", "caption", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1231b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("contentType")
        private final String contentType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("fileName")
        @NotNull
        private final String fileName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("fileSize")
        private final long fileSize;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("meta")
        private final t0 meta;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("correlationId")
        @NotNull
        private final UUID correlationId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("replyToMessageId")
        private final UUID replyTo;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("caption")
        private final String caption;

        public C1231b(String str, String fileName, long j2, t0 t0Var, UUID correlationId, String str2) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(correlationId, "correlationId");
            this.contentType = str;
            this.fileName = fileName;
            this.fileSize = j2;
            this.meta = t0Var;
            this.correlationId = correlationId;
            this.replyTo = null;
            this.caption = str2;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1231b)) {
                return false;
            }
            C1231b c1231b = (C1231b) obj2;
            return Intrinsics.f(this.contentType, c1231b.contentType) && Intrinsics.f(this.fileName, c1231b.fileName) && this.fileSize == c1231b.fileSize && Intrinsics.f(this.meta, c1231b.meta) && Intrinsics.f(this.correlationId, c1231b.correlationId) && Intrinsics.f(this.replyTo, c1231b.replyTo) && Intrinsics.f(this.caption, c1231b.caption);
        }

        public final int hashCode() {
            String str = this.contentType;
            int iC = a0.d.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.fileName), 31, this.fileSize);
            t0 t0Var = this.meta;
            int iF = t61.a.f(this.correlationId, (iC + (t0Var == null ? 0 : t0Var.hashCode())) * 31, 31);
            UUID uuid = this.replyTo;
            int iHashCode = (iF + (uuid == null ? 0 : uuid.hashCode())) * 31;
            String str2 = this.caption;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lo20/b$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getEntryPoint", "entryPoint", "Li20/m0;", "b", "Li20/m0;", "getReplyToDetails", "()Li20/m0;", "replyToDetails", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("entryPoint")
        private final String entryPoint;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("replyToDetails")
        private final m0 replyToDetails;

        public c() {
            this(null, null);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.entryPoint, cVar.entryPoint) && Intrinsics.f(this.replyToDetails, cVar.replyToDetails);
        }

        public final int hashCode() {
            String str = this.entryPoint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            m0 m0Var = this.replyToDetails;
            return iHashCode + (m0Var != null ? m0Var.hashCode() : 0);
        }

        public c(String str, m0 m0Var) {
            this.entryPoint = str;
            this.replyToDetails = m0Var;
        }
    }

    public b(UUID correlationId, UUID uuid, a aVar, c cVar, ArrayList uploads) {
        Intrinsics.checkNotNullParameter(correlationId, "correlationId");
        Intrinsics.checkNotNullParameter(uploads, "uploads");
        this.correlationId = correlationId;
        this.replyTo = uuid;
        this.textPayload = aVar;
        this.meta = cVar;
        this.uploads = uploads;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.correlationId, bVar.correlationId) && Intrinsics.f(this.replyTo, bVar.replyTo) && Intrinsics.f(this.textPayload, bVar.textPayload) && Intrinsics.f(this.meta, bVar.meta) && Intrinsics.f(this.uploads, bVar.uploads);
    }

    public final int hashCode() {
        int iHashCode = this.correlationId.hashCode() * 31;
        UUID uuid = this.replyTo;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        a aVar = this.textPayload;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c cVar = this.meta;
        return this.uploads.hashCode() + ((iHashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }
}
