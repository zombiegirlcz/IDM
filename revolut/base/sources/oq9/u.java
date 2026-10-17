package oq9;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f227858c;
    public final DateTime d;
    public final DateTime e;

    public u(String id10, String groupId, o member, DateTime reminderDate, DateTime reminderExpireDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(reminderDate, "reminderDate");
        Intrinsics.checkNotNullParameter(reminderExpireDate, "reminderExpireDate");
        this.f227856a = id10;
        this.f227857b = groupId;
        this.f227858c = member;
        this.d = reminderDate;
        this.e = reminderExpireDate;
    }

    @Override // oq9.v
    public final DateTime a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f227856a, uVar.f227856a) && Intrinsics.f(this.f227857b, uVar.f227857b) && Intrinsics.f(this.f227858c, uVar.f227858c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + m72.b.f(this.d, okl.m.d(this.f227858c, p.a.c(this.f227856a.hashCode() * 31, 31, this.f227857b), 31), 31);
    }
}
