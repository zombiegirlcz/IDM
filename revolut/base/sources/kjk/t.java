package kjk;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class t {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe0.e f184467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f184468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f184469c;

    public t(xe0.e storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f184467a = storage;
        od0.i.Companion.getClass();
        od0.i iVar = od0.i.f224256b;
        ihm.b bVarE = ihm.b.e(iVar);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f184468b = bVarE;
        ihm.b bVarE2 = ihm.b.e(iVar);
        Intrinsics.checkNotNullExpressionValue(bVarE2, "createDefault(...)");
        this.f184469c = bVarE2;
    }

    public final ihm.b a(egk.b bVar) {
        int i = r.f184464a[bVar.ordinal()];
        if (i == 1) {
            return this.f184468b;
        }
        if (i == 2) {
            return this.f184469c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
