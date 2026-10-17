package cli;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends g implements qki.a {

    @NotNull
    private static final x Companion = new x();
    public final j e;
    public final i f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(j initialState, n stateMapper, boolean z, i iVar) {
        super(initialState, stateMapper, z);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.e = initialState;
        this.f = iVar;
    }

    @Override // qki.a
    public final void e(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.setClassLoader(y.class.getClassLoader());
        Parcelable retainedState = bundle.getParcelable("DomainStateSnapshotKey");
        if (retainedState != null) {
            i iVar = this.f;
            if (iVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Intrinsics.checkNotNullParameter(retainedState, "retainedState");
            D(new ce9.a((j) iVar.b(this.e, retainedState), 16));
        }
    }

    @Override // qki.a
    public final void g(Bundle bundle) {
        Parcelable parcelableA;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        i iVar = this.f;
        if (iVar == null || (parcelableA = iVar.a(((j2) this.f22677a).getValue())) == null) {
            return;
        }
        bundle.putParcelable("DomainStateSnapshotKey", parcelableA);
    }
}
