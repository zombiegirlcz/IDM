package csh;

import aii.n;
import aii.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nsh.o;
import skm.a2;
import tji.l;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ash.f f108469a;

    @Override // csh.f
    public final void a() {
        this.f108469a = null;
    }

    public final n b(u destination) {
        Intrinsics.checkNotNullParameter(destination, "<this>");
        ash.f fVar = this.f108469a;
        if (fVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Intrinsics.checkNotNullParameter(destination, "destination");
        return ((o) fVar).A2(destination);
    }

    public final Flow c(l dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        ash.f fVar = this.f108469a;
        if (fVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        return ((o) fVar).L2(dialogModel);
    }

    public final a2 d(Function2 block, Function1 handleError) {
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(block, "block");
        ash.f fVar = this.f108469a;
        if (fVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(block, "block");
        return ((o) fVar).T2(block, handleError);
    }

    @Override // csh.f
    public final void p(ash.f facade) {
        Intrinsics.checkNotNullParameter(facade, "facade");
        this.f108469a = facade;
    }
}
