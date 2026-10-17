package do3;

import com.revolut.feature.address.models.Address;
import ip0.v7;
import java.io.Serializable;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements Serializable {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f116396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f116397c;
    public final s d;
    public final Address e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f116398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f116399h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u f116400j;
    public final String k;

    public e(String id10, f service, LocalDateTime createdDate, s state, Address address, p pVar, v vVar, String str, h salariedUser, u uVar, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(salariedUser, "salariedUser");
        this.f116395a = id10;
        this.f116396b = service;
        this.f116397c = createdDate;
        this.d = state;
        this.e = address;
        this.f = pVar;
        this.f116398g = vVar;
        this.f116399h = str;
        this.i = salariedUser;
        this.f116400j = uVar;
        this.k = str2;
    }

    public final Address a() {
        return this.e;
    }

    public final String b() {
        return this.f116399h;
    }

    public final LocalDateTime c() {
        return this.f116397c;
    }

    public final String d() {
        return this.k;
    }

    public final p e() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f116395a, eVar.f116395a) && this.f116396b == eVar.f116396b && Intrinsics.f(this.f116397c, eVar.f116397c) && this.d == eVar.d && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && this.f116398g == eVar.f116398g && Intrinsics.f(this.f116399h, eVar.f116399h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f116400j, eVar.f116400j) && Intrinsics.f(this.k, eVar.k);
    }

    public final h f() {
        return this.i;
    }

    public final String getId() {
        return this.f116395a;
    }

    public final f h() {
        return this.f116396b;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + v7.i(this.f116397c, (this.f116396b.hashCode() + (this.f116395a.hashCode() * 31)) * 31, 31)) * 31;
        Address address = this.e;
        int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
        p pVar = this.f;
        int iHashCode3 = (iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        v vVar = this.f116398g;
        int iHashCode4 = (iHashCode3 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        String str = this.f116399h;
        int iHashCode5 = (this.i.f116401a.hashCode() + ((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        u uVar = this.f116400j;
        int iHashCode6 = (iHashCode5 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        String str2 = this.k;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final s i() {
        return this.d;
    }

    public final u k() {
        return this.f116400j;
    }

    public final v l() {
        return this.f116398g;
    }
}
