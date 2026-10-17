package cog;

import bog.r;
import bog.s;
import bog.t;
import bog.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cog.f
    public final boolean a(zng.g domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (com.bumptech.glide.d.x(domainState.f323820b)) {
            u uVar = domainState.f323819a;
            if (uVar instanceof r) {
                String str = ((r) uVar).f17452c.f17438c;
                return (str == null || d0.W(str) || str.length() < 2) ? false : true;
            }
            if (uVar instanceof s) {
                String str2 = ((s) uVar).f17455c.f17438c;
                return (str2 == null || d0.W(str2) || str2.length() < 2) ? false : true;
            }
            if (!(uVar instanceof t)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }
}
