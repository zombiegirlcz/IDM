package fr9;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {

    @NotNull
    public static final C0803a Companion = new C0803a(0);

    /* JADX INFO: renamed from: fr9.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C0803a {
        private C0803a() {
        }

        public C0803a(int i) {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lfr9/a$b;", "Lfr9/a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "id", "c", "groupId", "d", "memberId", "", "e", "J", "()J", "reminderDate", "f", "reminderExpireDate", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("groupId")
        @NotNull
        private final String groupId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("memberId")
        @NotNull
        private final String memberId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("reminderDate")
        private final long reminderDate;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("reminderExpireDate")
        private final long reminderExpireDate;

        public b(long j2, String id10, String groupId, long j3, String memberId) {
            Intrinsics.checkNotNullParameter("DEBT", "type");
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(memberId, "memberId");
            this.type = "DEBT";
            this.id = id10;
            this.groupId = groupId;
            this.memberId = memberId;
            this.reminderDate = j2;
            this.reminderExpireDate = j3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getGroupId() {
            return this.groupId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getReminderDate() {
            return this.reminderDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getReminderExpireDate() {
            return this.reminderExpireDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.groupId, bVar.groupId) && Intrinsics.f(this.memberId, bVar.memberId) && this.reminderDate == bVar.reminderDate && this.reminderExpireDate == bVar.reminderExpireDate;
        }

        public final int hashCode() {
            return Long.hashCode(this.reminderExpireDate) + d.c(p.a.c(p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.id), 31, this.groupId), 31, this.memberId), 31, this.reminderDate);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lfr9/a$c;", "Lfr9/a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "id", "c", "groupId", "d", "memberId", "", "e", "J", "()J", "reminderDate", "f", "reminderExpireDate", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("groupId")
        @NotNull
        private final String groupId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("memberId")
        @NotNull
        private final String memberId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("reminderDate")
        private final long reminderDate;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("reminderExpireDate")
        private final long reminderExpireDate;

        public c(long j2, String id10, String groupId, long j3, String memberId) {
            Intrinsics.checkNotNullParameter("INVITE", "type");
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(memberId, "memberId");
            this.type = "INVITE";
            this.id = id10;
            this.groupId = groupId;
            this.memberId = memberId;
            this.reminderDate = j2;
            this.reminderExpireDate = j3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getGroupId() {
            return this.groupId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getReminderDate() {
            return this.reminderDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getReminderExpireDate() {
            return this.reminderExpireDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.groupId, cVar.groupId) && Intrinsics.f(this.memberId, cVar.memberId) && this.reminderDate == cVar.reminderDate && this.reminderExpireDate == cVar.reminderExpireDate;
        }

        public final int hashCode() {
            return Long.hashCode(this.reminderExpireDate) + d.c(p.a.c(p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.id), 31, this.groupId), 31, this.memberId), 31, this.reminderDate);
        }
    }

    private a() {
    }
}
