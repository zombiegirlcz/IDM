package fol;

import akl.l;
import bjl.p0;
import cli.g;
import cli.k;
import cli.y;
import com.revolut.sso.impl.ui.passkeys_management.passkeys_list.bottom_dialog.DeletePasskeyConfirmationBottomSheetContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends h implements dli.b {

    @NotNull
    public static final b Companion = new b();
    public final DeletePasskeyConfirmationBottomSheetContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f137011p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p0 f137012q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f137013r;

    public d(DeletePasskeyConfirmationBottomSheetContract$InputData inputData, l claimsRepository, p0 revolutSsoDependenciesProvider, e stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(claimsRepository, "claimsRepository");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f137011p = claimsRepository;
        this.f137012q = revolutSsoDependenciesProvider;
        this.f137013r = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f137013r;
    }
}
