package oq9;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f227855c;
    public final DateTime d;
    public final DateTime e;

    public t(String id10, String groupId, o member, DateTime reminderDate, DateTime reminderExpireDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(reminderDate, "reminderDate");
        Intrinsics.checkNotNullParameter(reminderExpireDate, "reminderExpireDate");
        this.f227853a = id10;
        this.f227854b = groupId;
        this.f227855c = member;
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
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f227853a, tVar.f227853a) && Intrinsics.f(this.f227854b, tVar.f227854b) && Intrinsics.f(this.f227855c, tVar.f227855c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + m72.b.f(this.d, okl.m.d(this.f227855c, p.a.c(this.f227853a.hashCode() * 31, 31, this.f227854b), 31), 31);
    }
}
