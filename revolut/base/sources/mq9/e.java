package mq9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();
    public static final e e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f207901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f207902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f207903c;
    public final List d;

    static {
        f0 f0Var = f0.f322471a;
        e = new e(f0Var, f0Var, f0Var, f0Var);
    }

    public e(List bills, List settlements, List messages, List groups) {
        Intrinsics.checkNotNullParameter(bills, "bills");
        Intrinsics.checkNotNullParameter(settlements, "settlements");
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.f207901a = bills;
        this.f207902b = settlements;
        this.f207903c = messages;
        this.d = groups;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f207901a, eVar.f207901a) && Intrinsics.f(this.f207902b, eVar.f207902b) && Intrinsics.f(this.f207903c, eVar.f207903c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f207901a.hashCode() * 31, 31, this.f207902b), 31, this.f207903c);
    }
}
