package usj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Lazy[] f282966m = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new us4.b(7)), null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f282968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f282969c;
    public final JsonObject d;
    public final List e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f282970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f282971h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f282972j;
    public final Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f282973l;

    public /* synthetic */ u(int i, String str, String str2, x xVar, JsonObject jsonObject, List list, Long l2, long j2, long j3, String str3, String str4, Boolean bool, Boolean bool2) {
        if (467 != (i & 467)) {
            j1.f(s.f282965a.getDescriptor(), i, 467);
            throw null;
        }
        this.f282967a = str;
        this.f282968b = str2;
        if ((i & 4) == 0) {
            this.f282969c = null;
        } else {
            this.f282969c = xVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = jsonObject;
        }
        this.e = list;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        this.f282970g = j2;
        this.f282971h = j3;
        this.i = str3;
        if ((i & 512) == 0) {
            this.f282972j = null;
        } else {
            this.f282972j = str4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool;
        }
        if ((i & 2048) == 0) {
            this.f282973l = null;
        } else {
            this.f282973l = bool2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f282967a, uVar.f282967a) && Intrinsics.f(this.f282968b, uVar.f282968b) && Intrinsics.f(this.f282969c, uVar.f282969c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e) && Intrinsics.f(this.f, uVar.f) && this.f282970g == uVar.f282970g && this.f282971h == uVar.f282971h && Intrinsics.f(this.i, uVar.i) && Intrinsics.f(this.f282972j, uVar.f282972j) && Intrinsics.f(this.k, uVar.k) && Intrinsics.f(this.f282973l, uVar.f282973l);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f282967a.hashCode() * 31, 31, this.f282968b);
        x xVar = this.f282969c;
        int iHashCode = (iC + (xVar == null ? 0 : xVar.hashCode())) * 31;
        JsonObject jsonObject = this.d;
        int iD = p.a.d((iHashCode + (jsonObject == null ? 0 : jsonObject.f187951a.hashCode())) * 31, 31, this.e);
        Long l2 = this.f;
        int iC2 = p.a.c(a0.d.c(a0.d.c((iD + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f282970g), 31, this.f282971h), 31, this.i);
        String str = this.f282972j;
        int iHashCode2 = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.k;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f282973l;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
