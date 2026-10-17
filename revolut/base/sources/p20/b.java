package p20;

import i20.b0;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lp20/b$a;", "Lp20/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "_type", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", "id", "Lp20/b$a$b;", "c", "Lp20/b$a$b;", "getData", "()Lp20/b$a$b;", "data", "Companion", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String _type = "ack";

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final UUID id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("data")
        private final C1280b data;

        /* JADX INFO: renamed from: p20.b$a$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes19.dex */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lp20/b$a$b;", "Lp20/b$f;", "", "toString", "()Ljava/lang/String;", "Lorg/joda/time/Instant;", "a", "Lorg/joda/time/Instant;", "getReceivedTimestamp", "()Lorg/joda/time/Instant;", "receivedTimestamp", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1280b extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("receivedTimestamp")
            @NotNull
            private final Instant receivedTimestamp;

            public C1280b(Instant receivedTimestamp) {
                Intrinsics.checkNotNullParameter(receivedTimestamp, "receivedTimestamp");
                this.receivedTimestamp = receivedTimestamp;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C1280b) && Intrinsics.f(this.receivedTimestamp, ((C1280b) obj2).receivedTimestamp);
            }

            public final int hashCode() {
                return this.receivedTimestamp.hashCode();
            }
        }

        public a(UUID uuid, C1280b c1280b) {
            this.id = uuid;
            this.data = c1280b;
        }

        @Override // p20.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        @Override // p20.b
        /* JADX INFO: renamed from: b */
        public final String getType() {
            String str = this._type;
            return str == null ? "ack" : str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this._type, aVar._type) && Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.data, aVar.data);
        }

        public final int hashCode() {
            String str = this._type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UUID uuid = this.id;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            C1280b c1280b = this.data;
            return iHashCode2 + (c1280b != null ? c1280b.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: p20.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0013"}, d2 = {"Lp20/b$b;", "Lp20/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "_type", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", "id", "Lp20/b$b$b;", "c", "Lp20/b$b$b;", "()Lp20/b$b$b;", "data", "Companion", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1281b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String _type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final UUID id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("data")
        private final C1282b data;

        /* JADX INFO: renamed from: p20.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lp20/b$b$b;", "Lp20/b$f;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "agentId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1282b extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("agentId")
            @NotNull
            private final UUID agentId;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final UUID getAgentId() {
                return this.agentId;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C1282b) && Intrinsics.f(this.agentId, ((C1282b) obj2).agentId);
            }

            public final int hashCode() {
                return this.agentId.hashCode();
            }
        }

        @Override // p20.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        @Override // p20.b
        /* JADX INFO: renamed from: b */
        public final String getType() {
            String str = this._type;
            return str == null ? "agentAvailabilityOverride" : str;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C1282b getData() {
            return this.data;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1281b)) {
                return false;
            }
            C1281b c1281b = (C1281b) obj2;
            return Intrinsics.f(this._type, c1281b._type) && Intrinsics.f(this.id, c1281b.id) && Intrinsics.f(this.data, c1281b.data);
        }

        public final int hashCode() {
            String str = this._type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UUID uuid = this.id;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            C1282b c1282b = this.data;
            return iHashCode2 + (c1282b != null ? c1282b.hashCode() : 0);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0013"}, d2 = {"Lp20/b$c;", "Lp20/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "_type", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", "id", "Lp20/b$c$b;", "c", "Lp20/b$c$b;", "()Lp20/b$c$b;", "data", "Companion", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String _type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final UUID id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("data")
        private final C1283b data;

        /* JADX INFO: renamed from: p20.b$c$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lp20/b$c$b;", "Lp20/b$f;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "agentId", "Lv30/c;", "b", "Lv30/c;", "getState", "()Lv30/c;", "state", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1283b extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("agentId")
            @NotNull
            private final UUID agentId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("state")
            @NotNull
            private final v30.c state;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final UUID getAgentId() {
                return this.agentId;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1283b)) {
                    return false;
                }
                C1283b c1283b = (C1283b) obj2;
                return Intrinsics.f(this.agentId, c1283b.agentId) && this.state == c1283b.state;
            }

            public final int hashCode() {
                return this.state.hashCode() + (this.agentId.hashCode() * 31);
            }
        }

        @Override // p20.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        @Override // p20.b
        /* JADX INFO: renamed from: b */
        public final String getType() {
            String str = this._type;
            return str == null ? "agentOnlineSession" : str;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C1283b getData() {
            return this.data;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this._type, cVar._type) && Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.data, cVar.data);
        }

        public final int hashCode() {
            String str = this._type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UUID uuid = this.id;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            C1283b c1283b = this.data;
            return iHashCode2 + (c1283b != null ? c1283b.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lp20/b$d;", "Lp20/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "_type", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", "id", "Lp20/b$d$b;", "c", "Lp20/b$d$b;", "getData", "()Lp20/b$d$b;", "data", "Companion", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String _type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final UUID id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("data")
        @NotNull
        private final C1284b data;

        /* JADX INFO: renamed from: p20.b$d$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes19.dex */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lp20/b$d$b;", "Lp20/b$f;", "", "toString", "()Ljava/lang/String;", "Lorg/joda/time/Instant;", "a", "Lorg/joda/time/Instant;", "getEventTime", "()Lorg/joda/time/Instant;", "eventTime", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1284b extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("eventTime")
            @NotNull
            private final Instant eventTime;

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C1284b) && Intrinsics.f(this.eventTime, ((C1284b) obj2).eventTime);
            }

            public final int hashCode() {
                return this.eventTime.hashCode();
            }
        }

        @Override // p20.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        @Override // p20.b
        /* JADX INFO: renamed from: b */
        public final String getType() {
            String str = this._type;
            return str == null ? "heartbeat" : str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this._type, dVar._type) && Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.data, dVar.data);
        }

        public final int hashCode() {
            String str = this._type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UUID uuid = this.id;
            return this.data.hashCode() + ((iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 31);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0013"}, d2 = {"Lp20/b$e;", "Lp20/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "_type", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", "id", "Lp20/b$e$b;", "c", "Lp20/b$e$b;", "()Lp20/b$e$b;", "data", "Companion", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String _type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final UUID id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("data")
        @NotNull
        private final C1285b data;

        /* JADX INFO: renamed from: p20.b$e$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes19.dex */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lp20/b$e$b;", "Lp20/b$f;", "", "toString", "()Ljava/lang/String;", "Li20/b0;", "a", "Li20/b0;", "()Li20/b0;", "message", "b", "replyTo", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1285b extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("message")
            @NotNull
            private final b0 message;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("replyTo")
            private final b0 replyTo;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final b0 getMessage() {
                return this.message;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final b0 getReplyTo() {
                return this.replyTo;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1285b)) {
                    return false;
                }
                C1285b c1285b = (C1285b) obj2;
                return Intrinsics.f(this.message, c1285b.message) && Intrinsics.f(this.replyTo, c1285b.replyTo);
            }

            public final int hashCode() {
                int iHashCode = this.message.hashCode() * 31;
                b0 b0Var = this.replyTo;
                return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
            }
        }

        @Override // p20.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        @Override // p20.b
        /* JADX INFO: renamed from: b */
        public final String getType() {
            String str = this._type;
            return str == null ? "message" : str;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C1285b getData() {
            return this.data;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this._type, eVar._type) && Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.data, eVar.data);
        }

        public final int hashCode() {
            String str = this._type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UUID uuid = this.id;
            return this.data.hashCode() + ((iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 31);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static abstract class f {
        private f() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lp20/b$g;", "Lp20/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "_type", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", "id", "Lp20/b$g$b;", "c", "Lp20/b$g$b;", "getData", "()Lp20/b$g$b;", "data", "Companion", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String _type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final UUID id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("data")
        @NotNull
        private final C1286b data;

        /* JADX INFO: renamed from: p20.b$g$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes19.dex */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t¨\u0006\u0011"}, d2 = {"Lp20/b$g$b;", "Lp20/b$f;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "getClientId", "()Ljava/util/UUID;", "clientId", "b", "getTicketId", "ticketId", "c", "getMessageId", "messageId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1286b extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("clientId")
            @NotNull
            private final UUID clientId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("ticketId")
            @NotNull
            private final UUID ticketId;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("messageId")
            @NotNull
            private final UUID messageId;

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1286b)) {
                    return false;
                }
                C1286b c1286b = (C1286b) obj2;
                return Intrinsics.f(this.clientId, c1286b.clientId) && Intrinsics.f(this.ticketId, c1286b.ticketId) && Intrinsics.f(this.messageId, c1286b.messageId);
            }

            public final int hashCode() {
                return this.messageId.hashCode() + t61.a.f(this.ticketId, this.clientId.hashCode() * 31, 31);
            }
        }

        @Override // p20.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        @Override // p20.b
        /* JADX INFO: renamed from: b */
        public final String getType() {
            String str = this._type;
            return str == null ? "read" : str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this._type, gVar._type) && Intrinsics.f(this.id, gVar.id) && Intrinsics.f(this.data, gVar.data);
        }

        public final int hashCode() {
            String str = this._type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UUID uuid = this.id;
            return this.data.hashCode() + ((iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 31);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0003\t\u000e\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0013"}, d2 = {"Lp20/b$h;", "Lp20/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "_type", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", "id", "Lp20/b$h$b;", "c", "Lp20/b$h$b;", "()Lp20/b$h$b;", "data", "Companion", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String _type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final UUID id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("data")
        @NotNull
        private final C1287b data;

        /* JADX INFO: renamed from: p20.b$h$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\n\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000e\u0010\bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001e"}, d2 = {"Lp20/b$h$b;", "Lp20/b$f;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "agentId", "b", "e", "ticketId", "Lorg/joda/time/Instant;", "c", "Lorg/joda/time/Instant;", "f", "()Lorg/joda/time/Instant;", "timestamp", "Lorg/joda/time/Period;", "d", "Lorg/joda/time/Period;", "()Lorg/joda/time/Period;", "duration", "previousMessageId", "", "Lp20/b$h$c;", "Ljava/util/List;", "()Ljava/util/List;", "thoughts", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1287b extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("agentId")
            @NotNull
            private final UUID agentId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("ticketId")
            @NotNull
            private final UUID ticketId;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("timestamp")
            @NotNull
            private final Instant timestamp;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("duration")
            @NotNull
            private final Period duration;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("previousMessageId")
            @NotNull
            private final UUID previousMessageId;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("thoughts")
            @NotNull
            private final List<c> thoughts;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final UUID getAgentId() {
                return this.agentId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Period getDuration() {
                return this.duration;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final UUID getPreviousMessageId() {
                return this.previousMessageId;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final List getThoughts() {
                return this.thoughts;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final UUID getTicketId() {
                return this.ticketId;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1287b)) {
                    return false;
                }
                C1287b c1287b = (C1287b) obj2;
                return Intrinsics.f(this.agentId, c1287b.agentId) && Intrinsics.f(this.ticketId, c1287b.ticketId) && Intrinsics.f(this.timestamp, c1287b.timestamp) && Intrinsics.f(this.duration, c1287b.duration) && Intrinsics.f(this.previousMessageId, c1287b.previousMessageId) && Intrinsics.f(this.thoughts, c1287b.thoughts);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Instant getTimestamp() {
                return this.timestamp;
            }

            public final int hashCode() {
                return this.thoughts.hashCode() + t61.a.f(this.previousMessageId, (this.duration.hashCode() + t61.a.g(this.timestamp, t61.a.f(this.ticketId, this.agentId.hashCode() * 31, 31), 31)) * 31, 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lp20/b$h$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "text", "Lorg/joda/time/Period;", "Lorg/joda/time/Period;", "()Lorg/joda/time/Period;", "duration", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("text")
            @NotNull
            private final String text;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("duration")
            @NotNull
            private final Period duration;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Period getDuration() {
                return this.duration;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.text, cVar.text) && Intrinsics.f(this.duration, cVar.duration);
            }

            public final int hashCode() {
                return this.duration.hashCode() + (this.text.hashCode() * 31);
            }
        }

        @Override // p20.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        @Override // p20.b
        /* JADX INFO: renamed from: b */
        public final String getType() {
            String str = this._type;
            return str == null ? "llmThinking" : str;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C1287b getData() {
            return this.data;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof h)) {
                return false;
            }
            h hVar = (h) obj2;
            return Intrinsics.f(this._type, hVar._type) && Intrinsics.f(this.id, hVar.id) && Intrinsics.f(this.data, hVar.data);
        }

        public final int hashCode() {
            String str = this._type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UUID uuid = this.id;
            return this.data.hashCode() + ((iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 31);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lp20/b$i;", "Lp20/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "_type", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", "id", "Lp20/b$i$b;", "c", "Lp20/b$i$b;", "getData", "()Lp20/b$i$b;", "data", "Companion", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class i extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String _type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final UUID id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("data")
        @NotNull
        private final C1288b data;

        /* JADX INFO: renamed from: p20.b$i$b, reason: collision with other inner class name */
        public static final class C1288b extends f {
        }

        @Override // p20.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        @Override // p20.b
        /* JADX INFO: renamed from: b */
        public final String getType() {
            String str = this._type;
            return str == null ? "ticketFeed" : str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof i)) {
                return false;
            }
            i iVar = (i) obj2;
            return Intrinsics.f(this._type, iVar._type) && Intrinsics.f(this.id, iVar.id) && Intrinsics.f(this.data, iVar.data);
        }

        public final int hashCode() {
            String str = this._type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UUID uuid = this.id;
            return this.data.hashCode() + ((iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 31);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0013"}, d2 = {"Lp20/b$j;", "Lp20/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "_type", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", "id", "Lp20/b$j$b;", "c", "Lp20/b$j$b;", "()Lp20/b$j$b;", "data", "Companion", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String _type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final UUID id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("data")
        private final C1289b data;

        /* JADX INFO: renamed from: p20.b$j$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes19.dex */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\n\u0010\u0017R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u0012\u0010\b¨\u0006 "}, d2 = {"Lp20/b$j$b;", "Lp20/b$f;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "agentId", "b", "getClientId", "clientId", "Lorg/joda/time/Instant;", "c", "Lorg/joda/time/Instant;", "()Lorg/joda/time/Instant;", "eventTime", "d", "e", "ticketId", "Lorg/joda/time/Period;", "Lorg/joda/time/Period;", "()Lorg/joda/time/Period;", "duration", "", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isBot", "g", "previousMessageId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1289b extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("agentId")
            private final UUID agentId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("clientId")
            private final UUID clientId;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("timestamp")
            private final Instant eventTime;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("ticketId")
            private final UUID ticketId;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("duration")
            private final Period duration;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("chatbot")
            private final Boolean isBot;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @lg.b("previousMessageId")
            private final UUID previousMessageId;

            public C1289b() {
                this(CertificateBody.profileType, null);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final UUID getAgentId() {
                return this.agentId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Period getDuration() {
                return this.duration;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Instant getEventTime() {
                return this.eventTime;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final UUID getPreviousMessageId() {
                return this.previousMessageId;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final UUID getTicketId() {
                return this.ticketId;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1289b)) {
                    return false;
                }
                C1289b c1289b = (C1289b) obj2;
                return Intrinsics.f(this.agentId, c1289b.agentId) && Intrinsics.f(this.clientId, c1289b.clientId) && Intrinsics.f(this.eventTime, c1289b.eventTime) && Intrinsics.f(this.ticketId, c1289b.ticketId) && Intrinsics.f(this.duration, c1289b.duration) && Intrinsics.f(this.isBot, c1289b.isBot) && Intrinsics.f(this.previousMessageId, c1289b.previousMessageId);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Boolean getIsBot() {
                return this.isBot;
            }

            public final int hashCode() {
                UUID uuid = this.agentId;
                int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
                UUID uuid2 = this.clientId;
                int iHashCode2 = (iHashCode + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
                Instant instant = this.eventTime;
                int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
                UUID uuid3 = this.ticketId;
                int iHashCode4 = (iHashCode3 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31;
                Period period = this.duration;
                int iHashCode5 = (iHashCode4 + (period == null ? 0 : period.hashCode())) * 31;
                Boolean bool = this.isBot;
                int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                UUID uuid4 = this.previousMessageId;
                return iHashCode6 + (uuid4 != null ? uuid4.hashCode() : 0);
            }

            public C1289b(int i, UUID uuid) {
                uuid = (i & 8) != 0 ? null : uuid;
                this.agentId = null;
                this.clientId = null;
                this.eventTime = null;
                this.ticketId = uuid;
                this.duration = null;
                this.isBot = null;
                this.previousMessageId = null;
            }
        }

        public j() {
            this(null, 7);
        }

        @Override // p20.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        @Override // p20.b
        /* JADX INFO: renamed from: b */
        public final String getType() {
            String str = this._type;
            return str == null ? "typing" : str;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C1289b getData() {
            return this.data;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof j)) {
                return false;
            }
            j jVar = (j) obj2;
            return Intrinsics.f(this._type, jVar._type) && Intrinsics.f(this.id, jVar.id) && Intrinsics.f(this.data, jVar.data);
        }

        public final int hashCode() {
            String str = this._type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UUID uuid = this.id;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            C1289b c1289b = this.data;
            return iHashCode2 + (c1289b != null ? c1289b.hashCode() : 0);
        }

        public j(C1289b c1289b, int i) {
            c1289b = (i & 4) != 0 ? null : c1289b;
            this._type = "typing";
            this.id = null;
            this.data = c1289b;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lp20/b$k;", "Lp20/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "type", "Ljava/util/UUID;", "Ljava/util/UUID;", "()Ljava/util/UUID;", "id", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class k extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final UUID id;

        @Override // p20.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        @Override // p20.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof k)) {
                return false;
            }
            k kVar = (k) obj2;
            return Intrinsics.f(this.type, kVar.type) && Intrinsics.f(this.id, kVar.id);
        }

        public final int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            UUID uuid = this.id;
            return (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        }
    }

    private b() {
    }

    /* JADX INFO: renamed from: a */
    public abstract UUID getId();

    /* JADX INFO: renamed from: b */
    public abstract String getType();
}
