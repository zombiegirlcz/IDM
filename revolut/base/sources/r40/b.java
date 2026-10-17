package r40;

import com.revolut.chat.domain.model.TicketCreationContext;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class b implements aii.r {

    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f251322a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: r40.b$b, reason: collision with other inner class name */
    public static final class C1386b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f251323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f251324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TicketCreationContext f251325c;

        public C1386b() {
            this(null, null, null, 7);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1386b)) {
                return false;
            }
            C1386b c1386b = (C1386b) obj2;
            return Intrinsics.f(this.f251323a, c1386b.f251323a) && Intrinsics.f(this.f251324b, c1386b.f251324b) && Intrinsics.f(this.f251325c, c1386b.f251325c);
        }

        public final int hashCode() {
            UUID uuid = this.f251323a;
            int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
            UUID uuid2 = this.f251324b;
            int iHashCode2 = (iHashCode + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
            TicketCreationContext ticketCreationContext = this.f251325c;
            return iHashCode2 + (ticketCreationContext != null ? ticketCreationContext.hashCode() : 0);
        }

        public C1386b(UUID uuid, UUID uuid2, TicketCreationContext ticketCreationContext, int i) {
            uuid = (i & 1) != 0 ? null : uuid;
            uuid2 = (i & 2) != 0 ? null : uuid2;
            ticketCreationContext = (i & 4) != 0 ? null : ticketCreationContext;
            this.f251323a = uuid;
            this.f251324b = uuid2;
            this.f251325c = ticketCreationContext;
        }
    }

    private b() {
    }
}
