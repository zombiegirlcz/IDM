package ps6;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239404c;
    public final LocalDate d;

    public /* synthetic */ e(int i, String str, String str2, String str3, LocalDate localDate) {
        if (15 != (i & 15)) {
            j1.f(c.f239401a.getDescriptor(), i, 15);
            throw null;
        }
        this.f239402a = str;
        this.f239403b = str2;
        this.f239404c = str3;
        this.d = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f239402a, eVar.f239402a) && Intrinsics.f(this.f239403b, eVar.f239403b) && Intrinsics.f(this.f239404c, eVar.f239404c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f239402a.hashCode() * 31, 31, this.f239403b), 31, this.f239404c);
        LocalDate localDate = this.d;
        return iC + (localDate == null ? 0 : localDate.hashCode());
    }

    public e(String id10, String stepType, String state, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(stepType, "stepType");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f239402a = id10;
        this.f239403b = stepType;
        this.f239404c = state;
        this.d = localDate;
    }
}
