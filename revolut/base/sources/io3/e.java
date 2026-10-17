package io3;

import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f163160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f163161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f163162c;

    public e(f scope, String beneficiaryName, LinkedHashMap fields) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f163160a = scope;
        this.f163161b = beneficiaryName;
        this.f163162c = fields;
    }

    public final String a() {
        return this.f163161b;
    }

    public final LinkedHashMap b() {
        return this.f163162c;
    }

    public final f c() {
        return this.f163160a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f163160a == eVar.f163160a && Intrinsics.f(this.f163161b, eVar.f163161b) && Intrinsics.f(this.f163162c, eVar.f163162c);
    }

    public final int hashCode() {
        return this.f163162c.hashCode() + p.a.c(this.f163160a.hashCode() * 31, 31, this.f163161b);
    }
}
