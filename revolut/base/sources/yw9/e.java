package yw9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dpg.a f317356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f317357c;
    public final iw9.b d;
    public final iw9.c e;

    public e(String usernameInput, dpg.a validation, String str, iw9.b bVar, iw9.c cVar) {
        Intrinsics.checkNotNullParameter(usernameInput, "usernameInput");
        Intrinsics.checkNotNullParameter(validation, "validation");
        this.f317355a = usernameInput;
        this.f317356b = validation;
        this.f317357c = str;
        this.d = bVar;
        this.e = cVar;
    }

    public static e a(e eVar, String str, dpg.a aVar, String str2, iw9.b bVar, iw9.c cVar, int i) {
        if ((i & 1) != 0) {
            str = eVar.f317355a;
        }
        String usernameInput = str;
        if ((i & 2) != 0) {
            aVar = eVar.f317356b;
        }
        dpg.a validation = aVar;
        if ((i & 4) != 0) {
            str2 = eVar.f317357c;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            bVar = eVar.d;
        }
        iw9.b bVar2 = bVar;
        if ((i & 16) != 0) {
            cVar = eVar.e;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(usernameInput, "usernameInput");
        Intrinsics.checkNotNullParameter(validation, "validation");
        return new e(usernameInput, validation, str3, bVar2, cVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f317355a, eVar.f317355a) && Intrinsics.f(this.f317356b, eVar.f317356b) && Intrinsics.f(this.f317357c, eVar.f317357c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f317356b.hashCode() + (this.f317355a.hashCode() * 31)) * 31;
        String str = this.f317357c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        iw9.b bVar = this.d;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.f168999a.hashCode())) * 31;
        iw9.c cVar = this.e;
        return iHashCode3 + (cVar != null ? cVar.f169000a.hashCode() : 0);
    }
}
