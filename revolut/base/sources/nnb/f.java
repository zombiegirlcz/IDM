package nnb;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f217489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f217490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f217491c;
    public final i d;

    public f(Data statementOptions, Set selectedMoneyBoxIds, boolean z, i iVar) {
        Intrinsics.checkNotNullParameter(statementOptions, "statementOptions");
        Intrinsics.checkNotNullParameter(selectedMoneyBoxIds, "selectedMoneyBoxIds");
        this.f217489a = statementOptions;
        this.f217490b = selectedMoneyBoxIds;
        this.f217491c = z;
        this.d = iVar;
    }

    public static f a(f fVar, Data statementOptions, Set selectedMoneyBoxIds, boolean z, i iVar, int i) {
        if ((i & 1) != 0) {
            statementOptions = fVar.f217489a;
        }
        if ((i & 2) != 0) {
            selectedMoneyBoxIds = fVar.f217490b;
        }
        if ((i & 4) != 0) {
            z = fVar.f217491c;
        }
        if ((i & 8) != 0) {
            iVar = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(statementOptions, "statementOptions");
        Intrinsics.checkNotNullParameter(selectedMoneyBoxIds, "selectedMoneyBoxIds");
        return new f(statementOptions, selectedMoneyBoxIds, z, iVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f217489a, fVar.f217489a) && Intrinsics.f(this.f217490b, fVar.f217490b) && this.f217491c == fVar.f217491c && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.f(this.f217489a.hashCode() * 31, 31, this.f217490b), 31, this.f217491c);
        i iVar = this.d;
        return iC + (iVar == null ? 0 : iVar.hashCode());
    }
}
